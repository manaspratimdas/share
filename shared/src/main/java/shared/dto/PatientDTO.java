package shared.dto;

public class PatientDTO {
	
	String id;
	String publishDate;
	String patientRecord;
	
	
	public PatientDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	


	public PatientDTO(String id, String publishDate, String patientRecord) {
		super();
		this.id = id;
		this.publishDate = publishDate;
		this.patientRecord = patientRecord;
	}





	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPublishDate() {
		return publishDate;
	}


	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}


	public String getPatientRecord() {
		return patientRecord;
	}


	public void setPatientRecord(String patientRecord) {
		this.patientRecord = patientRecord;
	}





	@Override
	public String toString() {
		return "PatientDTO [id=" + id + ", publishDate=" + publishDate + ", patientRecord=" + patientRecord + "]";
	}
	
	
	

}
