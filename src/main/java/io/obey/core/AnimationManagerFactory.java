package io.obey.core;

import io.obey.core.br.BusinessRuleFactory;

public class AnimationManagerFactory {

    private AnimationManager animationManager;

    public AnimationManager createManager(BusinessRuleFactory businessRuleFactory){
        if(this.animationManager == null){
            synchronized (AnimationManagerFactory.class) {
                if(this.animationManager == null){
                    this.animationManager = new AnimationManagerImpl(businessRuleFactory);
                }
                return this.animationManager;
            }
        }
        return this.animationManager;
    }

}
