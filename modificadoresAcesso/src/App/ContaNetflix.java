package App;

public class ContaNetflix {

    String idiomaPreferencial, resolucaoTela;

    void entrar() {
        buscarPreferenciasDoUsuario();
        identificarResolucao();
    }

    void buscarPreferenciasDoUsuario() {
        idiomaPreferencial = "PT-BR";
    }

    void identificarResolucao() {
        resolucaoTela = "Full HD";
    }

    void assistirFilme(String nomeFilme) {
        System.out.println("Iniciando o filme " + nomeFilme);
        System.out.println("Carregando o filme na resolução " + resolucaoTela);
        carregarAudioFilme();
    }

    void carregarAudioFilme() {
        if (idiomaPreferencial.equals("PT-BR") || idiomaPreferencial.equals("EN-US")) {
            System.out.println("Carregando o áudio em " + idiomaPreferencial);
        } else {
            System.out.println("Carregando o áudio em EN-US");
        }
    }
}
