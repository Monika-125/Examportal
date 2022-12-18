package com.boot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.payload.CourseDTO;
import com.boot.payload.ExamResultReportDTO;
import com.boot.payload.ExaminationDTO;
import com.boot.service.ExamResultReportService;
import com.boot.service.ExaminationService;


@RestController
@RequestMapping("/examResultReport")
@CrossOrigin("*")
public class ExamResultReportController {

	
	@Autowired
	private ExamResultReportService examResultReportService;
	
	@PostMapping
	@RequestMapping(value="/",method=RequestMethod.POST)//end point or mapping method
	
	public ResponseEntity<ExamResultReportDTO> addExamResultReport(@Valid @RequestBody ExamResultReportDTO examResultReport)
	{	
		ExamResultReportDTO addExamResultReport = this.examResultReportService.addExamReport(examResultReport);
	
		return new ResponseEntity<ExamResultReportDTO>(addExamResultReport,HttpStatus.CREATED);
	}
	@GetMapping("/")
	public ResponseEntity<List<ExamResultReportDTO>> getAllexamResultReport()
	{
		List<ExamResultReportDTO> examResultReportList = this.examResultReportService.getAllExamReportList();
		return new ResponseEntity<List<ExamResultReportDTO>>(examResultReportList,HttpStatus.OK);
		
   }
	
	
}
