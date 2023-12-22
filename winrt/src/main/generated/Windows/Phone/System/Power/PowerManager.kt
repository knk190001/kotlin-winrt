package Windows.Phone.System.Power

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PowerManager.ABI::class)
@WinRTByReference(brClass = PowerManager.ByReference::class)
public class PowerManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PowerManager> {
    public override fun getValue() = PowerManager(pointer.getPointer(0))

    public fun setValue(value: PowerManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PowerManager, MemoryAddress> {
    public val IPowerManagerStatics2_Instance: IPowerManagerStatics2 by lazy {
      createIPowerManagerStatics2()
    }


    public val IPowerManagerStatics_Instance: IPowerManagerStatics by lazy {
      createIPowerManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPowerManagerStatics2(): IPowerManagerStatics2 {
      val refiid = Guid.REFIID(IPowerManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.System.Power.PowerManager".toHandle(),refiid,interfacePtr)
      val result = IPowerManagerStatics2.ABI.makeIPowerManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIPowerManagerStatics(): IPowerManagerStatics {
      val refiid = Guid.REFIID(IPowerManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.System.Power.PowerManager".toHandle(),refiid,interfacePtr)
      val result = IPowerManagerStatics.ABI.makeIPowerManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PowerManager {
      val address = segment.toRawLongValue()
      return PowerManager(Pointer(address))
    }

    public override fun toNative(obj: PowerManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PowerSavingModeEnabled() =
        ABI.IPowerManagerStatics2_Instance.get_PowerSavingModeEnabled()

    public fun get_PowerSavingMode() = ABI.IPowerManagerStatics_Instance.get_PowerSavingMode()

    public fun add_PowerSavingModeChanged(changeHandler: EventHandler<IUnknown?>) =
        ABI.IPowerManagerStatics_Instance.add_PowerSavingModeChanged(changeHandler)

    public fun remove_PowerSavingModeChanged(token: EventRegistrationToken) =
        ABI.IPowerManagerStatics_Instance.remove_PowerSavingModeChanged(token)
  }
}
