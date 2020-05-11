package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();
        set.add("이순신");
        set.add("김유신");
        set.add("강감찬");
        set.add("이순신");
        set.add("세종대왕");

        Iterator<String> ir = set.iterator();

        while(ir.hasNext()) {
            String str = ir.next();
            System.out.println(str);
        }

//        System.out.println(set);
//
//        ArrayList<String> arrayList = new ArrayList<String>();
//        arrayList.add("이순신");
//        arrayList.add("김유신");
//        arrayList.add("강감찬");
//        arrayList.add("이순신");
//        arrayList.add("세종대왕");
//
//        System.out.println(arrayList);


    }
}
