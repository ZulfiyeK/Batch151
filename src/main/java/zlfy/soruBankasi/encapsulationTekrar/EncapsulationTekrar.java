package zlfy.soruBankasi.encapsulationTekrar;

public class EncapsulationTekrar {


//***** soru 139. sayfa 8. soru

    private double width;
    private double height;
    private double screenSize;
    private int maxVolume;
    private int volume = 12;
    private boolean power;
    public EncapsulationTekrar(double width, double height, double screenSize) {
        this.width = width;
        this.height = height;
        this.screenSize = screenSize;
    }
    public double channelTuning(int channel) {// frekans ayarlamasi yapiyor
        switch (channel) {
            case 1:
                return 34.56;
            case 2:
                return 54.89;
            case 3:
                return 73.89;
            case 4:
                return 94.98;
        }
        return 0;
    }
    public int decreaseVolume() {// sesinin dusuruyor
        if (0 < volume) {
            volume--;
        }
        return volume;
    }
    public void powerSwitch() {//
        this.power = !power;
    }
        public int increaseVolume() {//sesi arttir
            if (maxVolume > volume)
                volume++;
            return volume;
        }

    public static void main(String[] args) {
        System.out.println("A");//54.89--
        EncapsulationTekrar t= new EncapsulationTekrar(11.5,7,9);
        t.powerSwitch();
        System.out.println(t.channelTuning(2));//54.89-- sadece bunu yazdirmamiizi istemis

        System.out.println("B");//11
        EncapsulationTekrar t1= new EncapsulationTekrar(11.5,7,9);
        t1.powerSwitch();
        System.out.println(t1.decreaseVolume());//11-- 0<12 oldugu icin sesi bir azaltti ve 11 oldu.


        System.out.println("C");//0
        EncapsulationTekrar t2= new EncapsulationTekrar(11.5,7,9);
        t2.powerSwitch();
        System.out.println(t2.width);//11.5-- width'in degerini 11.5 girdigi icin



    }
    }








