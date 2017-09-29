package module5.carInformation;

public class Car {
    /*Класс Car

    На прямую к переменным этого класса никто не может, только через методы
            Хранит

    дата производства (неизменна после создания объекта)

    тип двигателя

    максимальная скорость машины (если она новая)

    время разгона до 100км/ч

            пассажировместимость

    кол-во пассажиров внутри в данный момент

    текущая скорость

    массив колес

    массив дверей

    Конструктор

    Нет пустого конструктора. Так как есть поля в классе, которые нельзя изменять после создания объекта. Например дата производства.

    Конструктор с датой производства.

    Конструктор со всеми полями, кроме массива колес и массива дверей.

            Методы

    Изменить текущую скорость

    Посадить 1 пассажира в машину

    Высадить 1 пассажира

    Высадить всех пассажиров

    Получить дверь по индексу

    Получить колесо по индексу

    Снять все колеса с машины

    Установить на машину X новых колесу (вдобавок к имеющимся, то есть если было 4 колеса, после вызова метода с Х аргументом равным трем, колес будет 4+3=7)

    Вычислить текущую возможную максимальную скорость (Скорость машины вычисляется так. Максимальная скорость новой машины множиться на самое стертое колесо в машине. Максимальная скорость равна 0 если в машине нет ни одного пассажира, так как некому ее вести)

    Вывести в консоль данные об объекте (все поля и вычисленную максимальную скорость в зависимости от целостности колес и наличия водителя)*/

    private String typeOfEngine;
    private double maxSpeed;
    private double accelerationTime100km;
    private int passengers;
    private int currentPassengers;
    private double currentSpeed;
    private CarWheel[] carWheel = new CarWheel[] {new CarWheel(), new CarWheel(), new CarWheel(), new CarWheel()};
    private CarDoor[] carDoor = new CarDoor[]{new CarDoor(), new CarDoor(), new CarDoor(), new CarDoor()};

    public Car(final String dateOfConstruction){

    }

    public Car(String typeOfEngine, double maxSpeed, double accelerationTime100km, int passengers, int currentPassengers, double currentSpeed){
        this.typeOfEngine = typeOfEngine;
        this.maxSpeed = maxSpeed;
        this.accelerationTime100km = accelerationTime100km;
        this.passengers = passengers;
        this.currentPassengers = currentPassengers;
        this.currentSpeed = currentSpeed;
    }

    public int onePassengerMore(){
        return currentPassengers++;
    }

    public int onePassengerLess(){
        return currentPassengers--;
    }

    public int noMorePassengers(){
        return currentPassengers = 0;
    }

    public CarDoor doorByIndex(int i){
        return carDoor[i];
    }

    public CarWheel wheelByIndex(int i){
        return carWheel[i];
    }

    public void wheelsOffTheCar(){
        for(int i = 0; i <= carWheel.length; i++){
            carWheel[i] = null;
        }
    }

    public CarWheel moreWheels(int x){
        for()
    }

    double currentMaxSpeed;
    public double currentMaxSpeed(){
        if(currentPassengers == 0)
            return currentMaxSpeed = 0;

        double min = carWheel[0].getTireIntegrity();
        for(int i = 1; i < carWheel.length; i++) {
            if(carWheel[i].getTireIntegrity() < min) {
                min = carWheel[i].getTireIntegrity();
            }
        }
        return currentMaxSpeed = maxSpeed * min;

    }

    public void show(){
        System.out.println();
        System.out.println(typeOfEngine);
        System.out.println(maxSpeed);
        System.out.println(accelerationTime100km);
        System.out.println(passengers);
        System.out.println(currentPassengers);
        System.out.println(currentSpeed);

        for(CarWheel a : carWheel){
            System.out.print(a);
        }
        System.out.println();
        for(CarDoor a : carDoor){
            System.out.print(a);
        }
        System.out.println(currentMaxSpeed);
    }

}
