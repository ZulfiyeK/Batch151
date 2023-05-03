package javaders.day38enumsiterators;

public class EnumRunner {
    public static void main(String[] args) {


      String capitanOfIllinois =  UsStatesEnum.ILLINOIS.getCapital();
        System.out.println(capitanOfIllinois);//Springfield

      String abbrevivationOfFlorida= UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbrevivationOfFlorida);//FL

        UsStatesEnum state = UsStatesEnum.ALASKA;// data tipi enum'in kendisi olmali.enum'daki method'u get method olmadan kullanirsak data tipi enum olmalidir.
        System.out.println(state);//ALASKA

      String stateName =  UsStatesEnum.getStateNameByUsingAbbreviation("AK");
        System.out.println(stateName);//Alaska

      String abbOfAlaska =  UsStatesEnum.getAbbreviationForStateName("Alaska");
        System.out.println(abbOfAlaska);//AK


    }
}
