public class Main {
    public static void main(String[] args) {
        //1
        String city = "Фукуока";
        int populationSize = 1461755;
        float pctUnemployed = 3.1F;
        System.out.printf("1) Город: %s | Население: %d, чел. | Безработные: %.1f%%\n",city,populationSize,pctUnemployed);
        //2
        char section = 'A';
        short seatNumber = 6;
        float ticketPrice = 156.77788F;
        System.out.printf("2) Секция: %s | Место №: %d | Стоимость билета: %.2f$\n",section,seatNumber,ticketPrice);
        //3
        String name = "Роберт Уодлоу";
        int age = 22;
        float growth = 272;
        System.out.printf("3) Имя: %s | Возраст: %d | Рост: %.0fсм\n",name,age,growth);
        //4
        char letters ='A';
        short numbers = 666;
        float weight = 2435.87F;
        System.out.printf("4) Номер: [%s%d%s%s] | Вес: %.2fкг\n",letters,numbers,letters,letters,weight);
        //5
        String companyName = "Netflix";
        long annualIncome = 3000000000000L;
        float marketShare = 8.4F;
        System.out.printf("5) Компания: %s | Годовая прибыль: %d | Доля на рынке: %.1f%%\n",companyName,annualIncome,marketShare);
        //6
        char rhFactor = '-';
        byte bloodType = 1;
        float proportionOfPeople = 33;
        System.out.printf("6) Резус-фактор: \"%s\" | Группа крови: %d | Доля людей с этой группой: %.0f%%\n",rhFactor,bloodType,proportionOfPeople);
        //7
        String university = "МГУ";
        int numberOfStudents = 38150;
        float pctOfExpelled = 10;
        System.out.printf("7) Университет: %s | Число студентов: %d | Процент отчисленных: %.0f\n",university,numberOfStudents,pctOfExpelled);
        //8
        char filmRating = 'R';
        int copiesSold = 500000;
        float rating = 8.8F;
        System.out.printf("8) Рейтинг MPAA: %s | Проданных копий: %d | Рейтинг фильма: %.1f\n",filmRating,copiesSold,rating);
        //9
        String brandName = "NoName";
        int producedGoods = 200000;
        float pctOfSales = 41;
        System.out.printf("9) Бренд: %s | Произведено продукции: %d | Процент продаж: %.0f\n",brandName,producedGoods,pctOfSales);
        //10
        String productCategory = "Парфюмерная вода";
        long barcode = 3423470890129L;
        float pctOfBuyersOverThirty = 50.4F;
        System.out.printf("10) Категория товара: \"%s\" | Штрихкод: %d | Процент покупателей старше 30: %.1f",productCategory,barcode,pctOfBuyersOverThirty);

    }
}
