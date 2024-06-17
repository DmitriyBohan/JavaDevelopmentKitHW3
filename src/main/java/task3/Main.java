package task3;

/*Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
а также переопределение метода toString(), возвращающее строковое представление пары.*/


public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "Hello");
        Pair<Double, Character> pair2 = new Pair<> (2.5, 'A');


        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);

        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
        System.out.println(pair2);
    }
}
