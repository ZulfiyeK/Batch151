package zlfy.Lambda;

import java.util.stream.IntStream;

public class MountainArray {
            /*
       INTERWIEW QUESTIONS
       Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
       Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan
       sonra sürekli azalan Array.
         int arr[]={1,2,3,2,1}
         int brr[]={1,3,7,11,8,7,3}== {2,4,4,-3,-1,-4}   7 elemanli brr[] nin 6 elemanli diff[] olur
         int crr[]={3,5,1,11,8}
*/
    public static void main(String[] args) {
        int arr[]={3,5,1,11,8};
        System.out.println(isMountainArray(arr));

            }

    private static boolean isMountainArray(int[] arr) {
        int length = arr.length;//5 {1,2,3,2,1}
        int diff[] = new int[length-1];//yeni arrayimin lengtini bu sekilde hesapliyorum.aralarindaki farki buluyouz.
        IntStream.
                range(0,length-1).//0 ile length-1 deki degerleri alsin.
                forEach(t->diff[t]=arr[t+1]-arr[t]);//t dedigim data 0 dan baslar ve devam eder. bir sonrakinden bir onceki cikararak ilerliyorum.[1,1,-1,-1]
        int i = 0;
        while (i<length-1 && diff[i]>0){//zirveye cikabilmesi icin surekli arttirma yapmasi gerek ve >0 olmali.bunun kontrolunu yapiyoruz.
            i++;
        }
        if(i==0 || i==length-1){//zirve kontrolu yaptik.
            return false;
        }
        while (i<length-1 && diff[i]<0){//zirveden inebilmesi icin surekli arttirma yapmasi gerek ama <0 olarak.bunun kontrolunu yapiyoruz.
            i++;
        }
        return i ==length-1;//en son veriye esit olana kadar dondurmeli.
    }
}
