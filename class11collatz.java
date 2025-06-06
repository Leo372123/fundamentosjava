import java.util.*;

public class class11collatz {
    
public static void main (String []args){

   Scanner teclado =new Scanner (System.in); 
System.out.println("introduce un numero");
String dato = teclado.nextLine();
int num = Integer.parseInt(dato);



while (num!=1) {
if  (num%2 ==0) {
num=num/2;

}else{
    num=(num*3) +1;
}
System.out.println(num);

}

}
}


