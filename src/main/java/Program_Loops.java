import java.util.Scanner;

public class Program_Loops {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//       int count = 0;
//       int sum = 0;
//       int numUser = sc.nextInt();
//       while(numUser !=0) {
//           count++;
//           sum += numUser;
//           numUser = sc.nextInt();
//
//       }
//       int aver = sum/count;
//        System.out.println(sum + "\n" + aver);
//        int numUser2;
//        int count2=-1;
//        int sum2 = 0;
//        do{
//            numUser2 = sc.nextInt();
//            count2++;
//            sum2 += numUser2;
//        }while(numUser2!=0);
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        int start = sc.nextInt();
//        int end = sc.nextInt();
//        for (int i = start; i <= end; i++){
//            if(i%2 != 0){
//                sum+=i;
//            }
//
//        }
//        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        int countFloor = sc.nextInt();
        for (int i = 1; i <= countFloor; i++) {
            for (int a = 1; a <= countFloor - i; a++)
                System.out.print(" ");

            for (int b = 1; b <= i; b++) {
                System.out.print("* ");

            }
            System.out.println();
        }


    }
}
