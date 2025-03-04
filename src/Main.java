import calculator.Calculator;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            // Lv 1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기
            // 양의 정수(0 포함)를 입력받기
            System.out.print("첫번째 숫자를 입력해주세요: ");
            int num1 = input.nextInt();
            System.out.print("두번째 숫자를 입력해주세요: ");
            int num2 = input.nextInt();
            Calculator calculator = new Calculator();

            // setter로 calculator 클래스에 값 넘기기.
            calculator.setNum1(num1);
            calculator.setNum2(num2);
            if(num1 < 0 || num2 < 0){
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
                    break;
                case '-':
                    result = calculator.subtract();
                    break;
                case '*':
                    result = calculator.multiply();
                    break;
                case '/':
                    //연산 오류가 발생할 경우 해당 오류에 대한 내용을 정제하여 출력
                    //ex) “나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.“
                    try {
                        result = calculator.division();
                    } catch (ArithmeticException e) {
                        System.out.println("나눗셈 연산에서 두번째 정수에 0을 입력할 수 없습니다.");
                    }
                    break;
                default:
                    System.out.println("잘못된 연산자를 입력하셨습니다!");
            }
            System.out.println("결과: " + result);
            //계속 계산할건지 체크
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = input.nextLine();
            if(answer.equals("exit")){
                System.exit(0);
            }

        }
    }
}

