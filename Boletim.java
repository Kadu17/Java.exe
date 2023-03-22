public class Boletim {
    public static void main(String[] args) {
//        int resultado;
//        double media = 5.1;
//        resultado = media>=5 ? 1 : 0;
//        System.out.println(resultado);

        double media = 5.1;
        int faltas = 20;
        boolean postura = false;
        String situacao;

        if(media >=5.0 && faltas<25 && postura==true){
            situacao="Approved";
        }
        else if(media<5.0 && faltas<25 && postura){
            situacao="Retake test ";
        }
        else if(media>5.0 && faltas>=25 && postura){
            situacao="No vacation";
        }
        else if(media>5.0 && faltas<25 && !postura){
            situacao="Call to talk";
        }
        else{
            situacao="Disapproved";
        }
        System.out.println(situacao);
    }
}