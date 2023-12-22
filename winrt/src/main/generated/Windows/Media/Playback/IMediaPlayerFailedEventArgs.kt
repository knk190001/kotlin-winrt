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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaPlayerFailedEventArgs.ABI::class)
@Signature("{2744e9b9-a7e3-4f16-bac4-7914ebc08301}")
@Guid("2744e9b9a7e34f16bac47914ebc08301")
@WinRTInterface("2744e9b9a7e34f16bac47914ebc08301")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayerFailedEventArgs.ByReference::class)
public interface IMediaPlayerFailedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Error(): MediaPlayerError?

  @InterfaceMethod(1)
  public fun get_ExtendedErrorCode(): HResult?

  @InterfaceMethod(2)
  public fun get_ErrorMessage(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlayerFailedEventArgs> {
    public override fun getValue() = ABI.makeIMediaPlayerFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayerFailedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayerFailedEventArgs {
    public val __1200682318_Ptr: Pointer?

    public val _1200682318_VtblPtr: Pointer?
      get() = __1200682318_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Error(): MediaPlayerError? {
      val fnPtr = _1200682318_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlayerError>()
      val hr = fn.invokeHR(arrayOf(__1200682318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlayerError>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedErrorCode(): HResult? {
      val fnPtr = _1200682318_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1200682318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ErrorMessage(): String? {
      val fnPtr = _1200682318_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1200682318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlayerFailedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1200682318_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayerFailedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2744e9b9a7e34f16bac47914ebc08301")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayerFailedEventArgs(ptr: Pointer?): WithDefault =
        IMediaPlayerFailedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayerFailedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaPlayerFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayerFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1200682318_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayerFailedEventArgs):
        Array<IMediaPlayerFailedEventArgs?> = (elements as
        Array<IMediaPlayerFailedEventArgs?>).castToImpl<IMediaPlayerFailedEventArgs,IMediaPlayerFailedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayerFailedEventArgs?> =
        arrayOfNulls<IMediaPlayerFailedEventArgs_Impl>(size) as Array<IMediaPlayerFailedEventArgs?>
  }
}
