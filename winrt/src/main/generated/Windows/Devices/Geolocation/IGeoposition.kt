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

@ABIMarker(IGeoposition.ABI::class)
@Signature("{c18d0454-7d41-4ff7-a957-9dffb4ef7f5b}")
@Guid("c18d04547d414ff7a9579dffb4ef7f5b")
@WinRTInterface("c18d04547d414ff7a9579dffb4ef7f5b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeoposition.ByReference::class)
public interface IGeoposition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Coordinate(): Geocoordinate?

  @InterfaceMethod(1)
  public fun get_CivicAddress(): CivicAddress?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGeoposition> {
    public override fun getValue() = ABI.makeIGeoposition(pointer.getPointer(0))

    public fun setValue(value: IGeoposition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeoposition {
    public val __1332701541_Ptr: Pointer?

    public val _1332701541_VtblPtr: Pointer?
      get() = __1332701541_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Coordinate(): Geocoordinate? {
      val fnPtr = _1332701541_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geocoordinate>()
      val hr = fn.invokeHR(arrayOf(__1332701541_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geocoordinate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CivicAddress(): CivicAddress? {
      val fnPtr = _1332701541_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CivicAddress>()
      val hr = fn.invokeHR(arrayOf(__1332701541_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CivicAddress>(result.getValue())
      return resultValue
    }
  }

  public class IGeoposition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1332701541_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeoposition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c18d04547d414ff7a9579dffb4ef7f5b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeoposition(ptr: Pointer?): WithDefault = IGeoposition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeoposition {
      val address = segment.toRawLongValue()
      return makeIGeoposition(Pointer(address))
    }

    public override fun toNative(obj: IGeoposition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1332701541_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeoposition): Array<IGeoposition?> = (elements as
        Array<IGeoposition?>).castToImpl<IGeoposition,IGeoposition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeoposition?> =
        arrayOfNulls<IGeoposition_Impl>(size) as Array<IGeoposition?>
  }
}
