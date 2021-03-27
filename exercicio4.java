class TestaCondicional{
    public static void main(String[] args) {
        System.out.println("Testando condiconais");
        int idade = 16;
        String autorizacao = "sim";
        
        if(idade >= 18){
            System.out.println("Você pode entrar!");
        }
        else if (autorizacao == "sim"){
            System.out.println("você pode entrar, porque tem autorização.");
        }  else {
            System.out.println("você não pode entrar, sinto muito!");
        }
    }
}    