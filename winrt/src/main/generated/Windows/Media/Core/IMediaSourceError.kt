package Windows.Media.Core

import Windows.Foundation.HResult
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

@ABIMarker(IMediaSourceError.ABI::class)
@Signature("{5c0a8965-37c5-4e9d-8d21-1cdee90cecc6}")
@Guid("5c0a896537c54e9d8d211cdee90cecc6")
@WinRTInterface("5c0a896537c54e9d8d211cdee90cecc6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaSourceError.ByReference::class)
public interface IMediaSourceError : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaSourceError> {
    public override fun getValue() = ABI.makeIMediaSourceError(pointer.getPointer(0))

    public fun setValue(value: IMediaSourceError_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaSourceError {
    public val __1115160830_Ptr: Pointer?

    public val _1115160830_VtblPtr: Pointer?
      get() = __1115160830_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1115160830_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1115160830_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IMediaSourceError_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1115160830_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaSourceError, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c0a896537c54e9d8d211cdee90cecc6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaSourceError(ptr: Pointer?): WithDefault = IMediaSourceError_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaSourceError {
      val address = segment.toRawLongValue()
      return makeIMediaSourceError(Pointer(address))
    }

    public override fun toNative(obj: IMediaSourceError): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1115160830_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaSourceError): Array<IMediaSourceError?> = (elements
        as Array<IMediaSourceError?>).castToImpl<IMediaSourceError,IMediaSourceError_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaSourceError?> =
        arrayOfNulls<IMediaSourceError_Impl>(size) as Array<IMediaSourceError?>
  }
}
