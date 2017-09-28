package module5.carInformation;

public class CarWheel {
    /*Класс CarWheel

    На прямую к переменным этого класса никто не может, только через методы
            Хранит

    Состояние целостности шины (дробное число от 0-стерта до 1-новая)

    Конструктор

    Аналогичный принцип как в классе CarDoor

    Методы

    Сменить шину на новую

    Стереть шину на X%

    Получить состояние (return)

    Вывести в консоль данные об объекте*/

    private double tireIntegrity;

    public CarWheel(){
        tireIntegrity = 1;
    }

    public CarWheel(double tireIntegrity){
        if(tireIntegrity >= 0 && tireIntegrity <= 1)
            this.tireIntegrity = tireIntegrity;
        else
            System.out.println("Вы ввели неверное значение");
    }

    public void newTire(){
        if(tireIntegrity <= 0)
            tireIntegrity = 1;
    }

    public void tireWipeOff(double percent){
        
    }

}
