package Windows.System.Power.Diagnostics

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

@ABIMarker(BackgroundEnergyDiagnostics.ABI::class)
@WinRTByReference(brClass = BackgroundEnergyDiagnostics.ByReference::class)
public class BackgroundEnergyDiagnostics(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundEnergyDiagnostics> {
    public override fun getValue() = BackgroundEnergyDiagnostics(pointer.getPointer(0))

    public fun setValue(value: BackgroundEnergyDiagnostics): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundEnergyDiagnostics, MemoryAddress> {
    public val IBackgroundEnergyDiagnosticsStatics_Instance: IBackgroundEnergyDiagnosticsStatics by
        lazy {
      createIBackgroundEnergyDiagnosticsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBackgroundEnergyDiagnosticsStatics(): IBackgroundEnergyDiagnosticsStatics {
      val refiid = Guid.REFIID(IBackgroundEnergyDiagnosticsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Power.Diagnostics.BackgroundEnergyDiagnostics".toHandle(),refiid,interfacePtr)
      val result =
          IBackgroundEnergyDiagnosticsStatics.ABI.makeIBackgroundEnergyDiagnosticsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BackgroundEnergyDiagnostics {
      val address = segment.toRawLongValue()
      return BackgroundEnergyDiagnostics(Pointer(address))
    }

    public override fun toNative(obj: BackgroundEnergyDiagnostics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DeviceSpecificConversionFactor() =
        ABI.IBackgroundEnergyDiagnosticsStatics_Instance.get_DeviceSpecificConversionFactor()

    public fun ComputeTotalEnergyUsage() =
        ABI.IBackgroundEnergyDiagnosticsStatics_Instance.ComputeTotalEnergyUsage()

    public fun ResetTotalEnergyUsage() =
        ABI.IBackgroundEnergyDiagnosticsStatics_Instance.ResetTotalEnergyUsage()
  }
}
