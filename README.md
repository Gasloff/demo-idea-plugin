### Empty demo multi-module plugin

Dependencies resolving broken with gradle-intellij-plugin version 1.10.0

```
Can not load tasks for project ':demo-bootstrap'

org.gradle.api.internal.tasks.DefaultTaskContainer$TaskCreationException: Could not create task ':demo-bootstrap:setupDependencies'.
	at org.gradle.api.internal.tasks.DefaultTaskContainer.taskCreationException(DefaultTaskContainer.java:715)
	at org.gradle.api.internal.tasks.DefaultTaskContainer.access$600(DefaultTaskContainer.java:76)
	at org.gradle.api.internal.tasks.DefaultTaskContainer$TaskCreatingProvider.domainObjectCreationException(DefaultTaskContainer.java:707)
	at org.gradle.api.internal.DefaultNamedDomainObjectCollection$AbstractDomainObjectCreatingProvider.tryCreate(DefaultNamedDomainObjectCollection.java:948)
	at org.gradle.api.internal.tasks.DefaultTaskContainer$TaskCreatingProvider.access$1401(DefaultTaskContainer.java:654)
	at org.gradle.api.internal.tasks.DefaultTaskContainer$TaskCreatingProvider$1.run(DefaultTaskContainer.java:680)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
	at org.gradle.api.internal.tasks.DefaultTaskContainer$TaskCreatingProvider.tryCreate(DefaultTaskContainer.java:676)
	at org.gradle.api.internal.DefaultNamedDomainObjectCollection$AbstractDomainObjectCreatingProvider.calculateOwnValue(DefaultNamedDomainObjectCollection.java:929)
	at org.gradle.api.internal.provider.AbstractMinimalProvider.calculateValue(AbstractMinimalProvider.java:102)
	at org.gradle.api.internal.provider.Collectors$ElementFromProvider.collectEntries(Collectors.java:100)
	at org.gradle.api.internal.provider.Collectors$TypedCollector.collectEntries(Collectors.java:333)
	at org.gradle.api.internal.provider.Collectors$TypedCollector.collectInto(Collectors.java:328)
	at org.gradle.api.internal.collections.DefaultPendingSource.realize(DefaultPendingSource.java:61)
	at org.gradle.api.internal.collections.DefaultPendingSource.realizePending(DefaultPendingSource.java:39)
	at org.gradle.api.internal.collections.SortedSetElementSource.iterator(SortedSetElementSource.java:63)
	at org.gradle.api.internal.DefaultDomainObjectCollection.iterator(DefaultDomainObjectCollection.java:128)
	at org.gradle.api.internal.tasks.DefaultTaskContainer.iterator(DefaultTaskContainer.java:620)
	at java.base/java.util.AbstractCollection.addAll(AbstractCollection.java:351)
	at java.base/java.util.TreeSet.addAll(TreeSet.java:312)
	at java.base/java.util.TreeSet.<init>(TreeSet.java:160)
	at org.jetbrains.plugins.gradle.tooling.builder.TasksFactory.getAllTasks(TasksFactory.java:56)
	at org.jetbrains.plugins.gradle.tooling.builder.TasksFactory.collectTasks(TasksFactory.java:46)
	at org.jetbrains.plugins.gradle.tooling.builder.TasksFactory.getTasks(TasksFactory.java:78)
	at org.jetbrains.plugins.gradle.tooling.builder.ExternalProjectBuilderImpl.getTasks(ExternalProjectBuilderImpl.groovy:171)
	at org.jetbrains.plugins.gradle.tooling.builder.ExternalProjectBuilderImpl.doBuild(ExternalProjectBuilderImpl.groovy:108)
	at org.jetbrains.plugins.gradle.tooling.builder.ExternalProjectBuilderImpl.buildAll(ExternalProjectBuilderImpl.groovy:75)
	at org.jetbrains.plugins.gradle.tooling.internal.ExtraModelBuilder.buildAll(ExtraModelBuilder.java:107)
	at org.jetbrains.plugins.gradle.tooling.internal.ExtraModelBuilder.buildAll(ExtraModelBuilder.java:76)
	at org.gradle.tooling.provider.model.internal.DefaultToolingModelBuilderRegistry$BuilderWithParameter.build(DefaultToolingModelBuilderRegistry.java:287)
	at org.gradle.tooling.provider.model.internal.DefaultToolingModelBuilderRegistry$UserCodeAssigningBuilder.lambda$build$0(DefaultToolingModelBuilderRegistry.java:374)
	at org.gradle.configuration.internal.DefaultUserCodeApplicationContext$CurrentApplication.reapply(DefaultUserCodeApplicationContext.java:109)
	at org.gradle.tooling.provider.model.internal.DefaultToolingModelBuilderRegistry$UserCodeAssigningBuilder.build(DefaultToolingModelBuilderRegistry.java:374)
	at org.gradle.tooling.provider.model.internal.DefaultToolingModelBuilderRegistry$LockSingleProjectBuilder.lambda$build$0(DefaultToolingModelBuilderRegistry.java:304)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.lambda$fromMutableState$1(DefaultProjectStateRegistry.java:374)
	at org.gradle.internal.work.DefaultWorkerLeaseService.withReplacedLocks(DefaultWorkerLeaseService.java:345)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.fromMutableState(DefaultProjectStateRegistry.java:374)
	at org.gradle.tooling.provider.model.internal.DefaultToolingModelBuilderRegistry$LockSingleProjectBuilder.build(DefaultToolingModelBuilderRegistry.java:304)
	at org.gradle.tooling.provider.model.internal.DefaultToolingModelBuilderRegistry$BuildOperationWrappingBuilder$1.call(DefaultToolingModelBuilderRegistry.java:337)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
	at org.gradle.tooling.provider.model.internal.DefaultToolingModelBuilderRegistry$BuildOperationWrappingBuilder.build(DefaultToolingModelBuilderRegistry.java:334)
	at org.gradle.internal.build.DefaultBuildToolingModelController$AbstractToolingScope.getModel(DefaultBuildToolingModelController.java:82)
	at org.gradle.tooling.internal.provider.runner.DefaultBuildController.getModel(DefaultBuildController.java:106)
	at org.gradle.tooling.internal.consumer.connection.ParameterAwareBuildControllerAdapter.getModel(ParameterAwareBuildControllerAdapter.java:39)
	at org.gradle.tooling.internal.consumer.connection.UnparameterizedBuildController.getModel(UnparameterizedBuildController.java:113)
	at org.gradle.tooling.internal.consumer.connection.NestedActionAwareBuildControllerAdapter.getModel(NestedActionAwareBuildControllerAdapter.java:31)
	at org.gradle.tooling.internal.consumer.connection.UnparameterizedBuildController.findModel(UnparameterizedBuildController.java:97)
	at org.gradle.tooling.internal.consumer.connection.NestedActionAwareBuildControllerAdapter.findModel(NestedActionAwareBuildControllerAdapter.java:31)
	at org.gradle.tooling.internal.consumer.connection.UnparameterizedBuildController.findModel(UnparameterizedBuildController.java:81)
	at org.gradle.tooling.internal.consumer.connection.NestedActionAwareBuildControllerAdapter.findModel(NestedActionAwareBuildControllerAdapter.java:31)
	at org.jetbrains.plugins.gradle.model.ProjectImportAction$MyBuildController.findModel(ProjectImportAction.java:639)
	at org.jetbrains.plugins.gradle.model.ProjectImportAction$MyBuildController.findModel(ProjectImportAction.java:660)
	at org.jetbrains.plugins.gradle.model.ClassSetImportModelProvider.populateBuildModels(ClassSetImportModelProvider.java:27)
	at org.jetbrains.plugins.gradle.model.ProjectImportAction.addBuildModels(ProjectImportAction.java:405)
	at org.jetbrains.plugins.gradle.model.ProjectImportAction.execute(ProjectImportAction.java:143)
	at org.jetbrains.plugins.gradle.model.ProjectImportAction.execute(ProjectImportAction.java:42)
	at org.gradle.tooling.internal.consumer.connection.InternalBuildActionAdapter.execute(InternalBuildActionAdapter.java:64)
	at org.gradle.tooling.internal.provider.runner.AbstractClientProvidedBuildActionRunner$ActionAdapter.runAction(AbstractClientProvidedBuildActionRunner.java:131)
	at org.gradle.tooling.internal.provider.runner.AbstractClientProvidedBuildActionRunner$ActionAdapter.fromBuildModel(AbstractClientProvidedBuildActionRunner.java:104)
	at org.gradle.tooling.internal.provider.runner.AbstractClientProvidedBuildActionRunner$ActionAdapter.fromBuildModel(AbstractClientProvidedBuildActionRunner.java:84)
	at org.gradle.internal.buildtree.DefaultBuildTreeModelCreator.fromBuildModel(DefaultBuildTreeModelCreator.java:57)
	at org.gradle.internal.buildtree.DefaultBuildTreeLifecycleController.lambda$fromBuildModel$1(DefaultBuildTreeLifecycleController.java:82)
	at org.gradle.internal.buildtree.DefaultBuildTreeLifecycleController.lambda$runBuild$4(DefaultBuildTreeLifecycleController.java:106)
	at org.gradle.internal.model.StateTransitionController.lambda$transition$5(StateTransitionController.java:166)
	at org.gradle.internal.model.StateTransitionController.doTransition(StateTransitionController.java:247)
	at org.gradle.internal.model.StateTransitionController.lambda$transition$6(StateTransitionController.java:166)
	at org.gradle.internal.work.DefaultSynchronizer.withLock(DefaultSynchronizer.java:44)
	at org.gradle.internal.model.StateTransitionController.transition(StateTransitionController.java:166)
	at org.gradle.internal.buildtree.DefaultBuildTreeLifecycleController.runBuild(DefaultBuildTreeLifecycleController.java:103)
	at org.gradle.internal.buildtree.DefaultBuildTreeLifecycleController.fromBuildModel(DefaultBuildTreeLifecycleController.java:74)
	at org.gradle.tooling.internal.provider.runner.AbstractClientProvidedBuildActionRunner.runClientAction(AbstractClientProvidedBuildActionRunner.java:43)
	at org.gradle.tooling.internal.provider.runner.ClientProvidedPhasedActionRunner.run(ClientProvidedPhasedActionRunner.java:53)
	at org.gradle.launcher.exec.ChainingBuildActionRunner.run(ChainingBuildActionRunner.java:35)
	at org.gradle.internal.buildtree.ProblemReportingBuildActionRunner.run(ProblemReportingBuildActionRunner.java:49)
	at org.gradle.launcher.exec.BuildOutcomeReportingBuildActionRunner.run(BuildOutcomeReportingBuildActionRunner.java:65)
	at org.gradle.tooling.internal.provider.FileSystemWatchingBuildActionRunner.run(FileSystemWatchingBuildActionRunner.java:136)
	at org.gradle.launcher.exec.BuildCompletionNotifyingBuildActionRunner.run(BuildCompletionNotifyingBuildActionRunner.java:41)
	at org.gradle.launcher.exec.RootBuildLifecycleBuildActionExecutor.lambda$execute$0(RootBuildLifecycleBuildActionExecutor.java:40)
	at org.gradle.composite.internal.DefaultRootBuildState.run(DefaultRootBuildState.java:122)
	at org.gradle.launcher.exec.RootBuildLifecycleBuildActionExecutor.execute(RootBuildLifecycleBuildActionExecutor.java:40)
	at org.gradle.internal.buildtree.DefaultBuildTreeContext.execute(DefaultBuildTreeContext.java:40)
	at org.gradle.launcher.exec.BuildTreeLifecycleBuildActionExecutor.lambda$execute$0(BuildTreeLifecycleBuildActionExecutor.java:65)
	at org.gradle.internal.buildtree.BuildTreeState.run(BuildTreeState.java:53)
	at org.gradle.launcher.exec.BuildTreeLifecycleBuildActionExecutor.execute(BuildTreeLifecycleBuildActionExecutor.java:65)
	at org.gradle.launcher.exec.RunAsBuildOperationBuildActionExecutor$3.call(RunAsBuildOperationBuildActionExecutor.java:61)
	at org.gradle.launcher.exec.RunAsBuildOperationBuildActionExecutor$3.call(RunAsBuildOperationBuildActionExecutor.java:57)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
	at org.gradle.launcher.exec.RunAsBuildOperationBuildActionExecutor.execute(RunAsBuildOperationBuildActionExecutor.java:57)
	at org.gradle.launcher.exec.RunAsWorkerThreadBuildActionExecutor.lambda$execute$0(RunAsWorkerThreadBuildActionExecutor.java:36)
	at org.gradle.internal.work.DefaultWorkerLeaseService.withLocks(DefaultWorkerLeaseService.java:249)
	at org.gradle.internal.work.DefaultWorkerLeaseService.runAsWorkerThread(DefaultWorkerLeaseService.java:109)
	at org.gradle.launcher.exec.RunAsWorkerThreadBuildActionExecutor.execute(RunAsWorkerThreadBuildActionExecutor.java:36)
	at org.gradle.tooling.internal.provider.continuous.ContinuousBuildActionExecutor.execute(ContinuousBuildActionExecutor.java:110)
	at org.gradle.tooling.internal.provider.SubscribableBuildActionExecutor.execute(SubscribableBuildActionExecutor.java:64)
	at org.gradle.internal.session.DefaultBuildSessionContext.execute(DefaultBuildSessionContext.java:46)
	at org.gradle.tooling.internal.provider.BuildSessionLifecycleBuildActionExecuter$ActionImpl.apply(BuildSessionLifecycleBuildActionExecuter.java:100)
	at org.gradle.tooling.internal.provider.BuildSessionLifecycleBuildActionExecuter$ActionImpl.apply(BuildSessionLifecycleBuildActionExecuter.java:88)
	at org.gradle.internal.session.BuildSessionState.run(BuildSessionState.java:69)
	at org.gradle.tooling.internal.provider.BuildSessionLifecycleBuildActionExecuter.execute(BuildSessionLifecycleBuildActionExecuter.java:62)
	at org.gradle.tooling.internal.provider.BuildSessionLifecycleBuildActionExecuter.execute(BuildSessionLifecycleBuildActionExecuter.java:41)
	at org.gradle.tooling.internal.provider.StartParamsValidatingActionExecuter.execute(StartParamsValidatingActionExecuter.java:63)
	at org.gradle.tooling.internal.provider.StartParamsValidatingActionExecuter.execute(StartParamsValidatingActionExecuter.java:31)
	at org.gradle.tooling.internal.provider.SessionFailureReportingActionExecuter.execute(SessionFailureReportingActionExecuter.java:52)
	at org.gradle.tooling.internal.provider.SessionFailureReportingActionExecuter.execute(SessionFailureReportingActionExecuter.java:40)
	at org.gradle.tooling.internal.provider.SetupLoggingActionExecuter.execute(SetupLoggingActionExecuter.java:47)
	at org.gradle.tooling.internal.provider.SetupLoggingActionExecuter.execute(SetupLoggingActionExecuter.java:31)
	at org.gradle.launcher.daemon.server.exec.ExecuteBuild.doBuild(ExecuteBuild.java:65)
	at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:37)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.WatchForDisconnection.execute(WatchForDisconnection.java:39)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.ResetDeprecationLogger.execute(ResetDeprecationLogger.java:29)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.RequestStopIfSingleUsedDaemon.execute(RequestStopIfSingleUsedDaemon.java:35)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.ForwardClientInput$2.create(ForwardClientInput.java:78)
	at org.gradle.launcher.daemon.server.exec.ForwardClientInput$2.create(ForwardClientInput.java:75)
	at org.gradle.util.internal.Swapper.swap(Swapper.java:38)
	at org.gradle.launcher.daemon.server.exec.ForwardClientInput.execute(ForwardClientInput.java:75)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.LogAndCheckHealth.execute(LogAndCheckHealth.java:55)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.LogToClient.doBuild(LogToClient.java:63)
	at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:37)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.EstablishBuildEnvironment.doBuild(EstablishBuildEnvironment.java:84)
	at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:37)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.StartBuildOrRespondWithBusy$1.run(StartBuildOrRespondWithBusy.java:52)
	at org.gradle.launcher.daemon.server.DaemonStateCoordinator$1.run(DaemonStateCoordinator.java:297)
	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:48)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.gradle.api.InvalidUserDataException: Cannot change dependencies of dependency configuration ':demo-bootstrap:compileOnly' after it has been included in dependency resolution.
	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.preventIllegalMutation(DefaultConfiguration.java:1384)
	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.validateMutation(DefaultConfiguration.java:1344)
	at org.gradle.api.internal.artifacts.configurations.DefaultConfiguration.extendsFrom(DefaultConfiguration.java:395)
	at org.jetbrains.intellij.IntelliJPlugin$configureSetupDependenciesTask$1$ideaConfiguration$1$1.invoke(IntelliJPlugin.kt:1494)
	at org.jetbrains.intellij.IntelliJPlugin$configureSetupDependenciesTask$1.invoke(IntelliJPlugin.kt:1496)
	at org.jetbrains.intellij.IntelliJPlugin$configureSetupDependenciesTask$1.invoke(IntelliJPlugin.kt:114)
	at org.jetbrains.intellij.IntelliJPlugin$inlined$sam$i$org_gradle_api_Action$0.execute(TaskContainerExtensions.kt)
	at org.gradle.api.internal.DefaultMutationGuard$2.execute(DefaultMutationGuard.java:44)
	at org.gradle.api.internal.DefaultMutationGuard$2.execute(DefaultMutationGuard.java:44)
	at org.gradle.configuration.internal.DefaultUserCodeApplicationContext$CurrentApplication$1.execute(DefaultUserCodeApplicationContext.java:123)
	at org.gradle.api.internal.DefaultCollectionCallbackActionDecorator$BuildOperationEmittingAction$1.run(DefaultCollectionCallbackActionDecorator.java:110)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
	at org.gradle.api.internal.DefaultCollectionCallbackActionDecorator$BuildOperationEmittingAction.execute(DefaultCollectionCallbackActionDecorator.java:107)
	at org.gradle.internal.ImmutableActionSet$SetWithManyActions.execute(ImmutableActionSet.java:329)
	at org.gradle.api.internal.DefaultDomainObjectCollection.doAdd(DefaultDomainObjectCollection.java:262)
	at org.gradle.api.internal.DefaultNamedDomainObjectCollection.doAdd(DefaultNamedDomainObjectCollection.java:113)
	at org.gradle.api.internal.DefaultDomainObjectCollection.add(DefaultDomainObjectCollection.java:256)
	at org.gradle.api.internal.DefaultNamedDomainObjectCollection$AbstractDomainObjectCreatingProvider.tryCreate(DefaultNamedDomainObjectCollection.java:944)
	... 152 more
```