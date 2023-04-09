package semana02;
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }
    
    public int darDia(){
        return dia;
    }
    
    public int darMes(){
        return mes;
    }
    
    public int darAnio(){
        return anio;
    }
    
    public int darDiferenciaEnMeses(Fecha pFecha){
        int diferencia=0;
        
        diferencia= this.mes -pFecha.mes;
        
        if (diferencia<0){
            diferencia= diferencia*-1;
        }
        if(this.dia>pFecha.dia){
            diferencia= diferencia-1;
        }
        
        return diferencia;
    }

    @Override
    public String toString() {
        String texto;
        texto = dia+"-"+mes+"-"+anio;
        return texto;
    }
    
    
}
