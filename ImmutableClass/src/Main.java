public class Main {

    public static void main(String[] args) {

        ImmutableStudent s=new ImmutableStudent(1,"shankar");
        System.out.println(s);

        LikeAString name=LikeAString.newInstance("ok");
       System.out.println(name.hashCode());
        LikeAString s2=LikeAString.newInstance(name.getName());
        System.out.println(s2.hashCode());
       System.out.println(s2.equals(name));

    }
}
