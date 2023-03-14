public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задание 1");
        int age = 50;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершоннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        // task 2
        System.out.println("Задание 2");
        int airTemperature = 3;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");
        }
        // task3
        System.out.println("Задание 3");
        int speed = 62;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то  можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        // task 4
        System.out.println("Задание 4");
        int personAge = 25;
        if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + " то ему пора ходить на работу");
        } else {
            if (personAge >= 2 && personAge <= 7) {
                System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить в садик");
            }
            if (personAge >= 7 && personAge <= 18) {
                System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить в школу");
            }
            if (personAge >= 18 && personAge <= 24) {
                System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить в университет");
            }
        }
        // task 5
        System.out.println("Задание 5");
        int ageChild = 14;
        if (ageChild <= 5) {
            System.out.println("Если зозраст ребёнка равен " + ageChild + " то он не может кататься на атракционе");
        } else {
            if (ageChild > 5 && ageChild < 14) {
                System.out.println("Если зозраст ребёнка равен " + ageChild + " то он может кататься на атракционе в сопровождении взрослого");
            } else {
                if (ageChild >= 14) {
                    System.out.println("Если зозраст ребёнка равен " + ageChild + " то он может кататься на атракционе без сопровождения взрослого");
                }
            }
        }
        //task 6
        System.out.println("Задание 6");
        int people = 10;
        int trainCar1 = 102;
        if (people > 102) {
            System.out.println("В вагоне нет мест");
        } else {
            if (people > 60 && people < 102) {
                System.out.println("Остались только стоячие места");
            } else {
                System.out.println("В вагоне есть сидячие места");
            }
        }
        //task7
        System.out.println("Задание 7");
        int one = 10;
        int two = 17;
        int three = 17;
        if (one > two && one > three) {
            System.out.println("Самое большое число равно " + one);
        } else {
            if (two > one && two > three) {
                System.out.println("Самое большое число равно " + two);
            } else {
                System.out.println("Самое большое число равно " + three);
            }
        }

    }
}