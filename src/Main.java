public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        var dog = 8.0;
        System.out.println("переменная dog="+dog);
        dog = dog + 4.0;
        System.out.println("сложение dog="+dog);
        dog = (dog - 3.5);
        System.out.println("вычитание dog="+dog);

        System.out.println("Задание 2");
        var cat = 3.6;
        System.out.println("переменная cat="+cat);
        cat = cat + 4.0;
        System.out.println("сложение cat="+cat);
        cat = (cat - 1.6);
        System.out.println("вычитание cat="+cat);

        System.out.println("Задание 3");
        var paper = 763789;
        System.out.println("переменная paper="+paper);
        paper = paper + 4;
        System.out.println("сложение paper="+paper);
        paper = (paper - 7639);
        System.out.println("вычитание paper="+paper);

        System.out.println("Задание 4");
        var friend = 19.00;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog= frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание 6");
        var stuffBoxer1 = 78.2;
        var stuffBoxer2 = 82.7;
        var totalWeight = stuffBoxer1 + stuffBoxer2;
        System.out.println("Общий вес боксеров " + totalWeight + " кг ");
        var subtraction = stuffBoxer2 - stuffBoxer1;
        System.out.println("Вычитание из большего веса меньшего = " + subtraction + " кг ");

        System.out.println("Задание 7");
        var percent = subtraction % totalWeight;
        System.out.println("остаток от деления = " + percent + " кг ");

        System.out.println("Задание 8");
        var watch = 640;
        var oneEmployee = 8;
        var workers = watch/oneEmployee;
        System.out.println("Всего работников в компании — " + workers + " человек ");
        var staff = 94;
        var wattch = (watch * staff)/workers;
        System.out.println("Если в компании работает " + staff + " человека, то всего " + wattch + " часов работы может быть поделено между сотрудниками");


    }
}