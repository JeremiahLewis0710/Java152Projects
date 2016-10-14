package ZooProject;

/**
 * Created by jeremiahlewis on 10/13/16.
 */
public class People extends Zoo {
    String phonenum;

    public People(String n, String g, int a, String p) {
        super(n, g, a);
        phonenum = p;
    }
}
