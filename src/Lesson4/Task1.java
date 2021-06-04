package Lesson4;

// Напишите структуру классов и продемонстрируйте работу:
// Машина имеет двигатель, бензобак (реализуйте класс для каждой сущности).
// Чтобы поехать, машину необходимо завести, т.е. включить двигатель. Реализуйте методы включения машины,
// который в свою очередь включает её двигатель.
// Реализуйте метод езды на машине (например просто печатаем на консоль, что машина поехала)
// Если машина не заведена, ехать она не может.
// Машину можно заглушить.
// После каждой поездки считаем, что машина прошла фиксированное расстояние.
// Реализовать возможность посмотреть, какое расстояние машина прошла за все время.
// Чтобы создать машину обязательно нужно иметь двигатель и бензобак.
// Марка машины, год выпуска, пройденное расстояние - не обязательны при создании машины и могут быть выставлены потом.
// (не обязательно задавать в конструкторе)
// После создания поменять двигатель машине нельзя.
// Чтобы машина завелась, у неё должно быть топливо в бензобаке, если топлива нет, машина не может завестись.
// Машину можно дозаправить, можно проверить сколько топлива осталось.
// Реализуйте пару полей для двигателя и бензобака, например: тип двигателя, общий объем бензобака, сколько бензина сейчас и т.д.

public class Task1 {
    public static void main(String[] args) {
        Engine engine = new Engine("Ferrari", 4500);
        GasTank gt = new GasTank(60, 70);
        Car car = new Car(engine, gt);
        car.setTitle("Ferrari F40");
        car.setDistance(10000);
        car.setYear(1993);
        System.out.println("Total distance is " + car.getDistance() + "km");
        System.out.println(car.isEngineStarted());
        car.run();
        car.stop();
        System.out.println("Total distance is " + car.getDistance() + "km");
        car.tank(20);
    }
}
