package desafio_linked_list;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NinjaList ninjaList = new NinjaList(new LinkedList<>());
        ninjaList.addFirstNinja(new Ninja("Naruto", "Konoha", 20));
        ninjaList.addNinja(new Ninja("Sakura", "Konoha", 17));
        ninjaList.addNinja(new Ninja("Sasuke", "Konoha", 20));
        ninjaList.addNinja(new Ninja("Jiraya", "Konoha", 57));
        ninjaList.addNinja(new Ninja("Gaara", "Areia", 22));
        ninjaList.addNinja(new Ninja("Killer Bee", "Pedra", 35));

        System.out.println(ninjaList);

        System.out.println("========== Removendo o primeiro ninja da lista ==========");
        ninjaList.removeFirstNinja();
        System.out.println(ninjaList);

        System.out.println("========== Adicionando um ninja na posição 1 ==========");
        ninjaList.addNinjaByIndex(new Ninja("Itachi", "Konoha", 37), 1);
        System.out.println(ninjaList);

        System.out.println("========== Ordenando a lista ==========");

        ninjaList.orderBy("nome");
        System.out.println(ninjaList);

        ninjaList.orderBy("idade");
        System.out.println(ninjaList);

        ninjaList.orderBy("vila");
        System.out.println(ninjaList);

        System.out.println("========== Informe um critério de ordenação ==========");
        String criterion = scanner.nextLine();
        ninjaList.orderBy(criterion);
        System.out.println(ninjaList);

        System.out.println("========== Informe o nome de um ninja para pesquisa ==========");
        String name = scanner.nextLine();
        ninjaList.searchNinja(name);

        scanner.close();
    }
}
