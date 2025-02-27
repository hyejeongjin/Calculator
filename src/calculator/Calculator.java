package calculator;

public class Calculator {
    int num1;
    int num2;
    int result;

    /*
   public void setNum1(int num1){
        this.num1 = num1;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

    public int getNum1() {
        return this.num1;
    }
    public int getNum2() {
        return this.num2;
    }*/

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
        result = this.num1 / this.num2;

        return result;
    }
}
