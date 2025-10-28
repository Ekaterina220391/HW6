//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 4");
        var friend = 19;
        var summFriend = friend+2;
        var divisionFriend = summFriend/7;
        System.out.println(friend);
        System.out.println(summFriend);
        System.out.println(divisionFriend);

        System.out.println("Задача 5");
        var frog =3.5;
        var multiFrog = frog*10;
        var divisionFrog= multiFrog/3.5;
        var summFrog= divisionFrog +4;
        System.out.println(frog);
        System.out.println(multiFrog);
        System.out.println(divisionFrog);
        System.out.println(summFrog);

        System.out.println("Задача 6");
        var box1= 78.2;
        var box2= 82.7;
        var summBox= box1+box2;
        var differenceBox= box2-box1;
        System.out.println(summBox +  "кг");
        System.out.println(differenceBox +  "кг");

        System.out.println("Задача 7");
        var remains = box2%box1;
        System.out.println(remains);

        System.out.println("Задача 8");
        var hourAll = 640;
        var hourDay = 8;
        var workerAll = hourAll/hourDay;
        var workerNew = workerAll+94;
        var hourNew = workerNew*hourDay;
        System.out.println( "Всего работников в компании - " +workerAll+  " человек " );
        System.out.println( "Если в компании работает " + workerNew+  " человек, то всего "  +hourNew+  " часов работы может быть поделено между сотрудниками" );







    }
}