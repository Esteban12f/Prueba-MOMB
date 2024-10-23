import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusqueda {

    // Insertion sort by age
    public void sortByAgeWithInsertion(Person[] people) {
        for (int i = 0; i < people.length; i++){
            Person aux = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getAge() > aux.getAge()) {
                people[j + 1] = people[j];
                j--;
            }
            people[j + 1] = aux;
        }
    }

    // Binary search by age
    public int searchBinaryByAge(Person[] people, int age) {
        int inicio = 0;
        int fin = people.length - 1;
        while (inicio <= fin){
            int medio = inicio - (inicio - fin) / 2;
            if (people[medio].getAge() == age){
                return medio;
            }

            if (people[medio].getAge() < age){
                inicio = medio + 1;
            }

            if (people[medio].getAge() > age){
                fin = medio - 1;
            }
        }
        return -1; // Placeholder return value
    }
}