package RandomList;

/**
 * [la clase Order sera para configurar el metodo quicksort]
 *
 * @version [1.0.000 2022-02-11]
 *
 * @author [Juan Esteban, Velasquez Posada ]
 *
 * @since [1.0.000 2022-02-11]
 *
 */
public class Order {

    /**
     * [Detalle Sera el metodo para ingresar el arreglo a organizar ]
     *
     *
     * @param int right se refiere a la ubicacion del recorrido del array
     * @param int left se refiere a la ubicacion del recorrido del array
     * @param int numbers es el arreglo al cual deseamos organizar
     * @return el arreglo organizado
     *
     * @author [Juan Esteban, Velasquez Posada ]
     *
     * @since [1.0.000 2022-02-11]
     */
    public void ordenarQuickSort(int[] array) {
        array = quicksort1(array);
    }

    public int[] quicksort1(int numbers[]) {
        return quicksort2(numbers, 0, numbers.length - 1);
    }

    public int[] quicksort2(int numbers[], int left, int right) {
        if (left >= right) {
            return numbers;
        }
        int i = left, d = right;
        if (left != right) {
            int pivote;
            int aux;
            pivote = left;
            while (left != right) {
                while (numbers[right] >= numbers[pivote] && left < right) {
                    right--;
                }
                while (numbers[left] < numbers[pivote] && left < right) {
                    left++;
                }
                if (right != left) {
                    aux = numbers[right];
                    numbers[right] = numbers[left];
                    numbers[left] = aux;
                }
            }
            if (left == right) {
                quicksort2(numbers, i, left - 1);
                quicksort2(numbers, left + 1, d);
            }
        } else {
            return numbers;
        }
        return numbers;
    }

}
