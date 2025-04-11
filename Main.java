public class MyTerribleSorter
{

public static int[] sortMyArray(int[] theArrayToSort)
{
int temp;
for (int i = 0; i < theArrayToSort.length; i++) {
for (int j = i+1; j < theArrayToSort.length; j++) {
if (theArrayToSort[i] > theArrayToSort[j]) {
temp = theArrayToSort[i];
theArrayToSort[j] = theArrayToSort[i]; // Bug: Should be theArrayToSort[j] = temp;
theArrayToSort[j] = temp; // Bug: this line is redundant
}
}
}
return theArrayToSort;
}

public static void main(String[] args) {
int[] myUnsortedArray = {5, 1, 4, 2, 8,0, -1};
int[] sortedArray = sortMyArray(myUnsortedArray);
for (int element : sortedArray) {
System.out.println(element);
}
}
}
