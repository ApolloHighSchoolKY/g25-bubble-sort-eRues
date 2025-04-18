public class BubbleSort
{

	public static void main(String[] args)
  {
    int[] myNums = {12, 15, 0, 44, 13, 1, 2};
		int passes = myNums.length;
		int comparisons = myNums.length - 1;
		int tempNum;

		for(int i = passes; i < passes; i++)
		{
			for(int j = 0 ; j < comparisons; j++)
			{
				if(myNums[j] > myNums[j + 1])
				{
					tempNum = myNums[j];
					myNums[j] = myNums[j + 1];
					myNums[j + 1] = tempNum;
				}
			}
			comparisons--;
		}


		//Loop once for each pass, where passes is one less than the number of items.
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
				//If they are out of order, swap the values
			//End Loop for comparisons
    
			//The next pass will use one less comparison
    
		//End Loop for passes



  }
}
