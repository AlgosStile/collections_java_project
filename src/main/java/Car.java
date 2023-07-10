import java.util.Objects;

public class Car  {
    private final String brand;// марка автомобиля
    private int number;// номер автомобиля

    public Car(String brand, int number) {// конструктор класса Car
        this.brand = brand;// присваиваем значение поля марки автомобиля
        this.number = number;// присваиваем значение поля номера автомобиля
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", number=" + number +
                '}';
    }

    public String getBrand() {// метод для получения значения поля марки автомобиля

        return brand;// возвращаем значение поля марки автомобиля
    }

    public int getNumber() {// метод для получения значения поля номера автомобиля

        return number;// возвращаем значение поля номера автомобиля
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, number);
    }


}
    //    @Override//переопределяем метод для вставки equals в класс Car
//    public boolean equals(Object obj) {
//        if (obj instanceof Car) {
//            Car car = (Car) obj;
//            return this.brand.equals(car.getBrand()) && this.number == car.getNumber();
//        } else {
//            return false;
//        }
//    }
//
//    @Override
//    public int hashCode() {//переопределяем метод для вставки hashCode в класс Car
//        return this.brand.hashCode() + this.number;
//    }
//}



