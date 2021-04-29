
package herencia;

/**
 *
 * @author Enriq
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
       //Animal animal2 = new Animal(color: "Lila");
       //System.out.println(animal2.getColor());
       
       //Creacion de objeto de la clase mamifero
       Mamifero mamifero1 = new Mamifero();
       mamifero1.setColor("AZUL");
       mamifero1.setTamaño("Grande");
       System.out.println(mamifero1.getColor());
       System.out.println(mamifero1.getTamaño());
       
       Camioneta camioneta = new Camioneta();
       
    }
    
}
