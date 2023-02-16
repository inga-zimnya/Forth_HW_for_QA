public class Car {
    String color;
    String type;
    int year;
    public Car(){}

    public void start(){
        System.out.println("Автомобиль заведен");
    }

    public void shutdown(){
        System.out.println("Автомобиль заглушен");
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setType(String type){
        this.type = type;
    }
}