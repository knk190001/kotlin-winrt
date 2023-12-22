package Windows.Devices.Geolocation

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

@ABIMarker(IGeocoordinateWithPoint.ABI::class)
@Signature("{feea0525-d22c-4d46-b527-0b96066fc7db}")
@Guid("feea0525d22c4d46b5270b96066fc7db")
@WinRTInterface("feea0525d22c4d46b5270b96066fc7db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeocoordinateWithPoint.ByReference::class)
public interface IGeocoordinateWithPoint : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Point(): Geopoint?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeocoordinateWithPoint> {
    public override fun getValue() = ABI.makeIGeocoordinateWithPoint(pointer.getPointer(0))

    public fun setValue(value: IGeocoordinateWithPoint_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeocoordinateWithPoint {
    public val __468313824_Ptr: Pointer?

    public val _468313824_VtblPtr: Pointer?
      get() = __468313824_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Point(): Geopoint? {
      val fnPtr = _468313824_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__468313824_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }
  }

  public class IGeocoordinateWithPoint_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __468313824_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeocoordinateWithPoint, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("feea0525d22c4d46b5270b96066fc7db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeocoordinateWithPoint(ptr: Pointer?): WithDefault =
        IGeocoordinateWithPoint_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeocoordinateWithPoint {
      val address = segment.toRawLongValue()
      return makeIGeocoordinateWithPoint(Pointer(address))
    }

    public override fun toNative(obj: IGeocoordinateWithPoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__468313824_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeocoordinateWithPoint): Array<IGeocoordinateWithPoint?>
        = (elements as
        Array<IGeocoordinateWithPoint?>).castToImpl<IGeocoordinateWithPoint,IGeocoordinateWithPoint_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeocoordinateWithPoint?> =
        arrayOfNulls<IGeocoordinateWithPoint_Impl>(size) as Array<IGeocoordinateWithPoint?>
  }
}
