import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if((A <= 6 && A > 0) && (B <= 6 && B > 0) && (C <= 6 && C > 0)){
            if(A == B && A == C){
                System.out.println(10000 + (A * 1000));
            } else if ((A == B && A != C) || (A == C && A != B)) {
                System.out.println(1000 + (A * 100));
            } else if (B == C && B != A){
                System.out.println(1000 + (B * 100));
            }else {
                int max = A;
                if(max < B) max = B;
                if(max < C) max = C;
                System.out.println(max * 100);
            }
        }else System.out.println("1 ~ 6의 숫자만 입력하시오");

    }
}