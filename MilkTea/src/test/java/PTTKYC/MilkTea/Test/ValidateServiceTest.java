package PTTKYC.MilkTea.Test;

import PTTKYC.MilkTea.Base.Constant;
import PTTKYC.MilkTea.Entity.ValidateService;
import org.junit.Assert;
import org.junit.Test;

public class ValidateServiceTest {
    private static ValidateService validateService = new ValidateService();

    @Test
    public void testingEmailEmpty(){
        Assert.assertEquals(false, validateService.validateEmail(Constant.EMPTY_STRING));
    }

    @Test
    public void testingEmailBlank(){
        Assert.assertEquals(false, validateService.validateEmail(Constant.BLANK_STRING));
    }

    @Test
    public void testingNormalEmail(){
        Assert.assertEquals(true, validateService.validateEmail(Constant.TESTING_EMAIL_1));
        Assert.assertEquals(true, validateService.validateEmail(Constant.TESTING_EMAIL_2));
        Assert.assertEquals(false, validateService.validateEmail(Constant.TESTING_EMAIL_3));
        Assert.assertEquals(true, validateService.validateEmail(Constant.TESTING_EMAIL_4));
        Assert.assertEquals(false, validateService.validateEmail(Constant.TESTING_EMAIL_5));
    }

    @Test
    public void testingEmptyPhone(){
        Assert.assertEquals(false, validateService.validatePhone(Constant.EMPTY_STRING));
    }

    @Test
    public void testingBlankPhone(){
        Assert.assertEquals(false, validateService.validatePhone(Constant.BLANK_STRING));
    }

    @Test
    public void testingNormalPhone(){
        Assert.assertEquals(false, validateService.validatePhone(Constant.TESTING_PHONE_1));
        Assert.assertEquals(true, validateService.validatePhone(Constant.TESTING_PHONE_2));
        Assert.assertEquals(true, validateService.validatePhone(Constant.TESTING_PHONE_3));
        Assert.assertEquals(false, validateService.validatePhone(Constant.TESTING_PHONE_4));
        Assert.assertEquals(false, validateService.validatePhone(Constant.TESTING_PHONE_5));
    }
}
