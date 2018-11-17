package lab5;
/**
 * Key word in context program with reading and writing files in java.
 * 
 * @author Nathan Mackenzie
 * @version 1.0
 * @since 1.0
 */
public class Lab5 {
    /*public static void main(String[] args) throws java.io.IOException {
        
	LineIterator li = new FileInput(args[0]);
        Sorter sort = new Sorter();
        IndexOutput io;
	
        while (li.hasMoreLines())
	{
		Line l = li.nextLine();
		Shifter s = new Shifter(l);
		while (s.hasMoreLines())
		{
			Line shift = s.nextLine();
			sort.addLine(shift);
		}
	}
	if (args[2].equals("screen")) {
            io = new ScreenOutput(sort);
        }
        else {
            io = new FileOutput(sort, args[1]);
        }
        io.print();
     }*/

    public static void main(String[] args) {
        
        String words[] = { "Get The Balance Right", "Love My Way", "A", "X", "Everything Counts" };
        LineIterator li = new StringInput(words);
        Sorter sort = new Sorter();
	
        while (li.hasMoreLines())
	{
		Line l = li.nextLine();
		Shifter s = new Shifter(l);
		while (s.hasMoreLines())
		{
			Line shift = s.nextLine();
			sort.addLine(shift);
		}
	}
	IndexOutput io = new ScreenOutput(sort);
        io.print();
     }
    
}
