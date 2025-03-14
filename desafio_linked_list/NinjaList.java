package desafio_linked_list;

import java.util.LinkedList;

public class NinjaList {

    LinkedList<Ninja> ninjaList = new LinkedList<>();

    public NinjaList(LinkedList<Ninja> ninjaList) {
        this.ninjaList = ninjaList;
    }

    public void addFirstNinja(Ninja ninja) {
        ninjaList.addFirst(ninja);
    }

    public void removeFirstNinja() {
        if (ninjaList.isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }
        ninjaList.removeFirst();
    }

    public void addNinjaByIndex(Ninja ninja, int index) {
        if (ninjaList.isEmpty() && index != 0) {
            System.out.println("Lista vazia, por favor insira um índice de 0");
            return;
        }
        if (index < 0 || index > ninjaList.size()) {
            System.out.println("Índice inválido, por favor insira um índice de 0 até " + ninjaList.size());
            return;
        }
        ninjaList.add(index, ninja);
    }

    public void addNinja (Ninja ninja) {
        ninjaList.add(ninja);
    }

    public void searchNinja(String name) {
        for (Ninja ninja : ninjaList) {
            if (ninja.getNome().equals(name)) {
                System.out.println("Ninja encontrado: " + ninja);
                return;
            }
        }
        System.out.println("Ninja não encontrado.");
    }

    public void orderBy(String criterion) {
        switch (criterion) {
            case "nome":
                ninjaList.sort((n1, n2) -> n1.getNome().compareTo(n2.getNome()));
                System.out.println("Lista ordenada por nome!\n");
                break;
            case "vila":
                ninjaList.sort((n1, n2) -> n1.getVila().compareTo(n2.getVila()));
                System.out.println("Lista ordenada por vila!\n");
                break;
            case "idade":
                ninjaList.sort((n1, n2) -> n1.getIdade() - n2.getIdade());
                System.out.println("Lista ordenada por idade!\n");
                break;
            default:
                System.out.println("Critério inválido.");
        }


    }

    @Override
    public String toString() {
        StringBuilder exibirNinja = new StringBuilder();
        for (Ninja ninja : ninjaList) {
            exibirNinja.append("Eu sou o ").append(ninja.getNome()).append(", da ").append(ninja.getVila()).append(" e tenho: ").append(ninja.getIdade()).append(" anos.\n");
        }
        return exibirNinja.toString();
    }
}
