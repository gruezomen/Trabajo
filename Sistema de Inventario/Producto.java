abstract class Producto{
    protected String nomProducto;
    protected int precioProducto;
    protected ValidadorProducto validador;

    public Producto(String nomProducto, int precioProducto){
        this.nomProducto = nomProducto;
        this.precioProducto = precioProducto;
        this.validador = new ValidadorPredeterminado();
    }

    public  String getNomProducto(){
        return nomProducto;
    }

    public int getPrecioProducto(){
        return precioProducto;
    }

    public boolean esValido(){
        return validador.validar(this);
    }

    public void setValidador(ValidadorProducto validador){
        this.validador = validador;
    }
}
