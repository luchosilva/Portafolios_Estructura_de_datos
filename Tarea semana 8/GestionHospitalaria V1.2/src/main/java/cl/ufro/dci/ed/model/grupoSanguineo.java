package cl.ufro.dci.ed.model;

public enum grupoSanguineo {
    AP("A positivo"),AN("A negativo"),BP("B positivo"),BN("B negativo"),ABP("AB positivo"),ABN("AB negativo"),OP("0 positivo"),ON("0 negativo");
    private String grupoSanguineo;

    grupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }
}
