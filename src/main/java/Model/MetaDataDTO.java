package Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MetaDataDTO(@JsonAlias("2. Symbol")String papel,
                          @JsonAlias("3. Last Refreshed")String ultimaAtualizacao) {
}
