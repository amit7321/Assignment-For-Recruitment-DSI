import java.util.*;

class books
{
	String bookName, startingDate, endDate ;
	float consumptionTime, rating ;
	int  totalDays ;
	
	public books(String bookName, String startingDate, String endDate, float consumptionTime, float rating, int totalDays) 
	{
		this.bookName = bookName ;
		this.startingDate = startingDate ;
		this.endDate = endDate ;
		this.consumptionTime = consumptionTime ;
		this.rating = rating ;
		this.totalDays = totalDays ;
		
	}
	
	List <books> bookList = null ;
	
	public List<books> getList()
	{
	    return bookList;
	}

	public static void setList(List<books> bookList)
	{
	    bookList = bookList;
	}
	
}

class series
{
	String seriesName, startingDate, endDate ;
	float consumptionTime, rating ;
	int  totalDays ;
	
	public series(String seriesName, String startingDate, String endDate, float consumptionTime, float rating, int totalDays) 
	{
		this.seriesName = seriesName ;
		this.startingDate = startingDate ;
		this.endDate = endDate ;
		this.consumptionTime = consumptionTime ;
		this.rating = rating ;
		this.totalDays = totalDays ;
		
	}
	
	List <series> seriesList = null ;
	
	public List<series> getList()
	{
	    return seriesList;
	}

	public static void setList(List<series> seriesList)
	{
	    seriesList = seriesList;
	}
	
}

class movies
{
	String moviesName, startingDate, endDate ;
	float consumptionTime, rating ;
	int  totalDays ;
	
	public movies(String moviesName, String startingDate, String endDate, float consumptionTime, float rating, int totalDays) 
	{
		this.moviesName = moviesName ;
		this.startingDate = startingDate ;
		this.endDate = endDate ;
		this.consumptionTime = consumptionTime ;
		this.rating = rating ;
		this.totalDays = totalDays ;
		
	}
	
	List <movies> moviesList = null ;
	
	public List<movies> getList()
	{
	    return moviesList;
	}

	public static void setList(List<movies> moviesList)
	{
	    moviesList = moviesList;
	}
	
}


public class test_driver
{

