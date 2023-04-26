public class PrecendenciaOperadores{
    public static void main (String[] args){

        //Manipulando a precedencia de uma equacao/operadores
        int a = 15 *4  +1;
        System.out.println(a);// imprime     61

        int b = 15 * (4  +1);
        System.out.println(b);// imprime   75

        System.out.println("Leandro".length()); // imprime 7
        System.out.println("Leandro" + " silva".length()); // errado, apenas imprime a quantidade de caracter do "silva"
        System.out.println(("Leandro"+ " Silva").length()); //Correto, imprime a quantidade de caracter do nome e sobrenome

        System.out.println(23 + 0 + " é duzentos e trinta"); // Errado, ele nao concatena, ele imprime só 23 (23+0)
        System.out.println(23 + (0 + " é duzentos e trinta")); // Certo, imprime 230

    }
}