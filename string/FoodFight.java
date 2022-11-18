public class FoodFight {
    public String solution(int[] food) {
        String answer = "";
        int length = food[0];
        for(int i = 1; i < food.length; i++) {
            length += (food[i] / 2) * 2;
        }

        int[] arr = new int[length];
        int index = 0;
        for(int i = 1; i < food.length; i++) {
            for(int j = 0; j < food[i]/2; j++) {
                arr[index] = i;
                arr[arr.length - 1 - index] = i;
                index++;
            }
        }

        for(int i = index; i <= arr.length - 1 - index; i++) {
            arr[i] = 0;
        }

        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}
