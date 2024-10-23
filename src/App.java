
import models.Person;
import models.PersonasGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        PersonasGenerator personaGenerator = new PersonasGenerator();
        MetodosOrdenamientoBusqueda mOmB = new MetodosOrdenamientoBusqueda();

        // Obtener el arreglo de 50 personas generadas aleatoriamente
        Person[] personas = personaGenerator.generarPersonas();

        System.out.println("Listado de personas generadas:");
        for (Person persona : personas) {
            System.out.println(persona.getAge());
        }

        mOmB.sortByAgeWithInsertion(personas);

        System.out.println("Listado de personas ordenado por edades:");
        for (Person persona : personas) {
            System.out.println(persona.getAge());
        }

        int resultado = mOmB.searchBinaryByAge(personas, 73);

        if(resultado == -1){
            System.out.println("La edad ingresada no se encuetra en el arreglo :/");
        } else {
            System.out.println("La edad pedida se encuentra en la posicion: " + resultado);
        }

    }
}
