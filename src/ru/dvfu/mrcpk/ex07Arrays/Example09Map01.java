package ru.dvfu.mrcpk.ex07Arrays;

import java.io.IOException;
import java.util.*;

public class Example09Map01 {
    public static void main(String[] args) throws IOException {
        Map<String,String> map = new HashMap<String,String>();

        map.put("Пупкин", "Олег");
        map.put("Козлов", "Михаил");
        map.put("Иванов", "Иван");
        map.put("Николаев", "Олег");
        map.put("Пупкин", "Коля");
        map.put("Сидоров", "Коля");

//        Iterator<Map.Entry<String,String>> map111 = map.entrySet().iterator();
//        while (map111.hasNext()) {
//            System.out.println(map111.next());
//        }


        for(Map.Entry<String,String> map111 : map.entrySet()){
            System.out.print(map111.getKey() + " ");
            System.out.println(map111.getValue());
        }





//        System.out.println();
//        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Введите имя человека, запись о котором следует удалить:");
//        String s = bufferedReader.readLine();
//
//        Set<String> setTmp=new HashSet<String>();
//        for(Map.Entry<String,String> map11 : map.entrySet()){
//            if(map11.getValue().equals(s))
//                setTmp.add(map11.getKey());
//        }
//        for(String setTmp1 : setTmp){
//            map.remove(setTmp1);
//        }
//
//        for(Map.Entry<String,String> map11 : map.entrySet()){
//            System.out.println(map11);
//        }

//        bufferedReader.close();

    }
}
