public class CalculoDesconto {
    public static void main(String[] args){
        double precoOriginal = 50.0;

        double percentualdesconto = 10.0;
        double valorDesconto = (percentualdesconto /100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("O preço original é: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("O novo preço é; R$" + novoPreco);
        






    }
}
