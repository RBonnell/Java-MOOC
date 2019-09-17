public class Reformatory {
        private int totalWeightsMeasured;
        
        public int weight(Person person) {
        // return the weight of the person
        int weight = person.getWeight();
        totalWeightsMeasured++;

        return weight;
    }
    
    public void feed(Person person){
        int weight = person.getWeight() + 1;
        person.setWeight(weight);
    }
    
    public int totalWeightsMeasured(){
        return totalWeightsMeasured;
    }

}
