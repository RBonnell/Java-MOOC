public class Main {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        for (int i = 1; i < 100; i++){
            Thing brick = new Thing("Brick", i);
            Suitcase brickSuitcase = new Suitcase(100);
            brickSuitcase.addThing(brick);
            container.addSuitcase(brickSuitcase);            
        }
    }
}
     
      
        

