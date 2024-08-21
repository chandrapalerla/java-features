package com.compleatable;

public class FolderDetail {

    public long size;
    public int totalFileCount;
    public int totalFolderCount;

    public FolderDetail(long size, int totalFileCount, int totalFolderCount) {
        this.size = size;
        this.totalFileCount = totalFileCount;
        this.totalFolderCount = totalFolderCount;
    }

    @Override
    public String toString() {
        return "FolderDetails{" + "size=" + size + ", totalFileCount=" + totalFileCount + ", totalFolderCount=" + totalFolderCount + '}';
    }

    public void add(FolderDetail folderDetail) {
        this.size += folderDetail.size;
        this.totalFileCount += folderDetail.totalFileCount;
        this.totalFolderCount += folderDetail.totalFolderCount;
    }
}
