public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i = 0; i < prices.length; i++) {
            for(int j = i; j < prices.length; j++) {
                if(prices[i] > prices[j]) {
                    answer[i] = j - i;
                    break;
                }
            }
            if(answer[i] == 0) {
                answer[i] = prices.length - 1 - i;
            }
        }

        return answer;
    }
}