# 2주차 : 자바 데이터 타입, 변수 그리고 배열

# 목표

## 자바의 프리미티브 타입, 변수 그리고 배열을 사용하는 방법을 익힙니다.

---

# 학습할 것

## 프리미티브 타입 종류 & 값의 범위 & 기본 값

### 기본형 타입 (Primitive type)

→ 기본값이 있어 Null이 없다.
→ 스택 메모리에 저장.
→ 컴파일 시 크기 정해져서 컴파일 에러가 발생.

![2%E1%84%8C%E1%85%AE%E1%84%8E%E1%85%A1%20%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1%20%E1%84%83%E1%85%A6%E1%84%8B%E1%85%B5%E1%84%90%E1%85%A5%20%E1%84%90%E1%85%A1%E1%84%8B%E1%85%B5%E1%86%B8,%20%E1%84%87%E1%85%A7%E1%86%AB%E1%84%89%E1%85%AE%20%E1%84%80%E1%85%B3%E1%84%85%E1%85%B5%E1%84%80%E1%85%A9%20%E1%84%87%E1%85%A2%E1%84%8B%E1%85%A7%E1%86%AF%204ac6b062d57e41d3abeddeca99553887/Untitled.png](2%E1%84%8C%E1%85%AE%E1%84%8E%E1%85%A1%20%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1%20%E1%84%83%E1%85%A6%E1%84%8B%E1%85%B5%E1%84%90%E1%85%A5%20%E1%84%90%E1%85%A1%E1%84%8B%E1%85%B5%E1%86%B8,%20%E1%84%87%E1%85%A7%E1%86%AB%E1%84%89%E1%85%AE%20%E1%84%80%E1%85%B3%E1%84%85%E1%85%B5%E1%84%80%E1%85%A9%20%E1%84%87%E1%85%A2%E1%84%8B%E1%85%A7%E1%86%AF%204ac6b062d57e41d3abeddeca99553887/Untitled.png)

## 프리미티브 타입과 레퍼런스 타입

### 참조형 타입 (Reference type)

→ 기본형 타입을 제외한 모든 타입.
→ Null 이 존재한다.
→ Heap 메모리에 저장.
→ Runtime Error, NullPointException 발생 가능.

![2%E1%84%8C%E1%85%AE%E1%84%8E%E1%85%A1%20%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1%20%E1%84%83%E1%85%A6%E1%84%8B%E1%85%B5%E1%84%90%E1%85%A5%20%E1%84%90%E1%85%A1%E1%84%8B%E1%85%B5%E1%86%B8,%20%E1%84%87%E1%85%A7%E1%86%AB%E1%84%89%E1%85%AE%20%E1%84%80%E1%85%B3%E1%84%85%E1%85%B5%E1%84%80%E1%85%A9%20%E1%84%87%E1%85%A2%E1%84%8B%E1%85%A7%E1%86%AF%204ac6b062d57e41d3abeddeca99553887/Untitled%201.png](2%E1%84%8C%E1%85%AE%E1%84%8E%E1%85%A1%20%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1%20%E1%84%83%E1%85%A6%E1%84%8B%E1%85%B5%E1%84%90%E1%85%A5%20%E1%84%90%E1%85%A1%E1%84%8B%E1%85%B5%E1%86%B8,%20%E1%84%87%E1%85%A7%E1%86%AB%E1%84%89%E1%85%AE%20%E1%84%80%E1%85%B3%E1%84%85%E1%85%B5%E1%84%80%E1%85%A9%20%E1%84%87%E1%85%A2%E1%84%8B%E1%85%A7%E1%86%AF%204ac6b062d57e41d3abeddeca99553887/Untitled%201.png)

## 리터럴

### 상수(constant) vs 리터럴(literal)

- 둘다 변하지 않는 값(데이터)

### 상수

변하지 않는 변수 (메모리 위치)

*참조변수가 상수 라면 :  참조변수 메모리 주소값이 변하지 않는다.
참조변수의 인스턴스 안의 데이터가 변하지 않는 것은 아니다.

```jsx
final Test t1 = new Test();
t1 = new Test   // 불가능
t1.num = 10;    // 가능
```

C,C++,C# : const
java : final

### 리터럴

변수의 값이 변하지 않는 데이터 (메모리 위치안의 값)

```jsx
final int a = 1;
a 는 상수.
1 는 리터럴.
```

객체는 보통 동적으로 생성되고 무슨 값을 가질지 몰라 리터럴이 될 수 없지만,
불변 클래스(immutable class)는 데이터가 변하지 않는다.
변한다면 새로운 객체를 만들어준다.
ex) String, Color 클래스

## 변수 선언 및 초기화하는 방법

```jsx
var month, date;             // 여러 변수를 한 번에 선언
var hours = 7, minutes = 15; // 여러 변수를 선언과 동시에 초기화
month = 10, date = 5;        // 여러 변수를 한 번에 초기화
```

### 변수 이름

영문자(대소문자), 숫자, 언더스코어(_), 달러($)로만 구성.

숫자 시작 X

대소문자 구분

## 변수의 스코프와 라이프타임

### Types of Variables and its scope

1. Instance Variables
2. Class variables
3. Local Variables

### Instance

클래스 내+그 블록 외부, 메소드에 선언되어있는 변수.

**Scope** : 스태틱 메소드를 제외한 클래스 내부.

**Lifetime** : 메모리에 클래스가 존재할 때 까지.

### Class

클래스 내,외부에서 static으로 선언된 변수.

Scope : 클래스 내부.

Lifetime : 프로그램 끝날 때 까지.

### Local

Instance/Class를 제외한 모든 변수.

Scope : 선언된 블록.

Lifetime : 선언된 블록이 끝날 때 까지.

전역변수는 없나?

```jsx
public class scope_and_lifetime {
    int num1, num2;   //Instance Variables
    static int result;  //Class Variable
    int add(int a, int b){  //Local Variables
        num1 = a;
        num2 = b;
        return a+b;
  }
```

## 타입 변환, 캐스팅 그리고 타입 프로모션

### 묵시적 (자동)

```java
double num1 = 10;
System.out.println(num1);

: 10.0
```

### 명시적 (강제)

```java
int num1 = 1, num2 = 4;
double result2 = (double) num1 / num2;
```

## 1차 및 2차 배열 선언하기

### 1차원

- 타입[] 배열이름
- 타입 배열이름[]
    - = {배열요소1, 배열요소2, ... }
    - = new 타입[]{배열요소1, 배열요소2, ...}

### 2차원

- 타입[][] 배열이름
- 타입 배열이름[][]
- 타입[] 배열이름[]
    - = {{배열요소1}, {배열요소2}, {...}, ...}
    - = new 타입[][]

## 타입 추론, var

java 10부터 추가된 타입 추론을 지원하는 var키워드
local variable
선언과 동시에 초기화 필요.
⇒ 초기화 되는 값으로 타입을 추론하는 타입.

주의점 

- 타입을 유추할 수 있는 정보를 줘야한다.

    java 7 의 다이아몬드 연산자 사용 시 컴파일 에러

    ```java
    var messages = new ArrayList<>();
    ```

- 가독성에 대한 고민을 해야한다.

---

# 마감 일시

## 2020년 11월 21일 오후 10시

---