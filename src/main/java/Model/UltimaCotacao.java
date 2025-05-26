package Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record UltimaCotacao(
        @JsonAlias("Time Series (Daily)") UltimaCotacaoDTO ultimaCotacaoDTO) {

}
