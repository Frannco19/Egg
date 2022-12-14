package Libro;

public class Libro {
    int SBN;
    String Titulo;
    String Autor;
    int Paginas;
    
    public Libro() {
    }

    public Libro(int SBN, String Titulo, String Autor, int Paginas) {
        this.SBN = SBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Paginas = Paginas;
    }

    public int getSBN() {
        return SBN;
    }

    public void setSBN(int SBN) {
        this.SBN = SBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    
    
    
}

