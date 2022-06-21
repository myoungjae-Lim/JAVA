
public class ADAgency {
	private LeafletHandler ad;

	public ADAgency(LeafletHandler ad) {
		this.ad = ad;
	}

	public LeafletHandler getAd() {
		return ad;
	}

	public void setAd(LeafletHandler ad) {
		this.ad = ad;
	}
	
	public void consoleAD() {
		System.out.println(ad.give());
	}
}
