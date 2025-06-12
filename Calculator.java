import java.util.function.*;

public class Calculator {
    // Получение экземпляра Calculator
    static Supplier<Calculator> instance = Calculator::new;

    // Арифметические операции
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    // Деление с защитой от деления на 0
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y == 0) {
            System.out.println("Ошибка: деление на 0");
            return 0; // Возврат безопасного значения
        }
        return x / y;
    };

    // Операции над одним числом
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    // Проверка на положительность
    Predicate<Integer> isPositive = x -> x > 0;

    // Вывод в консоль
    Consumer<Integer> println = System.out::println;
}

