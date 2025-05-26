package Model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class MetaDataClasse {

    String ultimaAtualizacao;


    public MetaDataClasse(MetaData metaData ) {
        this.ultimaAtualizacao = metaData.metadata().ultimaAtualizacao();
        System.out.println(ultimaAtualizacao);
    }


}
