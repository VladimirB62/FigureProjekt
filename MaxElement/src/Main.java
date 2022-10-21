import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
//        MaxElement friendList = new MaxElement();
//        friendList.addElement(4);
//        friendList.addElement(8);
//        friendList.addElement(10);
//        friendList.addElement(3);
//        friendList.addElement(6);
//        System.out.println(friendList.getMax());
//        friendList.removeLast();
//        System.out.println(friendList.getMax());
//        friendList.removeLast();
//        System.out.println(friendList.getMax());
//        friendList.removeLast();
//        System.out.println(friendList.getMax());
//        friendList.removeLast();
//        System.out.println(friendList.getMax());


        RemotePoints point1 = new RemotePoints(5,5);
        RemotePoints point2 = new RemotePoints(-5,5);
        RemotePoints point3 = new RemotePoints(-5,-5);
        RemotePoints point4 = new RemotePoints(5,-5);
        RemotePoints point5 = new RemotePoints(5,0);
        RemotePoints point6 = new RemotePoints(0,5);
        RemotePoints point7 = new RemotePoints(-5,0);
        RemotePoints point8 = new RemotePoints(0,-5);

        List<RemotePoints> points = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
        points.add(point5);
        points.add(point6);
        points.add(point7);
        points.add(point8);

        Collections.sort(points);
        System.out.println(points);

        Collections.sort(points, new ComporatorByArctan());
        System.out.println(points);

        for (RemotePoints p:points) {
            System.out.println(p.getArctanOffTheCorner());

        }







    }
}
