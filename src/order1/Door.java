package order1;

public class Door extends MapSite {
	private Room room1; // เดินจากห้องไหนไปห้องไหน เลยมี room1 กับ room2
	private Room room2;
	private boolean isOpen;

	public Door(Room room1, Room room2) {
		this.room1 = room1;
		this.room2 = room2;
		isOpen = true;
	}

	@Override
	public void enter() {
		if (isOpen)
			System.out.println("enter door from room " + room1.getId() + " to " + room2.getId());
		else
			System.out.println("hit door !!");
	}

}
