package repository;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRepository<TIPO> {
	
private List<TIPO>data;


public AbstractRepository(){
	data=new ArrayList<>();
}
public final void add(TIPO newData){
	data.add(newData);
}
 final List<TIPO> getData(){
	 return data;
 }


}
