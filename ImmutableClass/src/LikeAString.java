import java.io.Serializable;

public final class LikeAString implements Serializable {

    private final String name;
    private static  LikeAString las;

    public  String getName(){
        return name;
    }

    private LikeAString(String name) {
        this.name = name;
    }
    public static LikeAString newInstance(Object obj) {
        if(las==null){
            las=new LikeAString(obj.toString());
            return las;
        }
        return las;

    }


    @Override
    public String toString() {
        return getName();
    }
}
