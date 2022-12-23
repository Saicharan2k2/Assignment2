package assignment2;
public class SubSetArray {
	 static boolean subSet(int a1[], int a2[])
{
int i = 0,j=0;
for (i = 0; i < a2.length; i++) {
for (j = 0; j <a1.length ; j++)
 if (a2[i] == a1[j])
     break;	
if (j == a1.length)
 return false;
}
return true;
}
public static void main(String args[])
{
int a1[] = { 11, 1, 13, 21, 3, 7 };
int a2[] = { 11, 3, 7, 1 };
if (subSet(a1, a2))
    System.out.print("Array 2 is subset of Array 1");
else
    System.out.print("Array 2 is not a subset of Array 1");
}
}

