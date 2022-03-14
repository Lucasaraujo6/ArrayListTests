
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    static InsereItem insertor ;
    public static void main(String[] args) throws Exception {
        insertor = InsereItem.getInstance();
        menu(insertor.getItems(), insertor.getPositions());
    }

    private static void menu(ArrayList<Item> items, ArrayList<Integer> positions) {

        Scanner scn = new Scanner(System.in);

        boolean keepRunning = true;
        printlist(items);

        while (keepRunning) {

            // Ordenar de acordo com os arrastes;

            // Esse sempre vai assumir os valores da última configuração de visualização e
            // VAI SER O QUE SERÁ EXECUTADO A PRINCÍPIO
            System.out.println("Digite a opcao desejada: ");


            int option = scn.nextInt();
            switch (option) {
                case 1:
                    // Ordenar alfabeticamente e imprimir;
                    printlistCrescent(items);
                    break;
                    case 2:
                    // Ordenar embasado no reordenamento manual;
                    printlist(items, positions);
                    break;
                case 3:
                    adicionar(scn, items, positions);
                    imprimelista(positions);

                    break;
                case 4:
                    System.out.println("Posição atual a remover.\n");

                    remover();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
                    break;
                case 0:
                    keepRunning = false;
            }
        }
        scn.close();
    }

    private static void remover() {
    }

    private static void adicionar(Scanner scn, ArrayList<Item> items,ArrayList<Integer> positions ) {
        int id = items.size();
        // System.out.println("Name\n");
        // String name = scn.next();
        String name = "Tangerina";
        // System.out.println("amount\n");
        int amount = 5;
        // int amount = scn.nextInt();
        // System.out.println("Price\n");
        Double price = 2.3;
        // Double price = scn.nextDouble();
        // System.out.println("Brand: Fucked\n");
        String brand = "Fucked";
        // System.out.println("Observations\n");
        String obs = "Add obs";
        String origin = "https://t4.ftcdn.net/jpg/02/55/39/77/360_F_255397744_rwNCund3WjKsrsv6yKKpK8tzmJ8sYRnF.jpg";
        items.add(items.size(),new Item(id,name,amount, brand, price, origin, obs, false));
        insertor.setItems(items);
        // for (int i=0;i<positions.size();i++){
        //     positions.set(i,positions.get(i)+1);
        // }
        positions.add(0,items.size()-1);
        System.out.println("Novo item adicionado com sucesso!!!\n");

    }

    private static void printlistCrescent(ArrayList<Item> items) {
        System.out.println("ALFABÉTICALY");
        for (int i =0;i<items.size();i++){
            int j=i;
            while(j>0 && items.get(j).getName().compareTo(items.get(j-1).getName())<0 ){
                Collections.swap(items, j,j-1);     
                j--;   
            }
            
        }
        for(int i =0;i<items.size();i++){
            System.out.println(items.get(i).getId() + "  " + items.get(i).getName());
        }
        System.out.println("\n");

    }

    private static void printlist(ArrayList<Item> items, ArrayList<Integer> positions) {
        System.out.println("POR POSIÇÂO");
        for (int i = 0; i < items.size();i++){
            System.out.println(items.get(positions.get(i)).getId() + "  " + items.get(positions.get(i)).getName());

        }
        System.out.println("\n");
    }

    private static void printlist(ArrayList<Item> items) {
        for (Item item : items) {
            System.out.println(item.getId() + "  " + item.getName());
        }
        
        System.out.println("\n");
    }
    private static void imprimelista(ArrayList<Integer> postitions){
        for (Integer position: postitions) {
            System.out.println(position);
        }
    }
}
