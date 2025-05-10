public class Lacteo extends Producto{
    private Fecha caducidad;
    public Lacteo(String nomProducto, int precioProducto, Fecha caducidad){
        super(nomProducto, precioProducto);
        this.caducidad = caducidad;
    }

    public Fecha getCaducidad(){
        return caducidad;
    }

    @Override
    public boolean esValido(){
        if(caducidad != null){
            return true;
        }   else{
            return false;
        }
    }
}