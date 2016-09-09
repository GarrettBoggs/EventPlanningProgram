import java.util.Random;

class Event {
  private boolean mChips;
  private int mPeople;
  private boolean mDrinks;
  private String mBand;

  Random randomGenerator = new Random();

  public Event(boolean chips, boolean drinks, int people, String band) {
    mChips = chips;
    mDrinks = drinks;
    mPeople = people;
    mBand = band;
  }

  public int getCost() {
    int total = 0;
    if(mChips)
      total += 5;
    if(mDrinks)
      total += 10;
    if(mBand.equals("pros"))
      total += 40;
    else if(mBand.equals("kids"))
      total += 10;

    total += mPeople;
    return total;
  }

  public void randomizeParty() {
    mPeople = randomGenerator.nextInt(100);
    mChips = randomGenerator.nextBoolean();
    mDrinks = randomGenerator.nextBoolean();
    int bandPick = randomGenerator.nextInt(3);
    if(bandPick == 0)
      mBand = "pros";
    else if(bandPick == 1)
      mBand = "kids";
    else
      mBand = "me";
  }

  public String getBand() {
    return mBand;
  }

  public int getPeople() {
    return mPeople;
  }

  public boolean getChips() {
    return mChips;
  }

  public boolean getDrinks() {
    return mDrinks;
  }
}
