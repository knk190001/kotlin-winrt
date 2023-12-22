package Windows.Media

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaMarkerTypesStatics.ABI::class)
@Signature("{bb198040-482f-4743-8832-45853821ece0}")
@Guid("bb198040482f4743883245853821ece0")
@WinRTInterface("bb198040482f4743883245853821ece0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaMarkerTypesStatics.ByReference::class)
public interface IMediaMarkerTypesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Bookmark(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaMarkerTypesStatics> {
    public override fun getValue() = ABI.makeIMediaMarkerTypesStatics(pointer.getPointer(0))

    public fun setValue(value: IMediaMarkerTypesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaMarkerTypesStatics {
    public val __2098093146_Ptr: Pointer?

    public val _2098093146_VtblPtr: Pointer?
      get() = __2098093146_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Bookmark(): String? {
      val fnPtr = _2098093146_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2098093146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMediaMarkerTypesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2098093146_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaMarkerTypesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bb198040482f4743883245853821ece0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaMarkerTypesStatics(ptr: Pointer?): WithDefault =
        IMediaMarkerTypesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaMarkerTypesStatics {
      val address = segment.toRawLongValue()
      return makeIMediaMarkerTypesStatics(Pointer(address))
    }

    public override fun toNative(obj: IMediaMarkerTypesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2098093146_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaMarkerTypesStatics):
        Array<IMediaMarkerTypesStatics?> = (elements as
        Array<IMediaMarkerTypesStatics?>).castToImpl<IMediaMarkerTypesStatics,IMediaMarkerTypesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaMarkerTypesStatics?> =
        arrayOfNulls<IMediaMarkerTypesStatics_Impl>(size) as Array<IMediaMarkerTypesStatics?>
  }
}
