import domain.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Course class1 = new Course();
        Course class2 = new Course();
        Mentoring mentoring = new Mentoring();

        class1.setTitle("Basic Java");
        class1.setDescription("Java Basics");
        class1.setCourseLoad(10);

        class2.setTitle("Advanced Java");
        class2.setDescription("Java Advanced");
        class2.setCourseLoad(20);

        mentoring.setTitle("Java mentoring");
        mentoring.setDescription("Mentoring using Java");
        mentoring.setDate(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();

        bootcampJava.setName("Java");
        bootcampJava.setDescription("Java Bootcamp");
        bootcampJava.getBootcampContents().add(class1);
        bootcampJava.getBootcampContents().add(class2);
        bootcampJava.getBootcampContents().add(mentoring);

        Dev firstDev = new Dev();
        Dev secondDev = new Dev();

        firstDev.setName("Lucas");
        firstDev.bootcampSubscribe(bootcampJava);
        System.out.println(firstDev.getName() + " progress \n");
        System.out.println(firstDev.getName() + "'s Contents Subscribed: " + firstDev.getContentLists());
        System.out.println("\n ------------------------ Post Advanced ------------------------------------ \n");
        firstDev.advanced();
        System.out.println(firstDev.getName() + "'s Contents Concluded: " + firstDev.getContentConcluded());
        System.out.println(firstDev.getName() + "'s Contents Subscribed: " + firstDev.getContentLists());
        System.out.println("XP: " + firstDev.xpTotal());
        System.out.println("\n");


        secondDev.setName("Carlos");
        secondDev.bootcampSubscribe(bootcampJava);
        System.out.println(secondDev.getName() + " progress \n");
        System.out.println(secondDev.getName() + "'s Contents Subscribed: " + secondDev.getContentLists());
        System.out.println("\n ------------------------ Post Advanced ------------------------------------ \n");
        secondDev.advanced();
        secondDev.advanced();
        System.out.println(secondDev.getName() + "'s Contents Concluded: " + secondDev.getContentConcluded());
        System.out.println(secondDev.getName() + "'s Contents Subscribed: " + secondDev.getContentLists() + "\n");
        System.out.println("XP: " + secondDev.xpTotal());
        System.out.println("\n");







    }
}