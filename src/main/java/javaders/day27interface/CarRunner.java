package javaders.day27interface;

public class CarRunner {
    public static void main(String[] args) {

      Engine.stop();// stop methodu static oldugunda interface ismi ile ulastim demek.
      Honda h = new Honda();
      h.eco();//eco methodu static olmadigi icin "object" ismi ile ulastik.







    }
}
