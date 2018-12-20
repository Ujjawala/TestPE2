package com.stackroute.unittest.pe2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {
    private MemberVariable memberVariable = new MemberVariable();
    private Member member = new Member();
    @Test
    public void getName() {
        String expected = "Parul";
        member.setName("Parul");
        assertEquals("Parul", memberVariable.getName(member));
    }

    @Test
    public void getAge() {
        member.setAge(25);
        assertEquals(25, memberVariable.getAge(member));
    }

    @Test
    public void getSalary() {
        member.setSalary(60000.0);
        assertEquals(60000.0, memberVariable.getSalary(member), .001);
        /*if (Math.absolute(expected - actual) > delta) then fail*/
    }
}