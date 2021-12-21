package Escuela;

/** @author Jose Ignacio Berastegui Florez GM1A*/

public class Materia {
    private String nombreMateria1,nombreMateria2, nombreMateria3 ;
    private float notafinal1, notafinal2, notafinal3;
    private int periodo;
    
    public Materia(){
        nombreMateria1="";
        notafinal1=0;
        nombreMateria2="";
        notafinal2=0;
        nombreMateria3="";
        notafinal3=0;
        periodo=0;
    }
   
    public String getNombreMateria1() {
        return nombreMateria1;
    }
    public void setNombreMateria1(String nombreMateria1) {
        this.nombreMateria1 = nombreMateria1;
    }
    public float getNotafinal1() {
        return notafinal1;
    }
    public void setNotafinal1(float notafinal1) {
        this.notafinal1 = notafinal1;
    }  
    public String getNombreMateria2() {
        return nombreMateria2;
    }
    public void setNombreMateria2(String nombreMateria2) {
        this.nombreMateria2 = nombreMateria2;
    }
    public float getNotafinal2() {
        return notafinal2;
    }
    public void setNotafinal2(float notafinal2) {
        this.notafinal2 = notafinal2;
    }
    public String getNombreMateria3() {
        return nombreMateria3;
    }
    public void setNombreMateria3(String nombreMateria3) {
        this.nombreMateria3 = nombreMateria3;
    }
    public float getNotafinal3() {
        return notafinal3;
    }
    public void setNotafinal3(float notafinal3) {
        this.notafinal3 = notafinal3;
    }
    public int getPeriodo() {
        return periodo;
    }
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    } }

