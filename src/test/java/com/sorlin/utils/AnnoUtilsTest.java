package com.sorlin.utils;

import com.sorlin.annotation.Component;
import com.sorlin.annotation.Configuration;
import com.sorlin.annotation.Order;
import com.sorlin.exception.BeanDefinitionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * AnnoUtilsTest
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
public class AnnoUtilsTest {

    @Test
    public void noComponent() throws Exception {
        assertNull(ClassUtils.findAnnotation(Simple.class, Component.class));
    }

    @Test
    public void simpleComponent() throws Exception {
        assertNotNull(ClassUtils.findAnnotation(SimpleComponent.class, Component.class));
        assertEquals("simpleComponent", ClassUtils.getBeanName(SimpleComponent.class));
    }

    @Test
    public void simpleComponentWithName() throws Exception {
        assertNotNull(ClassUtils.findAnnotation(SimpleComponentWithName.class, Component.class));
        assertEquals("simpleName", ClassUtils.getBeanName(SimpleComponentWithName.class));
    }

    @Test
    public void simpleConfiguration() throws Exception {
        assertNotNull(ClassUtils.findAnnotation(SimpleConfiguration.class, Component.class));
        assertEquals("simpleConfiguration", ClassUtils.getBeanName(SimpleConfiguration.class));
    }

    @Test
    public void simpleConfigurationWithName() throws Exception {
        assertNotNull(ClassUtils.findAnnotation(SimpleConfigurationWithName.class, Component.class));
        assertEquals("simpleCfg", ClassUtils.getBeanName(SimpleConfigurationWithName.class));
    }

    @Test
    public void customComponent() throws Exception {
        assertNotNull(ClassUtils.findAnnotation(Custom.class, Component.class));
        assertEquals("custom", ClassUtils.getBeanName(Custom.class));
    }

    @Test
    public void customComponentWithName() throws Exception {
        assertNotNull(ClassUtils.findAnnotation(CustomWithName.class, Component.class));
        assertEquals("customName", ClassUtils.getBeanName(CustomWithName.class));
    }

    @Test
    public void duplicateComponent() throws Exception {
        assertThrows(BeanDefinitionException.class, () -> {
            ClassUtils.findAnnotation(DuplicateComponent.class, Component.class);
        });
        assertThrows(BeanDefinitionException.class, () -> {
            ClassUtils.findAnnotation(DuplicateComponent2.class, Component.class);
        });
    }
}

@Order(1)
class Simple {
}

@Component
class SimpleComponent {
}

@Component("simpleName")
class SimpleComponentWithName {
}

@Configuration
class SimpleConfiguration {

}

@Configuration("simpleCfg")
class SimpleConfigurationWithName {

}

@CustomComponent
class Custom {

}

@CustomComponent("customName")
class CustomWithName {

}

@Component
@Configuration
class DuplicateComponent {

}

@CustomComponent
@Configuration
class DuplicateComponent2 {

}