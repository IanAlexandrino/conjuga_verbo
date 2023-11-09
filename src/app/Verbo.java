package app;

public class Verbo {
    String radical;
    String sufixo;

    public Verbo(String _radical, String _sufixo){
        this.radical = _radical;
        this.sufixo = _sufixo;
    }

    public void setRadical(String radical) {
        this.radical = radical;
    }

    public String getRadical() {
        return radical;
    }

    public void setSufixo(String _sufixo) {
        this.sufixo = _sufixo;
    }

    public String getSufixo() {
        return sufixo;
    }

    public void Conjulgar(){

    }
}
