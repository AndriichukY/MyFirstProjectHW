package HW10SecondTask;

import java.util.ArrayList;
public class FirstVariantArrayList {
    public ArrayList fillNewList( ArrayList circleOfPeople, int N) {
        for(int i = 1; i <= N; i++) {
                circleOfPeople.add(i);
        }

        return circleOfPeople;
    }

    public  ArrayList removePeopleFromCircle( ArrayList circleOfPeople) {
        int index = 0;

        while (circleOfPeople.size() > 1) {
            index = (index + 1) % circleOfPeople.size();
            circleOfPeople.remove(index);
        }

        return circleOfPeople;
    }
}
