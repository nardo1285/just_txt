/*
Un Barco se caracteriza por: 
- Su matrícula, 
- Su eslora en metros y 
- Anio de fabricación.
*/
package Atributos;

public abstract class Barco {
    
    protected String matricula;
    protected Integer eslora;
    protected Integer anioFabricacion;
    protected Integer modulo;

    //CONSTRUCTORES

    public Barco() {
    }
    public Barco(String matricula, Integer eslora, Integer anioFabricacion, Integer modulo) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        this.modulo = eslora * 10;
    }
    
    
    //Agrego los Setters y Getters por si tengo que acceder desde la clase Alquiler
    //SETTERS
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }
    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    public void setModulo(Integer modulo) {
        this.modulo = modulo;
    }
    
    
    //GETTERS
    public String getMatricula() {
        return matricula;
    }
    public Integer getEslora() {
        return eslora;
    }
    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }
    public Integer getModulo() {
        return modulo;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula +"\n"+
                "Eslora [m]: " + eslora +"\n"+
                "Año de Fabricación: " + anioFabricacion +"\n"+ 
                "Módulo: " + modulo +"\n"+
                "Tipo: ";   //Esta parte queda pendiente de completar, ya que lo hace cuando 
                            // se invoca en la clase hija.
    }
    
    
    //Métodos Abstractos que aplicará a todos los tipos de barcos
    public abstract Integer moduloTotal();
    
    //Para mostrar resumen del Barco
    public abstract void resumenBoat();
    
    
    
    
}
