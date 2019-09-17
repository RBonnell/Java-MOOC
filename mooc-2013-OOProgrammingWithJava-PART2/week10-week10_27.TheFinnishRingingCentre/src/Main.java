/**
 *
 * @author 358721
 */
public class Main {
    public static void main(String[] args){
        RingingCentre kumpulaCentre = new RingingCentre();

        kumpulaCentre.observe( new Bird("Rose Starling", "Sturnus roseus", 2012), "Arabia" );
        kumpulaCentre.observe( new Bird("Rose-Coloured Starling", "Sturnus roseus", 2012), "Vallila" );
        kumpulaCentre.observe( new Bird("European Herring Gull", "Larus argentatus", 2008), "Kumpulanmäki" );
        kumpulaCentre.observe( new Bird("Rose Starling", "Sturnus roseus", 2008), "Mannerheimintie" );
        kumpulaCentre.observe( new Bird("Regular Fakeybird", "Sturnus roseus", 2008), "Stockholm" );
        kumpulaCentre.observe( new Bird("Fake Regularbird", "Sturnus roseus", 2002), "Calgary" );
        kumpulaCentre.observe( new Bird("Fakebird O'Regular", "Sturnus roseus", 2008), "Edmonton" );

        kumpulaCentre.observations( new Bird("Rose-Coloured Starling", "Sturnus roseus", 2012 ) );
        System.out.println("--");
        kumpulaCentre.observations( new Bird("European Herring Gull", "Larus argentatus", 2008 ) );
        System.out.println("--");
        kumpulaCentre.observations( new Bird("European Herring Gull", "Larus argentatus", 1980 ) );
        System.out.println("--");
        kumpulaCentre.observations( new Bird("Inconsequential Name", "Sturnus roseus", 2008 ) );
    }
}
