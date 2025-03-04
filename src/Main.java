import calculator.Calculator;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        // 반복문 실행 시에 초기화되는 일을 막기 위해 반복문 밖에 작성.
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);

        while (true) {
            // Lv 1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기
            // 양의 정수(0 포함)를 입력받기
            System.out.print("첫번째 숫자를 입력해주세요: ");
            int num1 = input.nextInt();
            System.out.print("두번째 숫자를 입력해주세요: ");
            int num2 = input.nextInt();

            // setter로 calculator 클래스에 값 넘기기.
            calculator.setNum1(num1);
            calculator.setNum2(num2);
            if (num1 < 0 || num2 < 0) {
                System.out.println("0을 포함한 양의 정수만 입력하세요!");
                continue;
            }
            System.out.print("사칙연산 기호(+, -, *, /)를 입력하세요: ");
            String operator = input.next();
            //버퍼 비우기
            input.nextLine();
            char oper = operator.charAt(0);
            int result = 0;

            switch (oper) {
                case '+':
                    result = calculator.sum();
                    calculator.setList(result);
                    break;
                case '-':
                    result = calculator.subtract();
                    calculator.setList(result);
                    break;
                case '*':
                    result = calculator.multiply();
                    calculator.setList(result);
                    break;
                case '/':
                    // try~catch 문 Calculator 클래스로 이동.
                    result = calculator.division();
                    break;
                default:
                    System.out.println("잘못된 연산자를 입력하셨습니다!");
            }
            System.out.println("결과: " + result);
            System.out.println("저장된 계산결과: " + calculator.getList());
            //계속 계산할건지 체크
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = input.nextLine();
            if (answer.equals("exit")) {
                System.exit(0);
            }
            System.out.println("계산한 값을 지우시겠습니까? yes 입력 시 가장 먼저 저장된 데이터가 삭제됩니다.");
            String erase = input.nextLine();
            if(erase.equals("yes")){
                calculator.removeList();
            }
        }
    }
}

