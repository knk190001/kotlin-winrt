package Windows.System.Power

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

@ABIMarker(ForegroundEnergyManager.ABI::class)
@WinRTByReference(brClass = ForegroundEnergyManager.ByReference::class)
public class ForegroundEnergyManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ForegroundEnergyManager> {
    public override fun getValue() = ForegroundEnergyManager(pointer.getPointer(0))

    public fun setValue(value: ForegroundEnergyManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ForegroundEnergyManager, MemoryAddress> {
    public val IForegroundEnergyManagerStatics_Instance: IForegroundEnergyManagerStatics by lazy {
      createIForegroundEnergyManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIForegroundEnergyManagerStatics(): IForegroundEnergyManagerStatics {
      val refiid = Guid.REFIID(IForegroundEnergyManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Power.ForegroundEnergyManager".toHandle(),refiid,interfacePtr)
      val result =
          IForegroundEnergyManagerStatics.ABI.makeIForegroundEnergyManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ForegroundEnergyManager {
      val address = segment.toRawLongValue()
      return ForegroundEnergyManager(Pointer(address))
    }

    public override fun toNative(obj: ForegroundEnergyManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_LowUsageLevel() =
        ABI.IForegroundEnergyManagerStatics_Instance.get_LowUsageLevel()

    public fun get_NearMaxAcceptableUsageLevel() =
        ABI.IForegroundEnergyManagerStatics_Instance.get_NearMaxAcceptableUsageLevel()

    public fun get_MaxAcceptableUsageLevel() =
        ABI.IForegroundEnergyManagerStatics_Instance.get_MaxAcceptableUsageLevel()

    public fun get_ExcessiveUsageLevel() =
        ABI.IForegroundEnergyManagerStatics_Instance.get_ExcessiveUsageLevel()

    public fun get_RecentEnergyUsage() =
        ABI.IForegroundEnergyManagerStatics_Instance.get_RecentEnergyUsage()

    public fun get_RecentEnergyUsageLevel() =
        ABI.IForegroundEnergyManagerStatics_Instance.get_RecentEnergyUsageLevel()

    public fun add_RecentEnergyUsageIncreased(handler: EventHandler<IUnknown?>) =
        ABI.IForegroundEnergyManagerStatics_Instance.add_RecentEnergyUsageIncreased(handler)

    public fun remove_RecentEnergyUsageIncreased(token: EventRegistrationToken) =
        ABI.IForegroundEnergyManagerStatics_Instance.remove_RecentEnergyUsageIncreased(token)

    public fun add_RecentEnergyUsageReturnedToLow(handler: EventHandler<IUnknown?>) =
        ABI.IForegroundEnergyManagerStatics_Instance.add_RecentEnergyUsageReturnedToLow(handler)

    public fun remove_RecentEnergyUsageReturnedToLow(token: EventRegistrationToken) =
        ABI.IForegroundEnergyManagerStatics_Instance.remove_RecentEnergyUsageReturnedToLow(token)
  }
}
