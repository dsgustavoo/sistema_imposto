package pkginterface;

public interface AppCommand {
    public void salvar(Object registro);
    public void atualizar(Object registro);
    public void deletar(int id);
}
