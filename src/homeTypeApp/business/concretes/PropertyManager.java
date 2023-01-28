package homeTypeApp.business.concretes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import homeTypeApp.business.abstracts.PropertyService;
import homeTypeApp.dataAccess.abstracts.IPropertyRepository;
import homeTypeApp.entities.concretes.BaseProperty;
import homeTypeApp.entities.concretes.House;
import homeTypeApp.entities.concretes.SummerHouse;
import homeTypeApp.entities.concretes.Villa;

public class PropertyManager implements PropertyService {

	private IPropertyRepository propertyRepository;
	List<BaseProperty> properties;

	public PropertyManager(IPropertyRepository propertyRepository) {
		super();
		this.propertyRepository = propertyRepository;
	}

	@Override
	public List<BaseProperty> filterByRoomAndLivingRoom(int roomCount, int livingRoomCout) {
	 
		return properties.stream().filter(p -> p.getRoomCount() == roomCount && p.getLivingRoomCount() == livingRoomCout).collect(Collectors.toList());
	}

	@Override
	public List<House> getHouseList() {

		return propertyRepository.getHouseList();
	}

	@Override
	public List<Villa> getVillaList() {

		return propertyRepository.getVillaList();
	}

	@Override
	public List<SummerHouse> getSummerHouseList() {

		return propertyRepository.getSummerHouseList();
	}

	@Override
	public long getHouseTotalPrice() {
		long total = 0;
		for (House house : propertyRepository.getHouseList()) {
			total = total + house.getPrice();
		}
		return total;
	}

	@Override
	public long getVillaTotalPrice() {
		long total = 0;
		for (Villa villa : propertyRepository.getVillaList()) {
			total = total + villa.getPrice();
		}
		return total;
	}

	@Override
	public long getSummerhouseTotalPrice() {
		long total = 0;
		for (SummerHouse summerhouse : propertyRepository.getSummerHouseList()) {
			total = total + summerhouse.getPrice();
		}
		return total;
	}

	@Override
	public long getTotalPrice() {
		long totalPrice = 0;
		totalPrice += getHouseTotalPrice() + getVillaTotalPrice() + getSummerhouseTotalPrice();
		return totalPrice;
	}

	@Override
	public long getHouseSquareMeters() {
		long squareMeter = 0;
		long averageSquareMeter = 0;
		for (House house : propertyRepository.getHouseList()) {
			squareMeter = squareMeter + house.getSquareMeters();
		}
		averageSquareMeter = squareMeter / propertyRepository.getHouseList().size();

		return averageSquareMeter;
	}

	@Override
	public long getVillaSquareMeters() {
		long squareMeter = 0;
		long averageSquareMeter = 0;
		for (Villa villa : propertyRepository.getVillaList()) {
			squareMeter = squareMeter + villa.getSquareMeters();
		}
		averageSquareMeter = squareMeter / propertyRepository.getVillaList().size();

		return averageSquareMeter;
	}

	@Override
	public long getSummerhouseSquareMeters() {
		long squareMeter = 0;
		long averageSquareMeter = 0;
		for (SummerHouse summerHouse : propertyRepository.getSummerHouseList()) {
			squareMeter = squareMeter + summerHouse.getSquareMeters();
		}
		averageSquareMeter = squareMeter / propertyRepository.getSummerHouseList().size();

		return averageSquareMeter;
	}

	@Override
	public long getTotalSquareMeters() {

		long averageSquareMeter = 0;

		averageSquareMeter = getHouseSquareMeters() + getVillaSquareMeters() + getSummerhouseSquareMeters();
		averageSquareMeter = averageSquareMeter / 3;

		return averageSquareMeter;
	}

}
