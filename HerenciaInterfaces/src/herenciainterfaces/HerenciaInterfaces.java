package herenciainterfaces;

public class HerenciaInterfaces {

    public static void main(String[] args) {
        
        Perro perro = new Perro();
        perro.hacerSonido();
        perro.amamantar();
        
        System.out.println();
        
        Gato gato = new Gato();
        gato.hacerSonido();
        gato.amamantar();
    }    
}
