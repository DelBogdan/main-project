public class Main {
    public static void main(String[] args) {

        int volume = 1200; // объем бассейна
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int sumLitres = 0; // текущий объем
        int minuteCounter = 0; // счетчик минут

        while (true) {
            if (sumLitres < volume) {
                sumLitres = sumLitres + fillingSpeed - devastationSpeed;
                minuteCounter++;
            } else
                break;
        }

        System.out.println("Для наполнения бассейна потребовалось " + minuteCounter + " минут");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        System.out.println("Я тебя вижу!");
        System.out.println("Проверка новой ветки в Git");
        System.out.println("Проверка новой ветки в Git");
        

    }
}
