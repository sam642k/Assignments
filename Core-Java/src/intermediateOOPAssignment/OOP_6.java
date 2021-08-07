package intermediateOOPAssignment;

abstract class Persistence{
	abstract void persist();
}

class FilePersistence extends Persistence{
	void persist() {
		System.out.println("Data being saved on file");
	}
}

class DatabasePersistence extends Persistence{
	void persist() {
		System.out.println("Data being saved on database");
	}
}

class Client{
	void invokePersist(Persistence per) {
		per.persist();
	}
}

public class OOP_6 {
	public static void main(String[] args) {
		Persistence file= new FilePersistence();
		Persistence db= new DatabasePersistence();
		Client c= new Client();
		c.invokePersist(file);
		c.invokePersist(db);
	}
}
