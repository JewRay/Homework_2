public class Main {
    public static void main(String[] args) {
        //Задача 1

        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Значение переменной dog = "+dog);
        System.out.println("Значение переменной cat = "+cat);
        System.out.println("Значение переменной paper = "+paper);

        //Задача 2

        System.out.println("Задача 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("Значение переменной dog = "+dog);
        System.out.println("Значение переменной cat = "+cat);
        System.out.println("Значение переменной paper = "+paper);

        //Задача 3

        System.out.println("Задача 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("Значение переменной dog = "+dog);
        System.out.println("Значение переменной cat = "+cat);
        System.out.println("Значение переменной paper = "+paper);

        //Задача 4

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("Значение переменной friend = "+friend);
        friend +=2;
        System.out.println("Значение переменной friend + 2 = "+friend);
        friend /=7;
        System.out.println("Значение переменной friend / 7 = "+friend);

        //Задача 5

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("Значение переменной frog = "+frog);
        frog *= 10;
        System.out.println("Значение переменной frog * 10 = "+frog);
        frog /= 3.5;
        System.out.println("Значение переменной frog / 3.5 = "+frog);
        frog += 4;
        System.out.println("Значение переменной frog + 4 = "+frog);

        //Задача 6

        System.out.println("Задача 6");
        var boxerWeigt_1 = 78.2;
        var boxerWeigt_2 = 82.7;
        var totalWeigth = boxerWeigt_2 + boxerWeigt_1;
        var differWeight = boxerWeigt_2 - boxerWeigt_1;
        System.out.println("Общая масса двух бойцов равна "+totalWeigth+" кг.");
        System.out.println("Разница в массе двух бойцов равна "+differWeight+" кг.");

        //Задача 7
        System.out.println("Задача 7");
        var differWeight_1 = boxerWeigt_2 - boxerWeigt_1;
        System.out.println("Разница в массе двух бойцов равна "+ differWeight_1 +" кг.");
        var differWeight_2 = boxerWeigt_2 % boxerWeigt_1;
        System.out.println("Разница в массе двух бойцов равна "+ differWeight_2 +" кг.");

        //Задача 8
        System.out.println("Задача 8");
        var totalTime = 640;
        var timePerWorker = 8;
        var totalWorker = totalTime / timePerWorker;
        System.out.println("Всего работников в компании - "+totalWorker+" человек");
        totalWorker += 94;
        totalTime = totalWorker * timePerWorker;
        System.out.println("Если в компании работает "+totalWorker+
                " человек, то всего "+totalTime+
                " часов работы может быть поделено между сотрудниками");

    }
}