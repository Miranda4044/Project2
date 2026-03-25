public class ScreenMatch {
    public static void main(String[] args) {
    System.out.println("Esse é o Screen Match"); // faz surgir o titulo do app
    System.out.println("Filme: Top Gun: Maverick"); // faz surgir o nome do filme

int anoDeLancamento = 2022; // Ano de lançamento
        System.out.println("Ano De Lancamento: " + anoDeLancamento); // faz surgir o ano de lançamento
        boolean incluidoNoPlano = true; // para saber se o plano cobre o filme
        double notaDoFilme = 8.1; // nota de avaliação
        System.out.println("Notas de Avaliação; " + notaDoFilme); // faz surgir a nota do filme

        //Notas de avalição de publico recente
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media /2);
        System.out.println(classificacao);

        





}
}