package com.hitachi.hibernate.entities;

import com.hitachi.objects.ParseElement;

// Generated Dec 1, 2011 1:17:19 AM by Hibernate Tools 3.4.0.CR1

/**
 * Storagearray generated by hbm2java
 */
public class Storagearray implements java.io.Serializable {

	private String objectId;
	private String agentVersion;
	private int allocatedCapacityInGb;
	private int allocatedCapacityinKb;
	private String arrayFamily;
	private String arrayType;
	private int autoFormatLu;
	private int cacheInMb;
	private int capacityInGb;
	private int configUpdateStatus;
	private String controllerVersion;
	private String displayArrayFamily;
	private String displayArrayType;
	private int distributedMode;
	private int freeCapacityInGb;
	private int freeCapacityInKb;
	private int hihsmCapacityInGb;
	private int hihsmCapacityInKb;
	private int imAllocatedCapacity;
	private int imFreeCapacity;
	private int imHiHismCapacity;
	private int imOnDemandCapacity;
	private int imTotalCapacity;
	private int largestFreeSpaceInGb;
	private int largestFreeSpaceInKb;
	private int lastRefreshed;
	private int mfAllocatedCapacity;
	private int mfHiHsmCapacity;
	private int mfOnDemandCapacity;
	private int mfTotalCapacity;
	private int mfUnallocatedCapacity;
	private String microcodeVersion;
	private int multipathSupport;
	private String name;
	private int numberOfAllocatedMfLdevs;
	private int numberOfControllers;
	private int numberOfImAllocatedLus;
	private int numberOfImReservedLus;
	private int numberofImUnalloctedLus;
	private int numberOfLus;
	private int numberOfMfLdevs;
	private int numberOfOpenAllocatedLus;
	private int numberOfOpenReservedLus;
	private int numberOfOpenUnallocatedLus;
	private int numberOfReservedLus;
	private int numberOfSpareDrives;
	private int numberOfUnallocatedLus;
	private int numberOfUnallocatedMfLdevs;
	private int onDemandCapacityInGb;
	private int onDemandCapacityInKb;
	private int openAllocatedActualCapacity;
	private int openAllocatedCapacity;
	private int openFreeCapacity;
	private int openHiHsmCapacity;
	private int openOnDemandCapacity;
	private int openReservedActualCapacity;
	private int openReservedCapacity;
	private int openTotalCapacity;
	private int openUnallocatedActualCapacity;
	private int openUnallocatedCapacity;
	private int productCode;
	private String productName;
	private int securityStatus;
	private int sequenceNumber;
	private int serialNumber;
	private int sharedMemoryInMb;
	private int slprStatus;
	private int statusOfDbinconsistency;
	private int totalFreeSpaceInGb;
	private int totalFreeSpaceInKb;

	public Storagearray() {
	}

