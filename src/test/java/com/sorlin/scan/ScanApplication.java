package com.sorlin.scan;

import com.sorlin.annotation.ComponentScan;
import com.sorlin.annotation.Import;
import com.sorlin.imported.LocalDateConfiguration;
import com.sorlin.imported.ZonedDateConfiguration;

/**
 * ScanApplication
 *
 * @author lisongling 2023/4/15
 * @since 1.0.0
 */
@ComponentScan
@Import({ LocalDateConfiguration.class, ZonedDateConfiguration.class })
public class ScanApplication {

}