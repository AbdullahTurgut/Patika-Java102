package javaClassesAndMethodsUntilJDBC.generics.createOwnListClass;

public class MyList<T> {
    private T[] genericArray;
    private int capacity;


    //varsayılan ve parametreli constructorlar
    public MyList() {
        setCapacity(10); // varsayılan dizi kapasitesi
        setGenericArray(new Object[getCapacity()]);
    }

    public MyList(int capacity) {
        setCapacity(capacity);
        setGenericArray(new Object[getCapacity()]);
    }

    // dizi eleman sayısı
    public int size() {
        int counter = 0;
        for (int i = 0; i < getCapacity(); i++) {
            if (getGenericArray()[i] != null) {
                counter++;
            }
        }
        return counter;
    }
    // kapasitenin kontrolü
    public void checkCapacity(int numOfElements) {
        if (numOfElements > getAvailableCapacity()) {
            doubleCapacity();
            checkCapacity(numOfElements);
        }
    }
    // listeye eleman ekleme
    public void add(T element) {
        checkCapacity(1);
        getGenericArray()[size()] = element;
    }

    // kapasite yetersiz ise 2 katına çıkar
    public void doubleCapacity() {
        T[] tempArray = getGenericArray();

        setCapacity(getCapacity() * 2);
        setGenericArray(new Object[getCapacity()]);

        int i = 0;
        for (T oldElements : tempArray) {
            this.getGenericArray()[i] = oldElements;
            i++;
        }
    }

    // liste indisini döndür
    public T get(int index) {
        if (getGenericArray()[index] == null) {
            return null;
        }
        T value = getGenericArray()[index];
        return value;
    }

    // sil ve sola kaydır
    public void remove(int index) {

        // index boş değilse
        if (getGenericArray()[index] != null) {
            // sil
            getGenericArray()[index] = null;

            // liste elemanlarını sola kaydır
            int i;
            for (i = index + 1; i == size(); i++) {
                getGenericArray()[i - 1] = getGenericArray()[i];
            }
        }

    }

    // liste indisini güncelle
    public void set(int index, T element) {
        //If index not empty
        if (getGenericArray()[index] != null) {
            //set
            getGenericArray()[index] = element;

        }
    }

    // elemanları listele
    public String toString() {

        String list = "[";
        for (T element : getGenericArray()) {
            if (element != null) {
                list = list + element;
            } else {
                list = list + "]";
                break;
            }
        }
        return list;
    }


    // liste indexini döndür
    public int indexOf(T element) {
        int index = -1;
        for (T i : getGenericArray()) {
            index++;
            if (i == element) {
                return index;
            }
        }
        return -1; // parametre değeri listede yoksa -1 döndürür
    }

    // son indexi döndür yoksa -1 döndürür
    public int lastIndexOf(T element) {
        int index = -1;
        int lastIndex = -1;
        for (T i : getGenericArray()) {
            index++;
            if (i == element) {
                lastIndex = index;
            }
        }
        return lastIndex;
    }

    // liste boş mu?
    public boolean isEmpty() {
        boolean isEmpty = true; //I assumed that it is empty
        for (T element : getGenericArray()) {
            if (element != null) {
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }

    // öğeleri dizi haline getir
    public T[] toArray() {
        T[] newArray = (T[]) new Object[size()];
        for (int i = 0; i < size(); i++) {
            newArray[i] = getGenericArray()[i];
        }
        return newArray;
    }

    // dizi elemanlarını temizle
    public void clear() {
        for (int i = 0; i < size(); i++) {
            getGenericArray()[i] = null;
        }
    }

    //değer aralığına göre liste döndürür
    public MyList<T> subList(int start, int finish) {
        // aralık değerlerinin 0 dan büyük olma koşulu
        if (start >= 0 && finish >= 0) {
            // kapasiteden küçük olma
            if (start <= this.getCapacity() && finish <= this.getCapacity()) {
                int size = finish - start + 1;

                MyList<T> myList = new MyList<>(size);
                for (int i = start; i <= finish; i++) {
                    myList.add(get(i));
                }
                return myList;
            }

        }
        return null;

    }

    // değer listede var mı?
    public boolean contains(T data) {
        boolean isContains = false;
        for (int i = 0; i <= size(); i++) {
            if (getGenericArray()[i] == data) {
                isContains = true;
            }
        }
        return isContains;
    }

    // listede ne kadar boş yer var
    public int getAvailableCapacity() {
        return getCapacity() - size();
    }

    //GETTERS and SETTERS
    private void setGenericArray(Object[] array) {
        this.genericArray = (T[]) array;

    }

    public T[] getGenericArray() {
        return this.genericArray;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
