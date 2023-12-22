package Windows.Media.Core

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

@ABIMarker(IMediaStreamSourceSwitchStreamsRequestedEventArgs.ABI::class)
@Signature("{42202b72-6ea1-4677-981e-350a0da412aa}")
@Guid("42202b726ea14677981e350a0da412aa")
@WinRTInterface("42202b726ea14677981e350a0da412aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSourceSwitchStreamsRequestedEventArgs.ByReference::class)
public interface IMediaStreamSourceSwitchStreamsRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): MediaStreamSourceSwitchStreamsRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSourceSwitchStreamsRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIMediaStreamSourceSwitchStreamsRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSourceSwitchStreamsRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSourceSwitchStreamsRequestedEventArgs {
    public val __1688414370_Ptr: Pointer?

    public val _1688414370_VtblPtr: Pointer?
      get() = __1688414370_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): MediaStreamSourceSwitchStreamsRequest? {
      val fnPtr = _1688414370_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSourceSwitchStreamsRequest>()
      val hr = fn.invokeHR(arrayOf(__1688414370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamSourceSwitchStreamsRequest>(result.getValue())
      return resultValue
    }
  }

  public class IMediaStreamSourceSwitchStreamsRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1688414370_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSourceSwitchStreamsRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("42202b726ea14677981e350a0da412aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSourceSwitchStreamsRequestedEventArgs(ptr: Pointer?): WithDefault =
        IMediaStreamSourceSwitchStreamsRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMediaStreamSourceSwitchStreamsRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSourceSwitchStreamsRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSourceSwitchStreamsRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1688414370_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSourceSwitchStreamsRequestedEventArgs):
        Array<IMediaStreamSourceSwitchStreamsRequestedEventArgs?> = (elements as
        Array<IMediaStreamSourceSwitchStreamsRequestedEventArgs?>).castToImpl<IMediaStreamSourceSwitchStreamsRequestedEventArgs,IMediaStreamSourceSwitchStreamsRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IMediaStreamSourceSwitchStreamsRequestedEventArgs?> =
        arrayOfNulls<IMediaStreamSourceSwitchStreamsRequestedEventArgs_Impl>(size) as
        Array<IMediaStreamSourceSwitchStreamsRequestedEventArgs?>
  }
}
