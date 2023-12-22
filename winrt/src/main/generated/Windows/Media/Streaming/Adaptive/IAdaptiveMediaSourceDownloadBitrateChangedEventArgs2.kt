package Windows.Media.Streaming.Adaptive

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

@ABIMarker(IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2.ABI::class)
@Signature("{f3f1f444-96ae-4de0-b540-2b3246e6968c}")
@Guid("f3f1f44496ae4de0b5402b3246e6968c")
@WinRTInterface("f3f1f44496ae4de0b5402b3246e6968c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2.ByReference::class)
public interface IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2 : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): AdaptiveMediaSourceDownloadBitrateChangedReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2> {
    public override fun getValue() =
        ABI.makeIAdaptiveMediaSourceDownloadBitrateChangedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2 {
    public val __64351681_Ptr: Pointer?

    public val _64351681_VtblPtr: Pointer?
      get() = __64351681_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): AdaptiveMediaSourceDownloadBitrateChangedReason? {
      val fnPtr = _64351681_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdaptiveMediaSourceDownloadBitrateChangedReason>()
      val hr = fn.invokeHR(arrayOf(__64351681_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<AdaptiveMediaSourceDownloadBitrateChangedReason>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __64351681_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f3f1f44496ae4de0b5402b3246e6968c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSourceDownloadBitrateChangedEventArgs2(ptr: Pointer?): WithDefault
        = IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSourceDownloadBitrateChangedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__64351681_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2):
        Array<IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2?> = (elements as
        Array<IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2?>).castToImpl<IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2,IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2?> =
        arrayOfNulls<IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2_Impl>(size) as
        Array<IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2?>
  }
}
