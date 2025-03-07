public class log {
    private log proxima;
    private log anterior;

    private Object autor;
    private Object receptor;
    private Object acao;
    private Object log;
    private Object diahora;

    public log(Object autor, Object log, Object diahora, Object acao, Object receptor, log proxima) {
        this.autor = autor;
        this.log = log;
        this.acao = acao;
        this.diahora = diahora;
        this.receptor = receptor;
        this.proxima = proxima;
    }

    public log(Object autor, Object log, Object diahora, Object acao, Object receptor) {
        this.autor = autor;
        this.log = log;
        this.acao = acao;
        this.diahora = diahora;
        this.receptor = receptor;
    }

    public Object getNome() {
        return autor;
    }

    public Object getLog() {
        return log;
    }

    public Object getDiaHora() {
        return diahora;
    }

    public Object getAcao() {
        return acao;
    }

    public String getMensagem() {
        String msg = "[" + diahora + "]" + autor + ' ' + acao + ' ' + receptor + ":" + log;
        return msg;
    }

    public log getAnterior() {
        return anterior;
    }

    public void setAnterior(log anterior) {
        this.anterior = anterior;
    }

    public void setProxima(log proxima) {
        this.proxima = proxima;
    }

    public log getProxima() {
        return proxima;
    }

}
