package calculator;


import java.util.ArrayList;

public class Calculator {
    int num1;
    int num2;
    int result;

    // 결과 값을 담을 list
    ArrayList<Integer> list = new ArrayList<Integer>();

   public void setNum1(int num1){
        this.num1 = num1;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

    public int sum() {
        result = num1 + num2;
        return result;
    }
    public int subtract(int num1, int num2){
        result = num1 - num2;
        return result;
    }
    public int multiply(int num1, int num2){
        result = num1 * num2;
        return result;
    }
    public int division(int num1, int num2){
        result = num1 / num2;
        return result;
    }


    // list의 getter, setter

    public void setList(int result){
        this.list.add(result);
    }

    public ArrayList<Integer> getList(){
        return this.list;
    }

}
