package tw.leonchen.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("wDao")
public class WorkerDao {

	//@Autowired @Qualifier("worker1") //指定為第一組
	private Worker worker;
	
	public WorkerDao() {
	}
	
	@Autowired //Qualifier 要寫在值的前方
	public WorkerDao(  @Qualifier("worker1") Worker worker) {
		this.worker = worker;
	}
	
	public void printDatials() {
		System.out.println(worker.getId()+" "+worker.getName()+" "+worker.getTitle());
	}
}
