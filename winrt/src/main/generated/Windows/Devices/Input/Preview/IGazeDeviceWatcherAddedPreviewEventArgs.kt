package Windows.Devices.Input.Preview

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

@ABIMarker(IGazeDeviceWatcherAddedPreviewEventArgs.ABI::class)
@Signature("{e79e7eed-b389-11e7-b201-c8d3ffb75721}")
@Guid("e79e7eedb38911e7b201c8d3ffb75721")
@WinRTInterface("e79e7eedb38911e7b201c8d3ffb75721")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGazeDeviceWatcherAddedPreviewEventArgs.ByReference::class)
public interface IGazeDeviceWatcherAddedPreviewEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Device(): GazeDevicePreview?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGazeDeviceWatcherAddedPreviewEventArgs> {
    public override fun getValue() =
        ABI.makeIGazeDeviceWatcherAddedPreviewEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGazeDeviceWatcherAddedPreviewEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGazeDeviceWatcherAddedPreviewEventArgs {
    public val __1360862799_Ptr: Pointer?

    public val _1360862799_VtblPtr: Pointer?
      get() = __1360862799_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Device(): GazeDevicePreview? {
      val fnPtr = _1360862799_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GazeDevicePreview>()
      val hr = fn.invokeHR(arrayOf(__1360862799_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GazeDevicePreview>(result.getValue())
      return resultValue
    }
  }

  public class IGazeDeviceWatcherAddedPreviewEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1360862799_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGazeDeviceWatcherAddedPreviewEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e79e7eedb38911e7b201c8d3ffb75721")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGazeDeviceWatcherAddedPreviewEventArgs(ptr: Pointer?): WithDefault =
        IGazeDeviceWatcherAddedPreviewEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGazeDeviceWatcherAddedPreviewEventArgs {
      val address = segment.toRawLongValue()
      return makeIGazeDeviceWatcherAddedPreviewEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGazeDeviceWatcherAddedPreviewEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1360862799_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGazeDeviceWatcherAddedPreviewEventArgs):
        Array<IGazeDeviceWatcherAddedPreviewEventArgs?> = (elements as
        Array<IGazeDeviceWatcherAddedPreviewEventArgs?>).castToImpl<IGazeDeviceWatcherAddedPreviewEventArgs,IGazeDeviceWatcherAddedPreviewEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGazeDeviceWatcherAddedPreviewEventArgs?> =
        arrayOfNulls<IGazeDeviceWatcherAddedPreviewEventArgs_Impl>(size) as
        Array<IGazeDeviceWatcherAddedPreviewEventArgs?>
  }
}
