/*
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos
especiales:

• Potencia en CV y número de camarotes para yates de lujo.

Un alquiler se calcula multiplicando el número de días de ocupación (calculado
con la fecha de alquiler y devolución), por un valor módulo de cada barco
(obtenido simplemente multiplicando por 10 los metros de eslora).

En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
modulo normal y sumándole el atributo particular de cada barco:

_En los yates se suma la potencia en CV y el número de camarotes.
 */
package Atributos;

public final class Yate extends Barco{
     
    private Integer potencia;
    private Integer nroCamarotes;
    
    
    //CONSTRUCTORES
    public Yate() {
    }
    public Yate(Integer potencia, Integer nroCamarotes, String matricula, Integer eslora, Integer anioFabricacion, Integer modulo) {
        super(matricula, eslora, anioFabricacion, modulo);
        this.potencia = potencia;
        this.nroCamarotes = nroCamarotes;
    }
    
    
    //SETTERS

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public void setNroCamarotes(Integer nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }
    
    
    //GETTERS

    public Integer getPotencia() {
        return potencia;
    }

    public Integer getNroCamarotes() {
        return nroCamarotes;
    }

    
    //OVERRIDE DE METODOS HEREDADOS
    @Override
    public Integer moduloTotal() {
        return (super.modulo + this.nroCamarotes + this.potencia); 
    }

    @Override
    public String toString() {
        return super.toString()+ "Yate de " + potencia + "HP y " + nroCamarotes + " camarotes.-";
    }
    
    @Override
    public void resumenBoat(){
        System.out.println("Yate de " + potencia + "HP y " + nroCamarotes + " camarotes.-");
    }
    
    
}
