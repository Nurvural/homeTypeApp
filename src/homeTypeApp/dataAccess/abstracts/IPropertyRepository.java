package homeTypeApp.dataAccess.abstracts;

import java.util.List;

import homeTypeApp.entities.concretes.BaseProperty;
import homeTypeApp.entities.concretes.House;
import homeTypeApp.entities.concretes.SummerHouse;
import homeTypeApp.entities.concretes.Villa;

public interface IPropertyRepository {

	//void add(BaseProperty baseProperty);
	List<House> getHouseList();
	List<Villa> getVillaList();
	List<SummerHouse> getSummerHouseList();
	
}
