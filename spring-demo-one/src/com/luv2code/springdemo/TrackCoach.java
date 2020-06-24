package com.luv2code.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;
    
    
  public TrackCoach() {
		super();
		// TODO Auto-generated constructor stub
	}
	//define a constructor for dependency injection
  	public TrackCoach(FortuneService theFortuneService) {
  		fortuneService = theFortuneService;
  	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupstuff");
	}
	

}
