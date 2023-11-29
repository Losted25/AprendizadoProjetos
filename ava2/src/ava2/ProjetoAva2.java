package ava2;

import java.util.ArrayList;
import java.util.List;

public class ProjetoAva2 {
    public static void main(String[] args) {
        List<Veiculos> veiculosList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            veiculosList.add(new Aviao());
        }

        for (int i = 0; i < 20; i++) {
            veiculosList.add(new Navio());
        }

        for (Veiculos veiculo : veiculosList) {
            veiculo.entradaDados();
            veiculo.imprimir();
        }
    }
}
