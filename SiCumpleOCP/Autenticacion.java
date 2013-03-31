class Authenticator{
    private UserProvider provider;
 
    public Authenticator(UserProvider provider) {
        this.provider = provider;
    }
 
    public boolean autenticar(String login, String paswword){
        List<User> users = provider.getUsers();
        // Aqui nuestro codigo para verificar dentro la lista
        return true;
    }
}
