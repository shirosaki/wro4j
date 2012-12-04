package ro.isdc.wro.extensions.support;

import static org.junit.Assert.assertFalse;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import ro.isdc.wro.extensions.processor.support.DefaultProcessorProvider;
import ro.isdc.wro.model.resource.processor.ResourceProcessor;

/**
 * @author Alex Objelean
 */
public class TestDefaultProcessorProvider {
  private DefaultProcessorProvider victim;

  @Before
  public void setUp() {
    victim = new DefaultProcessorProvider();
  }

  @Test
  public void shouldLoadNonEmptyPostProcessors() throws Exception {
    final Map<String, ResourceProcessor> map = victim.providePostProcessors();
    assertFalse(map.isEmpty());
  }


  @Test
  public void shouldLoadNonEmptyPreProcessors() throws Exception {
    final Map<String, ResourceProcessor> map = victim.providePreProcessors();
    assertFalse(map.isEmpty());
  }
}