package Unidad11Java.completos.bibliotecaProfe;


public class MiPrograma {
    public static void main(String[] args) {
        Biblioteca biblio=new Biblioteca();

        try {
            Libro l=new Libro("9788401337208","El nombre del viento",new Autor("PATRICK ROTHFUSS","incom"));
            biblio.anyadir(l);
            biblio.anyadir(new Revista("12345678", "Revista 1", 4));
        } catch (ValorIncorrecto | PublicacionException e) {
           System.out.println("Error en la creación del libro. "+e.getMessage());
        }

        if (!biblio.anyadirLibro("9788401352331", "EL TEMOR DE UN HOMBRE SABIO", new Autor("PATRICK ROTHFUSS","incom")))
            System.out.println("ERROR en la creación del libro");
            
        try {
            Libro l=new Libro("2342423","El nombre del viento",new Autor("PATRICK ROTHFUSS","incom"));
            biblio.anyadir(l);

        } catch (ValorIncorrecto | PublicacionException e) {
           System.out.println("Error en la creación del libro. "+e.getMessage());
        }        

        if (!biblio.anyadirLibro("234234", "EL TEMOR DE UN HOMBRE SABIO", new Autor("PATRICK ROTHFUSS","incom")))
            System.out.println("ERROR en la creación del libro");
     
        try{
            biblio.anyadir(new Revista("43132312", "Fabbles", 200));

            biblio.anyadir(new Revista("12345678", "Revista 1", 0));
        } catch (Exception e){
            e.printStackTrace();
        }
        
        biblio.mostrarLineas();
    }
}
