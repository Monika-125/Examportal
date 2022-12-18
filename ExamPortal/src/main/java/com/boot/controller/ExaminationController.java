package com.boot.controller;

import java.util.List;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.payload.CourseDTO;
import com.boot.payload.ExamResultReportDTO;
import com.boot.payload.ExaminationDTO;
import com.boot.service.ExaminationService;

@RestController
@RequestMapping("/examination")
@CrossOrigin("*")

public class ExaminationController {

	@Autowired
	
	private ExaminationService examinationService;
	
	@PostMapping
	@RequestMapping(value="/",method=RequestMethod.POST)//end point or mapping method
	
	public ResponseEntity<ExaminationDTO> addExamination(@Valid @RequestBody ExaminationDTO examination)
	{	
		ExaminationDTO addExamination = this.examinationService.addExamination(examination);
	
		return new ResponseEntity<ExaminationDTO>(addExamination,HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<ExaminationDTO>> getAllExamination()
	{
		List<ExaminationDTO> examinationList = this.examinationService.getAllExaminationList();
		return new ResponseEntity<List<ExaminationDTO>>(examinationList,HttpStatus.OK);
	}
    
/*	@GetMapping("/examResultReport/{examResultId}")
	public ResponseEntity<List<ExaminationDTO>>getAllExamResultReportByExaminationId(@PathVariable("examResultId") int examResultId)
	{
		List<ExaminationDTO> examinationList= this.examinationService.getAllExaminationByexamReportId(examResultId);
	   return new ResponseEntity<List<ExaminationDTO>>(examinationList,HttpStatus.OK);	
	}*/

}
