package interveiwQuestion;
import java.util.*;

// i/p : abcddcdbcd
// o/p : abbcccdddd

public class int5 {
    static String sortString(String str){
        Map<Character,Integer> map = new HashMap<>();
//        for(int i=0;i< str.length();i++){
//            char ch = str.charAt(i);
//            if(map.containsKey(ch)){
//                map.put(ch, map.get(ch) + 1);
//            }else{
//                map.put(ch,1);
//            }
//        }
        //optimized no need if else
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println("map "+ map);
        System.out.println("map key set " + map.keySet());
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(char ch : list){
            System.out.println("liast " + list);
            int count = map.get(ch);
            for(int i=0;i<count;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
       String ans = sortString("abcddcdbcd");
        System.out.println(ans);
    }

}
