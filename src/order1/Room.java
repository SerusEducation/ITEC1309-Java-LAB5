package order1;

public class Room extends MapSite {
	private int id;
	private MapSite[] sides = new MapSite[4];

	public Room(int id) {
		this.id = id;
	}

	@Override
	public void enter() {
		System.out.println("enter room ID " + id);
	}

	public MapSite getSide(Direction d) {
		if (d == Direction.NORTH)
			return sides[0];
		else if (d == Direction.SOUTH)
			return sides[1];
		else if (d == Direction.EAST)
			return sides[2];
		else
			return sides[3];
	}

	public void setSide(Direction d, MapSite site) {
		if (d == Direction.NORTH)
			sides[0] = site;
		else if (d == Direction.SOUTH)
			sides[1] = site;
		else if (d == Direction.EAST)
			sides[2] = site;
		else
			sides[3] = site;
	}

	public int getId() {
		return id;
	}
}
