enum status{
selected,unselected,authorized,unauthorized;
}
  public class good{
public static void main (String args[]){
  status[] ss = status.values();
  for(status s : ss){
    System.out.println(s.ordinal());
  }
}
  }
