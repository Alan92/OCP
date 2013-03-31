class Autenticar {
    private Proveedor proveedor;
 
    public Autenticar(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
 
    public boolean autenticar(String login, String paswword){
        List<Userios> usuarios = proveedor.obtenerUsuarios();
        // Aqui nuestro codigo para verificar dentro la lista
        return true;
    }
}
