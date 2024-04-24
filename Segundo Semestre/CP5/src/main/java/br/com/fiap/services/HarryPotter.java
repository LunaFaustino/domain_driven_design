package br.com.fiap.services;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import br.com.fiap.model.Personagem;

public class HarryPotter {
	
	public Personagem getPersonagem(String nome) throws ClientProtocolException, IOException {
	    Personagem personagem = null;
	    
	    // tiramos os espaços e trocamos para %20 porque se não sempre dá personagem não encontrado
	    String id = nome.replace(" ", "%20");
	    
	    HttpGet request = new HttpGet("https://potterhead-api.vercel.app/api/characters/"+id);
	    
	    CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
	    
	    CloseableHttpResponse response = httpClient.execute(request);
	    
	    HttpEntity entity = response.getEntity();
	    
	    if(entity != null) {
	        String result = EntityUtils.toString(entity);
	        
	        // identifica essa string quando o personagem não for encontrado e coloca como Null para definirmos a nossa saída na classe de Testes
	        if (result.startsWith("No character with name")) {
	            return null;
	        }
	        
	        Gson gson = new Gson();
	        
	        personagem = gson.fromJson(result, Personagem.class);
	    }
	    
	    return personagem;
	}




}
