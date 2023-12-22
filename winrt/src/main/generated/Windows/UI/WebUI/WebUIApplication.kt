package Windows.UI.WebUI

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(WebUIApplication.ABI::class)
@WinRTByReference(brClass = WebUIApplication.ByReference::class)
public class WebUIApplication(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebUIApplication> {
    public override fun getValue() = WebUIApplication(pointer.getPointer(0))

    public fun setValue(value: WebUIApplication): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUIApplication, MemoryAddress> {
    public val IWebUIActivationStatics4_Instance: IWebUIActivationStatics4 by lazy {
      createIWebUIActivationStatics4()
    }


    public val IWebUIActivationStatics_Instance: IWebUIActivationStatics by lazy {
      createIWebUIActivationStatics()
    }


    public val IWebUIActivationStatics3_Instance: IWebUIActivationStatics3 by lazy {
      createIWebUIActivationStatics3()
    }


    public val IWebUIActivationStatics2_Instance: IWebUIActivationStatics2 by lazy {
      createIWebUIActivationStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWebUIActivationStatics4(): IWebUIActivationStatics4 {
      val refiid = Guid.REFIID(IWebUIActivationStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.WebUI.WebUIApplication".toHandle(),refiid,interfacePtr)
      val result = IWebUIActivationStatics4.ABI.makeIWebUIActivationStatics4(interfacePtr.value)
      return result
    }

    public fun createIWebUIActivationStatics(): IWebUIActivationStatics {
      val refiid = Guid.REFIID(IWebUIActivationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.WebUI.WebUIApplication".toHandle(),refiid,interfacePtr)
      val result = IWebUIActivationStatics.ABI.makeIWebUIActivationStatics(interfacePtr.value)
      return result
    }

    public fun createIWebUIActivationStatics3(): IWebUIActivationStatics3 {
      val refiid = Guid.REFIID(IWebUIActivationStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.WebUI.WebUIApplication".toHandle(),refiid,interfacePtr)
      val result = IWebUIActivationStatics3.ABI.makeIWebUIActivationStatics3(interfacePtr.value)
      return result
    }

    public fun createIWebUIActivationStatics2(): IWebUIActivationStatics2 {
      val refiid = Guid.REFIID(IWebUIActivationStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.WebUI.WebUIApplication".toHandle(),refiid,interfacePtr)
      val result = IWebUIActivationStatics2.ABI.makeIWebUIActivationStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WebUIApplication {
      val address = segment.toRawLongValue()
      return WebUIApplication(Pointer(address))
    }

    public override fun toNative(obj: WebUIApplication): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun add_NewWebUIViewCreated(handler: EventHandler<NewWebUIViewCreatedEventArgs?>) =
        ABI.IWebUIActivationStatics4_Instance.add_NewWebUIViewCreated(handler)

    public fun remove_NewWebUIViewCreated(token: EventRegistrationToken) =
        ABI.IWebUIActivationStatics4_Instance.remove_NewWebUIViewCreated(token)

    public fun add_BackgroundActivated(handler: BackgroundActivatedEventHandler) =
        ABI.IWebUIActivationStatics4_Instance.add_BackgroundActivated(handler)

    public fun remove_BackgroundActivated(token: EventRegistrationToken) =
        ABI.IWebUIActivationStatics4_Instance.remove_BackgroundActivated(token)

    public fun add_Activated(handler: ActivatedEventHandler) =
        ABI.IWebUIActivationStatics_Instance.add_Activated(handler)

    public fun remove_Activated(token: EventRegistrationToken) =
        ABI.IWebUIActivationStatics_Instance.remove_Activated(token)

    public fun add_Suspending(handler: SuspendingEventHandler) =
        ABI.IWebUIActivationStatics_Instance.add_Suspending(handler)

    public fun remove_Suspending(token: EventRegistrationToken) =
        ABI.IWebUIActivationStatics_Instance.remove_Suspending(token)

    public fun add_Resuming(handler: ResumingEventHandler) =
        ABI.IWebUIActivationStatics_Instance.add_Resuming(handler)

    public fun remove_Resuming(token: EventRegistrationToken) =
        ABI.IWebUIActivationStatics_Instance.remove_Resuming(token)

    public fun add_Navigated(handler: NavigatedEventHandler) =
        ABI.IWebUIActivationStatics_Instance.add_Navigated(handler)

    public fun remove_Navigated(token: EventRegistrationToken) =
        ABI.IWebUIActivationStatics_Instance.remove_Navigated(token)

    public fun RequestRestartAsync(launchArguments: String) =
        ABI.IWebUIActivationStatics3_Instance.RequestRestartAsync(launchArguments)

    public fun RequestRestartForUserAsync(user: User, launchArguments: String) =
        ABI.IWebUIActivationStatics3_Instance.RequestRestartForUserAsync(user, launchArguments)

    public fun add_LeavingBackground(handler: LeavingBackgroundEventHandler) =
        ABI.IWebUIActivationStatics2_Instance.add_LeavingBackground(handler)

    public fun remove_LeavingBackground(token: EventRegistrationToken) =
        ABI.IWebUIActivationStatics2_Instance.remove_LeavingBackground(token)

    public fun add_EnteredBackground(handler: EnteredBackgroundEventHandler) =
        ABI.IWebUIActivationStatics2_Instance.add_EnteredBackground(handler)

    public fun remove_EnteredBackground(token: EventRegistrationToken) =
        ABI.IWebUIActivationStatics2_Instance.remove_EnteredBackground(token)

    public fun EnablePrelaunch(value: Boolean) =
        ABI.IWebUIActivationStatics2_Instance.EnablePrelaunch(value)
  }
}
