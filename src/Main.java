public class Main {
    public static void main(String[] args) {
        // задание 1
        byte number1 = 0;
        short number2 = 12512;
        int number3 = 12312415;
        long number4 = 151259812095815L;
        float number5 = 1.345235F;
        double number6 = 2.235235235235253;
        char key = 1;
        Boolean tru = true;

        // задание 2
        double boxerOne = 78.2;
        double boxerTwo = 82.7;
        double sum = boxerOne + boxerTwo;
        double difference = boxerTwo % boxerOne;
        System.out.println("Общий вес боксеров составляет " + sum + "кг");
        System.out.println("Разница в весе боксеров составляет " + difference + "кг");
        System.out.println();

        // задание 3
        int numberOfBananas = 5;
        int weightOfBananas = 80;
        int milkMl = 200;
        float weightOfMilk = 1.05F;
        int numberOfIceCream = 2;
        int weightOfIceCream = 100;
        int numberOfEgg = 4;
        int weightOgEgg = 70;
        var breakfastMg = (numberOfBananas * weightOfBananas)+(milkMl * weightOfMilk)+(numberOfIceCream * weightOfIceCream)+(numberOfEgg * weightOgEgg);
        var breakfastKg = breakfastMg / 1000;
        System.out.println("Масса завтрака составит " + breakfastKg + "кг");
        System.out.println();

        /// задание 4
        int weightKg = 7;
        int numberMgInKg = 1000;
        int weightMg = weightKg * numberMgInKg;
        int minWeightForDay = 250;
        int maxWeightForDay = 500;
        var minNumberOfDays = weightMg / maxWeightForDay;
        var maxNumberOfDays = weightMg / minWeightForDay;
        var averageNumberOfDays = (minNumberOfDays + maxNumberOfDays) / 2;
        System.out.println("Минимальное количество дней для похудения составит " + minNumberOfDays);
        System.out.println("Максимальное количество дней для похудения составит " + maxNumberOfDays);
        System.out.println("Среднее количество дней для похудения составит " + averageNumberOfDays);
        System.out.println();

        // задание №5
        int period = 12;
        int currentSalaryForMasha = 67_760;
        int currentSalaryForDenis = 83_690;
        int currentSalaryForKristina  = 76_230;
        float bet =10;
        float kef = (100 + bet)/100;
        var newSalaryForMasha = currentSalaryForMasha * kef;
        var newSalaryForDenis = currentSalaryForDenis * kef;
        var newSalaryForKristina = currentSalaryForKristina * kef;
        System.out.println("Маша теперь получает " + newSalaryForMasha +" рублей. Годовой доход вырос на " + ((newSalaryForMasha - currentSalaryForMasha) * period) +" рублей");
        System.out.println("Денис теперь получает " + newSalaryForDenis +" рублей. Годовой доход вырос на " + ((newSalaryForDenis - currentSalaryForDenis) * period) +" рублей");
        System.out.println("Кристина теперь получает " + newSalaryForKristina +" рублей. Годовой доход вырос на " + ((newSalaryForKristina - currentSalaryForKristina) * period) +" рублей");

    }
}