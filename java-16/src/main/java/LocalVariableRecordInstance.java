import java.util.HashSet;
import java.util.Set;

public class LocalVariableRecordInstance {

    public static void main(String[] args) {
        Object obj = new Person("chandu", 25);
        if (obj instanceof Person(String x, int y)) {
            System.out.println(x);
            System.out.println(y);
        }
        String[] strings = {"flower", "flow", "flight"};
        String prefix = strings[0];
        for(int i=1;i<strings.length;i++){
            while(strings[0].indexOf(prefix)!=0){
                prefix = prefix.substring(0, prefix.length() -1);
                }
            }

        System.out.println(prefix);
    }
}
