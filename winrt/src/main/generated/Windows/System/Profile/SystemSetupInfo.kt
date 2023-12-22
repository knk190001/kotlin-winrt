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

@ABIMarker(SystemSetupInfo.ABI::class)
@WinRTByReference(brClass = SystemSetupInfo.ByReference::class)
public class SystemSetupInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemSetupInfo> {
    public override fun getValue() = SystemSetupInfo(pointer.getPointer(0))

    public fun setValue(value: SystemSetupInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemSetupInfo, MemoryAddress> {
    public val ISystemSetupInfoStatics_Instance: ISystemSetupInfoStatics by lazy {
      createISystemSetupInfoStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISystemSetupInfoStatics(): ISystemSetupInfoStatics {
      val refiid = Guid.REFIID(ISystemSetupInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Profile.SystemSetupInfo".toHandle(),refiid,interfacePtr)
      val result = ISystemSetupInfoStatics.ABI.makeISystemSetupInfoStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SystemSetupInfo {
      val address = segment.toRawLongValue()
      return SystemSetupInfo(Pointer(address))
    }

    public override fun toNative(obj: SystemSetupInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_OutOfBoxExperienceState() =
        ABI.ISystemSetupInfoStatics_Instance.get_OutOfBoxExperienceState()

    public fun add_OutOfBoxExperienceStateChanged(handler: EventHandler<IUnknown?>) =
        ABI.ISystemSetupInfoStatics_Instance.add_OutOfBoxExperienceStateChanged(handler)

    public fun remove_OutOfBoxExperienceStateChanged(token: EventRegistrationToken) =
        ABI.ISystemSetupInfoStatics_Instance.remove_OutOfBoxExperienceStateChanged(token)
  }
}
