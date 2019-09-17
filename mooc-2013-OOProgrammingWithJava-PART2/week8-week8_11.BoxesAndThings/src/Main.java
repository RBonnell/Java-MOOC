/**
 *
 * @author 358721
 */
public class Main {
    
        public static void main(String[] args) {
        
            // a variety of tests below to see how the objects interact
            Box box1 = new Box(10);
            Box box2 = new Box(10);
            Box box3 = new Box(10);
            Box box4 = new Box(10);
            Box box5 = new Box(10);
            ToBeStored novel = new Book("A novel", "John Doe", 1);
            ToBeStored novel2 = new Book("Another novel", "Jane Doe", 55);

            box2.add(novel); // novel is added to Box 2
            box1.add(box2); // Box 2 (containing novel) is added to Box 1
            box1.add(box3); // Box 3 is also added to Box 1, which now contains a novel and 2 boxes
            box5.add(novel2); // prints "Sorry, too full!" and item is not added

            System.out.println(box1); // displays 2 items inside (1 box, 1 book)
        
        box4.add(box4); // Box 4 added to itself, results in an error as seen below
        //System.out.println(box4);  //results in Stack Overflow Error!
    }
}


