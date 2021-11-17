import business.abstracts.BrandService;
import business.abstracts.CarService;
import business.concretes.BrandManager;
import business.concretes.CarManager;
import dataAccess.abstracts.CarRepository;
import dataAccess.concretes.BrandDao;
import dataAccess.concretes.CarDao;
import entities.Brand;
import entities.Car;
import entities.Color;

public class Main {

public static void main(String[] args) {
		
		Car car1 = new Car(1, 1, 2000, 1000, "Otomobil");
		Car car2 = new Car(1, 1, 2000, 10000, "Otomobil");
		Car car3 = new Car(1, 1, 2000, 100000, "Otomobil");
		Car car4 = new Car(1, 1, 2000, 1000000, "Otomobil");

	    Brand brand = new Brand(1, "Ferrari");
	    Color color = new Color(5, "Kırmızı");
	    

		BrandService brandService = new BrandManager(new BrandDao());
		brandService.insert(brand);
		
		CarService carService = new CarManager(new CarDao());
		carService.insert(car1);
		
//		carService.insert(car2);
//		carService.insert(car3);
//		carService.insert(car4);
		
//		carService.getAll();
		
		System.out.println(car1.getDescription() + " " +  brand.getBrandName());

	}
}
