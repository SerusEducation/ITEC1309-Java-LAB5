package order1;

import java.util.ArrayList;
import java.util.List;

public class Maze {
	private List<Room> roomList = new ArrayList<Room>();

	public Maze() {
	}

	public void addRoom(Room r) {
		roomList.add(r);
	}

	public Room getRoom(int id) {
		for (Room r : roomList) {
			if (r.getId() == id)
				return r;

		}
		return null;
	}
}
