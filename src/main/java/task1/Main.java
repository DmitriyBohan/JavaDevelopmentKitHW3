package task1;

/*Написать класс Калькулятор (необобщенный),
который содержит обобщенные статические методы:
sum(), multiply(), divide(), subtract().
Параметры этих методов – два числа разного типа,
над которыми должна быть произведена операция.
Методы должны возвращать результат своей работы.
 */

import static task1.Calculator.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sum:       "+sum(5,3));

        System.out.println("Multiply:  "+ multiply(5,2.5));

        System.out.println("Divide:    "+divide(5,2.5));

        System.out.println("Subtract:  "+subtract(5,7));
    }




}
