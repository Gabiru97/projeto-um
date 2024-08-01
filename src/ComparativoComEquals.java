public class ComparativoComEquals {

    public static void main(String[] args) {
        String nome1 = "Gabriel";
        String nome2 = new String("Gabriel");

        System.out.println(nome1.equals(nome2));
// && -> E
// || -> OU
        int num1 = 5;
        int num2 = 10;
        int soma = num1+num2;
//        if (num1 != num2 && num1 > 100){
//            System.out.println("agrega valor");
//        } else {
//            System.out.println("não agrega nada");
//        }
        if (num1 == num2 || soma > 20){
            System.out.println("agrega valor");
        } else {
            System.out.println("não agrega nada");
        }
    }
}
