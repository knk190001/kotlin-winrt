package Windows.System.Profile

import Windows.Foundation.Collections.IIterable
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppApplicability.ABI::class)
@WinRTByReference(brClass = AppApplicability.ByReference::class)
public class AppApplicability(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppApplicability> {
    public override fun getValue() = AppApplicability(pointer.getPointer(0))

    public fun setValue(value: AppApplicability): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppApplicability, MemoryAddress> {
    public val IAppApplicabilityStatics_Instance: IAppApplicabilityStatics by lazy {
      createIAppApplicabilityStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppApplicabilityStatics(): IAppApplicabilityStatics {
      val refiid = Guid.REFIID(IAppApplicabilityStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Profile.AppApplicability".toHandle(),refiid,interfacePtr)
      val result = IAppApplicabilityStatics.ABI.makeIAppApplicabilityStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppApplicability {
      val address = segment.toRawLongValue()
      return AppApplicability(Pointer(address))
    }

    public override fun toNative(obj: AppApplicability): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetUnsupportedAppRequirements(capabilities: IIterable<String?>) =
        ABI.IAppApplicabilityStatics_Instance.GetUnsupportedAppRequirements(capabilities)
  }
}
