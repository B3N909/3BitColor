package me.savant.color;

public class Color
{
	public float r;
	public float g;
	public float b;
	
	
	public Color(float r, float g, float b)
	{
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public String to3Code()
	{
		return r + "" + g + "" + b;
	}
	
/**
1|1|1
1|1|2
1|1|3
1|2|1
1|2|2
1|2|3
1|3|1
1|3|2
1|3|3
2|1|1
2|1|2
2|1|3
2|2|1
2|2|2
2|2|3
2|3|1
2|3|2
2|3|3
3|1|1
3|1|2
3|1|3
3|2|1
3|2|2
3|2|3
3|3|1
3|3|2
3|3|3
*/
	
	public static Color parseColor(int i)
	{
		if(i > 27 || i < 1)
		{
			System.err.println("(ColorParser) That is not a valid color code");
			return null;
		}
		int l = 1;
		for(int r = 1; r <= 3; r++)
		{
			for(int g = 1; g <= 3; g++)
			{
				for(int b = 1; b <= 3; b++)
				{
					if(l == i)
						return parse3Code(r + "" + g + "" + b);
					l++;
				}
			}
		}
		return null;
	}
	
	public static Color parse3Code(String c)
	{
		if(c.length() != 3)
		{
			System.err.println("(ColorParser) Color code not valid length");
			return null;
		}
		
		try
		{
			Integer.parseInt(c);
			
			int r = Integer.parseInt(c.charAt(0) + "");
			int g = Integer.parseInt(c.charAt(1) + "");
			int b = Integer.parseInt(c.charAt(2) + "");
			
			if(r > 3 || g > 3 || b > 3 || r < 1 || g < 1 || b < 1)
			{
				System.err.println("(ColorParser) Color is not a valid 3 bit color");
				return null;
			}
			
			r = toRGB(r);
			g = toRGB(g);
			b = toRGB(b);
			
			return new Color(r, g, b);
		}
		catch (Exception e)
		{
			System.err.println("(ColorParser) Color code is not an integer");
			return null;
		}
	}
	
	private static int toRGB(int i)
	{
		if(i == 1)
			return 1;
		else if(i == 2)
			return 128;
		else if(i == 3)
			return 255;
		return -1;
	}
}