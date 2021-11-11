public class JavaStack {
}
//import java.util.*;
//class Solution{
//
//    public static void main(String []args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        HashMap<String, String> map = new HashMap<String,String>();
//        map.put("(",")");
//        map.put("{","}");
//        map.put("[","]");
//
//        ArrayList<String> result = new ArrayList<String>();
//
//        while (sc.hasNext()) {
//            String input=sc.next();
//
//            Stack<String> stack = new Stack<>();
//            boolean flg = true;
//            for(int count = 0; count<input.length(); count++){
//
//                if(stack.empty()){
//
//                    if(Character.toString(input.charAt(count)).equals(map.get("(")) || Character.toString(input.charAt(count)).equals(map.get("{")) || Character.toString(input.charAt(count)).equals(map.get("["))){
//
//                        result.add("false");
//                        flg = false;
//                        break;
//                    }else{
//
//                        stack.push(Character.toString(input.charAt(count)));
//                    }
//                }else{
//
//                    if(Character.toString(input.charAt(count)).equals(map.get("(")) || Character.toString(input.charAt(count)).equals(map.get("{")) || Character.toString(input.charAt(count)).equals(map.get("["))) {
//                        if (map.get(stack.peek()).equals(Character.toString(input.charAt(count)))) {
//
//                            stack.pop();
//                        } else {
//
//                            result.add("false");
//                            flg = false;
//                            break;
//                        }
//                    }else{
//
//                        stack.push(Character.toString(input.charAt(count)));
//                    }
//                }
//            }
//            if(stack.empty() && flg){
//                result.add("true");
//            }else if(!stack.empty() && flg){
//                result.add("false");
//            }
//        }
//
//        sc.close();
//        for (String st : result){
//            System.out.println(st);
//
//        }
//    }
//}