package Windows.System.Diagnostics.Telemetry

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PlatformTelemetryRegistrationSettings.ABI::class)
@Signature("rc(Windows.System.Diagnostics.Telemetry.PlatformTelemetryRegistrationSettings;{819a8582-ca19-415e-bb79-9c224bfa3a73})")
@WinRTByReference(brClass = PlatformTelemetryRegistrationSettings.ByReference::class)
public class PlatformTelemetryRegistrationSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlatformTelemetryRegistrationSettings.WithDefault, IWinRTObject {
  private val __782499940_Interface: IPlatformTelemetryRegistrationSettings.WithDefault by lazy {
    as_782499940()
  }


  public override val __782499940_Ptr: JNAPointer? by lazy {
    __782499940_Interface.__782499940_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__782499940_Interface)

  public constructor() : this(ABI.activate())

  private fun as_782499940(): IPlatformTelemetryRegistrationSettings.WithDefault {
    if(pointer == NULL) {
      return(IPlatformTelemetryRegistrationSettings.ABI.makeIPlatformTelemetryRegistrationSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlatformTelemetryRegistrationSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlatformTelemetryRegistrationSettings.ABI.makeIPlatformTelemetryRegistrationSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlatformTelemetryRegistrationSettings> {
    public override fun getValue() = PlatformTelemetryRegistrationSettings(pointer.getPointer(0))

    public fun setValue(value: PlatformTelemetryRegistrationSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlatformTelemetryRegistrationSettings, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Diagnostics.Telemetry.PlatformTelemetryRegistrationSettings".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): PlatformTelemetryRegistrationSettings {
      val address = segment.toRawLongValue()
      return PlatformTelemetryRegistrationSettings(Pointer(address))
    }

    public override fun toNative(obj: PlatformTelemetryRegistrationSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
