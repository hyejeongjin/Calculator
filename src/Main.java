import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Lv 1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기
        // 양의 정수(0 포함)를 입력받기
        Scanner input = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해주세요: ");
        int num1 = input.nextInt();
        System.out.print("두번째 숫자를 입력해주세요: ");
        int num2 = input.nextInt();
        System.out.print("사칙연산 기호(+, -, *, /)를 입력하세요: ");
        String operator = input.next();
        char op = operator.charAt(0);
        int result;


        //연산 오류가 발생할 경우 해당 오류에 대한 내용을 정제하여 출력
        //ex) “나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.“

        switch (op) {
            case '+':
                result = num1 + num2;
                System.out.println("결과: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("결과: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("결과: " + result);
                break;
            case '/':
                try {
                    result = num1 / num2;
                    System.out.println("결과: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("나눗셈 연산에서 두번째 정수에 0을 입력할 수 없습니다.");
                }
                break;
            default:
                System.out.println("잘못된 연산자를 입력하셨습니다!");
        }


    }
}