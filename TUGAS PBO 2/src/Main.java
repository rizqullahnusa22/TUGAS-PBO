 class ArrayOfInteger {
    private int[] arr;
    private int idx;

    public ArrayOfInteger(int[] arr) {
        this.arr = arr;
        this.idx = arr.length;
    }

    public void showArray() {
        System.out.print("Array elements: ");
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int getElemen(int idx) {
        if (idx >= 0 && idx < this.idx) {
            return arr[idx];
        } else {
            System.out.println("Index out of bounds.");
            return 1;
        }
    }

    public void setElemen(int idx, int nilai) {
        if (idx >= 0 && idx < this.idx) {
            arr[idx] = nilai;
            System.out.println("Value at index" + idx + " updated successfully.");
        } else {
            System.out.println("Index out of bounds. Value not updated.");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ArrayOfInteger arrObj = new ArrayOfInteger(array);

        arrObj.showArray();

        int valueAtIndex2 = arrObj.getElemen(2);
        System.out.println("Value at index 2: " + valueAtIndex2);

        arrObj.setElemen(3, 10);
        arrObj.showArray();
    }
}
