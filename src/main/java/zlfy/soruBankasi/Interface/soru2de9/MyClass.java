package zlfy.soruBankasi.Interface.soru2de9;

 class MyClass implements InfA{
     static int x = 5;
     public int myMethod(){
         return x;
}


     public static void main(String[] args){

         System.out.print(y);//9
         System.out.print(x);//5

         System.out.println();

         InfA obj = new MyClass();
         System.out.print(obj.myMethod());//5

         System.out.println();

         System.out.print(InfA.x);//7

         System.out.println();

         MyClass mc = new MyClass();
         System.out.print(mc.y);//9
         System.out.print(mc.myMethod());//5

//D yanlis 97 yazdirmaz, 95 yazdirir.
     }


 }
