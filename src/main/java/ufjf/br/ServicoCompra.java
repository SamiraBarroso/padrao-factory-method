package ufjf.br;

public class ServicoCompra implements IServico{
    @Override
    public String executar() {
        return "Compra realizada com sucesso!";
    }

    @Override
    public String cancelar() {
        return "Compra cancelada com sucesso!";
    }
}
