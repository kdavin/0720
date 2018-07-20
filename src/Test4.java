import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;
//로또만들기
public class Test4 {
    public static void main(String[] args) {

        Set aa= new HashSet();
        //i=0
        for (int i = aa.size(); i <7 ; i++) {
            //강제 형변환  //(0~44)+1
            int ran = (int)(Math.random()*45)+1;
            aa.add(ran);

        }
        for (Object o:aa){
            System.out.println(o);
        }
    }
}