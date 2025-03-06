package calculator;

public enum OperatorType {


    PLUS('+'){
        public int apply(int num1, int num2){
            return num1 + num2;
        }
    },
    MINUS('-'){
        public int apply(int num1, int num2){
            return num1 - num2;
        }
    },
    MUL('*'){
        public int apply(int num1, int num2){
            return num1 * num2;
        }
    },
    DIV('/'){
        public int apply(int num1, int num2){
            return num1 / num2;
        }
    };

    //생성자
    OperatorType(char oper) {

        this.oper = oper;
    }

    private final char oper;

    public static OperatorType getOperate(char operate) {

        if(OperatorType.PLUS.oper == operate){
            return OperatorType.PLUS;
        } else if (OperatorType.MINUS.oper == operate) {
            return OperatorType.MINUS;
        } else if(OperatorType.MUL.oper == operate){
            return OperatorType.MUL;
        }else if(OperatorType.DIV.oper == operate){
            return OperatorType.DIV;
        }else{
            throw new RuntimeException();
        }

    }
    public abstract int apply(int num1, int num2);

}
