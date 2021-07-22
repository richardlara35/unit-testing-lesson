package carStuff;

public class CarUtils {
    public static String getCarDetails(Car car) {

        if (car.getMake() == null || car.getModel() == null ||
                car.getYear() == null || car.getColor() == null) {
            return "Not able to provide details";
        }
        return car.getColor() + " " + car.getYear() + " " + car.getMake() + " " + car.getModel();
    }


    public static double addToMileage(Car car, double mileageToAdd) {
        return car.getMileage() + mileageToAdd;
    }

    public static void convertToElectric(Car car, String engineType){
        if (engineType.toLowerCase().contains("electric")){
        car.setIsElectric(true);
        }

    }




}


