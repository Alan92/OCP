class BaseDatos {
    public List obtenerUsuarios(){
        // Suponemos que viene de la Base de Datos
        List lst = new ArrayList();
        lst.add(new Usuarios("administrador", "passadmin"));
        lst.add(new Usuarios("invitado", "passinvitado"));
        return lst;
    }
}
