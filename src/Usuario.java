public class Usuario {

    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);
        System.out.println("====================================");

        smartTv.ligar();
        System.out.println("Novo Status: TV Ligada? " + smartTv.ligada);
        smartTv.subirCanal();
        System.out.println("Novo Status: Canal atual? " + smartTv.canal);
        smartTv.aumentarVolume();
        System.out.println("Novo Status: Volume atual? " + smartTv.volume);
        System.out.println("====================================");

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.abaixarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo Status: Volume atual? " + smartTv.volume);
        System.out.println("====================================");


        smartTv.mudarCanal(15);
        System.out.println("Novo Status: Canal atual? " + smartTv.canal);
        System.out.println("====================================");

        smartTv.desligar();
        System.out.println("Novo Status: TV Ligada? " + smartTv.ligada);




    }
}
