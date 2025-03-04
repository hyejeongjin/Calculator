package calculator;


import java.util.ArrayList;

public class Calculator {
    int num1;
    int num2;
    int result;

    ArrayList<Integer> resultList = new ArrayList<Integer>();

   public void setNum1(int num1){
        this.num1 = num1;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

    public int sum() {
        result = this.num1 + this.num2;
        resultList.add(result);
        return result;
    }
    public int subtract(){
        result = this.num1 - this.num2;
        resultList.add(result);
        return result;
    }
    public int multiply(){
        result = this.num1 * this.num2;
        resultList.add(result);
        return result;
    }
    public int division(){
        result = this.num1 / this.num2;
        resultList.add(result);
        return result;
    }
}
