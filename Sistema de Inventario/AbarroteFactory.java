public class AbarroteFactory implements ProductoFactory{

    public Producto crearProducto(String nombre, int precio){
        return (new Abarrote(nombre, precio));
    }
}