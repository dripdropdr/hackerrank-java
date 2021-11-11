import java.util.*;
interface AdvancedArithmetic{
    int divisor_sum(int n);
}

// Write your Checker class here
class Checker implements Comparator<Player>{

    @Override
    public int compare(Player a, Player b){
        if(a.score > b.score){
            return -1;
        }else if(a.score == b.score){

            if(a.name.compareTo(b.name) > 0){
                return  1;
            }else if(a.name.compareTo(b.name) == 0){
                return 0;
            }else{
                return -1;
            }

        }else{
            return 1;
        }
    }
}

public class JavaInterface {

    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

