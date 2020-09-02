public class Calculator { //final 클래스와 메소드는 상속, 오버라이딩이 불가능하다.
    double areaCircle(double r){
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return 3.14159*r*r;
    }
    int plus(int num1, int num2){
        System.out.println("부모 메소드 plus 실행 ");
        return num1 + num2;
    }
}
