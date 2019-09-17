
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nTop ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("\nTop ten by penalty minutes");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("\nStatistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("\nStats for the Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("\nStats for the Anaheim Ducks by Points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
