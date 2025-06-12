public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);     // 3
        int b = calc.minus.apply(1, 1);    // 0

        // Ошибка может возникнуть здесь:
        // int c = calc.devide.apply(a, b); // деление на 0

        // Решение: обернули деление в безопасный блок
        int c = calc.devide.apply(a, b);   // не вызовет исключение, выведет предупреждение

        calc.println.accept(c); // вывод результата
    }
}
// Ошибка возникла бы здесь:
// int c = calc.devide.apply(a, b);
// Причина: при b == 0 произойдёт деление на ноль и выбросится ArithmeticException.
// Решение: в Calculator.devide добавлена проверка деление на 0.
