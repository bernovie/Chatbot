package magpie;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		statement=statement.toLowerCase();
		if(statement.trim().length()==0){
			response = "Is anybody there?";
		}
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("friend") >= 0
				|| statement.indexOf("teacher") >= 0
				|| statement.indexOf("classmate") >= 0
				|| statement.indexOf("peer") >= 0
				|| statement.indexOf("homie") >= 0
				|| statement.indexOf("bro") >= 0)
		{
			response = "Tell me more about this person";
		}
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0
				|| statement.indexOf("fish") >= 0
				|| statement.indexOf("bird") >= 0
				|| statement.indexOf("hamster") >= 0
				|| statement.indexOf("horse") >= 0)
		{
			response = "Tell me more about your pets";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0
				|| statement.indexOf("uncle") >= 0
				|| statement.indexOf("aunt") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("game of thrones") >= 0
				|| statement.indexOf("the walking dead") >= 0
				|| statement.indexOf("breaking bad") >= 0
				|| statement.indexOf("mad men") >= 0
				|| statement.indexOf("gossip girl") >= 0
				|| statement.indexOf("the big bang theory") >= 0)
		{
			response = "What a great show! I watch it too";
		}
		else if (statement.indexOf("hola") >= 0
				|| statement.indexOf("como estas") >= 0
				|| statement.indexOf("mexico") >= 0
				|| statement.indexOf("que onda") >= 0
				|| statement.indexOf("quibo") >= 0
				|| statement.indexOf("pedo") >= 0)
		{
			response = "Yo tambien hablo español! Viva Mexico!";
		}
		else if (statement.indexOf("sing") >= 0)
		{
			response = "I dont sing, do you?";
		}
		else
		{
			response = getRandomResponse();
		}
		
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Maybe later";
		}
		else if (whichResponse == 5)
		{
			response = "Let me think about it";
		}

		return response;
	}
}

