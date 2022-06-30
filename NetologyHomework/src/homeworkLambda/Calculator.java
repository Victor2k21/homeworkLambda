package homeworkLambda;

import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    BinaryOperator<Integer> devide = (x, y) -> y == 0 ? x / 1 : x / y;

//    BinaryOperator<Integer> devide = (x, y) ->  y==0 ? Objects.requireNonNull(y) : x / y;

//    int result = 0;
//    BinaryOperator<Integer> devide = (x, y) -> {
//        if (y == 0) {
//            System.out.println("Деление на " + y);
//        } else {
//            result = x / y;
//        }
//        return result;
//    };

// Проблема в том что на 0 делить нельзя,
// можно еще попробовать написать исключение с блоком try, но думаю в задании требуется другое решение
// как в лямбда сделать описание к примеру выше через if я не могу, выдает лишний 0.(Потому что интерфейс
// BinaryOperator в любом случае требует отдать число (return Integer)), поэтому в тернарном операторе поставил 1,
// чтобы вместо 0 на который нельзя делить, делило на 1, и отдавало значение делимого,
// хотя это видимо не правильно. Правильно скорее будет чтобы выводилась надпись "Деление на ноль"(не могу потому
// что return должен быть Integer)

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