	public Storagearray(String objectId, String agentVersion,
			int allocatedCapacityInGb, int allocatedCapacityinKb,
			String arrayFamily, String arrayType, int autoFormatLu,
			int cacheInMb, int capacityInGb, int configUpdateStatus,
			String controllerVersion, String displayArrayFamily,
			String displayArrayType, int distributedMode, int freeCapacityInGb,
			int freeCapacityInKb, int hihsmCapacityInGb, int hihsmCapacityInKb,
			int imAllocatedCapacity, int imFreeCapacity, int imHiHismCapacity,
			int imOnDemandCapacity, int imTotalCapacity,
			int largestFreeSpaceInGb, int largestFreeSpaceInKb,
			int lastRefreshed, int mfAllocatedCapacity, int mfHiHsmCapacity,
			int mfOnDemandCapacity, int mfTotalCapacity,
			int mfUnallocatedCapacity, String microcodeVersion,
			int multipathSupport, String name, int numberOfAllocatedMfLdevs,
			int numberOfControllers, int numberOfImAllocatedLus,
			int numberOfImReservedLus, int numberofImUnalloctedLus,
			int numberOfLus, int numberOfMfLdevs, int numberOfOpenAllocatedLus,
			int numberOfOpenReservedLus, int numberOfOpenUnallocatedLus,
			int numberOfReservedLus, int numberOfSpareDrives,
			int numberOfUnallocatedLus, int numberOfUnallocatedMfLdevs,
			int onDemandCapacityInGb, int onDemandCapacityInKb,
			int openAllocatedActualCapacity, int openAllocatedCapacity,
			int openFreeCapacity, int openHiHsmCapacity,
			int openOnDemandCapacity, int openReservedActualCapacity,
			int openReservedCapacity, int openTotalCapacity,
			int openUnallocatedActualCapacity, int openUnallocatedCapacity,
			int productCode, String productName, int securityStatus,
			int sequenceNumber, int serialNumber, int sharedMemoryInMb,
			int slprStatus, int statusOfDbinconsistency,
			int totalFreeSpaceInGb, int totalFreeSpaceInKb) {
		this.objectId = objectId;
		this.agentVersion = agentVersion;
		this.allocatedCapacityInGb = allocatedCapacityInGb;
		this.allocatedCapacityinKb = allocatedCapacityinKb;
		this.arrayFamily = arrayFamily;
		this.arrayType = arrayType;
		this.autoFormatLu = autoFormatLu;
		this.cacheInMb = cacheInMb;
		this.capacityInGb = capacityInGb;
		this.configUpdateStatus = configUpdateStatus;
		this.controllerVersion = controllerVersion;
		this.displayArrayFamily = displayArrayFamily;
		this.displayArrayType = displayArrayType;
		this.distributedMode = distributedMode;
		this.freeCapacityInGb = freeCapacityInGb;
		this.freeCapacityInKb = freeCapacityInKb;
		this.hihsmCapacityInGb = hihsmCapacityInGb;
		this.hihsmCapacityInKb = hihsmCapacityInKb;
		this.imAllocatedCapacity = imAllocatedCapacity;
		this.imFreeCapacity = imFreeCapacity;
		this.imHiHismCapacity = imHiHismCapacity;
		this.imOnDemandCapacity = imOnDemandCapacity;
		this.imTotalCapacity = imTotalCapacity;
		this.largestFreeSpaceInGb = largestFreeSpaceInGb;
		this.largestFreeSpaceInKb = largestFreeSpaceInKb;
		this.lastRefreshed = lastRefreshed;
		this.mfAllocatedCapacity = mfAllocatedCapacity;
		this.mfHiHsmCapacity = mfHiHsmCapacity;
		this.mfOnDemandCapacity = mfOnDemandCapacity;
		this.mfTotalCapacity = mfTotalCapacity;
		this.mfUnallocatedCapacity = mfUnallocatedCapacity;
		this.microcodeVersion = microcodeVersion;
		this.multipathSupport = multipathSupport;
		this.name = name;
		this.numberOfAllocatedMfLdevs = numberOfAllocatedMfLdevs;
		this.numberOfControllers = numberOfControllers;
		this.numberOfImAllocatedLus = numberOfImAllocatedLus;
		this.numberOfImReservedLus = numberOfImReservedLus;
		this.numberofImUnalloctedLus = numberofImUnalloctedLus;
		this.numberOfLus = numberOfLus;
		this.numberOfMfLdevs = numberOfMfLdevs;
		this.numberOfOpenAllocatedLus = numberOfOpenAllocatedLus;
		this.numberOfOpenReservedLus = numberOfOpenReservedLus;
		this.numberOfOpenUnallocatedLus = numberOfOpenUnallocatedLus;
		this.numberOfReservedLus = numberOfReservedLus;
		this.numberOfSpareDrives = numberOfSpareDrives;
		this.numberOfUnallocatedLus = numberOfUnallocatedLus;
		this.numberOfUnallocatedMfLdevs = numberOfUnallocatedMfLdevs;
		this.onDemandCapacityInGb = onDemandCapacityInGb;
		this.onDemandCapacityInKb = onDemandCapacityInKb;
		this.openAllocatedActualCapacity = openAllocatedActualCapacity;
		this.openAllocatedCapacity = openAllocatedCapacity;
		this.openFreeCapacity = openFreeCapacity;
		this.openHiHsmCapacity = openHiHsmCapacity;
		this.openOnDemandCapacity = openOnDemandCapacity;
		this.openReservedActualCapacity = openReservedActualCapacity;
		this.openReservedCapacity = openReservedCapacity;
		this.openTotalCapacity = openTotalCapacity;
		this.openUnallocatedActualCapacity = openUnallocatedActualCapacity;
		this.openUnallocatedCapacity = openUnallocatedCapacity;
		this.productCode = productCode;
		this.productName = productName;
		this.securityStatus = securityStatus;
		this.sequenceNumber = sequenceNumber;
		this.serialNumber = serialNumber;
		this.sharedMemoryInMb = sharedMemoryInMb;
		this.slprStatus = slprStatus;
		this.statusOfDbinconsistency = statusOfDbinconsistency;
		this.totalFreeSpaceInGb = totalFreeSpaceInGb;
		this.totalFreeSpaceInKb = totalFreeSpaceInKb;
	}

