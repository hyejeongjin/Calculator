import calculator.Calculator;
import calculator.OperatorType;

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
            // calculator 클래스에서 0을 포함한 정수 체크
            calculator.setNum1(num1);
            calculator.setNum2(num2);
            if (!calculator.isNum()) {
                System.out.println("0을 포함한 양의 정수만 입력하세요!");
                continue;
            }

            System.out.print("사칙연산 기호(+, -, *, /)를 입력하세요: ");
            String operator = input.next();
            //버퍼 비우기
            input.nextLine();
            char op = operator.charAt(0);
            OperatorType operType = OperatorType.getOperate(op);
            int result = 0;

            switch (operType) {
                case PLUS:
                    result = OperatorType.PLUS.apply(num1, num2);
                    calculator.setList(result);
                    break;
                case MINUS:
                    result = OperatorType.MINUS.apply(num1, num2);
                    calculator.setList(result);
                    break;
                case MUL:
                    result = OperatorType.MUL.apply(num1, num2);
                    calculator.setList(result);
                    break;
                case DIV:
                    // enum 사용으로 인해 try ~ catch 문 다시 복구.
                    try{
                        result = OperatorType.DIV.apply(num1, num2);
                        // 계산이 될 경우에만 list에 값 저장.
                        calculator.setList(result);
                    }catch (ArithmeticException e){
                        System.out.println("나눗셈 연산에서 두번째 정수에 0을 입력할 수 없습니다.");
                    }
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
                System.out.println("삭제 후 저장된 결과: " + calculator.getList());
            }
        }
    }
}

