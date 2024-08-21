package com.compleatable;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class FolderProcessor extends RecursiveTask<FolderDetail> {
    private final File folder;

    public FolderProcessor(File folder) {
        this.folder = folder;
    }

    @Override
    protected FolderDetail compute() {

        FolderDetail folderDetail = new FolderDetail(0, 0, 0);
        try {
            File[] files = folder.listFiles();
            if (files != null) {
                Arrays.stream(files).forEach(file -> {
                    if (file.isDirectory()) {
                        FolderProcessor folderScanner = new FolderProcessor(file);
                        folderScanner.fork();
                        folderDetail.add(folderScanner.join());
                    } else {
                        folderDetail.size += file.length();
                        folderDetail.totalFileCount++;
                    }
                });
            }
            folderDetail.totalFolderCount++;
        } catch (Exception e) {
            System.err.println("Error accessing directory: " + folder.getAbsolutePath() + " - " + e.getMessage());
        }
        return folderDetail;
    }
}

public class FolderScanMain {
    public static void main(String[] args) {
        File file = new File("C:\\jpop");
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        FolderProcessor folderProcessor = new FolderProcessor(file);
        forkJoinPool.execute(folderProcessor);
        FolderDetail folderDetail = folderProcessor.join();
        System.out.println(folderDetail);

    }
}
