import jakarta.persistence.*;

public class pontosDeVacinacao {

    public class PontoDeVacinacao {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nome;
        private String endereco;

        @ManyToOne
        @JoinColumn(name = "cidade_id")
        private cidade cidade;
    }
