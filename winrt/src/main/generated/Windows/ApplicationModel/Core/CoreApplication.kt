package Windows.ApplicationModel.Core

import Windows.ApplicationModel.Activation.BackgroundActivatedEventArgs
import Windows.ApplicationModel.EnteredBackgroundEventArgs
import Windows.ApplicationModel.LeavingBackgroundEventArgs
import Windows.ApplicationModel.SuspendingEventArgs
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IGetActivationFactory
import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CoreApplication.ABI::class)
@WinRTByReference(brClass = CoreApplication.ByReference::class)
public class CoreApplication(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreApplication> {
    public override fun getValue() = CoreApplication(pointer.getPointer(0))

    public fun setValue(value: CoreApplication): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreApplication, MemoryAddress> {
    public val ICoreImmersiveApplication2_Instance: ICoreImmersiveApplication2 by lazy {
      createICoreImmersiveApplication2()
    }


    public val ICoreApplicationUseCount_Instance: ICoreApplicationUseCount by lazy {
      createICoreApplicationUseCount()
    }


    public val ICoreApplication2_Instance: ICoreApplication2 by lazy {
      createICoreApplication2()
    }


    public val ICoreApplicationUnhandledError_Instance: ICoreApplicationUnhandledError by lazy {
      createICoreApplicationUnhandledError()
    }


    public val ICoreApplicationExit_Instance: ICoreApplicationExit by lazy {
      createICoreApplicationExit()
    }


    public val ICoreImmersiveApplication3_Instance: ICoreImmersiveApplication3 by lazy {
      createICoreImmersiveApplication3()
    }


    public val ICoreApplication3_Instance: ICoreApplication3 by lazy {
      createICoreApplication3()
    }


    public val ICoreApplication_Instance: ICoreApplication by lazy {
      createICoreApplication()
    }


    public val ICoreImmersiveApplication_Instance: ICoreImmersiveApplication by lazy {
      createICoreImmersiveApplication()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreImmersiveApplication2(): ICoreImmersiveApplication2 {
      val refiid = Guid.REFIID(ICoreImmersiveApplication2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Core.CoreApplication".toHandle(),refiid,interfacePtr)
      val result = ICoreImmersiveApplication2.ABI.makeICoreImmersiveApplication2(interfacePtr.value)
      return result
    }

    public fun createICoreApplicationUseCount(): ICoreApplicationUseCount {
      val refiid = Guid.REFIID(ICoreApplicationUseCount.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Core.CoreApplication".toHandle(),refiid,interfacePtr)
      val result = ICoreApplicationUseCount.ABI.makeICoreApplicationUseCount(interfacePtr.value)
      return result
    }

    public fun createICoreApplication2(): ICoreApplication2 {
      val refiid = Guid.REFIID(ICoreApplication2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Core.CoreApplication".toHandle(),refiid,interfacePtr)
      val result = ICoreApplication2.ABI.makeICoreApplication2(interfacePtr.value)
      return result
    }

    public fun createICoreApplicationUnhandledError(): ICoreApplicationUnhandledError {
      val refiid = Guid.REFIID(ICoreApplicationUnhandledError.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Core.CoreApplication".toHandle(),refiid,interfacePtr)
      val result =
          ICoreApplicationUnhandledError.ABI.makeICoreApplicationUnhandledError(interfacePtr.value)
      return result
    }

    public fun createICoreApplicationExit(): ICoreApplicationExit {
      val refiid = Guid.REFIID(ICoreApplicationExit.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Core.CoreApplication".toHandle(),refiid,interfacePtr)
      val result = ICoreApplicationExit.ABI.makeICoreApplicationExit(interfacePtr.value)
      return result
    }

    public fun createICoreImmersiveApplication3(): ICoreImmersiveApplication3 {
      val refiid = Guid.REFIID(ICoreImmersiveApplication3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Core.CoreApplication".toHandle(),refiid,interfacePtr)
      val result = ICoreImmersiveApplication3.ABI.makeICoreImmersiveApplication3(interfacePtr.value)
      return result
    }

    public fun createICoreApplication3(): ICoreApplication3 {
      val refiid = Guid.REFIID(ICoreApplication3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Core.CoreApplication".toHandle(),refiid,interfacePtr)
      val result = ICoreApplication3.ABI.makeICoreApplication3(interfacePtr.value)
      return result
    }

    public fun createICoreApplication(): ICoreApplication {
      val refiid = Guid.REFIID(ICoreApplication.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Core.CoreApplication".toHandle(),refiid,interfacePtr)
      val result = ICoreApplication.ABI.makeICoreApplication(interfacePtr.value)
      return result
    }

    public fun createICoreImmersiveApplication(): ICoreImmersiveApplication {
      val refiid = Guid.REFIID(ICoreImmersiveApplication.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Core.CoreApplication".toHandle(),refiid,interfacePtr)
      val result = ICoreImmersiveApplication.ABI.makeICoreImmersiveApplication(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CoreApplication {
      val address = segment.toRawLongValue()
      return CoreApplication(Pointer(address))
    }

    public override fun toNative(obj: CoreApplication): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateNewView() = ABI.ICoreImmersiveApplication2_Instance.CreateNewView()

    public fun IncrementApplicationUseCount() =
        ABI.ICoreApplicationUseCount_Instance.IncrementApplicationUseCount()

    public fun DecrementApplicationUseCount() =
        ABI.ICoreApplicationUseCount_Instance.DecrementApplicationUseCount()

    public fun add_BackgroundActivated(handler: EventHandler<BackgroundActivatedEventArgs?>) =
        ABI.ICoreApplication2_Instance.add_BackgroundActivated(handler)

    public fun remove_BackgroundActivated(token: EventRegistrationToken) =
        ABI.ICoreApplication2_Instance.remove_BackgroundActivated(token)

    public fun add_LeavingBackground(handler: EventHandler<LeavingBackgroundEventArgs?>) =
        ABI.ICoreApplication2_Instance.add_LeavingBackground(handler)

    public fun remove_LeavingBackground(token: EventRegistrationToken) =
        ABI.ICoreApplication2_Instance.remove_LeavingBackground(token)

    public fun add_EnteredBackground(handler: EventHandler<EnteredBackgroundEventArgs?>) =
        ABI.ICoreApplication2_Instance.add_EnteredBackground(handler)

    public fun remove_EnteredBackground(token: EventRegistrationToken) =
        ABI.ICoreApplication2_Instance.remove_EnteredBackground(token)

    public fun EnablePrelaunch(value: Boolean) =
        ABI.ICoreApplication2_Instance.EnablePrelaunch(value)

    public fun add_UnhandledErrorDetected(handler: EventHandler<UnhandledErrorDetectedEventArgs?>) =
        ABI.ICoreApplicationUnhandledError_Instance.add_UnhandledErrorDetected(handler)

    public fun remove_UnhandledErrorDetected(token: EventRegistrationToken) =
        ABI.ICoreApplicationUnhandledError_Instance.remove_UnhandledErrorDetected(token)

    public fun Exit() = ABI.ICoreApplicationExit_Instance.Exit()

    public fun add_Exiting(handler: EventHandler<IUnknown?>) =
        ABI.ICoreApplicationExit_Instance.add_Exiting(handler)

    public fun remove_Exiting(token: EventRegistrationToken) =
        ABI.ICoreApplicationExit_Instance.remove_Exiting(token)

    public fun CreateNewView(viewSource: IFrameworkViewSource) =
        ABI.ICoreImmersiveApplication3_Instance.CreateNewView(viewSource)

    public fun RequestRestartAsync(launchArguments: String) =
        ABI.ICoreApplication3_Instance.RequestRestartAsync(launchArguments)

    public fun RequestRestartForUserAsync(user: User, launchArguments: String) =
        ABI.ICoreApplication3_Instance.RequestRestartForUserAsync(user, launchArguments)

    public fun get_Id() = ABI.ICoreApplication_Instance.get_Id()

    public fun add_Suspending(handler: EventHandler<SuspendingEventArgs?>) =
        ABI.ICoreApplication_Instance.add_Suspending(handler)

    public fun remove_Suspending(token: EventRegistrationToken) =
        ABI.ICoreApplication_Instance.remove_Suspending(token)

    public fun add_Resuming(handler: EventHandler<IUnknown?>) =
        ABI.ICoreApplication_Instance.add_Resuming(handler)

    public fun remove_Resuming(token: EventRegistrationToken) =
        ABI.ICoreApplication_Instance.remove_Resuming(token)

    public fun get_Properties() = ABI.ICoreApplication_Instance.get_Properties()

    public fun GetCurrentView() = ABI.ICoreApplication_Instance.GetCurrentView()

    public fun Run(viewSource: IFrameworkViewSource) = ABI.ICoreApplication_Instance.Run(viewSource)

    public fun RunWithActivationFactories(activationFactoryCallback: IGetActivationFactory) =
        ABI.ICoreApplication_Instance.RunWithActivationFactories(activationFactoryCallback)

    public fun get_Views() = ABI.ICoreImmersiveApplication_Instance.get_Views()

    public fun CreateNewView(runtimeType: String, entryPoint: String) =
        ABI.ICoreImmersiveApplication_Instance.CreateNewView(runtimeType, entryPoint)

    public fun get_MainView() = ABI.ICoreImmersiveApplication_Instance.get_MainView()
  }
}
