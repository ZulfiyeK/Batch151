package zlfy.overridingPdf.soru7;

public class Test07 extends Super {
    public Integer getLength(){
        return (5);
    }
    public static void main(String[] args) {
        Super sooper = new Super();//4
        Test07 sub = new Test07();//5
        System.out.println(sooper.getLength().toString()+ ","+ sub.getLength().toString());
        //4,5--anlamadim-Wrapper class oldugu icin


    }
}
