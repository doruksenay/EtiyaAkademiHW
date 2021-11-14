package homework3;

public class MyHashMap<T1, T2> {
	private Object[] keys;
	private Object[] values;

	public MyHashMap() {
		keys = new Object[0];
		values = new Object[0];
	}

	public void put(T1 key, T2 value) {
		Object[] tempKeys = keys;
		Object[] tempValues = values;
		keys = new Object[keys.length + 1];
		values = new Object[values.length + 1];

		if (keys.length > 0 && values.length > 0) {
			for (int i = 0; i < tempKeys.length; i++) {
				keys[i] = tempKeys[i];
				values[i] = tempValues[i];
			}
		}
		keys[keys.length - 1] = key;
		values[values.length - 1] = value;
	}

	public Object get(T1 key) {
		for (int i = 0; i < keys.length; i++) {
			if (keys[i] == key) {
				return values[i];
			}
		}
		return null;
	}

	public int size() {
		return keys.length;
	}

	public void remove(T1 key) {

		if (keys.length == 0) {
			System.out.println("Liste boştur.");
		} else if (keys.length == 1) {
			keys = new Object[0];
			values = new Object[0];
		} else {
			int myIndex = getIndex(key);
			if (myIndex != -1) {
				Object[] removedKeys = new Object[keys.length - 1];
				Object[] removedValues = new Object[values.length - 1];
				keys[myIndex] = null;
				values[myIndex] = null;
				int counter = 0;
				for (int i = 0; i < keys.length; i++) {
					if (keys[i] != null) {
						removedKeys[counter] = keys[i];
						removedValues[counter] = values[i];
						counter++;
					}
				}
				keys = removedKeys;
				values = removedValues;
			}

		}

	}

	public void clear() {
		keys = new Object[0];
		values = new Object[0];
	}

	public int getIndex(T1 key) {
		for (int i = 0; i < keys.length; i++) {
			if (keys[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public void print() {
		if (keys.length == 0) {
			System.out.println("Liste boş.");
		} else {
			for (int i = 0; i < keys.length; i++) {
				System.out.println((values[i] + "," + keys[i]));
			}
		}

		System.out.println("--------------");
	}

}
