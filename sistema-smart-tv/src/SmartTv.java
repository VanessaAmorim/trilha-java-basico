public class SmartTv {
    
    boolean ligada = false;
    int canal = 2;
    int volume = 25;

    public void mudarCanal (int numeroCanal){
        canal = numeroCanal;
    }

    public void amentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void dimunuirVolume(){
        volume--;
        System.out.println("Diminuindo Volume para: " + volume);
    }


    public void ligar (){
        ligada=true;
    }
    
    public void desligar(){
        ligada=false;
    }
}
