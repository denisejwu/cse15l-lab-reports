import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    int num = 0;
    String var = " ";
    String returns = " ";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return var;
        }else {
            if (url.getPath().contains("/add-message")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    for(int i = 1; i< parameters.length; i ++){
                        var += parameters[i];
                        num +=1;
                        returns = num + "." + var + " " + " \n\n ";
                    }
                    // num += 1;
                    // returns = ;
                    return returns;
                }
            }
            return "404 Not Found!";
        }
    }
      
    }


class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
