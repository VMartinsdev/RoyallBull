package Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record UltimaCotacaoDTO(
        @JsonAlias("2025-03-17")UltimaCotacaoDTO2 ultimaCotacaoDTO2){

}

