public class Main {

    public static void main(String[] args) {

        Logger logger = new Logger();
        logger.log(Logger.LogLevel.INFO, "Приложение запущено");

        Calculator calculator = new Calculator();
        System.out.println(calculator.divide(10, 2));
    }
}
