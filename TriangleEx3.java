package Crash_Triangles.src;

import java.util.Scanner;
public class TriangleEx3 {
    public static void main(String[] args){
        System.out.println("삼각형 높이를 정해주세요. 1~5 ");
        Scanner user = new Scanner(System.in);
        int t = user.nextInt();
     if(t >= 1 && t <= 5){
      System.out.println("입력받은 값은 "+ t + "입니다.");
      for(int s = 1; s <= t; s++ )
         {
             for(int ss = 1; ss <= s; ss++) {
                 System.out.print("*");
             }
             System.out.println();
         }

     }
     else {
         System.out.print("입력받은 값은 "+ t + "입니다.");
         System.out.println("1에서 5 사이의 값을 입력해주세요");
     }
    }
}

