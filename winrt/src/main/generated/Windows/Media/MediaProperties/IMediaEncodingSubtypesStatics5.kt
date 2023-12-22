package Windows.Media.MediaProperties

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

@ABIMarker(IMediaEncodingSubtypesStatics5.ABI::class)
@Signature("{5ad4a007-ffce-4760-9828-5d0c99637e6a}")
@Guid("5ad4a007ffce476098285d0c99637e6a")
@WinRTInterface("5ad4a007ffce476098285d0c99637e6a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaEncodingSubtypesStatics5.ByReference::class)
public interface IMediaEncodingSubtypesStatics5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Heif(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaEncodingSubtypesStatics5> {
    public override fun getValue() = ABI.makeIMediaEncodingSubtypesStatics5(pointer.getPointer(0))

    public fun setValue(value: IMediaEncodingSubtypesStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaEncodingSubtypesStatics5 {
    public val __2147278023_Ptr: Pointer?

    public val _2147278023_VtblPtr: Pointer?
      get() = __2147278023_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Heif(): String? {
      val fnPtr = _2147278023_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147278023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMediaEncodingSubtypesStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2147278023_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaEncodingSubtypesStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5ad4a007ffce476098285d0c99637e6a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaEncodingSubtypesStatics5(ptr: Pointer?): WithDefault =
        IMediaEncodingSubtypesStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaEncodingSubtypesStatics5 {
      val address = segment.toRawLongValue()
      return makeIMediaEncodingSubtypesStatics5(Pointer(address))
    }

    public override fun toNative(obj: IMediaEncodingSubtypesStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2147278023_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaEncodingSubtypesStatics5):
        Array<IMediaEncodingSubtypesStatics5?> = (elements as
        Array<IMediaEncodingSubtypesStatics5?>).castToImpl<IMediaEncodingSubtypesStatics5,IMediaEncodingSubtypesStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaEncodingSubtypesStatics5?> =
        arrayOfNulls<IMediaEncodingSubtypesStatics5_Impl>(size) as
        Array<IMediaEncodingSubtypesStatics5?>
  }
}
