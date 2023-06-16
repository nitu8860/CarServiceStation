import java.util.*;

class CarServiceStation {
    private static final Map<String, Map<String, Integer>> servicePrices = new HashMap<>();

    static {
        Map<String, Integer> hatchbackPrices = new HashMap<>();
        hatchbackPrices.put("BS01", 2000);
        hatchbackPrices.put("EF01", 5000);
        hatchbackPrices.put("CF01", 2000);
        hatchbackPrices.put("BF01", 1000);
        hatchbackPrices.put("GF01", 3000);

        Map<String, Integer> sedanPrices = new HashMap<>();
        sedanPrices.put("BS01", 4000);
        sedanPrices.put("EF01", 8000);
        sedanPrices.put("CF01", 4000);
        sedanPrices.put("BF01", 1500);
        sedanPrices.put("GF01", 6000);

        Map<String, Integer> suvPrices = new HashMap<>();
        suvPrices.put("BS01", 5000);
        suvPrices.put("EF01", 10000);
        suvPrices.put("CF01", 6000);
        suvPrices.put("BF01", 2500);
        suvPrices.put("GF01", 8000);

        servicePrices.put("Hatchback", hatchbackPrices);
        servicePrices.put("Sedan", sedanPrices);
        servicePrices.put("SUV", suvPrices);
    }

    private String typeOfCar;
    private List<String> serviceCodes;

    public CarServiceStation(String typeOfCar, List<String> serviceCodes) {
        this.typeOfCar = typeOfCar;
        this.serviceCodes = serviceCodes;
    }

    public void generateBill() {
        int totalBill = 0;

        System.out.println("Type of Car: " + typeOfCar);

        for (String serviceCode : serviceCodes) {
            if (servicePrices.containsKey(typeOfCar) && servicePrices.get(typeOfCar).containsKey(serviceCode)) {
                int price = servicePrices.get(typeOfCar).get(serviceCode);
                totalBill += price;
                System.out.println("Charges for " + getServiceName(serviceCode) + ": ₹ " + price);
            }
        }

        System.out.println("Total Bill: ₹ " + totalBill);

        if (totalBill > 10000) {
            System.out.println("Complimentary Cleaning Provided");
        }
    }

    private String getServiceName(String serviceCode) {
        switch (serviceCode) {
            case "BS01":
                return "Basic Servicing";
            case "EF01":
                return "Engine Fixing";
            case "CF01":
                return "Clutch Fixing";
            case "BF01":
                return "Brake Fixing";
            case "GF01":
                return "Gear Fixing";
            default:
                return "";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the type of car (Hatchback, Sedan, SUV): ");
        String typeOfCar = sc.nextLine();

        System.out.print("Enter the service codes (comma-separated): ");
        String serviceCodesString = sc.nextLine();
        String[] serviceCodesArray = serviceCodesString.split(",");

        List<String> serviceCodes = new ArrayList<>();
        for (String code : serviceCodesArray) {
            serviceCodes.add(code.trim());
        }

        CarServiceStation carServiceStation = new CarServiceStation(typeOfCar, serviceCodes);
        carServiceStation.generateBill();

        sc.close();
    }
}
