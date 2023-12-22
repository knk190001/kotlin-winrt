package Windows.System.Profile

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WindowsIntegrityPolicy.ABI::class)
@WinRTByReference(brClass = WindowsIntegrityPolicy.ByReference::class)
public class WindowsIntegrityPolicy(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WindowsIntegrityPolicy> {
    public override fun getValue() = WindowsIntegrityPolicy(pointer.getPointer(0))

    public fun setValue(value: WindowsIntegrityPolicy): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WindowsIntegrityPolicy, MemoryAddress> {
    public val IWindowsIntegrityPolicyStatics_Instance: IWindowsIntegrityPolicyStatics by lazy {
      createIWindowsIntegrityPolicyStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWindowsIntegrityPolicyStatics(): IWindowsIntegrityPolicyStatics {
      val refiid = Guid.REFIID(IWindowsIntegrityPolicyStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Profile.WindowsIntegrityPolicy".toHandle(),refiid,interfacePtr)
      val result =
          IWindowsIntegrityPolicyStatics.ABI.makeIWindowsIntegrityPolicyStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WindowsIntegrityPolicy {
      val address = segment.toRawLongValue()
      return WindowsIntegrityPolicy(Pointer(address))
    }

    public override fun toNative(obj: WindowsIntegrityPolicy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsEnabled() = ABI.IWindowsIntegrityPolicyStatics_Instance.get_IsEnabled()

    public fun get_IsEnabledForTrial() =
        ABI.IWindowsIntegrityPolicyStatics_Instance.get_IsEnabledForTrial()

    public fun get_CanDisable() = ABI.IWindowsIntegrityPolicyStatics_Instance.get_CanDisable()

    public fun get_IsDisableSupported() =
        ABI.IWindowsIntegrityPolicyStatics_Instance.get_IsDisableSupported()

    public fun add_PolicyChanged(handler: EventHandler<IUnknown?>) =
        ABI.IWindowsIntegrityPolicyStatics_Instance.add_PolicyChanged(handler)

    public fun remove_PolicyChanged(token: EventRegistrationToken) =
        ABI.IWindowsIntegrityPolicyStatics_Instance.remove_PolicyChanged(token)
  }
}
