public class ProgModBas_EX7
{
    // 7. (parellsArray) Fer una funció que rebi un vector i retorni quants elements són parells.


    public static void main (String[] args)
    {



        arrayFactory();


    }

    public static int[] arrayFactory()
    {
        int array1[] = new int[10];

        int aleatorio = (int) (Math.random()*20)+1;

        System.out.println("Array Creada con Números Aleatorios:");

        for (int i = 0; i < array1.length; i++)
        {
            array1[i]= (int) (Math.random()*20)+1;
        }
        for (int i = 0; i < array1.length; i++)
        {
            System.out.println(array1[i]);
        }
        System.out.println("------------------------");


        damePares(array1);

        return array1;
    }

    public static void damePares(int[] array1)
    {
        System.out.println("Array Recibida: ");

        for(int i = 0; i < array1.length; i++)
        {
            System.out.println(array1[i]);
        }

        System.out.println("------------------------");

        System.out.println("Numeros Pares: ");

        for (int i = 0; i < array1.length; i++)
        {


            if (array1[i] % 2 == 0 )
            {

                System.out.println(array1[i]);
            }
            else
            {

            }


        }
    }


}
