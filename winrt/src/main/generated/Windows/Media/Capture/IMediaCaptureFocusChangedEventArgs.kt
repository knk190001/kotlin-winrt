package Windows.Media.Capture

import Windows.Media.Devices.MediaCaptureFocusState
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

@ABIMarker(IMediaCaptureFocusChangedEventArgs.ABI::class)
@Signature("{81e1bc7f-2277-493e-abee-d3f44ff98c04}")
@Guid("81e1bc7f2277493eabeed3f44ff98c04")
@WinRTInterface("81e1bc7f2277493eabeed3f44ff98c04")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCaptureFocusChangedEventArgs.ByReference::class)
public interface IMediaCaptureFocusChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FocusState(): MediaCaptureFocusState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCaptureFocusChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIMediaCaptureFocusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaCaptureFocusChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCaptureFocusChangedEventArgs {
    public val __242563265_Ptr: Pointer?

    public val _242563265_VtblPtr: Pointer?
      get() = __242563265_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FocusState(): MediaCaptureFocusState? {
      val fnPtr = _242563265_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaCaptureFocusState>()
      val hr = fn.invokeHR(arrayOf(__242563265_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaCaptureFocusState>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCaptureFocusChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __242563265_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCaptureFocusChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("81e1bc7f2277493eabeed3f44ff98c04")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCaptureFocusChangedEventArgs(ptr: Pointer?): WithDefault =
        IMediaCaptureFocusChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCaptureFocusChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaCaptureFocusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaCaptureFocusChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__242563265_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCaptureFocusChangedEventArgs):
        Array<IMediaCaptureFocusChangedEventArgs?> = (elements as
        Array<IMediaCaptureFocusChangedEventArgs?>).castToImpl<IMediaCaptureFocusChangedEventArgs,IMediaCaptureFocusChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCaptureFocusChangedEventArgs?> =
        arrayOfNulls<IMediaCaptureFocusChangedEventArgs_Impl>(size) as
        Array<IMediaCaptureFocusChangedEventArgs?>
  }
}
