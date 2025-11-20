public enum StatusLocacao {
    RESERVADA("Veiculo Reservado, aguardando retirada"),
    EM_ANDAMENTO("Veiculo em uso pelo cliente"),
    ATRASADA("Devolucao atrasada, verificar multa"),
    CONCLUIDA("Locacao finalizada e arquivada");

    private final String descricao;

    StatusLocacao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
