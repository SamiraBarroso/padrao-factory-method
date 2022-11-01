package ufjf.br;

public class ServicoDevolucao implements IServico{
    @Override
    public String executar() {
        return "Solicitação de devolução realizada com sucesso!";
    }

    @Override
    public String cancelar() {
        return "Solicitação de devolução cancelada com sucesso!";
    }
}
