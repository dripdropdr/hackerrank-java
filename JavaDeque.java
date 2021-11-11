import java.util.*;
public class JavaDeque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque deque = new ArrayDeque<Integer>();
        HashSet<Integer> hashSet = new HashSet<>();
        int maxunique = 0;

        int n = sc.nextInt();
        int m = sc.nextInt();


        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            deque.addLast(num);
            hashSet.add(num);

            if(deque.size() == m){

                maxunique = Math.max(maxunique, hashSet.size());
//                if(maxunique < hashSet.size()){
//                    maxunique = hashSet.size();
//                }
                for(Object j: deque){
                    System.out.print((int)j+" ");
                }
                System.out.print("\n");

                Object out = deque.removeFirst();

                if (!deque.contains(out)){
                    hashSet.remove((Integer)out);
                }

            }

        }

//        Error at 3 3 \n 1 2 3
//        for (int i = 0; i < n; i++) {
//            int num = sc.nextInt();
//
//            if(deque.size() == m){
//
//                if(i == m){
//                    hashSet = new HashSet<>(deque);
//                    maxunique = hashSet.size();
//                }
//                //firstout
//                Object out = deque.pollFirst();
//                //lastin
//                deque.addLast(num);
//
//                if (!deque.contains(out)){
//                    hashSet.remove((Integer)out);
//                }
//                hashSet.add(num);
//                if(maxunique < hashSet.size()){
//                    maxunique = hashSet.size();
//                }
//
//
//            }else{
//                deque.add(num);
//            }
//        }

        System.out.println(maxunique);
    }
}