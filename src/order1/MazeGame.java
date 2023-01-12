package order1;

public class MazeGame {
	public static void main(String[] args) {
		Maze m = createMaze();
	}

	public static Maze createMaze() {
		Maze maze;
		Room r1, r2;
		Door d;
		maze = new Maze();
		r1 = new Room(1);
		r2 = new Room(2);
		d = new Door(r1, r2); // เปิดประตูห้อง 1 ไปห้อง 2
		maze.addRoom(r1);
		maze.addRoom(r2);
		r1.setSide(Direction.NORTH, new Wall());
		r1.setSide(Direction.EAST, new Wall());
		r1.setSide(Direction.SOUTH, new Wall());
		r1.setSide(Direction.WEST, d);
		r2.setSide(Direction.NORTH, new Wall());
		r2.setSide(Direction.EAST, d);
		r2.setSide(Direction.SOUTH, new Wall());
		r2.setSide(Direction.WEST, new Wall());
		return maze;
	}
}
