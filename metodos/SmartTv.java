public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
   
    public void ligar(){
        System.out.println("Ligando a TV");
        ligada = true;
    }
    public void desligar(){
        System.out.println("desligando a TV");
        ligada = false;
    }
    
    public void aumentarVolume(){
        System.out.println("volume: " + volume);
        volume++;
    }public void diminuirVolume(){
        System.out.println("volume: " + volume);
        volume--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Trocando para o canal " + novoCanal);
    }
}
