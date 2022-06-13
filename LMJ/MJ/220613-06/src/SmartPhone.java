
public class SmartPhone extends Phone {
	private String osType;
	private String osVersion;
	private int memorySize;
	private String cameraEquip;
	private String bluetooth;
	
	
	
	public SmartPhone(String producter, String version, String type, String osType, String osVersion, int memorySize,
			String cameraEquip, String bluetooth) {
		super(producter, version, type);
		this.osType = osType;
		this.osVersion = osVersion;
		this.memorySize = memorySize;
		this.cameraEquip = cameraEquip;
		this.bluetooth = bluetooth;
	}
	
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public int getMemorySize() {
		return memorySize;
	}
	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}
	public String getCameraEquip() {
		return cameraEquip;
	}
	public void setCameraEquip(String cameraEquip) {
		this.cameraEquip = cameraEquip;
	}
	public String getBluetooth() {
		return bluetooth;
	}
	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n운영체제 타입:" + osType + "\n운영체제 버전:" + osVersion + "\n내부 메모리 크기:" + memorySize + "\n카메라 장착 여부:" + cameraEquip + "\n블루투스 지원 여부:" + bluetooth;
	}
	
}
