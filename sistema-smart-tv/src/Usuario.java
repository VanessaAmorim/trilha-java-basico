public class Usuario {

    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
      /*  este documento é um teste para criar documentação */        
        smartTv.dimunuirVolume();
        smartTv.dimunuirVolume();
        smartTv.dimunuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);
        
        System.out.println("Canal: " + smartTv.canal);

        smartTv.mudarCanal(15);
        System.out.println("Canal: " + smartTv.canal);



        System.out.println("Sua TV está: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Sua tv está: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Sua tv está: " + smartTv.ligada);



    }
}
