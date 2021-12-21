package Escuela;

/** @author Jose Ignacio Berastegui Florez GM1A*/

public class Matricula {
   
    private int tam=5;
    private Estudiantes lista[];
    private Materia lista1[];
    
    
    
    public Matricula(int tam){
        this.tam=tam;
        lista=new Estudiantes[tam];
        lista1=new Materia[tam];
    }
    
   
    public int getTam(){
        return this.tam;     
    }
    
   
    public Estudiantes getEstudiante(int pos) {
        return lista[pos];
    }

    public Materia getMateria(int pos) {
        return lista1[pos];
    }
    
    public void setEstudiante(int cod, String nom, String carr, String mup, String corr, int pos){
        Estudiantes est = new Estudiantes();
       
        est.setCodigo(cod);
        est.setNombre(nom);
        est.setCarrera(carr);
        est.setMunicipio(mup);
        est.setCorreo(corr);     
     
        lista[pos]=est;       
    }
    
    public void setMatriculas(String nommat1, float notfinal1, String nommat2, float notfinal2,
                              String nommat3, float notfinal3, int per, int pos) {
       
        Materia materia = new Materia();
        
        materia.setNombreMateria1(nommat1);
        materia.setNotafinal1(notfinal1);
        materia.setNombreMateria2(nommat2);
        materia.setNotafinal2(notfinal2);
        materia.setNombreMateria3(nommat3);
        materia.setNotafinal3(notfinal3);
        materia.setPeriodo(per);
                   
        lista1[pos]=materia;
    }
      
    
    public int buscarEstudiante(int cod, int numest){
        int i=0;
        int res=-1;
        while (i<numest){
            if(cod==lista[i].getCodigo()){
                res=i;
                break;
            }else{
                i++;
            }
        } 
        return res;
        
    }
  
    public boolean validarEstudiante(int cod, int numest){
        int i=0;
        boolean encontrado=false;
        if(numest>0){
            for(i=0;i<numest;i++)
              if (lista[i].getCodigo()==cod )
              {  encontrado =true; }
                   }
        return encontrado;
        
    }
    
    public int BuscaNotaMayor() {
        int pos = 0;
        float mayor = 0;

        for (int i = 0; i < 5; i++) {

            if (lista1[i].getNotafinal1()> lista1[i].getNotafinal2() && lista1[i].getNotafinal1() 
                    > lista1[i].getNotafinal1()) {
                if (lista1[i].getNotafinal1() > mayor) {
                    mayor = lista1[i].getNotafinal1();
                    pos = i;
                }
            } else if (lista1[i].getNotafinal2() > lista1[i].getNotafinal1() && lista1[i].getNotafinal2()
                    > lista1[i].getNotafinal3()) {
                if (lista1[i].getNotafinal2() > mayor) {
                    mayor = lista1[i].getNotafinal2();
                    pos = i;
                }
            } else if (lista1[i].getNotafinal3() > lista1[i].getNotafinal1() && lista1[i].getNotafinal3()
                    > lista1[i].getNotafinal2()) {
                if (lista1[i].getNotafinal3() > mayor) {
                    mayor = lista1[i].getNotafinal3();
                    pos = i;
                }
            }
        }return pos;
    }
    
}
