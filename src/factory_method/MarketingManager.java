package factory_method;

public class MarketingManager extends HiringManager {

	@Override
	public Interviewer makeInterview() {
		// TODO Auto-generated method stub
		return new CommunityExecutive();
	}

}
