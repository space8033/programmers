public class ChickenCoupon {
    public int solution(int chicken) {
        int answer = 0;
        int bonusChicken = 0;
        int extraChicken = 0;

        while (chicken >= 10) {
            bonusChicken = chicken / 10;
            extraChicken = chicken % 10;

            chicken = bonusChicken + extraChicken;

            answer += bonusChicken;

        }

        return answer;
    }
}
