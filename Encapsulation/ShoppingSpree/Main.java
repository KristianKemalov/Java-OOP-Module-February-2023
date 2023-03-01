package ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String[] peopleAndMoney = sc.nextLine().split(";");
        String[] productAndCost = sc.nextLine().split(";");

        List<Person> people = new ArrayList<>();
        List<Product> products = new ArrayList<>();


        Map<String, List<String>> result = new LinkedHashMap<>();


        for (String s : peopleAndMoney) {
            String[] current = s.split("=");
            try {

                people.add(new Person(current[0], Double.parseDouble(current[1])));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        for (String s : productAndCost) {
            String[] current = s.split("=");
            try {

                products.add(new Product(current[0], Double.parseDouble(current[1])));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }


        String command = sc.nextLine();

        while (!command.equals("END")) {
            String[] data = command.split(" ");

            Person currentPerson = people.stream().filter(p -> p.getName().equals(data[0])).findFirst().get();
            Product currentProduct = products.stream().filter(p -> p.getName().equals(data[1])).findFirst().get();

            result.putIfAbsent(currentPerson.getName(),new ArrayList<>());

            try {
                currentPerson.buyProduct(currentProduct);
                System.out.println(currentPerson.getName() + " bought " + currentProduct.getName());

                    result.get(currentPerson.getName()).add(currentProduct.getName());

            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }

            command = sc.nextLine();
        }


        for (Map.Entry<String, List<String>> stringListEntry : result.entrySet()) {
            if (stringListEntry.getValue().isEmpty()){
                System.out.println(stringListEntry.getKey()+" - Nothing bought");
            }else {
                System.out.println(stringListEntry.getKey()+" - "+String.join(", ",stringListEntry.getValue()));
            }
        }

    }
}