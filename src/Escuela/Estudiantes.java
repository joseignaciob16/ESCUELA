package Escuela;

/** @author Jose Ignacio Berastegui Florez GM1A*/

public class Estudiantes {
     private int codigo;
    private String nombre;
    private String correo;
    private String municipio;
    private String carrera;
   
    
    //creamos el constructor
    public Estudiantes(){
        codigo=0;
        nombre="";
        correo="";
        municipio="";
        carrera="";
    }

    //agregamos los metodos set y get
    public int getCodigo() { 
        return codigo;     }

    public String getNombre() { 
        return nombre;     }

    public String getCorreo() {  
        return correo;    }
    
    public String getMunicipio() {  
        return municipio;    }
    
    public String getCarrera() {  
        return carrera;    }

    public void setCodigo(int codigo) { 
        this.codigo = codigo ;    }

    public void setNombre(String nombre) { 
        this.nombre = nombre;    }

    public void setCorreo(String correo) {  
        this.correo = correo;    }

    public void setMunicipio(String municipio) {  
        this.municipio = municipio;    }
    
    public void setCarrera(String carrera) {  
        this.carrera = carrera;    }
    
}
