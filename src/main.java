import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int numberOne,numberTwo,resultEbob=1,resultEkok=1;

        Scanner input=new Scanner(System.in);
        int i;
        System.out.print("1. Sayıyı Giriniz : ");
        numberOne=input.nextInt();
        System.out.print("2.Sayıyı Giriniz : ");
        numberTwo=input.nextInt();

            if (numberOne < numberTwo){
                i=numberOne;
            }else {
                i=numberTwo;
            }


            while (i >=1){

                if ((numberOne%i == 0) && (numberTwo%i==0)){
                    resultEbob=i;
                    break;
                }
                i--;
            }
            resultEkok = (numberOne*numberTwo)/resultEbob;
        System.out.println("Sayının Ebob değeri : "+ resultEbob + " Sayının Ekok Değeri "+ resultEkok);


    }
}