	public static void main(String[] args) 
	{
	
		List <books> bookList = new ArrayList<books>();
		List <series> seriesList = new ArrayList<series>();
		List <movies> moviesList = new ArrayList<movies>();
		
		Scanner scInt = new Scanner(System.in) ;
		Scanner scStr = new Scanner(System.in) ;
		Scanner scFlt = new Scanner(System.in) ;
		
		while(true)
		{
			
			System.out.println("----------Please enter your choice from the options below---------") ;
			System.out.println("1.Add \t 2.Edit \t 3.Delete \t 4.See the list of comsumables or individually \t 5.See overall info \t 6.Exit ") ;
			
			int inputMainMenu = scInt.nextInt();
			
			// user choose to add
			if(inputMainMenu == 1)
			{
				System.out.println("Please enter the type of art ----->  1.Book   2.Series   3.Movie ") ;
				int artMenu = scInt.nextInt();
				
				// user choose to add books
				if(artMenu == 1)
				{
					System.out.println("Please enter the name of the book: ") ;
					String name = scStr.nextLine();
					
					System.out.println("Please enter the consumption starting date of the book: ") ;
					String startDate = scStr.nextLine();
					
					System.out.println("Please enter the consumption ending date of the book: ") ;
					String endDate = scStr.nextLine();
					
					System.out.println("Please enter the total consumption time in hours: ") ;
					float totalTime = scFlt.nextFloat();
					
					System.out.println("Please enter your rating: ") ;
					float userRating = scFlt.nextFloat();
					
					System.out.println("Please enter the total days of consumption: ") ;
					int days = scFlt.nextInt();
					
					books book = new books(name, startDate, endDate, totalTime, userRating, days) ;
					bookList.add(book) ;
					books.setList(bookList) ;
					
					for(books b:bookList)
					{
						System.out.println(book.bookName) ;
					}					
					
				}
				
				// if user choose series to add series
				if(artMenu == 2)
				{
					System.out.println("Please enter the name of the series: ") ;
					String name = scStr.nextLine();
					
					System.out.println("Please enter the consumption starting date of the series: ") ;
					String startDate = scStr.nextLine();
									
					System.out.println("Please enter the consumption ending date of the series: ") ;
					String endDate = scStr.nextLine();
					
					System.out.println("Please enter the total consumption time in hours of the series: ") ;
					float totalTime = scFlt.nextFloat();
					
					System.out.println("Please enter your rating of the series: ") ;
					float userRating = scFlt.nextFloat();
					
					System.out.println("Please enter the total days of consumption of the series: ") ;
					int days = scFlt.nextInt();
					
					series s = new series(name, startDate, endDate, totalTime, userRating, days) ;
					seriesList.add(s) ;
					//series.setList(seriesList) ;
					
					for(series x:seriesList)
					{
						System.out.println(s.seriesName) ;
					}
										
				}
				
				// if user choose series to add movies
				if(artMenu == 3)
				{
					System.out.println("Please enter the name of the movies: ") ;
					String name = scStr.nextLine();
					
					System.out.println("Please enter the consumption starting date of the movies: ") ;
					String startDate = scStr.nextLine();
									
					System.out.println("Please enter the consumption ending date of the movies: ") ;
					String endDate = scStr.nextLine();
					
					System.out.println("Please enter the total consumption time in hours of the movies: ") ;
					float totalTime = scFlt.nextFloat();
					
					System.out.println("Please enter your rating of the movies: ") ;
					float userRating = scFlt.nextFloat();
					
					System.out.println("Please enter the total days of consumption of the movies: ") ;
					int days = scFlt.nextInt();
					
					movies movie = new movies(name, startDate, endDate, totalTime, userRating, days) ;
					moviesList.add(movie) ;
					movies.setList(moviesList) ;
					
					for(movies m:moviesList)
					{
						System.out.println(m.moviesName) ;
					}
										
				}
						
			}
			
			// if user choose to edit
			if(inputMainMenu == 2)
			{
				System.out.println("Please enter the type of art do you want to edit ----->  1.Book   2.Series   3.Movie ") ;
				int artMenuEdit = scInt.nextInt();
				
				// user choose to edit for books
				if(artMenuEdit == 1)
				{
					System.out.println("What do you want to edit ----->  1.Add consumption hours   2. Add day to days of consumption   3.Change rating    4. Add Ending Date") ;
					int editMenuOption = scInt.nextInt();
					float hours ;
					int days ;
					
					if(editMenuOption == 1)
					{

						System.out.println("How many hours do you want to add?") ;
						float addHours = scInt.nextFloat();
						for(books b:bookList)
						{
							hours = b.consumptionTime ;
						}
						hours =+ addHours ;
					}
					
					if(editMenuOption == 2)
					{
				
						System.out.println("How many days do you want to add?") ;
						int addDays = scInt.nextInt();
						for(books b:bookList)
						{
							days = b.totalDays ;
						}
						days =+ addDays ;
					}
					
					if(editMenuOption == 3)
					{
				
						System.out.println("Please enter your rating to edit for the book.") ;
						float userEditRating = scFlt.nextFloat() ;
						//books editRating = userEditRating;
						//bookList.set(4, editRating);
					}
					
					if(editMenuOption == 4)
					{
				
						System.out.println("Please enter ending date to edit for the book.") ;
						String endingDate = scStr.nextLine();
						//bookList.set(endingDate);
					}
					
				}
				
				// if user choose to edit series
				if(artMenuEdit == 2)
				{
					System.out.println("What do you want to edit for the series ----->  1.Add consumption hours  2. Add day to days of consumption   3.Change rating    4. Add Ending Date") ;
					int editMenuOption = scInt.nextInt();
					float hours ;
					int days ;
					
					if(editMenuOption == 1)
					{
						System.out.println("How many hours do you want to add for the series?") ;
						float addHours = scInt.nextFloat();
						for(series s:seriesList)
						{
							hours = s.consumptionTime ;
						}
						hours =+ addHours ;
					}
					
					if(editMenuOption == 2)
					{
				
						System.out.println("How many days do you want to add for the series?") ;
						int addDays = scInt.nextInt();
						for(series x:seriesList)
						{
							days = x.totalDays ;
						}
						days =+ addDays ;
					}
					
					if(editMenuOption == 3)
					{
				
						System.out.println("Please enter your rating to edit for the series.") ;
						float editRating = scFlt.nextFloat();
						//bookList.set(4, scFlt.nextFloat());
					}
					
					if(editMenuOption == 4)
					{
				
						System.out.println("Please enter ending date to edit for the series.") ;
						String endingDate = scStr.nextLine();
						//bookList.set(endingDate);
					}
					
				}
				
				// if user choose to edit movies
				if(artMenuEdit == 3)
				{
					System.out.println("What do you want to edit for the movies ----->  1.Add consumption hours  2. Add day to days of consumption   3.Change rating    4. Add Ending Date") ;
					int editMenuOption = scInt.nextInt();
					float hours ;
					int days ;
					
					if(editMenuOption == 1)
					{
						System.out.println("How many hours do you want to add for the movies?") ;
						float addHours = scInt.nextFloat();
						for(movies m:moviesList)
						{
							hours = m.consumptionTime ;
						}
						hours =+ addHours ;
					}
					
					if(editMenuOption == 2)
					{
				
						System.out.println("How many days do you want to add for the movies?") ;
						int addDays = scInt.nextInt();
						for(movies m:moviesList)
						{
							days = m.totalDays ;
						}
						days =+ addDays ;
					}
					
					if(editMenuOption == 3)
					{
				
						System.out.println("Please enter your rating to edit for the movies.") ;
						float editRating = scFlt.nextFloat();
						//bookList.set(4, scFlt.nextFloat());
					}
					
					if(editMenuOption == 4)
					{
				
						System.out.println("Please enter ending date to edit for the movies.") ;
						String endingDate = scStr.nextLine();
						//bookList.set(endingDate);
					}
					
				}
			}
			
			// Delete a consumable
			if(inputMainMenu == 3)
			{
				System.out.println("Please enter the type of art do you want to Delete ----->  1.Book   2.Series   3.Movie ") ;
				int artMenuDelete = scInt.nextInt();
				
				// if user choose to delete a book
				if(artMenuDelete == 1)
				{
					bookList.remove(0) ;
				}
				
				// if user choose to delete a series
				if(artMenuDelete == 2)
				{
					seriesList.remove(0) ;
				}
				
				// if user choose to delete a movies
				if(artMenuDelete == 3)
				{
					moviesList.remove(0) ;
				}
			}
			
			// See the list of consumables and individually
			if(inputMainMenu == 4)
			{
				System.out.println("Please enter the type of art do you want to  ----->  1.Book   2.Series   3.Movie ") ;
				int artMenuShow = scInt.nextInt();
				
				// if user want to see the list of books
				if(artMenuShow == 1)
				{
					for(books b:bookList)
					{
						System.out.println("----------The book items are -------\n") ;
						System.out.println("Book Name \t Start Date \t End Date \t Total Consumption(hours) \t Rating \t Consumption Days \n") ;
						System.out.println(b.bookName + "\t\t" + b.startingDate + "\t\t" + b.endDate + "\t\t" + b.consumptionTime + "\t\t\t" + b.rating +
								"\t\t\t" + b.totalDays);
					}
					
				}
				
				// if user want to see the list of series
				if(artMenuShow == 2)
				{
					for(series x:seriesList)
					{
						System.out.println("----------The series items are -------\n") ;
						System.out.println("Series Name \t Start Date \t End Date \t Total Consumption(hours) \t Rating \t Consumption Days \n") ;
						System.out.println(x.seriesName + "\t\t" + x.startingDate + "\t\t" + x.endDate + "\t\t" + x.consumptionTime + "\t\t\t" + x.rating +
								"\t\t\t" + x.totalDays);
					}
					
				}
				
				// if user want to see the list of movies
				if(artMenuShow == 3)
				{
					for(movies m:moviesList)
					{
						System.out.println("----------The movies items are -------\n") ;
						System.out.println("Movies Name \t Start Date \t End Date \t Total Consumption(hours) \t Rating \t Consumption Days \n") ;
						System.out.println(m.moviesName + "\t\t" + m.startingDate + "\t\t" + m.endDate + "\t\t" + m.consumptionTime + "\t\t\t" + m.rating +
								"\t\t\t" + m.totalDays);
					}
					
				}
			}
			
			// if user choose to see the overall info of the consumables
			if(inputMainMenu == 5)
			{
				System.out.println("What type of info do you want to see?  ----->  1.Consumption time   2.Days of consumption   3.Average rating   4.Number of consumable") ;
				int showInfo = scInt.nextInt();
				
				// if user want to see the info of consumption time
				if(showInfo == 1)
				{
					System.out.println("What type of info do you want to see?  ----->  1.Across all types   2.Individual types") ;
					int showInfoConsumptionHours = scInt.nextInt();
					float totalHoursAll = 0, hoursBook = 0, hoursSeries = 0, hoursMovies = 0;
					
					for(books b:bookList)
					{
						hoursBook =+ b.consumptionTime ;
					}
					
					for(series s:seriesList)
					{
						hoursSeries =+ s.consumptionTime ;
					}
					
					for(movies m:moviesList)
					{
						hoursMovies =+ m.consumptionTime ;
					}
					
					if(showInfoConsumptionHours == 1)
					{
						
						totalHoursAll = hoursBook + hoursSeries + hoursMovies ;
						System.out.println("The total consumption time in hours across all types is : " + totalHoursAll + "\n") ;
					}
					
					if(showInfoConsumptionHours == 2)
					{
						
						System.out.println("Individual consumption time in hours of books " + hoursBook + "\n") ;
						System.out.println("Individual consumption time in hours of series " + hoursSeries + "\n") ;
						System.out.println("Individual consumption time in hours of movies " + hoursMovies + "\n") ;
					}
										
					
				}
				
				// if user want to see the info of Days of consumption
				if(showInfo == 2)
				{
					System.out.println("What type of info do you want to see?  ----->  1.Across all types   2.Individual types") ;
					int showInfoConsumptionDays = scInt.nextInt();
					int totalDaysAll = 0, daysBook = 0, daysSeries = 0, daysMovies = 0 ;
					
					for(books b:bookList)
					{
						daysBook =+ b.totalDays ;
					}
					
					for(series s:seriesList)
					{
						daysSeries =+ s.totalDays ;
					}
					
					for(movies m:moviesList)
					{
						daysMovies =+ m.totalDays ;
					}
					
					if(showInfoConsumptionDays == 1)
					{
						
						totalDaysAll = daysBook + daysSeries + daysMovies ;
						System.out.println("The total days of consumption across all types is : " + totalDaysAll + "\n") ;
					}
					
					if(showInfoConsumptionDays == 2)
					{
						System.out.println("Individual days of consumption of books " + daysBook + "\n") ;
						System.out.println("Individual days of consumption of series " + daysSeries + "\n") ;
						System.out.println("Individual days of consumption of movies " + daysMovies + "\n") ;
					}
										
					
				}
				
				// if user want to see the average rating
				if(showInfo == 3)
				{
					System.out.println("What type of info do you want to see?  ----->  1.Across all types   2.Individual types") ;
					float showAverageRating = scFlt.nextFloat();
					float totalRating = 0, ratingBook = 0, ratingSeries = 0, ratingMovies = 0 ;
					
					for(books b:bookList)
					{
						ratingBook =+ b.rating ;
					}
					
					for(series s:seriesList)
					{
						ratingSeries =+ s.rating ;
					}
					
					for(movies m:moviesList)
					{
						ratingMovies =+ m.rating ;
					}
					
					if(showAverageRating == 1)
					{
						
						totalRating = ratingBook + ratingSeries + ratingMovies ;
						System.out.println("Average rating of consumable across all types : " + totalRating + "\n") ;
					}
					
					if(showAverageRating == 2)
					{
						System.out.println("Average individual rating of books " + ratingBook + "\n") ;
						System.out.println("Average individual rating of series " + ratingSeries + "\n") ;
						System.out.println("Average individual rating of movies " + ratingMovies + "\n") ;
					}
										
					
				}
				
				// if user want to see the number of consumables  
				if(showInfo == 4)
				{
					System.out.println("What type of info do you want to see?  ----->  1.Across all types   2.Individual types") ;
					int showNumberOfElement = scInt.nextInt();
					float totalElements = 0, elementBook = 0, elementSeries = 0, elementMovies = 0 ;
					
					if(showNumberOfElement == 1)
					{
						elementBook = bookList.size() ;
						elementSeries = seriesList.size() ;
						elementMovies = moviesList.size() ;
						
						totalElements = elementBook + elementSeries + elementMovies ;
						System.out.println("The total days of consumption across all types is : " + totalElements + "\n") ;
					}
					
					if(showNumberOfElement == 2)
					{
						System.out.println("Number of books " + elementBook + "\n") ;
						System.out.println("Number of series " + elementSeries + "\n") ;
						System.out.println("Number of movies " + elementMovies + "\n") ;
					}
										
					
				}
			}
			
			
			if(inputMainMenu == 6)
			{
				System.exit(0) ;
			}
				
		}
		

	}

}
