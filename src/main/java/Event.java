class Event {
  private boolean mChips;
  private int mPeople;
  private boolean mDrinks;
  private String mBand;

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

  public String getBand() {
    return mBand;
  }

  public int getPeople() {
    return mPeople;
  }
}
