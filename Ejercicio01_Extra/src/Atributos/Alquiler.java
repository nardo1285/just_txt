/*
Para cada Alquiler se guarda: 
- El nombre del cliente, 
- Documento del cliente, 
- La fecha de alquiler, 
- Fecha de devolución, 
- La posición del amarre y 
- El barco que lo ocupará.
 */
package Atributos;

public class Alquiler {
    
    private String nombre;
    private Double dni;
    private Integer diaAlq;
    private Integer mesAlq;
    private Integer anioAlq;
    private Integer diaDev;
    private Integer mesDev;
    private Integer anioDev;
    private Integer posicionAma;
    private Barco barco;
    private Double periodo;
    private Double precio;

    //CONSTRUCTORES
    public Alquiler() {
    }

    public Alquiler(Double precio, String nombre, Double dni, Integer diaAlq, Integer mesAlq, Integer anioAlq, Integer diaDev, Integer mesDev, Integer anioDev, Integer posicionAma, Barco barco, Double periodo) {
        this.nombre = nombre;
        this.dni = dni;
        this.diaAlq = diaAlq;
        this.mesAlq = mesAlq;
        this.anioAlq = anioAlq;
        this.diaDev = diaDev;
        this.mesDev = mesDev;
        this.anioDev = anioDev;
        this.posicionAma = posicionAma;
        this.barco = barco;
        this.periodo = periodo;
        this.precio = precio;
    }
    
    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDni(Double dni) {
        this.dni = dni;
    }

    public void setDiaAlq(Integer diaAlq) {
        this.diaAlq = diaAlq;
    }

    public void setMesAlq(Integer mesAlq) {
        this.mesAlq = mesAlq;
    }

    public void setAnioAlq(Integer anioAlq) {
        this.anioAlq = anioAlq;
    }

    public void setDiaDev(Integer diaDev) {
        this.diaDev = diaDev;
    }

    public void setMesDev(Integer mesDev) {
        this.mesDev = mesDev;
    }

    public void setAnioDev(Integer anioDev) {
        this.anioDev = anioDev;
    }
    
    public void setPosicionAma(Integer posicionAma) {
        this.posicionAma = posicionAma;
    }
    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public void setPeriodo(Double periodo) {
        this.periodo = periodo;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }
    public Double getDni() {
        return dni;
    }
    public Integer getDiaAlq() {
        return diaAlq;
    }

    public Integer getMesAlq() {
        return mesAlq;
    }

    public Integer getAnioAlq() {
        return anioAlq;
    }

    public Integer getDiaDev() {
        return diaDev;
    }

    public Integer getMesDev() {
        return mesDev;
    }

    public Integer getAnioDev() {
        return anioDev;
    }
    public Integer getPosicionAma() {
        return posicionAma;
    }
    public Barco getBarco() {
        return barco;
    }

    public Double getPeriodo() {
        return periodo;
    }

    public Double getPrecio() {
        return precio;
    }
    
    
    @Override
    public String toString() {
        return "Detalles de Alquiler:\n" 
                +"-Nombre del cliente: " + this.nombre +"\n"
                +"-DNI: " + dni +"\n"
                +"-Fecha Inicio del Alquiler: " + diaAlq+"/"+mesAlq+"/"+anioAlq+ "\n"
                +"-Fecha Fin del Alquiler: " + diaDev+"/"+mesDev+"/"+anioDev+ "\n"
                +"-Amarre Número: " + posicionAma +"\n"
                +"-DETALLES DEL BARCO: " + barco + "\n"
                +"-PRECIO TOTAL del ALQUILER $"+precio;
    }
    
    public String usuario(){
        return "-Nombre del cliente: " + nombre +"\n"
                +"-DNI: " + dni +"\n"
                +"-Fecha Inicio del Alquiler: " + diaAlq+"/"+mesAlq+"/"+anioAlq+ "\n"
                +"-Fecha Fin del Alquiler: " + diaDev+"/"+mesDev+"/"+anioDev+ "\n";
    }
    
    
    
    
}
