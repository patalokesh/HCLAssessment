package com.assessment.hcl;

import java.util.List;
import java.util.ArrayList;

/**
 * Table contains the Record data
 * 
 * @author Lokesh Reddy
 * @version 1.0
 */
public class Table {
	
	private List<Record> records = new ArrayList<Record>();

	/**
	 * @return the records
	 */
	public List<Record> getAllRecords() {
		if(records.size()==0)
			System.out.println("No records found");
		return records;
	}

	public Record getRecord(int id)
	{
		Record record = new Record(id);
		for(Record eachRecord: records)
		{
			if(record.equals(eachRecord))
				return eachRecord;
		}
		System.out.println("Record does not exists");
		return null;
	}
	/**
	 * @param records the records to set
	 */
	public void add(int id, String name, String phone, String address) {
		if(id<=0)
		{
			System.out.println("Could not add record: please enter a positive id");
			return;
		}
		Record record = new Record(id,name,phone,address);
		if(records.contains(record))
		{
			System.out.println("Could not add record: record with the same id already exists");
			return;
		}
		this.records.add(record);	
		System.out.println("Successfully added: "+record);
	}

}
