public class KakaoMobility3 {
    //저축시작한 날짜가 주어지고 얼마 후에 저축을했는지 알려주는 배열이 일 시 분 초 로 주어졌을 때
    //1일 1저축 성공여부와 저축 기간을 차례로 배열에 담아 반환하기
    public static int[] solution(String s, String[] times) {
        boolean isSuccess = true;

        int[] startTimes = dateParser(s);
        int[] nowTimes = dateParser(s);
        int[] nextTimes = dateParser(s);

        for(int i=0;i<times.length;i++) {
            int[] time = timeParser(times[i]);
            nextTimes = timeMerge(nowTimes, time);

            if(nowTimes[2] +1 != nextTimes[2] && nowTimes[2] != nextTimes[2]) isSuccess = false;

            for(int j=0;j<6;j++) {
                nowTimes[j] = nextTimes[j];
            }
        }
        int answerCount = timeGap(nextTimes, startTimes);



        int success = 0;
        if(isSuccess) success = 1;

        int[] answer = {success, answerCount};
        System.out.println(success);
        System.out.println(answerCount);
        return answer;
    }

    public static int timeGap(int[] nextTimes, int[] startTimes) {
        int nextDay = nextTimes[2];
        int nextMonth = nextTimes[1];
        int nextYear = nextTimes[0];

        int startDay = startTimes[2];
        int startMonth = startTimes[1];
        int startYear = startTimes[0];

        int YearGap = nextYear - startYear;
        int MonthGap = nextMonth - startMonth;
        int DayGap = nextDay - startDay;

        DayGap += YearGap * 360 + MonthGap * 30 + 1;


        return DayGap;
    }
    public static int[] timeMerge(int[] nowTimes, int[] time) {

        int Sec = nowTimes[5] + time[5];
        boolean MinFlag = false;
        if(Sec >59) {
            Sec -= 60;
            MinFlag = true;
        }

        int Min = nowTimes[4] + time[4];
        if(MinFlag) Min ++;
        boolean HourFlag = false;
        if(Min > 59) {
            Min -= 60;
            HourFlag = true;
        }

        int Hour = nowTimes[3] + time[3];
        if(HourFlag) Hour ++;
        boolean DayFlag = false;
        if(Hour > 23) {
            Hour -= 24;
            DayFlag = true;
        }

        int Day = nowTimes[2] + time[2];
        if(DayFlag) Day ++;
        boolean MonthFlag = false;
        if(Day > 30) {
            Day -= 30;
            MonthFlag = true;
        }

        int Month = nowTimes[1] + time[1];
        if(MonthFlag) Month++;
        boolean YearFlag = false;
        if(Month>12) {
            Day -= 12;
            YearFlag = true;
        }

        int Year = nowTimes[0] + time[0];
        if(YearFlag) Year ++;

        int[] mergedDate = {Year, Month, Day, Hour, Min, Sec};
        return mergedDate;
    }
    public static int[] dateParser(String s) {
        String[] tokens = s.split(":");

        int Year = Integer.parseInt(tokens[0]);
        int Month = Integer.parseInt(tokens[1]);
        int Day = Integer.parseInt(tokens[2]);
        int Hour = Integer.parseInt(tokens[3]);
        int Min = Integer.parseInt(tokens[4]);
        int Sec = Integer.parseInt(tokens[5]);

        int[] dates = {Year, Month, Day, Hour, Min, Sec};

        return dates;
    }

    public static int[] timeParser(String s) {
        String[] tokens = s.split(":");

        int Day = Integer.parseInt(tokens[0]);
        int Hour = Integer.parseInt(tokens[1]);
        int Min = Integer.parseInt(tokens[2]);
        int Sec = Integer.parseInt(tokens[3]);

        int[] dates = {0, 0, Day, Hour, Min, Sec};

        return dates;
    }
}
