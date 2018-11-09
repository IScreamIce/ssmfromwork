package com.kaige123.daomu.service;

import com.kaige123.daomu.DAO.Mapper.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ViewService {

    private static Logger log = Logger.getLogger(ViewService.class);

    @Autowired
    private BannerMapper bannerMapper;
    @Autowired
    private DrawmonyMapper drawmonyMapper;
    @Autowired
    private FinancewaterMapper financewaterMapper;
    @Autowired
    private OSaidlogMapper oSaidlogMapper;
    @Autowired
    private OSconfigMapper oSconfigMapper;
    @Autowired
    private ResourceDownloadMapper resourceDownloadMapper;
    @Autowired
    private UserlogMapper userlogMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private VcommentMapper vcommentMapper;
    @Autowired
    private VideobuyorderMapper videobuyorderMapper;
    @Autowired
    private VideocouresMapper videocouresMapper;
    @Autowired
    private VideoMapper videoMapper;
    @Autowired
    private VideotypeMapper videotypeMapper;

}
