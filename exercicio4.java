class TestaCondicional{
    public static void main(String[] args) {
        System.out.println("Testando condiconais");
        int idade = 17;
        Boolean autorizacao = true;
        
        if(idade >= 18 || autorizacao){
            System.out.println("Você pode entrar!");
        } else {
            System.out.println("você não pode entrar, sinto muito!");
        }
    }
}     
