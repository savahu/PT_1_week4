package com.qc.qcrobot.lib.pipefilter.BloodPressureFilter;

/**
 *
 * @author sander
 */
   public enum BloodPressureEnum {
	 Healthy("H"), Prehypertension("P"), HypertensionStage1("S1"), HypertensionStage2("S2"), HypertensiveCrisis("S3");

	private String bloodPressureCode;

	private BloodPressureEnum(String b) {
		bloodPressureCode = b;
	}

	public String getStatusCode() {
		return bloodPressureCode;
	}

}
