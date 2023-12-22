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

@ABIMarker(IMediaEncodingSubtypesStatics6.ABI::class)
@Signature("{a1252973-a984-5912-93bb-54e7e569e053}")
@Guid("a1252973a984591293bb54e7e569e053")
@WinRTInterface("a1252973a984591293bb54e7e569e053")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaEncodingSubtypesStatics6.ByReference::class)
public interface IMediaEncodingSubtypesStatics6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Pgs(): String?

  @InterfaceMethod(1)
  public fun get_Srt(): String?

  @InterfaceMethod(2)
  public fun get_Ssa(): String?

  @InterfaceMethod(3)
  public fun get_VobSub(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaEncodingSubtypesStatics6> {
    public override fun getValue() = ABI.makeIMediaEncodingSubtypesStatics6(pointer.getPointer(0))

    public fun setValue(value: IMediaEncodingSubtypesStatics6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaEncodingSubtypesStatics6 {
    public val __2147278022_Ptr: Pointer?

    public val _2147278022_VtblPtr: Pointer?
      get() = __2147278022_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Pgs(): String? {
      val fnPtr = _2147278022_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147278022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Srt(): String? {
      val fnPtr = _2147278022_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147278022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Ssa(): String? {
      val fnPtr = _2147278022_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147278022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_VobSub(): String? {
      val fnPtr = _2147278022_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2147278022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMediaEncodingSubtypesStatics6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2147278022_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaEncodingSubtypesStatics6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a1252973a984591293bb54e7e569e053")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaEncodingSubtypesStatics6(ptr: Pointer?): WithDefault =
        IMediaEncodingSubtypesStatics6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaEncodingSubtypesStatics6 {
      val address = segment.toRawLongValue()
      return makeIMediaEncodingSubtypesStatics6(Pointer(address))
    }

    public override fun toNative(obj: IMediaEncodingSubtypesStatics6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2147278022_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaEncodingSubtypesStatics6):
        Array<IMediaEncodingSubtypesStatics6?> = (elements as
        Array<IMediaEncodingSubtypesStatics6?>).castToImpl<IMediaEncodingSubtypesStatics6,IMediaEncodingSubtypesStatics6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaEncodingSubtypesStatics6?> =
        arrayOfNulls<IMediaEncodingSubtypesStatics6_Impl>(size) as
        Array<IMediaEncodingSubtypesStatics6?>
  }
}
