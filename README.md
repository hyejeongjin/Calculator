# 🧮 프로젝트 소개
**클래스를 적용한 기본적인 연산을 수행할 수 있는 계산기**

<br>

## 🧮 1. 기능 및 조건

1. **양의 정수 2개 입력**
    * Scanner를 사용하여 0을 포함하는 양의 정수 입력받기.
    * 0보다 작은 음수일경우 오류메시지 출력 후 재입력.
<br>


2. **사칙연산 기호(➕,➖,✖️,➗)로 계산**
    * Scanner를 사용하여 사칙연산 기호를 입력받기.
    * 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장.(charAt())사용.
<br>

3. **입력받은 양의 정수와 사칙연산 기호를 사용하여 연산 후 결과값 출력**
    * 입력받은 연산 기호를 구분하기 위해 제어문을 사용.
    * 연산 오류가 발생할 경우 해당 오류에 대한 내용을 정제하여 출력.
    * ex) “나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다."
    * Calculator 클래스를 생성하고 사칙연산을 수행한 후 결과값을 반환하는 메서드와
      연산 결과를 저장하는 컬렉션 타입 필드 생성.
<br>

4. **반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행**
    * 무한으로 반복, 수정하기
<br>

5. **연산 결과를 저장하는 컬렉션 필드에 직접 접근이 불가하도록 캡슐화**
    * 간접 접근을 통해 필드에 접근하여 값을 가져올 수 있도록 구현(Getter 메서드)
    * 간접 접근을 통해 필드에 접근하여 값을 수정할 수 있도록 구현(Setter 메서드)
<br>

6. **저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현**
    * 리스트에 저장된 값을 먼저 저장된 데이터부터 삭제함.
<br>

## 🧮 2. 작동순서

**1. 양의 정수 2개 입력**

**2. 사칙연산 기호 입력**

**3. 입력받은 양수와 사칙연산 기호를 이용해 결과 계산 후 값 출력**

**4. exit 문자열 입력 전까지 무한으로 계산**

**5. 저장된 값들을 삭제하고 싶으면 yes 입력**

<br>

## 3. 실행 결과
```
첫번째 숫자를 입력해주세요: 1
두번째 숫자를 입력해주세요: 2
사칙연산 기호(+, -, *, /)를 입력하세요: +
결과: 3
저장된 계산결과: [3]
더 계산하시겠습니까? (exit 입력 시 종료)

계산한 값을 지우시겠습니까? yes 입력 시 가장 먼저 저장된 데이터가 삭제됩니다.

첫번째 숫자를 입력해주세요: 2
두번째 숫자를 입력해주세요: 5
사칙연산 기호(+, -, *, /)를 입력하세요: *
결과: 10
저장된 계산결과: [3, 10]
더 계산하시겠습니까? (exit 입력 시 종료)

계산한 값을 지우시겠습니까? yes 입력 시 가장 먼저 저장된 데이터가 삭제됩니다.

첫번째 숫자를 입력해주세요: 4
두번째 숫자를 입력해주세요: 8
사칙연산 기호(+, -, *, /)를 입력하세요: *
결과: 32
저장된 계산결과: [3, 10, 32]
더 계산하시겠습니까? (exit 입력 시 종료)

계산한 값을 지우시겠습니까? yes 입력 시 가장 먼저 저장된 데이터가 삭제됩니다.
yes
삭제 후 저장된 결과: [10, 32]
더 계산하시겠습니까? (exit 입력 시 종료)
exit

Process finished with exit code 0

```

<br><br>














