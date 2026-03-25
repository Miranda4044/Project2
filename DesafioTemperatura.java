public class DesafioTemperatura {
    public static void main (String[] args) {
        double temperaturaemCelsius = 34.4;
        double temperaturaemFahrenheit = (temperaturaemCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaemCelsius, temperaturaemFahrenheit);

        System.out.println(mensagem);

    int TemperaturaFahrenheitInteira = (int) temperaturaemFahrenheit;
        System.out.println("A temperatura Fahrenheit inteira é:" + TemperaturaFahrenheitInteira);
    }
}
