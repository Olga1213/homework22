public class Main {
    public static void main(String[] args) {
        //1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //4
        var friend = 19;
        System.out.println("friend");
        friend = friend + 2;
        System.out.println("friend");
        friend = friend / 7;
        System.out.println("friend");

        //5
        var frog = 3.5;
        System.out.println("frog");
        frog = frog * 10;
        System.out.println("frog");
        frog = frog / 3.5;
        System.out.println("frog");
        frog = frog + 4;
        System.out.println("frog");

        //6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println(boxer1 + boxer2);
        System.out.println(boxer2 - boxer1);


        //7
        System.out.println(boxer2 - boxer1);
        System.out.println(boxer2 % boxer1);

        //8
        var totalWorkingHours = 640;
        var workHours = 8;
        var employeeCount = totalWorkingHours / workHours;
        System.out.println("employeeCount");
        System.out.println("Всего работников в компании-" + employeeCount + "человек ");

        employeeCount = employeeCount * 94;
        System.out.println("Если в компании работает" + employeeCount + "человек, то всего" + totalWorkingHours + "часов работы может быть поделено между сотрудниками");
    }
}
