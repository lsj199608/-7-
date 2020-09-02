public abstract class Phone { //추상클래스
    public String owner;

    public Phone(String owner){
        this.owner = owner;
    }
    public void turnOn(){
        System.out.println("폰 킴");
    }
    public void turnOff(){
        System.out.println("폰 끔");
    }
    public abstract void ringing();
}
