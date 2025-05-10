public  class Inventario  implements Registro{
    AlmacenInventario almacen;

    public Inventario(AlmacenInventario almacen){
        this.almacen = almacen;
    }

    public void registrarProducto(Producto producto, Integer cantidad){
        if(cantidad >= 0 && producto.esValido()){
            almacen.almacenar(producto, cantidad);
        }   else{
            System.out.println(producto.getNomProducto() + " no es Valido para su registro.");
        }
    }
}