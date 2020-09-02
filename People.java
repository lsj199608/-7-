public class People {
    public String name;
    public String ssn;

    public People(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }
    //public People(){} //이게 있다면 student에서 super(); 없어도 컴파일 오류 나지 않음
}
