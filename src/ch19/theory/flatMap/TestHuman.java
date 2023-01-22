package ch19.theory.flatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestHuman {
    public static void main(String[] args) {

        List<Human> humans = List.of(
                new Human("Sam", List.of("Buddy", "Lucy")),
                new Human("Bob", List.of("Frankie", "Rosie")),
                new Human("Marta", List.of("Simba", "Tilly")));

        //до Java 8
//        List<String> petNames = new ArrayList<>();
//        for (Human human : humans) {
//            petNames.addAll(human.getPets());
//        }
//        System.out.println(petNames); // output [Buddy, Lucy, Frankie, Rosie, Simba, Tilly]

        //со стримами
        List<String> petNames = humans.stream()
                .map(human -> human.getPets()) //преобразовываем Stream<Human> в Stream<List<Pet>>
                .flatMap(pets -> pets.stream())//"разворачиваем" Stream<List<Pet>> в Stream<Pet>
                .collect(Collectors.toList());

        System.out.println(petNames);
    }
}
