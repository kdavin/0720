import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//로또만들기-업그레이드
public class Test {
    public static void main(String[] args) {
        Set aa= new HashSet();
        ArrayList list1=new ArrayList();

        //i=0
        for (int i = aa.size(); i <7 ; i++) {
            //강제 형변환  //(0~44)+1
            int ran = (int)(Math.random()*45)+1;
            aa.add(ran);

        }
        for (Object o:aa){
            System.out.println(o);
        }

        for (int i = 0; i <45 ; i++) {
            list1.add(i+1);

        }
        Iterator iter=aa.iterator();
        while (iter.hasNext()) {
            Object e=iter.next();
             for(int j = 0; j <list1.size() ; j++) {
                if(e.equals(list1.get(j))){
                    list1.set(j,"["+list1.get(j)+"]");
                   //String num=String.valueOf(list1.get(j));
                   //num="["+num+"]";
                   //list1.set(j,num);

                }
            }       //첫번째값부터
        }
        for (int i = 0; i <45 ; i++) {

            System.out.print(list1.get(i) +" ");
            if((i+1)%5==0) {
                System.out.println(" ");
            }

        }




    }
}
//main 메소드에 static으로 인해 main밖에 변수 생성 후 사용시 에러
//메모리 등록전에 만든 변수 사용 x
//배열
// 리스트
//Set HashSet()중복된 값 허용 x,순서x 저장
//TreeSet()중복된 값 허용 x,순서대로 저장
//LinkedHashSet()중복된 값 허용 x,순서대로 저장,오름차순 저장
//Math 수학식

