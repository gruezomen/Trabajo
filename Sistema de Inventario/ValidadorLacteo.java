public class ValidadorLacteo implements ValidadorProducto{

    public boolean validar(Producto producto){
        boolean resp = false;

        if(producto instanceof Lacteo){
            if(((Lacteo) producto).getCaducidad() != null){
                resp = true;
            }
        }
        return resp;
    }
}