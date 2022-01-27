

public class HelloWorld{
    public static void main(String []args){
		
		System.out.println("Recibí " + args.length + " parámetros" );
		
        System.out.println("Hello World from San Luis Potosí!");

		for(int i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}
		
    }
}