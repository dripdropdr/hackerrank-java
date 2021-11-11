import java.util.*;


public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int numofline = sc.nextInt();

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(numofline);
        ArrayList<String> output = new ArrayList<>();

        for(int i = 0; i<numofline; i++){

            ArrayList<Integer> tmp = new ArrayList<>();

            int linesize = sc.nextInt();

            for(int j = 0; j<linesize; j++){
                tmp.add(j, sc.nextInt());
            }
//            System.out.println("HI");
            if(tmp.size()>0){
                arr.add(i, tmp);
            }else{
                arr.add(i, null);
            }
        }

//        for(ArrayList<Integer> j:arr){
//            for(int t:j){
//                System.out.println(t);
//            }
//        }

        int checknum = sc.nextInt();

        for(int k = 0; k<checknum; k++){
            int linenum = sc.nextInt();
            int index = sc.nextInt();

            if(arr.get(linenum-1) == null){
                output.add(k, "ERROR!");
            }else if(index <= arr.get(linenum-1).size()){
                output.add(k, Integer.toString(arr.get(linenum-1).get(index-1)));
            }else{
                output.add(k, "ERROR!");
            }
        }

        for(String e:output){
            System.out.println(e);
        }
    }
}
