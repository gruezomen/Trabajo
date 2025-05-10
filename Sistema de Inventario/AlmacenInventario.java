import java.util.ArrayList;

public class AlmacenInventario implements Almacen{

    private ArrayList<Producto> listaProductos = new ArrayList<>();
    private ArrayList<Integer> cantidadProductos = new ArrayList<>();

    public void almacenar(Producto producto, Integer cantidad){
        listaProductos.add(producto);
        cantidadProductos.add(cantidad);
    }
}