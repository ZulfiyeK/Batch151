package zlfy.interfacesPdf.soru2;

public class Beetle extends Insect{
    int getNumberOfLegs(){
        return 6;
    }

    @Override
    public int getNumberOfSections() {
        return 0;
    }  }
// nornalde override edilmemisti. o yuzden Class isminin oldugu line'de  CTE veriyordu.