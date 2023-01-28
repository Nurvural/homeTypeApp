package homeTypeApp.business.abstracts;

import java.util.List;

import homeTypeApp.entities.concretes.BaseProperty;
import homeTypeApp.entities.concretes.House;
import homeTypeApp.entities.concretes.SummerHouse;
import homeTypeApp.entities.concretes.Villa;

public interface PropertyService {

	//void add(BaseProperty baseProperty);
	List<House> getHouseList();
	List<Villa> getVillaList();
	List<SummerHouse> getSummerHouseList();
	
	long getHouseTotalPrice();
	long getVillaTotalPrice();
	long getSummerhouseTotalPrice();
	long getTotalPrice();
	
	long getHouseSquareMeters();
	long getVillaSquareMeters();
	long getSummerhouseSquareMeters();
	long getTotalSquareMeters();
	
    List<BaseProperty> filterByRoomAndLivingRoom(int roomCount,int livingRoomCout);
}
