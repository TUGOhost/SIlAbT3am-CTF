package com.silabt3am.ctf.models.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.silabt3am.ctf.models.dao.FilesMapper;
import com.silabt3am.ctf.models.services.FileServices;
import com.silabt3am.ctf.pojo.Files;

//Files字段实现类
@Service("FileServices")
public class FileServicesImpl implements FileServices {

	@Resource
	private FilesMapper filesMapper;

	public List<Files> getFilesByChallengeId(Long id) {

		return filesMapper.SelectFilesByTaskId(id);
	}

	@Override
	public int insertNewFileRecord(Files afile) {

		return filesMapper.insert(afile);
	}

	@Override
	public Files getFileNotAttachedByName(String name) {
		
		return filesMapper.selectAFilesNotattachedByName(name);
	}

	@Override
	public Files getFileById(Long id) {

		return filesMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateFileInfo(Files file) {

		return filesMapper.updateByPrimaryKey(file);
	}

	@Override
	public int deleteFileRecordById(Long id) {

		return filesMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Files> getAllFiles() {

		return filesMapper.SelectAll();
	}
	
}
