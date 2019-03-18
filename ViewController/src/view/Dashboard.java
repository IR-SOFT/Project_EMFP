package view;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;

public class Dashboard implements Serializable {
    private String taskFlowId = "/WEB-INF/Task_Flows/Dashboard_TaskFlow.xml#Dashboard_TaskFlow";

    public Dashboard() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public void Management_Click(ActionEvent actionEvent) {
        // Add event code here...
    }

    public void Infrastructure_Click(ActionEvent actionEvent) {
        // Add event code here...
    }

//    public void Setup_Click(ActionEvent actionEvent) {
//        // Add event code here...
//        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Setup/Setup_TaskFlow.xml#Setup_TaskFlow");
//    }

    public void Monitoring_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Monitoring/Monitoring_TaskFlow.xml#Monitoring_TaskFlow");
    }

    public void Training_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Training/Training_TaskFlow.xml#Training_TaskFlow");
    }

    public void Cluster_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Clusters_Farmers/Cluster_Farmer_TaskFlow.xml#Cluster_Farmer_TaskFlow");
    }

    public void Grant_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Grants/Grants_TaskFlow.xml#Grants_TaskFlow");
    }

    public void Certification_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Certification/Certification_TaskFlow.xml#Certification_TaskFlow");
    }

    public void Marketing_Click(ActionEvent actionEvent) {
        // Add event code here...
    }

    public void Report_Click(ActionEvent actionEvent) {
        // Add event code here...
    }

    public void Financial_Click(ActionEvent actionEvent) {
        // Add event code here...
    }

    public String testttt() {
        // Add event code here...
        System.out.println("here is function called");
        return "/faces/Main_Pages/Modules/Setup/Setup.jsf?faces-redirect=true";
    }
}
