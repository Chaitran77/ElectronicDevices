package com.kiranthepro;

public class Device {
    protected String IdentificationCode;
    protected String MakeAndModel;
    protected String Owner;
    protected String ProblemDescription;
    protected String RepairNotes;
    protected int Priority;
    protected boolean isChargable;

    public Device(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priority, boolean IsChargable) {
        IdentificationCode = identificationCode;
        MakeAndModel = makeAndModel;
        Owner = owner;
        ProblemDescription = problemDescription;
        RepairNotes = repairNotes;
        Priority = priority;
        isChargable = IsChargable;
    }

    @Override
    public String toString() {
        return "IdentificationCode" + IdentificationCode +
                "MakeAndModel" + MakeAndModel +
                "Owner" + Owner +
                "ProblemDescription" + ProblemDescription +
                "RepairNotes" + RepairNotes +
                "Priority" + Priority;
    }

    public String getIdentificationCode() {
        return IdentificationCode;
    }

    public void setIdentificationCode(String identificationCode) {
        IdentificationCode = identificationCode;
    }

    public String getMakeAndModel() {
        return MakeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        MakeAndModel = makeAndModel;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public String getProblemDescription() {
        return ProblemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        ProblemDescription = problemDescription;
    }

    public String getRepairNotes() {
        return RepairNotes;
    }

    public void setRepairNotes(String repairNotes) {
        RepairNotes = repairNotes;
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int priority) {
        Priority = priority;
    }

    public boolean isChargable() {
        return isChargable;
    }

    public void setChargable(boolean chargable) {
        isChargable = chargable;
    }
}
