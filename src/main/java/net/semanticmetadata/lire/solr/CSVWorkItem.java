package net.semanticmetadata.lire.solr;

import java.awt.image.BufferedImage;

import net.semanticmetadata.lire.indexing.parallel.WorkItem;

public class CSVWorkItem extends WorkItem {
	
	private String id;
	
	public CSVWorkItem(String id, String fileName, BufferedImage image) {
		super(fileName, image);
		this.id = id;
	}

	public CSVWorkItem(String id, String fileName, byte[] buffer) {
		super(fileName, buffer);
		this.id = id;
	}
	
	public String getId() {
        return id;
    }
	
}
