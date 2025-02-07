package Creational.Singleton;

public class Client {

	public static void main(String[] args) {
		EagerRegistry registry = EagerRegistry.getInstance();
		EagerRegistry registry2 = EagerRegistry.getInstance();


		LazyRegistryWithDCL lazySingleton1 = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazySingleton2 = LazyRegistryWithDCL.getInstance();
//		System.out.println(lazySingleton2 == lazySingleton1);


		LazyRegistryIODH singleton;
		LazyRegistryIODH.getInstance();
		System.out.println("done");
	}

}
