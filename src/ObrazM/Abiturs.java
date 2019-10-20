package ObrazM;

import java.util.ArrayList;
import java.util.Arrays;

public class Abiturs {

    ArrayList<Abitur> list2;

    public Abiturs() {
        this.list2 = new ArrayList<>();
    }

    public Abiturs(int length) {
        this.list2 = new ArrayList<>(length);
    }

    /*public void resize(int newLength)
    {
        Abitur[] tempList = new Abitur[newLength];
        tempList = Arrays.copyOf(this.list, newLength);

        this.list = tempList;
    }*/
}
