package com_nozama.txt;
import CLI.CLI001;
import CLI.CLI002;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses(value = {
        CLI001Test.class,
        CLI002.class
})

public class TestSuiteCLI {

}