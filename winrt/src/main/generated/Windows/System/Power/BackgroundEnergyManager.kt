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

@ABIMarker(BackgroundEnergyManager.ABI::class)
@WinRTByReference(brClass = BackgroundEnergyManager.ByReference::class)
public class BackgroundEnergyManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundEnergyManager> {
    public override fun getValue() = BackgroundEnergyManager(pointer.getPointer(0))

    public fun setValue(value: BackgroundEnergyManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundEnergyManager, MemoryAddress> {
    public val IBackgroundEnergyManagerStatics_Instance: IBackgroundEnergyManagerStatics by lazy {
      createIBackgroundEnergyManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBackgroundEnergyManagerStatics(): IBackgroundEnergyManagerStatics {
      val refiid = Guid.REFIID(IBackgroundEnergyManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Power.BackgroundEnergyManager".toHandle(),refiid,interfacePtr)
      val result =
          IBackgroundEnergyManagerStatics.ABI.makeIBackgroundEnergyManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BackgroundEnergyManager {
      val address = segment.toRawLongValue()
      return BackgroundEnergyManager(Pointer(address))
    }

    public override fun toNative(obj: BackgroundEnergyManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_LowUsageLevel() =
        ABI.IBackgroundEnergyManagerStatics_Instance.get_LowUsageLevel()

    public fun get_NearMaxAcceptableUsageLevel() =
        ABI.IBackgroundEnergyManagerStatics_Instance.get_NearMaxAcceptableUsageLevel()

    public fun get_MaxAcceptableUsageLevel() =
        ABI.IBackgroundEnergyManagerStatics_Instance.get_MaxAcceptableUsageLevel()

    public fun get_ExcessiveUsageLevel() =
        ABI.IBackgroundEnergyManagerStatics_Instance.get_ExcessiveUsageLevel()

    public fun get_NearTerminationUsageLevel() =
        ABI.IBackgroundEnergyManagerStatics_Instance.get_NearTerminationUsageLevel()

    public fun get_TerminationUsageLevel() =
        ABI.IBackgroundEnergyManagerStatics_Instance.get_TerminationUsageLevel()

    public fun get_RecentEnergyUsage() =
        ABI.IBackgroundEnergyManagerStatics_Instance.get_RecentEnergyUsage()

    public fun get_RecentEnergyUsageLevel() =
        ABI.IBackgroundEnergyManagerStatics_Instance.get_RecentEnergyUsageLevel()

    public fun add_RecentEnergyUsageIncreased(handler: EventHandler<IUnknown?>) =
        ABI.IBackgroundEnergyManagerStatics_Instance.add_RecentEnergyUsageIncreased(handler)

    public fun remove_RecentEnergyUsageIncreased(token: EventRegistrationToken) =
        ABI.IBackgroundEnergyManagerStatics_Instance.remove_RecentEnergyUsageIncreased(token)

    public fun add_RecentEnergyUsageReturnedToLow(handler: EventHandler<IUnknown?>) =
        ABI.IBackgroundEnergyManagerStatics_Instance.add_RecentEnergyUsageReturnedToLow(handler)

    public fun remove_RecentEnergyUsageReturnedToLow(token: EventRegistrationToken) =
        ABI.IBackgroundEnergyManagerStatics_Instance.remove_RecentEnergyUsageReturnedToLow(token)
  }
}
