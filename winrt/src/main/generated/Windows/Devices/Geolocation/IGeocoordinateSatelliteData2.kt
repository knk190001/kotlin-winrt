package Windows.Devices.Geolocation

import Windows.Foundation.IReference
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGeocoordinateSatelliteData2.ABI::class)
@Signature("{761c8cfd-a19d-5a51-80f5-71676115483e}")
@Guid("761c8cfda19d5a5180f571676115483e")
@WinRTInterface("761c8cfda19d5a5180f571676115483e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeocoordinateSatelliteData2.ByReference::class)
public interface IGeocoordinateSatelliteData2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GeometricDilutionOfPrecision(): IReference<Double>?

  @InterfaceMethod(1)
  public fun get_TimeDilutionOfPrecision(): IReference<Double>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeocoordinateSatelliteData2> {
    public override fun getValue() = ABI.makeIGeocoordinateSatelliteData2(pointer.getPointer(0))

    public fun setValue(value: IGeocoordinateSatelliteData2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeocoordinateSatelliteData2 {
    public val __2111634857_Ptr: Pointer?

    public val _2111634857_VtblPtr: Pointer?
      get() = __2111634857_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GeometricDilutionOfPrecision(): IReference<Double>? {
      val fnPtr = _2111634857_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__2111634857_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TimeDilutionOfPrecision(): IReference<Double>? {
      val fnPtr = _2111634857_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__2111634857_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }
  }

  public class IGeocoordinateSatelliteData2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2111634857_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeocoordinateSatelliteData2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("761c8cfda19d5a5180f571676115483e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeocoordinateSatelliteData2(ptr: Pointer?): WithDefault =
        IGeocoordinateSatelliteData2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeocoordinateSatelliteData2 {
      val address = segment.toRawLongValue()
      return makeIGeocoordinateSatelliteData2(Pointer(address))
    }

    public override fun toNative(obj: IGeocoordinateSatelliteData2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2111634857_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeocoordinateSatelliteData2):
        Array<IGeocoordinateSatelliteData2?> = (elements as
        Array<IGeocoordinateSatelliteData2?>).castToImpl<IGeocoordinateSatelliteData2,IGeocoordinateSatelliteData2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeocoordinateSatelliteData2?> =
        arrayOfNulls<IGeocoordinateSatelliteData2_Impl>(size) as
        Array<IGeocoordinateSatelliteData2?>
  }
}
