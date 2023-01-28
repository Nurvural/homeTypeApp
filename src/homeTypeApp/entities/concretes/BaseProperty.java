package homeTypeApp.entities.concretes;

public class BaseProperty {

	private int id;
	private long price;
	private long squareMeters;
	private int roomCount;
	private int livingRoomCount;
	public BaseProperty() {
		super();
	}
	public BaseProperty(int id, long price, long squareMeters, int roomCount, int livingRoomCount) {
		super();
		this.id = id;
		this.price = price;
		this.squareMeters = squareMeters;
		this.roomCount = roomCount;
		this.livingRoomCount = livingRoomCount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getSquareMeters() {
		return squareMeters;
	}
	public void setSquareMeters(long squareMeters) {
		this.squareMeters = squareMeters;
	}
	public int getRoomCount() {
		return roomCount;
	}
	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}
	public int getLivingRoomCount() {
		return livingRoomCount;
	}
	public void setLivingRoomCount(int livingRoomCount) {
		this.livingRoomCount = livingRoomCount;
	}
	
	

}
