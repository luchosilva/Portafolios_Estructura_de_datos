package cl.ufro.dci.ed.model;

public enum Prevision {
    FONASAA("fonasa A") , FONASAB("fonasa B") , FONASAC("fonasa C") , FONASAD("fonasa D") , ISAPRE("isapre");
    private String prevision;

    Prevision(String prevision) {
        this.prevision = prevision;
    }

    public String getPrevision() {
        return prevision;
    }

    public void setPrevision(String prevision) {
        this.prevision = prevision;
    }
}
