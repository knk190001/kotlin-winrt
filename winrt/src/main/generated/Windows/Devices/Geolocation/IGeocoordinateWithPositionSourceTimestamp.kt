package Windows.Devices.Geolocation

import Windows.Foundation.DateTime
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGeocoordinateWithPositionSourceTimestamp.ABI::class)
@Signature("{8543fc02-c9f1-4610-afe0-8bc3a6a87036}")
@Guid("8543fc02c9f14610afe08bc3a6a87036")
@WinRTInterface("8543fc02c9f14610afe08bc3a6a87036")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeocoordinateWithPositionSourceTimestamp.ByReference::class)
public interface IGeocoordinateWithPositionSourceTimestamp : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PositionSourceTimestamp(): IReference<DateTime?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeocoordinateWithPositionSourceTimestamp> {
    public override fun getValue() =
        ABI.makeIGeocoordinateWithPositionSourceTimestamp(pointer.getPointer(0))

    public fun setValue(value: IGeocoordinateWithPositionSourceTimestamp_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeocoordinateWithPositionSourceTimestamp {
    public val __299521634_Ptr: Pointer?

    public val _299521634_VtblPtr: Pointer?
      get() = __299521634_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PositionSourceTimestamp(): IReference<DateTime?>? {
      val fnPtr = _299521634_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__299521634_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }
  }

  public class IGeocoordinateWithPositionSourceTimestamp_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __299521634_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeocoordinateWithPositionSourceTimestamp, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8543fc02c9f14610afe08bc3a6a87036")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeocoordinateWithPositionSourceTimestamp(ptr: Pointer?): WithDefault =
        IGeocoordinateWithPositionSourceTimestamp_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGeocoordinateWithPositionSourceTimestamp {
      val address = segment.toRawLongValue()
      return makeIGeocoordinateWithPositionSourceTimestamp(Pointer(address))
    }

    public override fun toNative(obj: IGeocoordinateWithPositionSourceTimestamp): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__299521634_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeocoordinateWithPositionSourceTimestamp):
        Array<IGeocoordinateWithPositionSourceTimestamp?> = (elements as
        Array<IGeocoordinateWithPositionSourceTimestamp?>).castToImpl<IGeocoordinateWithPositionSourceTimestamp,IGeocoordinateWithPositionSourceTimestamp_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeocoordinateWithPositionSourceTimestamp?> =
        arrayOfNulls<IGeocoordinateWithPositionSourceTimestamp_Impl>(size) as
        Array<IGeocoordinateWithPositionSourceTimestamp?>
  }
}
