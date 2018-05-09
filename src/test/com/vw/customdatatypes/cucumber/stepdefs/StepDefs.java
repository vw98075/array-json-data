package com.vw.customdatatypes.cucumber.stepdefs;

import com.vw.customdatatypes.CustomdatatypesApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CustomdatatypesApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
