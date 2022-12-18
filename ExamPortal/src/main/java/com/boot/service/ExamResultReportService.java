package com.boot.service;

import java.util.List;

import com.boot.payload.ExamResultReportDTO;


public interface ExamResultReportService {

public ExamResultReportDTO addExamReport(ExamResultReportDTO examResultReport);
	
	public List<ExamResultReportDTO> getAllExamReportList();
	
	public ExamResultReportDTO getExamReportById(int examResultReportId);
	
	public void deleteExamReportById(int examResultReportId);
	
	public ExamResultReportDTO updateExamReportById(ExamResultReportDTO examResultReport,int examResultReportId);

	
}
