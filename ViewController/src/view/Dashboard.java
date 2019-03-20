package view;

import java.io.Serializable;

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
}
