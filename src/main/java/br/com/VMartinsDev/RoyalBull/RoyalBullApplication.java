package br.com.VMartinsDev.RoyalBull;
/* Link API B3 : https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=PETR4.SA&interval=5min&apikey=NLIUYXHSL37T5X4P */

import Model.*;
import Model.Json.MetaData;
import Model.Json.MetaDataClass;
import Model.Json.TimeSeriesDaily;
import Service.ConsumoApi;
import Service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class RoyalBullApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(RoyalBullApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		String papel = "PETR4";
		ConsumoApi consumoApi = new ConsumoApi();
		var json = consumoApi.consumirDados("https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol="+ papel +".SA&interval=5min&apikey=NLIUYXHSL37T5X4P");

		System.out.println(json);

		ConverteDados converteDados = new ConverteDados();

		MetaDataClass metaDataClass = converteDados.obterDados(json, MetaDataClass.class);
		System.out.println(metaDataClass.toString());

		TimeSeriesDaily timeSeriesDaily = converteDados.obterDados(json, TimeSeriesDaily.class);

		System.out.println(timeSeriesDaily.toString());


//		System.out.println("impressão do Json");
//		System.out.println(json);
//		ConverteDados converteDados = new ConverteDados();
// 		MetaData metaData = converteDados.obterDados(json, MetaData.class);
//		System.out.println(metaData);
//		UltimaCotacao ultimaCotacao = converteDados.obterDados(json, UltimaCotacao.class);
//
//		System.out.println("Impressão Json para Classe");
//		System.out.println(ultimaCotacao);
//
//		MetaDataClasse metaDataClasse = new MetaDataClasse(metaData);
//		String string = metaDataClasse.toString();
//		System.out.println(string);


	}
}
