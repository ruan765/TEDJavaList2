package entities;


public class alunoEx6 {
    private String name;
    private Double n1;
    private Double n2;
    private Double n3;
    private Double n4;
    private Double media;

    public alunoEx6(String nome, double n1, double n2, double n3, double n4, double media) {
        this.name = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.media = media;

    }

    public alunoEx6() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public Double getN3() {
        return n3;
    }

    public void setN3(Double n3) {
        this.n3 = n3;
    }

    public Double getN4() {
        return n4;
    }

    public void setN4(Double n4) {
        this.n4 = n4;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double Media) {
        this.media = Media;
    }
    
    public double media(double n1,double n2,double n3,double n4) {
        double media = (n1+n2+n3+n4) / 4;
        return media;
    }
}