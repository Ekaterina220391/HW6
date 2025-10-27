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
        var dog2 = 8.0;
        var cat2 = 3.6;
        var paper2 = 763789;
        var rezultDog2 = dog2 + 4;
        var rezultCat2 = cat2 + 4;
        var rezultPaper2 = paper2 + 4;
        System.out.println(rezultDog2);
        System.out.println(rezultCat2);
        System.out.println(rezultPaper2);

        System.out.println("Задача 3");
        var dog3 = 8.0;
        var cat3 = 3.6;
        var paper3 = 763789;
        var rezultDog3 = dog2 - 3.5;
        var rezultCat3 = cat2 - 1.6;
        var rezultPaper3 = paper2 - 7639;
        System.out.println(rezultDog3);
        System.out.println(rezultCat3);
        System.out.println(rezultPaper3);

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
        var box11= 78.2;
        var box22= 82.7;
        var remains = box22%box11;
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