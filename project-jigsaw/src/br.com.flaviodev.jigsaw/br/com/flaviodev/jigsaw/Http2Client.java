package br.com.flaviodev.jigsaw;

import jdk.incubator.http.*;
import java.net.URI;
import java.io.IOException;
import java.lang.InterruptedException;
import java.net.URISyntaxException;

class Http2Client {
   public static void main (String... args) throws IOException, InterruptedException, URISyntaxException {
      HttpClient client = HttpClient.newHttpClient();

      // GET
      HttpResponse<String> response = client.send(
          HttpRequest
              .newBuilder(new URI("http://openjdk.java.net/jeps/11"))
              .GET()
              .build(),
          HttpResponse.BodyHandler.asString()
      );
      int statusCode = response.statusCode();
      String body = response.body();

      System.out.println(body);
      System.out.println("status code: "+statusCode);
   }
}
