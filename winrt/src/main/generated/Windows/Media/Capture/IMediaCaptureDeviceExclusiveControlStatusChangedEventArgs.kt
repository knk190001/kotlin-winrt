package Windows.Media.Capture

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

@ABIMarker(IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs.ABI::class)
@Signature("{9d2f920d-a588-43c6-89d6-5ad322af006a}")
@Guid("9d2f920da58843c689d65ad322af006a")
@WinRTInterface("9d2f920da58843c689d65ad322af006a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs.ByReference::class)
public interface IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_Status(): MediaCaptureDeviceExclusiveControlStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIMediaCaptureDeviceExclusiveControlStatusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs {
    public val __1881799740_Ptr: Pointer?

    public val _1881799740_VtblPtr: Pointer?
      get() = __1881799740_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1881799740_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1881799740_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): MediaCaptureDeviceExclusiveControlStatus? {
      val fnPtr = _1881799740_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaCaptureDeviceExclusiveControlStatus>()
      val hr = fn.invokeHR(arrayOf(__1881799740_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaCaptureDeviceExclusiveControlStatus>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1881799740_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs, MemoryAddress>
      {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d2f920da58843c689d65ad322af006a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCaptureDeviceExclusiveControlStatusChangedEventArgs(ptr: Pointer?):
        WithDefault = IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaCaptureDeviceExclusiveControlStatusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1881799740_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs):
        Array<IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs?> = (elements as
        Array<IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs?>).castToImpl<IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs,IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs?> =
        arrayOfNulls<IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs_Impl>(size) as
        Array<IMediaCaptureDeviceExclusiveControlStatusChangedEventArgs?>
  }
}
