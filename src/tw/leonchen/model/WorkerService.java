package tw.leonchen.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("wService")
public class WorkerService {

	@Autowired
	private WorkerDao wDao;
	
	public void printDetails() {
		wDao.printDatials();
	}
}
