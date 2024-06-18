package shared.events;

public class PatientRecordEvent {

	private String id;

	private String patientId;

	private String healthRecords;

	private String treatmentHistories;

	private String doctor;

	public PatientRecordEvent() {

	}

	public PatientRecordEvent(String id, String patientId, String healthRecords, String treatmentHistories,
			String doctor) {
		super();
		this.id = id;
		this.patientId = patientId;
		this.healthRecords = healthRecords;
		this.treatmentHistories = treatmentHistories;
		this.doctor = doctor;
	}


	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getHealthRecords() {
		return healthRecords;
	}

	public void setHealthRecords(String healthRecords) {
		this.healthRecords = healthRecords;
	}

	public String getTreatmentHistories() {
		return treatmentHistories;
	}

	public void setTreatmentHistories(String treatmentHistories) {
		this.treatmentHistories = treatmentHistories;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "PatientRecordEvent [id=" + id + ", patientId=" + patientId + ", healthRecords=" + healthRecords
				+ ", treatmentHistories=" + treatmentHistories + ", doctor=" + doctor + "]";
	}

}
