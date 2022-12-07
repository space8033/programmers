public class PlayingAlone {
    public int solution(int[] cards) {
        int[] max = {-1, -1};

        for(int i = 0; i < cards.length; i++) {
            if(cards[i] == -1) {
                continue;
            }

            int size = open(cards, i);

            if(max[0] < size) {
                max[1] = max[0];
                max[0] = size;
            }else if (max[1] < size) {
                max[1] = size;
            }
        }

        if(max[0] == cards.length) {
            return 0;
        }else {
            return max[0] * max[1];
        }
    }

    public int open(int[] cards, int index) {
        if(cards[index] == -1) {
            return  0;
        }

        int next = cards[index] - 1;
        cards[index] = -1;

        return open(cards, next) + 1;
    }
}
