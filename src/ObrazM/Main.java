package ObrazM;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Abiturs abiturs = new Abiturs();
        abiturs.list2.add(new Abitur(1, "Obraz", "Mary", "Evgenievna", 1999, 100, 100, 95, 11.75));
        abiturs.list2.add(new Abitur(2, "Baranov", "Maksim", "Victorovich", 1999, 100, 100, 100, 10.5));
        abiturs.list2.add(new Abitur(3, "Shuliak", "Olga", "Vitalievna", 1999, 90, 70, 90, 6));
        Scanner in = new Scanner(System.in);
        System.out.println("Input the last name:");
        String lastNameInput= in.nextLine();

        //вывод сведений об абитуриенте с данной фамилией
        System.out.println("Showing data about the abiturient with set last name:");
        int count=0;
        for (int i=0; i < abiturs.list2.size(); i++){
        if (lastNameInput.equals(abiturs.list2.get(i).lastName))
            System.out.println(abiturs.list2.get(i));
        else
            count++;
        }
        if (count > 0)
            System.out.println("Not found");

        //добавление абитуриента после
       for (int i=0; i < abiturs.list2.size()-1; i++){
            if (lastNameInput.equals(abiturs.list2.get(i).lastName))
                abiturs.list2.add(i+1, new Abitur(4, "Filin", "Dmitriy", "Vladislavovich", 1999, 65, 70, 84, 9));
        }
        System.out.println("\n"+"After adding after the abiturient with set last name:");
        for (int i=0; i < abiturs.list2.size(); i++){
            System.out.println(abiturs.list2.get(i));}

       // удаление абитуриентов с баллом аттестата меньше заданного
        Scanner sert = new Scanner(System.in);
        System.out.println("\n"+"Input average mark of the sertificate (please, use ',', not '.':");
        double averSertInput= sert.nextDouble();
        for (int i=0; i < abiturs.list2.size(); i++){
            if (averSertInput==abiturs.list2.get(i).averCertificate)
                abiturs.list2.remove(i);
        }
        System.out.println("\n"+"After deleting with average sertificate mark less than set mark:");
        for (int i=0; i < abiturs.list2.size(); i++){
            System.out.println(abiturs.list2.get(i));}

        System.out.println("\n"+"Show data about abiturients with marks in 100 system");
       //вывод сведений с оценками в 100-бальной системе
        for (int i=0; i < abiturs.list2.size(); i++){
            System.out.println(abiturs.list2.get(i).getData());}
    }
}
