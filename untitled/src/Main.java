
class MyList {
    private int capacity = 10;
    private int size = 0;
    private int[] arr;

    public MyList() {
        arr = new int[capacity];
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public void add(int value) {
        if (size < capacity) {
            arr[size] = value;
            size++;
        } else {
            System.out.println("Список заполнен!");
        }
    }

    public void clear() {
        size = 0;
        arr = new int[capacity];
    }

    public boolean isHasValue(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return i; // Возвращаем индекс первого вхождения
            }
        }
        return -1; // Если значение не найдено
    }
public void removeByValue(int value){
        int index = indexOf(value);
        if (index!=-1){
            removeByIndex(index);
        }

}
public void removeByIndex(int index){
        if (index<0||index>=size){
            System.out.println("Error");
            return;
        }
        for (int i =index; i<size;i++){
            System.out.println(arr[i]+" ");
            System.out.println("n/Size: " +size);
        }
}
    public void print() {
        System.out.print("Список: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nРазмер: " + size);
    }

    public static void main(String[] args) {
        MyList list = new MyList();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(10);
        System.out.println("Исходный список:");
        list.print();
        // Добавим повторяющееся значение
//
//        System.out.println("До очистки:");
//        list.print();
//
//        System.out.println("Есть ли 10 в списке? " + list.isHasValue(10)); // Ожидаем true
//        System.out.println("Индекс первого вхождения 10: " + list.indexOf(10)); // Ожидаем 1
//        System.out.println("Индекс 20 (отсутствует): " + list.indexOf(20)); // Ожидаем -1
//        System.out.println("Удаляем число 10 ");
        list.removeByValue(10);
        System.out.println("Удаляем по индексу 1:");
        list.removeByIndex(1);
        list.clear();

        System.out.println("После очистки:");
        list.print();

        System.out.println("Есть ли 10 в списке после очистки? " + list.isHasValue(10)); // Ожидаем false
        System.out.println("Индекс 10 после очистки: " + list.indexOf(10)); // Ожидаем -1
    }
}

