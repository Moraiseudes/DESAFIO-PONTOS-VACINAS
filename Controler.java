import com.example.ApiVacinas.services.VacinacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class Controler {
    import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/vacinacao")
    public class VacinacaoController {

        @Autowired
        private VacinacaoService vacinacaoService;

        // Endpoint para obter os pontos de vacinação de uma cidade
        @GetMapping("/cidade/{nomeCidade}")
        public List<pontosDeVacinacao.PontoDeVacinacao> getPontosDeVacinacao(@PathVariable String nomeCidade) {
            return vacinacaoService.getPontosDeVacinacaoPorCidade(nomeCidade);
        }

        // Endpoint para adicionar um novo ponto de vacinação
        @PostMapping("/ponto")
        public PontoDeVacinacao adicionarPontoDeVacinacao(@RequestBody PontoDeVacinacao ponto) {
            return vacinacaoService.adicionarPontoDeVacinacao(ponto);
        }
    }
}
