public class ComputerExample {
    public static void main(String[] args){
        int r = 10;
        Calculator calculator = new Calculator();
        System.out.println("원면적 : "+calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적 : "+computer.areaCircle(r));
        System.out.println();

        System.out.println("10 이상이면 자식 메소드, 10이하이면 부모 메소드");
        System.out.println("처음엔 1과 2");
        System.out.println("값 : "+computer.plus(1,2));

        System.out.println("다음엔 10,20");
        System.out.println("값 : "+computer.plus(10,20));



    }
}
