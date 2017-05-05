package com.broduck.enigma.controller;

import com.broduck.enigma.common.BroduckController;
import com.broduck.enigma.common.MessageException;
import com.broduck.enigma.controller.rqrs.ReadCategoryListRs;
import com.broduck.enigma.controller.rqrs.SaveVoteControllerRq;
import com.broduck.enigma.controller.rqrs.VoteControllerRq;
import com.broduck.enigma.controller.rqrs.VoteControllerRs;
import com.broduck.enigma.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/**
 * 투표 컨트롤러
 * Created by ydh0624 on 2017-04-16.
 */
public class VoteController extends BroduckController {

    @Autowired
    private VoteService voteService;

    public ModelAndView readVote(HttpServletRequest request, HttpServletResponse response, VoteControllerRq rq) {
        VoteControllerRs rs = new VoteControllerRs();
        ModelAndView mv = this.initModel(request, response, rq, rs);

        try {
            rs.setIsSuccess(true);
        } catch (Exception e) {
            rs.setResultMessage("요청 실패");
            rs.setIsSuccess(false);
        }

        return mv;
    }

    public ModelAndView createVote(HttpServletRequest request, HttpServletResponse response, VoteControllerRq rq) {
        VoteControllerRs rs = new VoteControllerRs();
        ModelAndView mv = this.initModel(request, response, rq, rs);

        try {
            rs.setIsSuccess(true);
        } catch (Exception e) {
            rs.setResultMessage("요청 실패");
            rs.setIsSuccess(false);
        }

        return mv;
    }

    public ModelAndView uploadImage(HttpServletRequest request, HttpServletResponse response, VoteControllerRq rq) {
        VoteControllerRs rs = new VoteControllerRs();
        ModelAndView mv = this.initModel(request, response, rq, rs);

        String uploadPath = "C:\\upload\\broduck";
        String[] allowExtension = {"jpg", "jpeg", "png", "bmp"};

        try {
            MultipartFile multipartFile = null;
            MultipartHttpServletRequest mRq = (MultipartHttpServletRequest) request;

            Iterator<String> fileNames = mRq.getFileNames();

            while (fileNames.hasNext()) {
                String key = fileNames.next();

                List<MultipartFile> multipartFileList = mRq.getFiles(key);
                for (MultipartFile data : multipartFileList) {
                    multipartFile = data;
                }
            }

            if (multipartFile == null)
                throw new MessageException("파일 똑바로 올리세요");

            File dir = new File(uploadPath);
            if (!dir.exists())
                dir.mkdirs();

            if (!multipartFile.isEmpty()) {
                String fileName = multipartFile.getOriginalFilename();
                int iStartExtension = fileName.lastIndexOf(".");
                String fileExtension = fileName.substring(iStartExtension + 1, fileName.length()).toLowerCase();

                boolean isAllowed = false;
                for (String extension : allowExtension) {
                    if (extension.equals(fileExtension))
                        isAllowed = true;
                }

                if (!isAllowed)
                    throw new MessageException("사진 파일만 올리세요");

                String fileUid = UUID.randomUUID().toString() + "." + fileExtension;

                File uploadFile = new File(uploadPath, fileUid);

                multipartFile.transferTo(uploadFile);

                logger.debug("파일 업로드 성공");
            }

        } catch (MessageException e) {
            rs.setResultMessage(e.getMessage());
            rs.setIsSuccess(false);
        } catch (Exception e) {
            rs.setResultMessage("요청 실패");
            rs.setIsSuccess(false);
        }

        return mv;
    }

    public ModelAndView generateVoteData(HttpServletRequest request, HttpServletResponse response, VoteControllerRq rq) {
        VoteControllerRs rs = new VoteControllerRs();
        ModelAndView mv = this.initModel(request, response, rq, rs);

        try {
            voteService.generateVoteData();
            rs.setIsSuccess(true);
            rs.setResultMessage("성공적");
        } catch (Exception e) {
            rs.setIsSuccess(false);
            rs.setResultMessage("오류!!!");
        }

        return mv;
    }

    public ModelAndView readCategoryList(HttpServletRequest request, HttpServletResponse response, VoteControllerRq rq) {
        ReadCategoryListRs rs = new ReadCategoryListRs();
        ModelAndView mv = this.initModel(request, response, rq, rs);

        try {
            rs.setCategoryList(voteService.readVoteKindList());
            rs.setIsSuccess(true);
            rs.setResultMessage("성공");
        } catch (Exception e) {
            rs.setIsSuccess(false);
            rs.setResultMessage("오류!");
        }

        return mv;
    }

    public @ResponseBody ModelAndView saveVote(HttpServletRequest request, HttpServletResponse response, @RequestBody SaveVoteControllerRq rq) {
        VoteControllerRs rs = new VoteControllerRs();
        ModelAndView mv = this.initModel(request, response, rq, rs);

        try {
            voteService.saveVote(rq);

            rs.setIsSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            rs.setIsSuccess(false);
            rs.setResultMessage("오류!");
        }

        return mv;
    }
}