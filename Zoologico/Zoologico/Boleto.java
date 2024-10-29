public class Boleto {
    //atributos de boleto
    private int idBoleto;
    private String fechaCompra;
    private float precio;
    private String tipoBoleto;
    private boolean usado;

    //constructor de los atributos
    public Boleto(int boletoID, String fechaCompra, float precio, String tipoBoleto, boolean usado) {
        idBoleto = boletoID;
        this.fechaCompra = fechaCompra;
        this.precio = precio;
        this.tipoBoleto = tipoBoleto;
        this.usado = false;

    }

    //Getter and Setters

    public int getBoletoID() {
        return idBoleto;
    }

    public void setBoletoID(int boletoID) {
        this.idBoleto = boletoID;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTipoBoleto() {
        return tipoBoleto;
    }

    public void setTipoBoleto(String tipoBoleto) {
        this.tipoBoleto = tipoBoleto;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    // Metodos del boleto

    public boolean validarBoleto(){
        return !usado;

    }

    public void marcarUso(){
        usado = true;
    }

    // Intenta reembolsar el boleto si no ha sido usado

    public boolean rembolsar() {
        if (!usado) {
            return true;
        }
        return false;
    }

}
