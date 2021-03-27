class TestaCaracteres {
    public static void main(String[] args) {
        char letra = 'a'; //char declara uma letra apenas
        System.out.println(letra);

        String palavra = "uma frase BEM grandona "; //a variael string serve para colocar frases
        System.out.println(palavra);

        palavra = palavra + "como " + 2000 + "PALAVRAS"; //e tambem pode concatenar com numeros e strings
        System.out.println(palavra);

        char valor = 65;                    // Transforma em uma letra!
        System.out.println(valor);

        valor = (char) (valor + 1);         // fazendo um casting para assim o java reconhecer que não é um int(inteiro) e sim um char (caracter).
        System.out.println(valor);
    }
}