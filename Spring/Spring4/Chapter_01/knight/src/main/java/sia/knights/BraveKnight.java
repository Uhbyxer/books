package sia.knights;
  
public class BraveKnight implements Knight {
	static{
		System.out.println("hohohoh");
	}

  private Quest quest;

  public BraveKnight(Quest quest) {
    this.quest = quest;
  }

  public void embarkOnQuest() {
    quest.embark();
  }

}
