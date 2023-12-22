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

@ABIMarker(IGazeInputSourcePreviewStatics.ABI::class)
@Signature("{e79e7ee6-b389-11e7-b201-c8d3ffb75721}")
@Guid("e79e7ee6b38911e7b201c8d3ffb75721")
@WinRTInterface("e79e7ee6b38911e7b201c8d3ffb75721")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGazeInputSourcePreviewStatics.ByReference::class)
public interface IGazeInputSourcePreviewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): GazeInputSourcePreview?

  @InterfaceMethod(1)
  public fun CreateWatcher(): GazeDeviceWatcherPreview?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGazeInputSourcePreviewStatics> {
    public override fun getValue() = ABI.makeIGazeInputSourcePreviewStatics(pointer.getPointer(0))

    public fun setValue(value: IGazeInputSourcePreviewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGazeInputSourcePreviewStatics {
    public val __1896522852_Ptr: Pointer?

    public val _1896522852_VtblPtr: Pointer?
      get() = __1896522852_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): GazeInputSourcePreview? {
      val fnPtr = _1896522852_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GazeInputSourcePreview>()
      val hr = fn.invokeHR(arrayOf(__1896522852_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GazeInputSourcePreview>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWatcher(): GazeDeviceWatcherPreview? {
      val fnPtr = _1896522852_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GazeDeviceWatcherPreview>()
      val hr = fn.invokeHR(arrayOf(__1896522852_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GazeDeviceWatcherPreview>(result.getValue())
      return resultValue
    }
  }

  public class IGazeInputSourcePreviewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1896522852_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGazeInputSourcePreviewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e79e7ee6b38911e7b201c8d3ffb75721")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGazeInputSourcePreviewStatics(ptr: Pointer?): WithDefault =
        IGazeInputSourcePreviewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGazeInputSourcePreviewStatics {
      val address = segment.toRawLongValue()
      return makeIGazeInputSourcePreviewStatics(Pointer(address))
    }

    public override fun toNative(obj: IGazeInputSourcePreviewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1896522852_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGazeInputSourcePreviewStatics):
        Array<IGazeInputSourcePreviewStatics?> = (elements as
        Array<IGazeInputSourcePreviewStatics?>).castToImpl<IGazeInputSourcePreviewStatics,IGazeInputSourcePreviewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGazeInputSourcePreviewStatics?> =
        arrayOfNulls<IGazeInputSourcePreviewStatics_Impl>(size) as
        Array<IGazeInputSourcePreviewStatics?>
  }
}
