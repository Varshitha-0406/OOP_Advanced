package SortingandStreamAPI;
import java.util.*;

class Medicine {
    String name;
    double price;
    int expiryYear;

    Medicine(String name, double price, int expiryYear) {
        this.name = name;
        this.price = price;
        this.expiryYear = expiryYear;
    }

    public String toString() {
        return name + " - Price: " + price + ", Expiry Year: " + expiryYear;
    }
}

public class PharmacyInventory {
    public static void main(String[] args) {
        List<Medicine> medicines = new ArrayList<>();
        medicines.add(new Medicine("Paracetamol", 50.0, 2026));
        medicines.add(new Medicine("Amoxicillin", 120.0, 2025));
        medicines.add(new Medicine("Cetrizine", 50.0, 2024));
        medicines.add(new Medicine("Ibuprofen", 80.0, 2027));
        medicines.add(new Medicine("Dolo", 50.0, 2027));

        Comparator<Medicine> sortByPriceThenExpiry = (m1, m2) -> {
            if (m1.price == m2.price)
                return Integer.compare(m2.expiryYear, m1.expiryYear);
            else
                return Double.compare(m1.price, m2.price);
        };

        Collections.sort(medicines, sortByPriceThenExpiry);

        for (Medicine m : medicines)
            System.out.println(m);
    }
}
