package Windows.System

import Windows.Foundation.TimeSpan
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ShutdownManager.ABI::class)
@WinRTByReference(brClass = ShutdownManager.ByReference::class)
public class ShutdownManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ShutdownManager> {
    public override fun getValue() = ShutdownManager(pointer.getPointer(0))

    public fun setValue(value: ShutdownManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ShutdownManager, MemoryAddress> {
    public val IShutdownManagerStatics2_Instance: IShutdownManagerStatics2 by lazy {
      createIShutdownManagerStatics2()
    }


    public val IShutdownManagerStatics_Instance: IShutdownManagerStatics by lazy {
      createIShutdownManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIShutdownManagerStatics2(): IShutdownManagerStatics2 {
      val refiid = Guid.REFIID(IShutdownManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.ShutdownManager".toHandle(),refiid,interfacePtr)
      val result = IShutdownManagerStatics2.ABI.makeIShutdownManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIShutdownManagerStatics(): IShutdownManagerStatics {
      val refiid = Guid.REFIID(IShutdownManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.ShutdownManager".toHandle(),refiid,interfacePtr)
      val result = IShutdownManagerStatics.ABI.makeIShutdownManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ShutdownManager {
      val address = segment.toRawLongValue()
      return ShutdownManager(Pointer(address))
    }

    public override fun toNative(obj: ShutdownManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsPowerStateSupported(powerState: PowerState) =
        ABI.IShutdownManagerStatics2_Instance.IsPowerStateSupported(powerState)

    public fun EnterPowerState(powerState: PowerState) =
        ABI.IShutdownManagerStatics2_Instance.EnterPowerState(powerState)

    public fun EnterPowerState(powerState: PowerState, wakeUpAfter: TimeSpan) =
        ABI.IShutdownManagerStatics2_Instance.EnterPowerState(powerState, wakeUpAfter)

    public fun BeginShutdown(shutdownKind: ShutdownKind, timeout: TimeSpan) =
        ABI.IShutdownManagerStatics_Instance.BeginShutdown(shutdownKind, timeout)

    public fun CancelShutdown() = ABI.IShutdownManagerStatics_Instance.CancelShutdown()
  }
}
