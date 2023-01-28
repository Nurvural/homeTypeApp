package homeTypeApp;

import java.util.List;

import homeTypeApp.business.abstracts.PropertyService;
import homeTypeApp.business.concretes.PropertyManager;
import homeTypeApp.dataAccess.concretes.PropertyRepository;
import homeTypeApp.entities.concretes.House;
import homeTypeApp.entities.concretes.SummerHouse;
import homeTypeApp.entities.concretes.Villa;

public class Main {

	public static void main(String[] args) {

		PropertyService propertyService = new PropertyManager(new PropertyRepository());

		System.out.println("----------------HOUSE-------------");
		List<House> houses = propertyService.getHouseList();
		for (House house : houses) {
			System.out.println("id: " + house.getId() + " fiyat: " + house.getPrice() + " evin metrekaresi: "
					+ house.getSquareMeters());

		}
		System.out.println("----------------VÝLLA-------------");
		List<Villa> villas = propertyService.getVillaList();
		for (Villa villa : villas) {
			System.out.println(
					"id: " + villa.getId() + " fiyat: " + villa.getPrice() + " oda sayýsý: " + villa.getRoomCount());
		}

		System.out.println("----------------SUMMER HOUSE-------------");
		List<SummerHouse> summerHouses = propertyService.getSummerHouseList();
		for (SummerHouse summerHouse : summerHouses) {
			System.out.println("id: " + summerHouse.getId() + " fiyat: " + summerHouse.getPrice()
					+ " evin metrekaresi: " + summerHouse.getSquareMeters());
		}
		System.out.println("----------------TOPLAM FÝYAT-------------");
		System.out.println("Evlerin toplam fiyatý: " + propertyService.getHouseTotalPrice());
		System.out.println("Villalarýn toplam fiyatý: " + propertyService.getVillaTotalPrice());
		System.out.println("Yazlýklarýn toplam fiyatý: " + propertyService.getSummerhouseTotalPrice());

		System.out.println("Tüm tipteki evlerin toplam fiyatý: " + propertyService.getTotalPrice());

		System.out.println("----------------ORTALAMA METREKARE-------------");
		System.out.println("Evlerin ortalama metrekaresi: " + propertyService.getHouseSquareMeters());
		System.out.println("Villalarýn ortalama metrekaresi: " + propertyService.getVillaSquareMeters());
		System.out.println("Yazlýklarýn ortalama metrekaresi: " + propertyService.getSummerhouseSquareMeters());

		System.out.println("Tüm tipteki evlerin ortalama metrekaresi: " + propertyService.getTotalSquareMeters());
		
		System.out.println("Oda ve salon sayýsýna göre tüm tipteki evleri filtreleme: " + propertyService.filterByRoomAndLivingRoom(3, 2));

	}

}
