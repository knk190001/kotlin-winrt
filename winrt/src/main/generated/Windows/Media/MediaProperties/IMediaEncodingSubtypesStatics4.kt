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

@ABIMarker(IMediaEncodingSubtypesStatics4.ABI::class)
@Signature("{ddece58a-3949-4644-8a2c-59ef02c642fa}")
@Guid("ddece58a394946448a2c59ef02c642fa")
@WinRTInterface("ddece58a394946448a2c59ef02c642fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaEncodingSubtypesStatics4.ByReference::class)
public interface IMediaEncodingSubtypesStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_P010(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaEncodingSubtypesStatics4> {
    public override fun getValue() = ABI.makeIMediaEncodingSubtypesStatics4(pointer.getPointer(0))

    public fun setValue(value: IMediaEncodingSubtypesStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaEncodingSubtypesStatics4 {
    public val __2147278024_Ptr: Pointer?

    public val _2147278024_VtblPtr: Pointer?
      get() = __2147278024_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_P010(): String? {
      val fnPtr = _2147278024_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147278024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMediaEncodingSubtypesStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2147278024_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaEncodingSubtypesStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ddece58a394946448a2c59ef02c642fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaEncodingSubtypesStatics4(ptr: Pointer?): WithDefault =
        IMediaEncodingSubtypesStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaEncodingSubtypesStatics4 {
      val address = segment.toRawLongValue()
      return makeIMediaEncodingSubtypesStatics4(Pointer(address))
    }

    public override fun toNative(obj: IMediaEncodingSubtypesStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2147278024_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaEncodingSubtypesStatics4):
        Array<IMediaEncodingSubtypesStatics4?> = (elements as
        Array<IMediaEncodingSubtypesStatics4?>).castToImpl<IMediaEncodingSubtypesStatics4,IMediaEncodingSubtypesStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaEncodingSubtypesStatics4?> =
        arrayOfNulls<IMediaEncodingSubtypesStatics4_Impl>(size) as
        Array<IMediaEncodingSubtypesStatics4?>
  }
}
