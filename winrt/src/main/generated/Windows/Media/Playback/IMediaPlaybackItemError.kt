package Windows.Media.Playback

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

@ABIMarker(IMediaPlaybackItemError.ABI::class)
@Signature("{69fbef2b-dcd6-4df9-a450-dbf4c6f1c2c2}")
@Guid("69fbef2bdcd64df9a450dbf4c6f1c2c2")
@WinRTInterface("69fbef2bdcd64df9a450dbf4c6f1c2c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackItemError.ByReference::class)
public interface IMediaPlaybackItemError : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ErrorCode(): MediaPlaybackItemErrorCode?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackItemError> {
    public override fun getValue() = ABI.makeIMediaPlaybackItemError(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackItemError_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackItemError {
    public val __1468555025_Ptr: Pointer?

    public val _1468555025_VtblPtr: Pointer?
      get() = __1468555025_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ErrorCode(): MediaPlaybackItemErrorCode? {
      val fnPtr = _1468555025_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItemErrorCode>()
      val hr = fn.invokeHR(arrayOf(__1468555025_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItemErrorCode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1468555025_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1468555025_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlaybackItemError_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1468555025_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackItemError, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("69fbef2bdcd64df9a450dbf4c6f1c2c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackItemError(ptr: Pointer?): WithDefault =
        IMediaPlaybackItemError_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackItemError {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackItemError(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackItemError): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1468555025_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackItemError): Array<IMediaPlaybackItemError?>
        = (elements as
        Array<IMediaPlaybackItemError?>).castToImpl<IMediaPlaybackItemError,IMediaPlaybackItemError_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackItemError?> =
        arrayOfNulls<IMediaPlaybackItemError_Impl>(size) as Array<IMediaPlaybackItemError?>
  }
}
