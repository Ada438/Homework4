//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    var age = 14;
    if (age>=18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");}
    else System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");


    var temp = 10;
    if (temp<=5) {
        System.out.println("На улице " + temp + " градусов. На улице холодно, нужно надеть шапку.");}
    else System.out.println("На улице " + temp + " градусов. Сегодня тепло, можно идти без шапки.");

    var speed = 60;
    if (speed>60) {
        System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");}
    else System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");

    var age2 = 10;
    if (age2>=2 && age2<=6) {
        System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад.");}
        else if (age2>=7 && age2<=17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.");}
            else if (age2>=18 && age2<=24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет.");}
    else System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу.");

    var age3 = 3;
        if (age3<5) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе.");}
            else if (age3>=5 && age3<14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе в сопровождении взрослого.");}
       else System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого.");


       var seat =50;
       var stand = 34;
       if (seat+stand>=102) {
           System.out.println("В вагоне нет мест");}
           else {if (seat<60) {
            System.out.println("В вагоне есть сидячее место.");}
            else System.out.println("В вагоне нет сидячих мест");
            if (stand<42) {
                System.out.println("В вагоне есть стоячее место.");}
            else System.out.println("В вагоне нет стоячих мест");}

           int one = 15;
           int two = 43;
           int three = 7;
           if (one>two) {
               if (one>three) {
                   System.out.println("Наибольшее число - " + one);}
               else System.out.println("Наибольшее число - " + three);}
           else if (two<three) {
               System.out.println("Наибольшее число - " + three);}
           else System.out.println("Наибольшее число - " + two);
               }
           }
