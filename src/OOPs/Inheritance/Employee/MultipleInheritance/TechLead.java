package OOPs.Inheritance.Employee.MultipleInheritance;

import OOPs.Inheritance.Employee.MultipleInheritance.interfaces.ProjectManager;
import OOPs.Inheritance.Employee.MultipleInheritance.interfaces.TeamLead;
import OOPs.Inheritance.Employee.employee.Employee;

// MultipleInheritance using Interfaces!!
public class TechLead extends Employee implements ProjectManager, TeamLead {

    private String projectManaged;

    private int teamSize;

    public TechLead(String empName, int empId, String project, int teamSize){
        super(empName, empId);

        this.projectManaged = project;
        this.teamSize = teamSize;


    }

    public void displayInfo(){
        display();
        manageProject();
        leadTeam();
    }


    @Override
    public void manageProject() {
        System.out.println("Project Manager managing project: " + projectManaged);
    }

    @Override
    public void leadTeam() {
        System.out.println("Team Lead leading a team of " + teamSize + " members.");
    }
}
