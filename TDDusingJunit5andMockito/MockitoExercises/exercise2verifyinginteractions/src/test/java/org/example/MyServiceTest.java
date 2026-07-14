package org.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testVerifyInteraction() {

        // Step 1: Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Create MyService using the mock
        MyService service = new MyService(mockApi);

        // Step 3: Call the service method
        service.fetchData();

        // Step 4: Verify that getData() was called
        verify(mockApi).getData();
    }
}