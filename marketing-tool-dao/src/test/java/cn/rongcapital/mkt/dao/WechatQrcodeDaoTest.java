/*************************************************
 * @功能简述: DAO接口测试类
 * @项目名称: marketing cloud
 * @see: 
 * @author: 
 * @version: 0.0.1
 * @date: 
 * @复审人: 
*************************************************/

package cn.rongcapital.mkt.dao;

import cn.rongcapital.mkt.dao.testbase.AbstractUnitTest;
import cn.rongcapital.mkt.dao.WechatQrcodeDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.junit.After;

@RunWith(SpringJUnit4ClassRunner.class)
public class WechatQrcodeDaoTest extends AbstractUnitTest {

    private Logger logger = LoggerFactory.getLogger(getClass());
    
    @Autowired
    private WechatQrcodeDao wechatQrcodeDao;
    
    @Before  
    public void setUp() throws Exception {
        logger.info("测试: WechatQrcodeDao 开始---------------------");
    }
    
	@Test
	public void testUpdateStatusById() {
	    logger.info("测试方法: updateStatusById ");    
	}
	
	@Test
	public void testUpdataByBatchId() {
	    logger.info("测试方法: updataByBatchId ");    
	}
	
	@Test
	public void testDeleteById() {
	    logger.info("测试方法: deleteById ");    
	}
	
	@Test
	public void testSelectListExpirationTime() {
	    logger.info("测试方法: selectListExpirationTime ");    
	}
	
	@Test
	public void testFuzzySearchQrcodeName() {
	    logger.info("测试方法: fuzzySearchQrcodeName ");    
	}
	
	@Test
	public void testUpdateStatusByExpirationTime() {
	    logger.info("测试方法: updateStatusByExpirationTime ");    
	}
	
	@Test
	public void testSelectUsedChannelCountBychCode() {
	    logger.info("测试方法: selectUsedChannelCountBychCode ");    
	}
	
	@Test
	public void testInsert() {
	    logger.info("测试方法: insert ");    
	}
	
	@Test
	public void testSelectListCount() {
	    logger.info("测试方法: selectListCount ");    
	}
	
	@Test
	public void testUpdateById() {
	    logger.info("测试方法: updateById ");    
	}
	
	@Test
	public void testSelectList() {
	    logger.info("测试方法: selectList ");    
	}
	
	@Test
	public void testSelectListByIdList() {
	    logger.info("测试方法: selectListByIdList ");    
	}
	
    
    @After
    public void tearDown() throws Exception {
        logger.info("测试: WechatQrcodeDao 结束---------------------");
    }
}