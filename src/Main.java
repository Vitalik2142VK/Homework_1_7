public class Main {



    public static void main(String[] args)
    {
        // Task1:
        int[] arrInt = {1, 2, 3};
        float[] arrFloat = {1.57f, 7.654f, 9.986f};
        char[] arrChar = {'a', 'b', 'c'};

        // Task2:
        System.out.println("Task2:");
        for (int i = 0; i < arrInt.length; i++)
        {
            if (arrInt[i] != arrInt[arrInt.length - 1])
            {
                System.out.print(arrInt[i] + ", ");
            }
            else
            {
                System.out.println(arrInt[i]);
            }
        }
        for (int i = 0; i < arrFloat.length; i++)
        {
            if (arrFloat[i] != arrFloat[arrFloat.length - 1])
            {
                System.out.print(arrFloat[i] + ", ");
            } else
            {
                System.out.println(arrFloat[i]);
            }
        }
        for (int i = 0; i < arrChar.length; i++)
        {
            if (arrChar[i] != arrChar[arrChar.length - 1])
            {
                System.out.print(arrChar[i] + ", ");
            } else
            {
                System.out.println(arrChar[i]);
            }
        }
        System.out.println("##########");

        //Task3:
        System.out.println("Task3:");
        for (int i = arrInt.length - 1; i > -1; i--)
        {
            if (arrInt[i] != arrInt[0])
            {
                System.out.print(arrInt[i] + ", ");
            }
            else
            {
                System.out.println(arrInt[i]);
            }
        }
        for (int i = arrFloat.length - 1; i > -1; i--)
        {
            if (arrFloat[i] != arrFloat[0])
            {
                System.out.print(arrFloat[i] + ", ");
            } else
            {
                System.out.println(arrFloat[i]);
            }
        }
        for (int i = arrChar.length - 1; i > -1; i--)
        {
            if (arrChar[i] != arrChar[0])
            {
                System.out.print(arrChar[i] + ", ");
            } else
            {
                System.out.println(arrChar[i]);
            }
        }
        System.out.println("##########");

        //Task4:
        System.out.println("Task4:");
        for (int i = 0; i < arrInt.length; i++)
        {
            if(arrInt[i] % 2 != 0)
            {
                arrInt[i] += 1;
            }
        }
        for (int i = 0; i < arrInt.length; i++)
        {
            if (arrInt[i] != arrInt[arrInt.length - 1])
            {
                System.out.print(arrInt[i] + ", ");
            }
            else
            {
                System.out.println(arrInt[i]);
            }
        }
        System.out.println("##########");
    }
}