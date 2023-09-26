package classes;

public class Pais {
    private String nome;
    private String capital;
    private int dimensaoKm;
    private String[] fronteiras;

    public Pais(String nome, String capital, int dimensaoKm, String[] fronteiras) {
        this.nome = nome;
        this.capital = capital;
        this.dimensaoKm = dimensaoKm;
        this.fronteiras = fronteiras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getDimensaoKm() {
        return dimensaoKm;
    }

    public void setDimensaoKm(int dimensaoKm) {
        this.dimensaoKm = dimensaoKm;
    }

    public String[] getFronteiras() {
        return fronteiras;
    }

    public void setFronteiras(String[] fronteiras) {
        this.fronteiras = fronteiras;
    }

    public void paisesIguais(Pais pais1, Pais pais2) {
        if (pais1.getNome().equals(pais2.getNome())) {
            System.out.println("Os dois países são iguais");
        } else {
            System.out.println("Os dois países não são iguais");
        }
    }

    public void paisLimitrofe(Pais pais1, Pais pais2) {
        String resposta = null;
        for (int i = 0; i < fronteiras.length; i++) {
            if (pais2.getNome().equals(pais1.fronteiras[i])) {
                resposta = "Sim";
            }
        }
        if (resposta != null) {
            System.out.println("O/A " + pais2.getNome() + " faz fronteira com o/a " + pais1.getNome());
        } else {
            System.out.println("O/A " + pais1.getNome() + " não faz fronteira com o/a " + pais1.getNome());
        }
    }


    public void listaVizinhos(Pais pais1, Pais pais2) {
        String[] listaVizinhos = new String[10];
        int cont = 0;
        for (int i = 0; i < pais1.fronteiras.length; i++) {
            for (int j = 0; j < pais2.fronteiras.length; j++) {
                if (pais1.fronteiras[i].equals(pais2.fronteiras[j])) {
                    listaVizinhos[cont] = pais2.fronteiras[j];
                    cont++;
                }
            }
        }
        System.out.println("A lista de países vizinhos em comum entre " + pais1.getNome() + " e " + pais2.getNome() + " são: ");
        for (int i = 0; i < listaVizinhos.length; i++) {
            if (listaVizinhos[i] != null) {
                System.out.println(listaVizinhos[i]);
            }
        }
    }
}

