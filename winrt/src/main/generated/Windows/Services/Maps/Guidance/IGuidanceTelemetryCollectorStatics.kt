package Windows.Services.Maps.Guidance

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGuidanceTelemetryCollectorStatics.ABI::class)
@Signature("{36532047-f160-44fb-b578-94577ca05990}")
@Guid("36532047f16044fbb57894577ca05990")
@WinRTInterface("36532047f16044fbb57894577ca05990")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGuidanceTelemetryCollectorStatics.ByReference::class)
public interface IGuidanceTelemetryCollectorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrent(): GuidanceTelemetryCollector?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGuidanceTelemetryCollectorStatics> {
    public override fun getValue() =
        ABI.makeIGuidanceTelemetryCollectorStatics(pointer.getPointer(0))

    public fun setValue(value: IGuidanceTelemetryCollectorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGuidanceTelemetryCollectorStatics {
    public val __187337050_Ptr: Pointer?

    public val _187337050_VtblPtr: Pointer?
      get() = __187337050_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrent(): GuidanceTelemetryCollector? {
      val fnPtr = _187337050_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GuidanceTelemetryCollector>()
      val hr = fn.invokeHR(arrayOf(__187337050_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GuidanceTelemetryCollector>(result.getValue())
      return resultValue
    }
  }

  public class IGuidanceTelemetryCollectorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __187337050_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGuidanceTelemetryCollectorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("36532047f16044fbb57894577ca05990")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGuidanceTelemetryCollectorStatics(ptr: Pointer?): WithDefault =
        IGuidanceTelemetryCollectorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGuidanceTelemetryCollectorStatics {
      val address = segment.toRawLongValue()
      return makeIGuidanceTelemetryCollectorStatics(Pointer(address))
    }

    public override fun toNative(obj: IGuidanceTelemetryCollectorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__187337050_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGuidanceTelemetryCollectorStatics):
        Array<IGuidanceTelemetryCollectorStatics?> = (elements as
        Array<IGuidanceTelemetryCollectorStatics?>).castToImpl<IGuidanceTelemetryCollectorStatics,IGuidanceTelemetryCollectorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGuidanceTelemetryCollectorStatics?> =
        arrayOfNulls<IGuidanceTelemetryCollectorStatics_Impl>(size) as
        Array<IGuidanceTelemetryCollectorStatics?>
  }
}
