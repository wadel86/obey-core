package io.obey.core;

public class AnimationManagerFactory {

    private AnimationManager animationManager;

    public AnimationManager createManager(){
        if(this.animationManager == null){
            synchronized (AnimationManagerFactory.class) {
                if(this.animationManager == null){
                    this.animationManager = new AnimationManagerImpl();
                }
                return this.animationManager;
            }
        }
        return this.animationManager;
    }

}
