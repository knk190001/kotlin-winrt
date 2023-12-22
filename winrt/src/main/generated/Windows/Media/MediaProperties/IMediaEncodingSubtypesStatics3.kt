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

@ABIMarker(IMediaEncodingSubtypesStatics3.ABI::class)
@Signature("{ba2414e4-883d-464e-a44f-097da08ef7ff}")
@Guid("ba2414e4883d464ea44f097da08ef7ff")
@WinRTInterface("ba2414e4883d464ea44f097da08ef7ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaEncodingSubtypesStatics3.ByReference::class)
public interface IMediaEncodingSubtypesStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Alac(): String?

  @InterfaceMethod(1)
  public fun get_Flac(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaEncodingSubtypesStatics3> {
    public override fun getValue() = ABI.makeIMediaEncodingSubtypesStatics3(pointer.getPointer(0))

    public fun setValue(value: IMediaEncodingSubtypesStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaEncodingSubtypesStatics3 {
    public val __2147278025_Ptr: Pointer?

    public val _2147278025_VtblPtr: Pointer?
      get() = __2147278025_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Alac(): String? {
      val fnPtr = _2147278025_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147278025_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Flac(): String? {
      val fnPtr = _2147278025_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147278025_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMediaEncodingSubtypesStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2147278025_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaEncodingSubtypesStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ba2414e4883d464ea44f097da08ef7ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaEncodingSubtypesStatics3(ptr: Pointer?): WithDefault =
        IMediaEncodingSubtypesStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaEncodingSubtypesStatics3 {
      val address = segment.toRawLongValue()
      return makeIMediaEncodingSubtypesStatics3(Pointer(address))
    }

    public override fun toNative(obj: IMediaEncodingSubtypesStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2147278025_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaEncodingSubtypesStatics3):
        Array<IMediaEncodingSubtypesStatics3?> = (elements as
        Array<IMediaEncodingSubtypesStatics3?>).castToImpl<IMediaEncodingSubtypesStatics3,IMediaEncodingSubtypesStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaEncodingSubtypesStatics3?> =
        arrayOfNulls<IMediaEncodingSubtypesStatics3_Impl>(size) as
        Array<IMediaEncodingSubtypesStatics3?>
  }
}
