package test.strings;

import org.junit.Test;
import strings.ReverseString;

import static org.junit.Assert.assertEquals;

/**
 * Created by josep_000 on 5/26/2014.
 */
public class ReverseStringTest {

    private String veryLongString = "poKEwg9034j[tk3okpspdkfPO#kflz,mofwiojwklj3row3pga9baemiohjaw9u4390wjag[esIGJK(OSGU(JEG)IMlk;mselkfj;ioWEJF(W#PHt9832u205p2390*%)(@*#%ji23oi4joiJ:Asklsncknzxnfowiehjfuiowhjetiohweiofjawpeijga98w34jtp983jw592up52j3ioajpeofjipoijioejcioJE#ROP*(jtpjwwppioejpoitwjpoiejfiopjzxcmvxnvxm,nvbmlnv,ncvmNCXM<VNCXM,vCX<vn.,mz..Z>Z>Z>Z>W902)!))!)!))!)!($$($";
    private String veryLongStringReversed = "$($$(!)!))!)!))!)209W>Z>Z>Z>Z..zm,.nv<XCv,MXCNV<MXCNmvcn,vnlmbvn,mxvnxvmcxzjpoifjeiopjwtiopjeoippwwjptj(*POR#EJoicjeoijiopijfoepjaoi3j25pu295wj389ptj43w89agjiepwajfoiewhoitejhwoiufjheiwofnxznkcnslksA:Jioj4io32ij%#*@()%*0932p502u2389tHP#W(FJEWoi;jfklesm;klMI)GEJ(UGSO(KJGIse[gajw0934u9wajhoimeab9agp3wor3jlkwjoiwfom,zlfk#OPfkdpspko3kt[j4309gwEKop";

    @Test
    public void testReverseString() {
        assertEquals("dlroW olleH", ReverseString.reverse("Hello World"));
    }

    @Test
    public void testReverseStringOptimized() {
        assertEquals("dlroW olleH", ReverseString.reverseOptimized("Hello World"));
    }

    @Test
    public void testReverseStringVeryLargeString() {
        assertEquals(veryLongStringReversed, ReverseString.reverse(veryLongString));
    }

    @Test
    public void testReverseStringOptimizedVeryLargeString() {
        assertEquals(veryLongStringReversed, ReverseString.reverseOptimized(veryLongString));
    }


}
