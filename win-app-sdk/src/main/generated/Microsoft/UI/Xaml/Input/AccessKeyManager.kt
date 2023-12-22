package Microsoft.UI.Xaml.Input

import Microsoft.UI.Xaml.XamlRoot
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AccessKeyManager.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.AccessKeyManager;{8f2a4402-a635-53dc-bc17-da911eabaade})")
@WinRTByReference(brClass = AccessKeyManager.ByReference::class)
public class AccessKeyManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAccessKeyManager.WithDefault, IWinRTObject {
  private val __423144413_Interface: IAccessKeyManager.WithDefault by lazy {
    as_423144413()
  }


  public override val __423144413_Ptr: JNAPointer? by lazy {
    __423144413_Interface.__423144413_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__423144413_Interface)

  private fun as_423144413(): IAccessKeyManager.WithDefault {
    if(pointer == NULL) {
      return(IAccessKeyManager.ABI.makeIAccessKeyManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccessKeyManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccessKeyManager.ABI.makeIAccessKeyManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AccessKeyManager> {
    public override fun getValue() = AccessKeyManager(pointer.getPointer(0))

    public fun setValue(value: AccessKeyManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AccessKeyManager, MemoryAddress> {
    public val IAccessKeyManagerStatics_Instance: IAccessKeyManagerStatics by lazy {
      createIAccessKeyManagerStatics()
    }


    public val IAccessKeyManagerStatics2_Instance: IAccessKeyManagerStatics2 by lazy {
      createIAccessKeyManagerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAccessKeyManagerStatics(): IAccessKeyManagerStatics {
      val refiid = Guid.REFIID(IAccessKeyManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Input.AccessKeyManager".toHandle(),refiid,interfacePtr)
      val result = IAccessKeyManagerStatics.ABI.makeIAccessKeyManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIAccessKeyManagerStatics2(): IAccessKeyManagerStatics2 {
      val refiid = Guid.REFIID(IAccessKeyManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Input.AccessKeyManager".toHandle(),refiid,interfacePtr)
      val result = IAccessKeyManagerStatics2.ABI.makeIAccessKeyManagerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AccessKeyManager {
      val address = segment.toRawLongValue()
      return AccessKeyManager(Pointer(address))
    }

    public override fun toNative(obj: AccessKeyManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsDisplayModeEnabled() =
        ABI.IAccessKeyManagerStatics_Instance.get_IsDisplayModeEnabled()

    public fun get_AreKeyTipsEnabled() =
        ABI.IAccessKeyManagerStatics_Instance.get_AreKeyTipsEnabled()

    public fun put_AreKeyTipsEnabled(value: Boolean) =
        ABI.IAccessKeyManagerStatics_Instance.put_AreKeyTipsEnabled(value)

    public fun add_IsDisplayModeEnabledChanged(handler: TypedEventHandler<IUnknown?, IUnknown?>) =
        ABI.IAccessKeyManagerStatics_Instance.add_IsDisplayModeEnabledChanged(handler)

    public fun remove_IsDisplayModeEnabledChanged(token: EventRegistrationToken) =
        ABI.IAccessKeyManagerStatics_Instance.remove_IsDisplayModeEnabledChanged(token)

    public fun ExitDisplayMode() = ABI.IAccessKeyManagerStatics_Instance.ExitDisplayMode()

    public fun EnterDisplayMode(XamlRoot: XamlRoot) =
        ABI.IAccessKeyManagerStatics2_Instance.EnterDisplayMode(XamlRoot)
  }
}
