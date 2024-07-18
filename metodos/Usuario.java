public class Usuario {
    public static void main(String[] args) {
        SmartTv tvSamsung = new SmartTv();
        System.out.println("A TV está ligada? " + tvSamsung.ligada);
        System.out.println("Volume atual é " + tvSamsung.volume);
        System.out.println("Canal atual é "+ tvSamsung.canal);
        tvSamsung.ligar();
        tvSamsung.aumentarVolume();
        tvSamsung.mudarCanal(13);   
        tvSamsung.diminuirVolume();
        tvSamsung.desligar();
    }
}
