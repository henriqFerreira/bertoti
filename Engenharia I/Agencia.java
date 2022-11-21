class Agencia {
    protected String numAgencia;
    protected String nomeAgencia;

    public Agencia (String numAgencia, String nomeAgencia) {
        this.numAgencia = numAgencia;
        this.nomeAgencia = nomeAgencia;
    }

    public String getNumAgencia() {
        return numAgencia;
    }
    public String getNomeAgencia() {
        return nomeAgencia;
    }
    public void setNumAgencia(String numAgencia) {
        this.numAgencia = numAgencia;
    }
    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }
}