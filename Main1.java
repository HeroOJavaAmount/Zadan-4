public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        /*Это приведет к ArithmeticException, так как деление на ноль и
        в математике и в Java запрещены.
        Один из вариантов - обработать деление на ноль в лямбда-выражении для devide.
        Или изменить тип на Double и использовать деление с плавающей точкой, где деление на ноль даст бесконечность.
        Еще способ - использование Optional.
        Также можно использовать try-catch в методе main, но это менее функционально.*/
        int c = 0;
        try {
            c = calc.devide.apply(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка при делении: " + e.getMessage());
        }
        calc.println.accept(c);
    }
}
