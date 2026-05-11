
import java.util.StringTokenizer;

public class StringTokenizers {
    public static void main(String[] args) {
        String str="10,20,30,40";
        StringTokenizer st=new StringTokenizer(str,",");
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
