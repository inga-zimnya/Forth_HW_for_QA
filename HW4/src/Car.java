public class Car {
    String color;
    String type;
    int year;

    boolean started;
    static int count = 0;

    public Car(String type, int year){
        color = "green";
        this.type = type;
        this.year = year;
        started = false;
        countCar();
    }

    public String getColor(){
        return color.toUpperCase();
    }

    public String getType(){
        return type;
    }

    public void startCar(Car car){
        if(car.started){
            System.out.println("Автомобиль уже заведен");
        }else{
            System.out.println("Автомобиль заведен");
            started = true;
        }
    }

    public void stopCar(){
        System.out.println("Автомобиль заглушен");
        started = true;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setColor(String color){
        switch(color){
            case "red":
            case "green":
                this.color = color;
            default:
                break;
        }
    }

    public static void countCar(){
        count++;
    }
}