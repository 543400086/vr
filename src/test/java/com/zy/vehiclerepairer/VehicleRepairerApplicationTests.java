package com.zy.vehiclerepairer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VehicleRepairerApplicationTests {
    private MockMvc mvc;

   /* @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new PersonController()).build();
    }

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/index").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello world")));
    }*/

    @Test
    public void contextLoads() {
    }

}
