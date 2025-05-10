public class LacteoFactory implements ProductoFactory{

    private Fecha caducidad;
    public LacteoFactory(Fecha fecha){
        caducidad = fecha;
    }

    public Producto crearProducto(String nombre, int precio){
        return (new Lacteo(nombre, precio, caducidad));
    }
}