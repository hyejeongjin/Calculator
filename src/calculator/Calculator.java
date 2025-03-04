package calculator;


import java.util.ArrayList;

public class Calculator {
    int num1;
    int num2;
    int result;

    // 결과 값을 담을 list
    // 캡슐화
    private ArrayList<Integer> list = new ArrayList<Integer>();

   public void setNum1(int num1){
        this.num1 = num1;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

    public int sum() {
        result = this.num1 + this.num2;
        return result;
    }
    public int subtract(){
        result = this.num1 - this.num2;
        return result;
    }
    public int multiply(){
        result = this.num1 * this.num2;
        return result;
    }
    public int division(){
        try{
            result = this.num1 / this.num2;
            // 계산이 될 경우에만 list에 값 저장.
            setList(result);
        }catch (ArithmeticException e){
            System.out.println("나눗셈 연산에서 두번째 정수에 0을 입력할 수 없습니다.");
        }
        return result;
    }

    // list의 getter, setter
    public void setList(int result){
        this.list.add(result);
    }

    public ArrayList<Integer> getList(){
        return this.list;
    }
    // 가장 먼저 저장된 데이터 삭제
    public Integer removeList(){
        return this.list.remove(0);
    }
}
