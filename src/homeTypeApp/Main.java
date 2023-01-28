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
		System.out.println("----------------V�LLA-------------");
		List<Villa> villas = propertyService.getVillaList();
		for (Villa villa : villas) {
			System.out.println(
					"id: " + villa.getId() + " fiyat: " + villa.getPrice() + " oda say�s�: " + villa.getRoomCount());
		}

		System.out.println("----------------SUMMER HOUSE-------------");
		List<SummerHouse> summerHouses = propertyService.getSummerHouseList();
		for (SummerHouse summerHouse : summerHouses) {
			System.out.println("id: " + summerHouse.getId() + " fiyat: " + summerHouse.getPrice()
					+ " evin metrekaresi: " + summerHouse.getSquareMeters());
		}
		System.out.println("----------------TOPLAM F�YAT-------------");
		System.out.println("Evlerin toplam fiyat�: " + propertyService.getHouseTotalPrice());
		System.out.println("Villalar�n toplam fiyat�: " + propertyService.getVillaTotalPrice());
		System.out.println("Yazl�klar�n toplam fiyat�: " + propertyService.getSummerhouseTotalPrice());

		System.out.println("T�m tipteki evlerin toplam fiyat�: " + propertyService.getTotalPrice());

		System.out.println("----------------ORTALAMA METREKARE-------------");
		System.out.println("Evlerin ortalama metrekaresi: " + propertyService.getHouseSquareMeters());
		System.out.println("Villalar�n ortalama metrekaresi: " + propertyService.getVillaSquareMeters());
		System.out.println("Yazl�klar�n ortalama metrekaresi: " + propertyService.getSummerhouseSquareMeters());

		System.out.println("T�m tipteki evlerin ortalama metrekaresi: " + propertyService.getTotalSquareMeters());
		
		System.out.println("Oda ve salon say�s�na g�re t�m tipteki evleri filtreleme: " + propertyService.filterByRoomAndLivingRoom(3, 2));

	}

}
