import java.util.Set;

public interface ProjectDao {
	void addProject(Project p);

	void modifyProject(Project p);

	void deleteProject(int pno);

	Project findProject(int pno);

	Set<Project> findAllProject();
}
