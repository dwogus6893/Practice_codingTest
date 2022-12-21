package Test1;

import java.util.Scanner;

public class Main2 {

/*
X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데,
학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
교수님이 내준 특별과제를 28명이 제출했는데, 
그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] student = new int[31]; //학생이 30명이니깐
        
        
        for(int i=1;i<29;i++){ //28명이 제출했기때문에 29까지 반복
            int success = sc.nextInt(); //한번 반복할때마다 값을 받음 = 번호
            student[success] = 1; //입력 받은 번호는 1로 표기
        }

        for(int i=1;i<student.length; i++){ // 배열 student 길이 만큼 반복
            if(student[i]!=1)
                System.out.println(i);
        }
        sc.close();

    }
}

