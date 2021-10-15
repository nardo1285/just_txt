/*
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos
especiales:
• Número de mástiles para veleros.

Un alquiler se calcula multiplicando el número de días de ocupación (calculado
con la fecha de alquiler y devolución), por un valor módulo de cada barco
(obtenido simplemente multiplicando por 10 los metros de eslora).

En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
modulo normal y sumándole el atributo particular de cada barco:
_En los veleros se suma el número de mástiles, 

 */
package Atributos;

public final class Velero extends Barco{
    
    private Integer nroMastiles;

    //CONSTRUCTORES
    public Velero() {
    }
    public Velero(Integer nroMastiles, String matricula, Integer eslora, Integer anioFabricacion, Integer modulo) {
        super(matricula, eslora, anioFabricacion, modulo);
        this.nroMastiles = nroMastiles;
    }

    public Integer getNroMastiles() {
        return nroMastiles;
    }
    
    public void setNroMastiles(Integer nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    @Override
    public String toString() {
        return super.toString()+"Velero de " + nroMastiles + " mástiles.-";
    }

    
    //OVERRIDE DE METODOS HEREDADOS
    @Override
    public Integer moduloTotal() {
        return (super.modulo + this.nroMastiles);
    }
    
    @Override
    public void resumenBoat(){
        System.out.println("Velero de " + nroMastiles + " mástiles.-");
    }
    
    
    
    
    
}
