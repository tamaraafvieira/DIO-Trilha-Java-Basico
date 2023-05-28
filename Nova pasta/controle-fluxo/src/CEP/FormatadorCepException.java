package CEP;

public class FormatadorCepException {
    public static void main(String[] args) {

        try{
        String cepFormatado = formatarCep("23765064");
        System.out.println(cepFormatado);
    }
        catch (CepInvalidException e) {
            e.printStackTrace();
        }

    }

        static String formatarCep(String cep) throws CepInvalidException{
            if(cep.length() != 8)
              throw new CepInvalidException();
            
              //simulando um cep formatado
              return "23.765-064";
              
        }
    
}
