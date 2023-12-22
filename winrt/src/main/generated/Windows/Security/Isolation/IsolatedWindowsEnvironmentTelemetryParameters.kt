package Windows.Security.Isolation

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

@ABIMarker(IsolatedWindowsEnvironmentTelemetryParameters.ABI::class)
@Signature("rc(Windows.Security.Isolation.IsolatedWindowsEnvironmentTelemetryParameters;{ebdb3cab-7a3a-4524-a0f4-f96e284d33cd})")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentTelemetryParameters.ByReference::class)
public class IsolatedWindowsEnvironmentTelemetryParameters(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIsolatedWindowsEnvironmentTelemetryParameters.WithDefault, IWinRTObject {
  private val __247470788_Interface: IIsolatedWindowsEnvironmentTelemetryParameters.WithDefault by
      lazy {
    as_247470788()
  }


  public override val __247470788_Ptr: JNAPointer? by lazy {
    __247470788_Interface.__247470788_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__247470788_Interface)

  public constructor() : this(ABI.activate())

  private fun as_247470788(): IIsolatedWindowsEnvironmentTelemetryParameters.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironmentTelemetryParameters.ABI.makeIIsolatedWindowsEnvironmentTelemetryParameters(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironmentTelemetryParameters>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironmentTelemetryParameters.ABI.makeIIsolatedWindowsEnvironmentTelemetryParameters(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsEnvironmentTelemetryParameters> {
    public override fun getValue() =
        IsolatedWindowsEnvironmentTelemetryParameters(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsEnvironmentTelemetryParameters): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentTelemetryParameters, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Isolation.IsolatedWindowsEnvironmentTelemetryParameters".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress):
        IsolatedWindowsEnvironmentTelemetryParameters {
      val address = segment.toRawLongValue()
      return IsolatedWindowsEnvironmentTelemetryParameters(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsEnvironmentTelemetryParameters): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
