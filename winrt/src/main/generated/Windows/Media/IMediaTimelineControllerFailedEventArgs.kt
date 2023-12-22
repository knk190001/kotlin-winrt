package Windows.Media

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

@ABIMarker(IMediaTimelineControllerFailedEventArgs.ABI::class)
@Signature("{8821f81d-3e77-43fb-be26-4fc87a044834}")
@Guid("8821f81d3e7743fbbe264fc87a044834")
@WinRTInterface("8821f81d3e7743fbbe264fc87a044834")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaTimelineControllerFailedEventArgs.ByReference::class)
public interface IMediaTimelineControllerFailedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaTimelineControllerFailedEventArgs> {
    public override fun getValue() =
        ABI.makeIMediaTimelineControllerFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaTimelineControllerFailedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaTimelineControllerFailedEventArgs {
    public val __357794327_Ptr: Pointer?

    public val _357794327_VtblPtr: Pointer?
      get() = __357794327_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _357794327_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__357794327_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IMediaTimelineControllerFailedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __357794327_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaTimelineControllerFailedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8821f81d3e7743fbbe264fc87a044834")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaTimelineControllerFailedEventArgs(ptr: Pointer?): WithDefault =
        IMediaTimelineControllerFailedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMediaTimelineControllerFailedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaTimelineControllerFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaTimelineControllerFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__357794327_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaTimelineControllerFailedEventArgs):
        Array<IMediaTimelineControllerFailedEventArgs?> = (elements as
        Array<IMediaTimelineControllerFailedEventArgs?>).castToImpl<IMediaTimelineControllerFailedEventArgs,IMediaTimelineControllerFailedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaTimelineControllerFailedEventArgs?> =
        arrayOfNulls<IMediaTimelineControllerFailedEventArgs_Impl>(size) as
        Array<IMediaTimelineControllerFailedEventArgs?>
  }
}
