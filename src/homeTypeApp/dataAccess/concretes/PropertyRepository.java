package homeTypeApp.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homeTypeApp.dataAccess.abstracts.IPropertyRepository;
import homeTypeApp.entities.concretes.BaseProperty;
import homeTypeApp.entities.concretes.House;
import homeTypeApp.entities.concretes.SummerHouse;
import homeTypeApp.entities.concretes.Villa;

public class PropertyRepository implements IPropertyRepository{

	//List<BaseProperty> properties;
	//List<House> houses;
	
	BaseProperty house = new House(1,10,200,1,2);
	BaseProperty house1 = new House(1,10,100,1,2);
	BaseProperty house2 = new House(1,10,100,1,2);
	BaseProperty villa = new Villa(2,100,120,1,2);
	BaseProperty villa1 = new Villa(2,100,120,1,2);
	BaseProperty villa2 = new Villa(2,100,120,1,2);
	BaseProperty summerhouse = new SummerHouse(3,200,120,3,2);
	BaseProperty summerhouse1 = new SummerHouse(3,200,120,3,2);
	BaseProperty summerhouse3 = new SummerHouse(3,200,120,3,2);


	@Override
	public List<House> getHouseList() {
		List<House> houseList = new ArrayList<>();
		houseList.add((House) house);
		houseList.add((House) house1);
		return houseList;
	}

	@Override
	public List<Villa> getVillaList() {
		List<Villa> villaList = new ArrayList<>();
		villaList.add((Villa) villa);
		return villaList;
	}
	@Override
	public List<SummerHouse> getSummerHouseList() {
		List<SummerHouse> summerList = new ArrayList<>();
		summerList.add((SummerHouse) summerhouse);
		return summerList;
	}



}
