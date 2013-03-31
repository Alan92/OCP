class Autenticacion{
    private BaseDatos proveedor;
 
    public Autenticacion(BaseDatos proveedor) {
        this.proveedor = proveedor;
    }
 
    public void autenticar(String login, String password){
        List<Usuarios> list = proveedor.obtenerUsuarios();
        //No voy a escribir el codigo para no hacerlo largo, pero la idea es
        // que aqui verificamos que ese login y password este en la lista.
    }
}
