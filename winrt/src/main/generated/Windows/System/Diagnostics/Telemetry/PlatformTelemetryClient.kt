package Windows.System.Diagnostics.Telemetry

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

@ABIMarker(PlatformTelemetryClient.ABI::class)
@WinRTByReference(brClass = PlatformTelemetryClient.ByReference::class)
public class PlatformTelemetryClient(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlatformTelemetryClient> {
    public override fun getValue() = PlatformTelemetryClient(pointer.getPointer(0))

    public fun setValue(value: PlatformTelemetryClient): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlatformTelemetryClient, MemoryAddress> {
    public val IPlatformTelemetryClientStatics_Instance: IPlatformTelemetryClientStatics by lazy {
      createIPlatformTelemetryClientStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPlatformTelemetryClientStatics(): IPlatformTelemetryClientStatics {
      val refiid = Guid.REFIID(IPlatformTelemetryClientStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Diagnostics.Telemetry.PlatformTelemetryClient".toHandle(),refiid,interfacePtr)
      val result =
          IPlatformTelemetryClientStatics.ABI.makeIPlatformTelemetryClientStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PlatformTelemetryClient {
      val address = segment.toRawLongValue()
      return PlatformTelemetryClient(Pointer(address))
    }

    public override fun toNative(obj: PlatformTelemetryClient): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Register(id: String) = ABI.IPlatformTelemetryClientStatics_Instance.Register(id)

    public fun Register(id: String, settings: PlatformTelemetryRegistrationSettings) =
        ABI.IPlatformTelemetryClientStatics_Instance.Register(id, settings)
  }
}
