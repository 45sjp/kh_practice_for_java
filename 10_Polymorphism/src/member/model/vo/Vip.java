package member.model.vo;

public class Vip extends Member {
	
	private static final double RATE = 0.10;
	
	public Vip() {
		super();
	}
	
	public Vip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getBonusPoint() {
		return getPoint() * RATE;
	}

	@Override
	public int buy(int price) {
		return (int) (price - (price * RATE));
	}
}
