package org.dromara.dynamictp.spring;

import lombok.extern.slf4j.Slf4j;
import org.dromara.dynamictp.common.properties.DtpProperties;
import org.dromara.dynamictp.core.refresher.AbstractRefresher;
import org.dromara.dynamictp.core.support.BinderHelper;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

@Slf4j
public abstract class AbstractSpringRefresher extends AbstractRefresher implements EnvironmentAware {

    protected Environment environment;

    protected AbstractSpringRefresher(DtpProperties dtpProperties) {
        super(dtpProperties);
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Override
    protected void refresh(Object environment) {
        super.refresh(environment);
    }
}
