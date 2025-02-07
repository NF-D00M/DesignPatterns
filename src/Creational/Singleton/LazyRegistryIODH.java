package Creational.Singleton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazyRegistryIODH {
    private LazyRegistryIODH() {
        // Calls only once
        // No synchronisation issues
        System.out.println("In LazyRegistryIODH singleton");
    }

    private static class RegistryHolder {
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();

    }

    public static LazyRegistryIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }
}
