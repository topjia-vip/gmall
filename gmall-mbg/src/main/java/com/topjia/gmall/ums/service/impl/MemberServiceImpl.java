package com.topjia.gmall.ums.service.impl;

import com.topjia.gmall.ums.entity.Member;
import com.topjia.gmall.ums.mapper.MemberMapper;
import com.topjia.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author wjh
 * @since 2019-11-24
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
