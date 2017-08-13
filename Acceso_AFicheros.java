import java.io.*;

/**
 * ---SECUENCIAS, STREAMS O FLUJOS DE DATOS.
 *Sirven para mandar información desde un sitio remoto a través de la red. Para poder leer información dentro de 
 * ficheros que haya en nuestro ordenador, o para poder escrbir en un fichero que haya en nuestro ordenador.

 *Hasta ahora guardabamos la información en VL, y era momentanea, con las secuencias podemos almacenar la 
 * información de forma permanente, en un fichero normalmente,     Como podemos abordar el asunto?

 *--- es decir, cuando queremos leer o escribir en un archivo podemos hacerlo usando bytes o usando caracteres.
 * 
 * --VAMOS A VER COMO ACCEDER A INFORMACIÓN DE ARCHIVOS CON  Flujo de Caracteres, sino con las cl, ‘Reader y Write’ 
 * si con otras que heredan de ellas.
 * @author franciscoJavier
 */
public class Acceso_AFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Acceso_AFicheros accediendo = new Acceso_AFicheros();
        accediendo.lee();
    }

    public void lee() {
        try {
            //PASOS.
            // 1º decirle a nuestra programa java donde está el fichero.
            //instaciamo FileReader para decirle donde se encuentra el archivo.
            FileReader entrada = new FileReader("C:/Users/Usuario/Desktop/CURSO_JAVA/00 Apuntes_Sobre_Los_Videos/0. ETIQUETAS PARA GIT.txt");
            //FileReader entrada = new FileReader("C:/Users/Usuario/Desktop/archivo.txt");
           
            // 2º le decimos a java que empiece a leer el archivo.
            // Para ello utizamos el mt, ‘read()’ de la cl, class java.io.InputStreamReader de la que hereda 'FileReader'.
            //y que  devuelve el cararcter leido en forma de entero, o ‘-1’ si ha llegado al final del String.
            //declaramos una variable para almacenar este dato.
            int c = entrada.read();// almacena en 'c' el código del 1º caracter que se encuentra en el fichero.
            while (c != -1) {
                c = entrada.read();
                char letra =(char)c;// --- hacemos casting para que sea entendible el codigo del mt read()
                System.out.print(letra);
            }

        } catch (IOException e) {// ---IOException abarca la excepción del mt read() y la de la cl 'FileReader'.
            System.out.println("no se encuentra el archivo.");
            //Logger.getLogger(Leer_Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}