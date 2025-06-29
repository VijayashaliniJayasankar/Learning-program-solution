package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);

        // Act
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Assert: verify interaction
        verify(mockApi).getData();
        System.out.println("Verified: getData() was called.");
    }
}