	public String getObjectId() {
		return this.objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getAgentVersion() {
		return this.agentVersion;
	}

	public void setAgentVersion(String agentVersion) {
		this.agentVersion = agentVersion;
	}

	public int getAllocatedCapacityInGb() {
		return this.allocatedCapacityInGb;
	}

	public void setAllocatedCapacityInGb(int allocatedCapacityInGb) {
		this.allocatedCapacityInGb = allocatedCapacityInGb;
	}

	public int getAllocatedCapacityinKb() {
		return this.allocatedCapacityinKb;
	}

	public void setAllocatedCapacityinKb(int allocatedCapacityinKb) {
		this.allocatedCapacityinKb = allocatedCapacityinKb;
	}

	public String getArrayFamily() {
		return this.arrayFamily;
	}

	public void setArrayFamily(String arrayFamily) {
		this.arrayFamily = arrayFamily;
	}

	public String getArrayType() {
		return this.arrayType;
	}

	public void setArrayType(String arrayType) {
		this.arrayType = arrayType;
	}

	public int getAutoFormatLu() {
		return this.autoFormatLu;
	}

	public void setAutoFormatLu(int autoFormatLu) {
		this.autoFormatLu = autoFormatLu;
	}

	public int getCacheInMb() {
		return this.cacheInMb;
	}

	public void setCacheInMb(int cacheInMb) {
		this.cacheInMb = cacheInMb;
	}

	public int getCapacityInGb() {
		return this.capacityInGb;
	}

	public void setCapacityInGb(int capacityInGb) {
		this.capacityInGb = capacityInGb;
	}

	public int getConfigUpdateStatus() {
		return this.configUpdateStatus;
	}

	public void setConfigUpdateStatus(int configUpdateStatus) {
		this.configUpdateStatus = configUpdateStatus;
	}

	public String getControllerVersion() {
		return this.controllerVersion;
	}

	public void setControllerVersion(String controllerVersion) {
		this.controllerVersion = controllerVersion;
	}

	public String getDisplayArrayFamily() {
		return this.displayArrayFamily;
	}

	public void setDisplayArrayFamily(String displayArrayFamily) {
		this.displayArrayFamily = displayArrayFamily;
	}

	public String getDisplayArrayType() {
		return this.displayArrayType;
	}

	public void setDisplayArrayType(String displayArrayType) {
		this.displayArrayType = displayArrayType;
	}

	public int getDistributedMode() {
		return this.distributedMode;
	}

	public void setDistributedMode(int distributedMode) {
		this.distributedMode = distributedMode;
	}

	public int getFreeCapacityInGb() {
		return this.freeCapacityInGb;
	}

	public void setFreeCapacityInGb(int freeCapacityInGb) {
		this.freeCapacityInGb = freeCapacityInGb;
	}

	public int getFreeCapacityInKb() {
		return this.freeCapacityInKb;
	}

	public void setFreeCapacityInKb(int freeCapacityInKb) {
		this.freeCapacityInKb = freeCapacityInKb;
	}

	public int getHihsmCapacityInGb() {
		return this.hihsmCapacityInGb;
	}

	public void setHihsmCapacityInGb(int hihsmCapacityInGb) {
		this.hihsmCapacityInGb = hihsmCapacityInGb;
	}

	public int getHihsmCapacityInKb() {
		return this.hihsmCapacityInKb;
	}

	public void setHihsmCapacityInKb(int hihsmCapacityInKb) {
		this.hihsmCapacityInKb = hihsmCapacityInKb;
	}

	public int getImAllocatedCapacity() {
		return this.imAllocatedCapacity;
	}

	public void setImAllocatedCapacity(int imAllocatedCapacity) {
		this.imAllocatedCapacity = imAllocatedCapacity;
	}

	public int getImFreeCapacity() {
		return this.imFreeCapacity;
	}

	public void setImFreeCapacity(int imFreeCapacity) {
		this.imFreeCapacity = imFreeCapacity;
	}

	public int getImHiHismCapacity() {
		return this.imHiHismCapacity;
	}

	public void setImHiHismCapacity(int imHiHismCapacity) {
		this.imHiHismCapacity = imHiHismCapacity;
	}

	public int getImOnDemandCapacity() {
		return this.imOnDemandCapacity;
	}

	public void setImOnDemandCapacity(int imOnDemandCapacity) {
		this.imOnDemandCapacity = imOnDemandCapacity;
	}

	public int getImTotalCapacity() {
		return this.imTotalCapacity;
	}

	public void setImTotalCapacity(int imTotalCapacity) {
		this.imTotalCapacity = imTotalCapacity;
	}

	public int getLargestFreeSpaceInGb() {
		return this.largestFreeSpaceInGb;
	}

	public void setLargestFreeSpaceInGb(int largestFreeSpaceInGb) {
		this.largestFreeSpaceInGb = largestFreeSpaceInGb;
	}

	public int getLargestFreeSpaceInKb() {
		return this.largestFreeSpaceInKb;
	}

	public void setLargestFreeSpaceInKb(int largestFreeSpaceInKb) {
		this.largestFreeSpaceInKb = largestFreeSpaceInKb;
	}

	public int getLastRefreshed() {
		return this.lastRefreshed;
	}

	public void setLastRefreshed(int lastRefreshed) {
		this.lastRefreshed = lastRefreshed;
	}

	public int getMfAllocatedCapacity() {
		return this.mfAllocatedCapacity;
	}

	public void setMfAllocatedCapacity(int mfAllocatedCapacity) {
		this.mfAllocatedCapacity = mfAllocatedCapacity;
	}

	public int getMfHiHsmCapacity() {
		return this.mfHiHsmCapacity;
	}

	public void setMfHiHsmCapacity(int mfHiHsmCapacity) {
		this.mfHiHsmCapacity = mfHiHsmCapacity;
	}

	public int getMfOnDemandCapacity() {
		return this.mfOnDemandCapacity;
	}

	public void setMfOnDemandCapacity(int mfOnDemandCapacity) {
		this.mfOnDemandCapacity = mfOnDemandCapacity;
	}

	public int getMfTotalCapacity() {
		return this.mfTotalCapacity;
	}

	public void setMfTotalCapacity(int mfTotalCapacity) {
		this.mfTotalCapacity = mfTotalCapacity;
	}

	public int getMfUnallocatedCapacity() {
		return this.mfUnallocatedCapacity;
	}

	public void setMfUnallocatedCapacity(int mfUnallocatedCapacity) {
		this.mfUnallocatedCapacity = mfUnallocatedCapacity;
	}

	public String getMicrocodeVersion() {
		return this.microcodeVersion;
	}

	public void setMicrocodeVersion(String microcodeVersion) {
		this.microcodeVersion = microcodeVersion;
	}

	public int getMultipathSupport() {
		return this.multipathSupport;
	}

	public void setMultipathSupport(int multipathSupport) {
		this.multipathSupport = multipathSupport;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfAllocatedMfLdevs() {
		return this.numberOfAllocatedMfLdevs;
	}

	public void setNumberOfAllocatedMfLdevs(int numberOfAllocatedMfLdevs) {
		this.numberOfAllocatedMfLdevs = numberOfAllocatedMfLdevs;
	}

	public int getNumberOfControllers() {
		return this.numberOfControllers;
	}

	public void setNumberOfControllers(int numberOfControllers) {
		this.numberOfControllers = numberOfControllers;
	}

	public int getNumberOfImAllocatedLus() {
		return this.numberOfImAllocatedLus;
	}

	public void setNumberOfImAllocatedLus(int numberOfImAllocatedLus) {
		this.numberOfImAllocatedLus = numberOfImAllocatedLus;
	}

	public int getNumberOfImReservedLus() {
		return this.numberOfImReservedLus;
	}

	public void setNumberOfImReservedLus(int numberOfImReservedLus) {
		this.numberOfImReservedLus = numberOfImReservedLus;
	}

	public int getNumberofImUnalloctedLus() {
		return this.numberofImUnalloctedLus;
	}

	public void setNumberofImUnalloctedLus(int numberofImUnalloctedLus) {
		this.numberofImUnalloctedLus = numberofImUnalloctedLus;
	}

	public int getNumberOfLus() {
		return this.numberOfLus;
	}

	public void setNumberOfLus(int numberOfLus) {
		this.numberOfLus = numberOfLus;
	}

	public int getNumberOfMfLdevs() {
		return this.numberOfMfLdevs;
	}

	public void setNumberOfMfLdevs(int numberOfMfLdevs) {
		this.numberOfMfLdevs = numberOfMfLdevs;
	}

	public int getNumberOfOpenAllocatedLus() {
		return this.numberOfOpenAllocatedLus;
	}

	public void setNumberOfOpenAllocatedLus(int numberOfOpenAllocatedLus) {
		this.numberOfOpenAllocatedLus = numberOfOpenAllocatedLus;
	}

	public int getNumberOfOpenReservedLus() {
		return this.numberOfOpenReservedLus;
	}

	public void setNumberOfOpenReservedLus(int numberOfOpenReservedLus) {
		this.numberOfOpenReservedLus = numberOfOpenReservedLus;
	}

	public int getNumberOfOpenUnallocatedLus() {
		return this.numberOfOpenUnallocatedLus;
	}

	public void setNumberOfOpenUnallocatedLus(int numberOfOpenUnallocatedLus) {
		this.numberOfOpenUnallocatedLus = numberOfOpenUnallocatedLus;
	}

	public int getNumberOfReservedLus() {
		return this.numberOfReservedLus;
	}

	public void setNumberOfReservedLus(int numberOfReservedLus) {
		this.numberOfReservedLus = numberOfReservedLus;
	}

	public int getNumberOfSpareDrives() {
		return this.numberOfSpareDrives;
	}

	public void setNumberOfSpareDrives(int numberOfSpareDrives) {
		this.numberOfSpareDrives = numberOfSpareDrives;
	}

	public int getNumberOfUnallocatedLus() {
		return this.numberOfUnallocatedLus;
	}

	public void setNumberOfUnallocatedLus(int numberOfUnallocatedLus) {
		this.numberOfUnallocatedLus = numberOfUnallocatedLus;
	}

	public int getNumberOfUnallocatedMfLdevs() {
		return this.numberOfUnallocatedMfLdevs;
	}

	public void setNumberOfUnallocatedMfLdevs(int numberOfUnallocatedMfLdevs) {
		this.numberOfUnallocatedMfLdevs = numberOfUnallocatedMfLdevs;
	}

	public int getOnDemandCapacityInGb() {
		return this.onDemandCapacityInGb;
	}

	public void setOnDemandCapacityInGb(int onDemandCapacityInGb) {
		this.onDemandCapacityInGb = onDemandCapacityInGb;
	}

	public int getOnDemandCapacityInKb() {
		return this.onDemandCapacityInKb;
	}

	public void setOnDemandCapacityInKb(int onDemandCapacityInKb) {
		this.onDemandCapacityInKb = onDemandCapacityInKb;
	}

	public int getOpenAllocatedActualCapacity() {
		return this.openAllocatedActualCapacity;
	}

	public void setOpenAllocatedActualCapacity(int openAllocatedActualCapacity) {
		this.openAllocatedActualCapacity = openAllocatedActualCapacity;
	}

	public int getOpenAllocatedCapacity() {
		return this.openAllocatedCapacity;
	}

	public void setOpenAllocatedCapacity(int openAllocatedCapacity) {
		this.openAllocatedCapacity = openAllocatedCapacity;
	}

	public int getOpenFreeCapacity() {
		return this.openFreeCapacity;
	}

	public void setOpenFreeCapacity(int openFreeCapacity) {
		this.openFreeCapacity = openFreeCapacity;
	}

	public int getOpenHiHsmCapacity() {
		return this.openHiHsmCapacity;
	}

	public void setOpenHiHsmCapacity(int openHiHsmCapacity) {
		this.openHiHsmCapacity = openHiHsmCapacity;
	}

	public int getOpenOnDemandCapacity() {
		return this.openOnDemandCapacity;
	}

	public void setOpenOnDemandCapacity(int openOnDemandCapacity) {
		this.openOnDemandCapacity = openOnDemandCapacity;
	}

	public int getOpenReservedActualCapacity() {
		return this.openReservedActualCapacity;
	}

	public void setOpenReservedActualCapacity(int openReservedActualCapacity) {
		this.openReservedActualCapacity = openReservedActualCapacity;
	}

	public int getOpenReservedCapacity() {
		return this.openReservedCapacity;
	}

	public void setOpenReservedCapacity(int openReservedCapacity) {
		this.openReservedCapacity = openReservedCapacity;
	}

	public int getOpenTotalCapacity() {
		return this.openTotalCapacity;
	}

	public void setOpenTotalCapacity(int openTotalCapacity) {
		this.openTotalCapacity = openTotalCapacity;
	}

	public int getOpenUnallocatedActualCapacity() {
		return this.openUnallocatedActualCapacity;
	}

	public void setOpenUnallocatedActualCapacity(
			int openUnallocatedActualCapacity) {
		this.openUnallocatedActualCapacity = openUnallocatedActualCapacity;
	}

	public int getOpenUnallocatedCapacity() {
		return this.openUnallocatedCapacity;
	}

	public void setOpenUnallocatedCapacity(int openUnallocatedCapacity) {
		this.openUnallocatedCapacity = openUnallocatedCapacity;
	}

	public int getProductCode() {
		return this.productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getSecurityStatus() {
		return this.securityStatus;
	}

	public void setSecurityStatus(int securityStatus) {
		this.securityStatus = securityStatus;
	}

	public int getSequenceNumber() {
		return this.sequenceNumber;
	}

	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public int getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getSharedMemoryInMb() {
		return this.sharedMemoryInMb;
	}

	public void setSharedMemoryInMb(int sharedMemoryInMb) {
		this.sharedMemoryInMb = sharedMemoryInMb;
	}

	public int getSlprStatus() {
		return this.slprStatus;
	}

	public void setSlprStatus(int slprStatus) {
		this.slprStatus = slprStatus;
	}

	public int getStatusOfDbinconsistency() {
		return this.statusOfDbinconsistency;
	}

	public void setStatusOfDbinconsistency(int statusOfDbinconsistency) {
		this.statusOfDbinconsistency = statusOfDbinconsistency;
	}

	public int getTotalFreeSpaceInGb() {
		return this.totalFreeSpaceInGb;
	}

	public void setTotalFreeSpaceInGb(int totalFreeSpaceInGb) {
		this.totalFreeSpaceInGb = totalFreeSpaceInGb;
	}

	public int getTotalFreeSpaceInKb() {
		return this.totalFreeSpaceInKb;
	}

	public void setTotalFreeSpaceInKb(int totalFreeSpaceInKb) {
		this.totalFreeSpaceInKb = totalFreeSpaceInKb;
	}
	
	public void populate(ParseElement pElem) {
		
		this.setAgentVersion(pElem.getAttribute().get("agentVersion"));
		this.setAllocatedCapacityInGb(Integer.parseInt(pElem.getAttribute().get("allocatedCapacityInGB")));
		this.setAllocatedCapacityinKb(Integer.parseInt(pElem.getAttribute().get("allocatedCapacityinKB")));
		this.setArrayFamily(pElem.getAttribute().get("arrayFamily"));
		this.setArrayType(pElem.getAttribute().get("arrayType"));
		this.setAutoFormatLu(Integer.parseInt(pElem.getAttribute().get("autoFormatLu")));
		this.setCacheInMb(Integer.parseInt(pElem.getAttribute().get("cacheInMB")));
		this.setCapacityInGb(Integer.parseInt(pElem.getAttribute().get("allocatedCapacityInGB")));
		this.setConfigUpdateStatus(Integer.parseInt(pElem.getAttribute().get("configUpdateStatus")));
		this.setControllerVersion(pElem.getAttribute().get("controllerVersion"));
		this.setDisplayArrayFamily(pElem.getAttribute().get("displayArrayFamily"));
		this.setDisplayArrayType(pElem.getAttribute().get("displayArrayType"));
		this.setDistributedMode(Integer.parseInt(pElem.getAttribute().get("distributedMode")));
		this.setFreeCapacityInGb(Integer.parseInt(pElem.getAttribute().get("freeCapacityInGB")));
		this.setFreeCapacityInKb(Integer.parseInt(pElem.getAttribute().get("freeCapacityInKB")));
		this.setHihsmCapacityInGb(Integer.parseInt(pElem.getAttribute().get("hihsmCapacityInGB")));
		this.setImAllocatedCapacity(Integer.parseInt(pElem.getAttribute().get("imAllocatedCapacity")));
		this.setImFreeCapacity(Integer.parseInt(pElem.getAttribute().get("imFreeCapacity")));
		this.setImHiHismCapacity(Integer.parseInt(pElem.getAttribute().get("imHiHismCapacity")));
		this.setImOnDemandCapacity(Integer.parseInt(pElem.getAttribute().get("imOnDemandCapacity")));
		this.setImTotalCapacity(Integer.parseInt(pElem.getAttribute().get("imTotalCapacity")));
		this.setLargestFreeSpaceInGb(Integer.parseInt(pElem.getAttribute().get("largestFreeSpaceInGB")));
		this.setLargestFreeSpaceInKb(Integer.parseInt(pElem.getAttribute().get("largestFreeSpaceInKB")));
		this.setLastRefreshed(Integer.parseInt(pElem.getAttribute().get("lastRefreshed")));
		this.setMfAllocatedCapacity(Integer.parseInt(pElem.getAttribute().get("mfAllocatedCapacity")));
		this.setMfHiHsmCapacity(Integer.parseInt(pElem.getAttribute().get("mfHiHsmCapacity")));
		this.setMfOnDemandCapacity(Integer.parseInt(pElem.getAttribute().get("mfOnDemandCapacity")));
		this.setMfTotalCapacity(Integer.parseInt(pElem.getAttribute().get("mfTotalCapacity")));
		this.setMfUnallocatedCapacity(Integer.parseInt(pElem.getAttribute().get("mfUnallocatedCapacity")));
		this.setMicrocodeVersion(pElem.getAttribute().get("microcodeVersion"));
		this.setMultipathSupport(Integer.parseInt(pElem.getAttribute().get("multipathSupport")));
		this.setName(pElem.getAttribute().get("name"));
		this.setNumberOfAllocatedMfLdevs(Integer.parseInt(pElem.getAttribute().get("numberOfAllocatedMfLdevs")));
		this.setNumberOfControllers(Integer.parseInt(pElem.getAttribute().get("numberOfControllers")));
		this.setNumberOfImAllocatedLus(Integer.parseInt(pElem.getAttribute().get("numberOfImAllocatedLus")));
		this.setNumberOfImReservedLus(Integer.parseInt(pElem.getAttribute().get("numberOfImReservedLus")));
		this.setNumberofImUnalloctedLus(Integer.parseInt(pElem.getAttribute().get("numberofImUnalloctedLus")));
		this.setNumberOfLus(Integer.parseInt(pElem.getAttribute().get("numberOfLus")));
		this.setNumberOfMfLdevs(Integer.parseInt(pElem.getAttribute().get("numberOfMfLdevs")));
		this.setNumberOfOpenAllocatedLus(Integer.parseInt(pElem.getAttribute().get("numberOfOpenAllocatedLus")));
		this.setNumberOfReservedLus(Integer.parseInt(pElem.getAttribute().get("numberOfReservedLus")));
		this.setNumberOfSpareDrives(Integer.parseInt(pElem.getAttribute().get("numberOfSpareDrives")));
		this.setNumberOfUnallocatedLus(Integer.parseInt(pElem.getAttribute().get("numberOfUnallocatedLus")));
		this.setNumberOfUnallocatedMfLdevs(Integer.parseInt(pElem.getAttribute().get("numberOfUnallocatedMfLdevs")));
		this.setObjectId(pElem.getAttribute().get("objectID"));
		this.setOnDemandCapacityInGb(Integer.parseInt(pElem.getAttribute().get("onDemandCapacityInGB")));
		this.setOnDemandCapacityInKb(Integer.parseInt(pElem.getAttribute().get("onDemandCapacityInKB")));
		this.setOpenAllocatedActualCapacity(Integer.parseInt(pElem.getAttribute().get("openAllocatedActualCapacity")));
		this.setOpenAllocatedCapacity(Integer.parseInt(pElem.getAttribute().get("openAllocatedCapacity")));
		this.setOpenFreeCapacity(Integer.parseInt(pElem.getAttribute().get("openFreeCapacity")));
		this.setOpenHiHsmCapacity(Integer.parseInt(pElem.getAttribute().get("openHiHsmCapacity")));
		this.setOpenOnDemandCapacity(Integer.parseInt(pElem.getAttribute().get("openOnDemandCapacity")));
		this.setOpenReservedActualCapacity(Integer.parseInt(pElem.getAttribute().get("openReservedActualCapacity")));
		this.setOpenReservedCapacity(Integer.parseInt(pElem.getAttribute().get("openReservedCapacity")));
		this.setOpenTotalCapacity(Integer.parseInt(pElem.getAttribute().get("openTotalCapacity")));
		this.setOpenUnallocatedActualCapacity(Integer.parseInt(pElem.getAttribute().get("openUnallocatedActualCapacity")));
		this.setOpenUnallocatedCapacity(Integer.parseInt(pElem.getAttribute().get("openUnallocatedCapacity")));
		this.setProductCode(Integer.parseInt(pElem.getAttribute().get("productCode")));
		this.setProductName(pElem.getAttribute().get("productName"));
		this.setSecurityStatus(Integer.parseInt(pElem.getAttribute().get("securityStatus")));
		this.setSequenceNumber(Integer.parseInt(pElem.getAttribute().get("sequenceNumber")));
		this.setSerialNumber(Integer.parseInt(pElem.getAttribute().get("serialNumber")));
		this.setSharedMemoryInMb(Integer.parseInt(pElem.getAttribute().get("sharedMemoryInMB")));
		this.setSlprStatus(Integer.parseInt(pElem.getAttribute().get("slprStatus")));
		this.setStatusOfDbinconsistency(Integer.parseInt(pElem.getAttribute().get("statusOfDbinconsistency")));
		this.setTotalFreeSpaceInGb(Integer.parseInt(pElem.getAttribute().get("totalFreeSpaceInGB")));
		this.setTotalFreeSpaceInKb(Integer.parseInt(pElem.getAttribute().get("totalFreeSpaceInKB")));
	}
}
