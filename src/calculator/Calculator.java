package calculator;


import java.util.ArrayList;

public class Calculator{
    int num1;
    int num2;
    int result;

    // 결과 값을 담을 list
    // 캡슐화
    // 인텔리제이는 왜 final을 추천할까? -> 불변객체
    // 불변객체 선언 : 값을 함부로 변경할 수 없도록.
    private final ArrayList<Integer> list = new ArrayList<Integer>();

   public void setNum1(int num1){
       isNum();
       this.num1 = num1;
    }

    public void setNum2(int num2){
       isNum();
       this.num2 = num2;
    }

    public boolean isNum(){
       if(this.num1 <= -1 || this.num2 <= -1){
           return false;
       }
       return true;
    }

    // list의 getter, setter
    // list가 불변객ㅊ체로 설정되어있지만
    // 값 변경 및 재초기화한 것이 아니기 때문에 setter 사용 가능!!
    public void setList(int result){
        this.list.add(result);
    }

    public ArrayList<Integer> getList(){
        return this.list;
    }
    // 가장 먼저 저장된 데이터 삭제
    public void removeList(){
       try{
           this.list.remove(0);
       }catch(IndexOutOfBoundsException e){
           System.out.println("저장된 값이 없습니다.");
       }
    }
}
