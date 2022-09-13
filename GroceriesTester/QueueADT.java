
public interface QueueADT<T> {
		// define our abstract methods
	public abstract boolean fullShoppers();
	public abstract boolean emptyShoppers();
	public abstract void enqueue(T element);
	public abstract	T dequeue();
}	// end interface QueueADT
