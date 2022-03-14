import java.util.ArrayList;

public class InsereItem {

private ArrayList<Item> items;
private ArrayList<Integer> positions;

public static InsereItem instance;

public static synchronized InsereItem getInstance() {
    if (instance == null) {
        instance = new InsereItem();
    }
    return instance;
}


private InsereItem() {
    createArrayLists();
}


public void createArrayLists(){
    items = new ArrayList<>();
        positions = new ArrayList<>();
        items.add(new Item(0, "Banana", 6,"Natural", 6, "https://www.infoescola.com/wp-content/uploads/2010/04/banana_600797891.jpg",null, false));
        positions.add(1);
        items.add(new Item(1, "Apple", 4,"Natural", 4, "https://www.collinsdictionary.com/images/thumb/apple_158989157_250.jpg",null, false));
        positions.add(0);
        items.add(new Item(2, "Orange", 2,"Natural", 6, "https://riviste.newbusinessmedia.it/wp-content/uploads/sites/27/2013/12/Fotolia_11313277_M-300x264.jpg",null, false));
        positions.add(2);
        items.add(new Item(3, "Papaya", 2,"Natural", 6, "https://comper.vteximg.com.br/arquivos/ids/182176-1000-1000/631906_mamao.jpg",null, false));
        positions.add(3);
        items.add(new Item(4, "Melon", 2,"Natural", 6, "https://deluxeproduce.com/wp-content/uploads/2017/06/canary-melon.jpg",null,true));
        positions.add(4);
        items.add(new Item(5, "Strawberry", 2,"Natural", 6, "https://www.collinsdictionary.com/images/full/strawberry_227472010.jpg",null, false));
        positions.add(5);
        items.add(new Item(6, "Lemon", 2,"Natural", 6, "https://t4.ftcdn.net/jpg/02/55/39/77/360_F_255397744_rwNCund3WjKsrsv6yKKpK8tzmJ8sYRnF.jpg",null, false));
        positions.add(6);
    }


    public ArrayList<Item> getItems() {
        return items;
    }





    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }





    public ArrayList<Integer> getPositions() {
        return positions;
    }





    public void setPositions(ArrayList<Integer> positions) {
        this.positions = positions;
    }

    
    

}    
