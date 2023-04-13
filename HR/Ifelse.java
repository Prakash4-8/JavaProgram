import java.util.*;
public class Ifelse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        N = 24;

        sc.close();
        if (N%2 ==1 || (N %2 ==0 && (6 <= N && N<=20 ))){
            System.out.println("Weird");
        }
        else if((N %2 ==0 && (2<= N && N<=5)) || (N%2 ==0 && 20<N)){
            System.out.println("Not Weird");
        }
        
    }
}
