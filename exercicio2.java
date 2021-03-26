 class TestaVariaveis {
     public static void main(String[] args) {
         System.out.println("new project");
         
         int idade; //atribuindo uma variavel
         idade = 19; //dando valor a variavel idade
         System.out.println("eu tenho " + idade);

         double salario;// variavel double serve para numeros quebrados
         salario = 2200.30;//atribui uma valor quebrado a variavel salario
         System.out.println("meu salario é " + salario);

         //maneira mais simples de declarar variavel 
         int maneiraNova = 23;//Atribui valor em apenas 1 linha 
         System.out.println(maneiraNova);

         long numeroGrande = 2000000000001L;//usar long para numero maiores que 6 numeros
         System.out.println(numeroGrande);
         
         double numeroQuebrado = 21.7;
         int valor = (int) numeroQuebrado;//O nome dessa conversão é Type casting, consiste em tranformar o double em int.
         System.out.println(valor);
        }
    }
   
    class Teste{ //cada class pode dar um "run"
         public static void main(String[] args) {
             System.out.println("teste de run");
         }
        }
