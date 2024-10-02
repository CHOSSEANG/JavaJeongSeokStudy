package ch11;

import java.util.Iterator;

class MyVector {
    protected Object[] data = null;
    protected int capacity = 0;
    protected int size = 0;

    public MyVector(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("유효하지 않은 값입니다. :" + capacity);
        }

        this.capacity = capacity;
        data = new Object[capacity];
    }

    public MyVector() {
        this(10);
    }

    public void ensureCapacity(int minCapacity) {
        int newCapacity = capacity;

        if (minCapacity > capacity) {
            newCapacity = capacity * 2;
        }

        if(minCapacity > newCapacity) {
            newCapacity = minCapacity;
        }

        setCapacity(newCapacity);
    }

    public boolean add(Object obj) {
        ensureCapacity(size + 1);
        data[size++] = obj;
        return true;
    }

    public Object get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        return data[index];
    }

    public Object remove(int index) {
        Object oldObj = null;

        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        oldObj = data[index];

        if (index != size - 1) {
            System.arraycopy(data, index + 1, data, index, size - index - 1);
        }

        data[size - 1] = null;
        size--;
        return oldObj;
    }

    public boolean remove(Object obj) {
        for (int i = 0; i < size; i++) {
            if(obj.equals(data[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void trimToSize(){
        setCapacity(size);
    }

    public void setCapacity(int capacity) {
        if(this.capacity==capacity) return;

        Object[] tmp = new Object[capacity];
        System.arraycopy(data, 0, tmp, 0, size);
        data = tmp;
        this.capacity = capacity;
    }

    public void clear() {
        for(int i=0;i<size;i++) {
            data[i] = null;
        }
        size = 0;
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        System.arraycopy(data, 0, result, 0, size);

        return result;
    }

    public boolean isEmpty(){ return size==0;}
    public int capacity() {  return capacity;  }
    public int size() {  return size;  }
    /****************************************/
    /* List 인터페이스로부터 상속받은 메서드들       */
    /****************************************/

//    public int size();
//    public boolean isEmpty();
    public boolean contains (Object o){return false;}
    public Iterator iterator() { return null;}
//    public Object[] toArray();
    public Object[] toArray(Object a[]){return null;}
//    public boolean add(Object o);
//    public boolean remove(Object o);






}
