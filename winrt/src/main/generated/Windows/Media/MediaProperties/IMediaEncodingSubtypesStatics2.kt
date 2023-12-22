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

@ABIMarker(IMediaEncodingSubtypesStatics2.ABI::class)
@Signature("{4b7cd23d-42ff-4d33-8531-0626bee4b52d}")
@Guid("4b7cd23d42ff4d3385310626bee4b52d")
@WinRTInterface("4b7cd23d42ff4d3385310626bee4b52d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaEncodingSubtypesStatics2.ByReference::class)
public interface IMediaEncodingSubtypesStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Vp9(): String?

  @InterfaceMethod(1)
  public fun get_L8(): String?

  @InterfaceMethod(2)
  public fun get_L16(): String?

  @InterfaceMethod(3)
  public fun get_D16(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaEncodingSubtypesStatics2> {
    public override fun getValue() = ABI.makeIMediaEncodingSubtypesStatics2(pointer.getPointer(0))

    public fun setValue(value: IMediaEncodingSubtypesStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaEncodingSubtypesStatics2 {
    public val __2147278026_Ptr: Pointer?

    public val _2147278026_VtblPtr: Pointer?
      get() = __2147278026_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Vp9(): String? {
      val fnPtr = _2147278026_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147278026_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_L8(): String? {
      val fnPtr = _2147278026_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147278026_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_L16(): String? {
      val fnPtr = _2147278026_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147278026_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_D16(): String? {
      val fnPtr = _2147278026_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147278026_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMediaEncodingSubtypesStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2147278026_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaEncodingSubtypesStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4b7cd23d42ff4d3385310626bee4b52d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaEncodingSubtypesStatics2(ptr: Pointer?): WithDefault =
        IMediaEncodingSubtypesStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaEncodingSubtypesStatics2 {
      val address = segment.toRawLongValue()
      return makeIMediaEncodingSubtypesStatics2(Pointer(address))
    }

    public override fun toNative(obj: IMediaEncodingSubtypesStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2147278026_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaEncodingSubtypesStatics2):
        Array<IMediaEncodingSubtypesStatics2?> = (elements as
        Array<IMediaEncodingSubtypesStatics2?>).castToImpl<IMediaEncodingSubtypesStatics2,IMediaEncodingSubtypesStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaEncodingSubtypesStatics2?> =
        arrayOfNulls<IMediaEncodingSubtypesStatics2_Impl>(size) as
        Array<IMediaEncodingSubtypesStatics2?>
  }
}
