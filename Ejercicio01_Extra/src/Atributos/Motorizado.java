/*
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos
especiales:

• Potencia en CV para barcos a motor.


Un alquiler se calcula multiplicando el número de días de ocupación (calculado
con la fecha de alquiler y devolución), por un valor módulo de cada barco
(obtenido simplemente multiplicando por 10 los metros de eslora).

En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
modulo normal y sumándole el atributo particular de cada barco:

_En los barcos a motor se le suma la potencia en CV y 

 */
package Atributos;


public class Motorizado extends Barco{
    
    private Integer power;

    
    
    public Motorizado() {
    }

    public Motorizado(Integer power, String matricula, Integer eslora, Integer anioFabricacion, Integer modulo) {
        super(matricula, eslora, anioFabricacion, modulo);
        this.power = power;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    
    @Override
    public String toString() {
        return super.toString()+"Motorizado de " + power + " HP.-";
    }

    
    @Override
    public Integer moduloTotal() {
        return (super.modulo + this.power);
    }
    
    @Override
    public void resumenBoat(){
        System.out.println("Motorizado de " + power + " HP.-");
    }
    
    
    
    
}
