package Test1;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] student = new int[31];// 학생 30명 있음

        for(int i=1; i<29; i++){ // 과제 28명 제출함으로 29까지
            int success = sc.nextInt();
            student[success] = 1;
        }
        // 하나씩 번호를 입력해서 해당 번호는 1로 표기
        
        for(int i=1; i<student.length; i++){
            if(student[i]!=1)
                System.out.println(i);
        }
        //이때 1이 아닌 숫자를 프린트

        sc.close();

    }
}
