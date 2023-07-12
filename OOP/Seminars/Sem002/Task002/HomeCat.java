package Seminars.Sem002.Task002;

public class HomeCat extends Cat {
    protected static int count;

    public HomeCat(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, type, maxRunDistance, maxSwimDistance);
        // if(maxRunDistance > 200){
        // maxRunDistance =200;
        // }
        count++;
    }
}
