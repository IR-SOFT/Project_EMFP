package view;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;

public class SetupSideBar {
    private String taskFlowId = "/WEB-INF/Task_Flows/Modules/Setup/Setup_TaskFlow.xml#Setup_TaskFlow";

    public SetupSideBar() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public void Program_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Setup/Program_TaskFlow.xml#Program_TaskFlow");
    }

    public void Project_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Setup/Project_TaskFlow.xml#Project_TaskFlow");
    }

    public void Phase_Click(ActionEvent actionEvent) {
        // Add event code here...
        setDynamicTaskFlowId("/WEB-INF/Task_Flows/Modules/Setup/Phase_TaskFlow.xml#Phase_TaskFlow");
    }
}
