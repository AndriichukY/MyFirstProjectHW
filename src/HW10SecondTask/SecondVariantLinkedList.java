package HW10SecondTask;

import java.util.LinkedList;

public class SecondVariantLinkedList {
        public LinkedList fillNewList(LinkedList circleOfPeople, int N) {
            for(int i = 1; i <= N; i++) {
                circleOfPeople.add(i);
            }

            return circleOfPeople;
        }

        public LinkedList removePeopleFromCircle(LinkedList circleOfPeople) {
            int index = 0;
            while (circleOfPeople.size() > 1) {
                index = (index + 1) % circleOfPeople.size();
                circleOfPeople.remove(index);
            }
            return circleOfPeople;
        }
}
