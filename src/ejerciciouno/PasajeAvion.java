
package ejerciciouno;

public class PasajeAvion {
    private int distancia;
    private int numDias;
    private double vrKm;
    
    private double vrVuelo;

    public PasajeAvion(int distancia, int numDias) {
        this.distancia = distancia;
        this.numDias   = numDias;
        this.vrKm      = 35.00;
        this.vrVuelo   = 0;
        getValorVuelo();
    }
    
    

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public double getVrKm() {
        return vrKm;
    }

    public void setVrKm(double vrKm) {
        this.vrKm = vrKm;
    }

    public double getVrVuelo() {
        return vrVuelo;
    }

    public void setVrVuelo(double vrVuelo) {
        this.vrVuelo = vrVuelo;
    }
    
    public void getValorVuelo(){
             setVrVuelo(getPrecio());
             getDescuento();

    }   
    
    public double getDescuento(){
        if(distancia > 1000 && numDias > 7){
           return this.vrVuelo = vrVuelo - ( vrVuelo * 0.30 );
        }
        else {
            return vrVuelo;
        }
    }
    
    public double getPrecio(){
        // precio 
        // double precio = 0;
        return distancia * vrKm;
    }
    
}
