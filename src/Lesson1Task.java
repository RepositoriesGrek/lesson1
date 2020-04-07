public class Lesson1Task {
    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {

        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte a = 127;
        short b = 300;
        int c = 564541;
        long e = 5454141L;
        float f = 54.85f;
        double d = 56.4848;
        char symb = 'V';
        boolean t = true;
        String s = "Привет!";

        number(5); // № 5.
        System.out.println(hello("Игорь")); // № 7.
        leapYear(300); // № 8.

    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d))
    // и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static int expression(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их
    // сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean limitSumm(int a, int b) {
        int summ = a + b;
        boolean t;
        if (summ >= 10 && summ <= 20) {
            return  t = true;
        } else {
            return t = false;
        }
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
    // положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    public static void number(int i) {
        if (i >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //6. Написать метод, которому в качестве параметра передается целое число,
    // метод должен вернуть true, если число отрицательное;
    public static boolean numberNegative(int a){
        boolean t;
        if (a < 0){
            return t = true;
        } else {
            return t = false;
        }

    }

    //7. Написать метод, которому в качестве параметра передается строка,
    // обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static String hello(String name){
        String s = "Привет, " + name + "!";
        return s;
    }

    //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение
    // в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void leapYear(int a){
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0){
            System.out.println("Год " + a + " является високосным");
        } else {
            System.out.println("Год " + a + " не является високосным");
        }

    }
}

