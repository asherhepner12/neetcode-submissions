class DynamicArray {
private int[] array;
private int size;
    public DynamicArray(int capacity) {
        array = new int[capacity];
        size  = 0;
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if (getSize() == getCapacity())
        {
            resize();
        }
        array[getSize()] = n;
        size++;
    }

    public int popback() {
        size--;
        return array[getSize()];
    }

    private void resize() {
        int[] resized = new int[array.length * 2];
        for (int i = 0; i < array.length; i++)
        {
            resized[i] = array[i]; 
        }
        array = resized;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return array.length;
    }
}
