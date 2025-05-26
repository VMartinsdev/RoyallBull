package Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record UltimaCotacaoDTO2(
        @JsonAlias("1. open") String abertura,
        @JsonAlias("4. close") String fechamento
) {
}
