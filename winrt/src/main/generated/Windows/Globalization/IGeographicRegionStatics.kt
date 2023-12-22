package Windows.Globalization

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGeographicRegionStatics.ABI::class)
@Signature("{29e28974-7ad9-4ef4-8799-b3b44fadec08}")
@Guid("29e289747ad94ef48799b3b44fadec08")
@WinRTInterface("29e289747ad94ef48799b3b44fadec08")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeographicRegionStatics.ByReference::class)
public interface IGeographicRegionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsSupported(geographicRegionCode: String?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeographicRegionStatics> {
    public override fun getValue() = ABI.makeIGeographicRegionStatics(pointer.getPointer(0))

    public fun setValue(value: IGeographicRegionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeographicRegionStatics {
    public val __1392274279_Ptr: Pointer?

    public val _1392274279_VtblPtr: Pointer?
      get() = __1392274279_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSupported(geographicRegionCode: String?): Boolean {
      val fnPtr = _1392274279_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1392274279_Ptr, marshalToNative(geographicRegionCode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IGeographicRegionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1392274279_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeographicRegionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("29e289747ad94ef48799b3b44fadec08")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeographicRegionStatics(ptr: Pointer?): WithDefault =
        IGeographicRegionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeographicRegionStatics {
      val address = segment.toRawLongValue()
      return makeIGeographicRegionStatics(Pointer(address))
    }

    public override fun toNative(obj: IGeographicRegionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1392274279_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeographicRegionStatics):
        Array<IGeographicRegionStatics?> = (elements as
        Array<IGeographicRegionStatics?>).castToImpl<IGeographicRegionStatics,IGeographicRegionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeographicRegionStatics?> =
        arrayOfNulls<IGeographicRegionStatics_Impl>(size) as Array<IGeographicRegionStatics?>
  }
}
