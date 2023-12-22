package Windows.Media.Streaming.Adaptive

import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
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

@ABIMarker(IAdaptiveMediaSourceDownloadRequestedEventArgs3.ABI::class)
@Signature("{333c50fd-4f62-4481-ab44-1e47b0574225}")
@Guid("333c50fd4f624481ab441e47b0574225")
@WinRTInterface("333c50fd4f624481ab441e47b0574225")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSourceDownloadRequestedEventArgs3.ByReference::class)
public interface IAdaptiveMediaSourceDownloadRequestedEventArgs3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResourceDuration(): IReference<TimeSpan?>?

  @InterfaceMethod(1)
  public fun get_ResourceContentType(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSourceDownloadRequestedEventArgs3> {
    public override fun getValue() =
        ABI.makeIAdaptiveMediaSourceDownloadRequestedEventArgs3(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSourceDownloadRequestedEventArgs3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSourceDownloadRequestedEventArgs3 {
    public val __1612480565_Ptr: Pointer?

    public val _1612480565_VtblPtr: Pointer?
      get() = __1612480565_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResourceDuration(): IReference<TimeSpan?>? {
      val fnPtr = _1612480565_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1612480565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ResourceContentType(): String? {
      val fnPtr = _1612480565_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1612480565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveMediaSourceDownloadRequestedEventArgs3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1612480565_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSourceDownloadRequestedEventArgs3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("333c50fd4f624481ab441e47b0574225")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSourceDownloadRequestedEventArgs3(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSourceDownloadRequestedEventArgs3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAdaptiveMediaSourceDownloadRequestedEventArgs3 {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSourceDownloadRequestedEventArgs3(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSourceDownloadRequestedEventArgs3):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1612480565_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSourceDownloadRequestedEventArgs3):
        Array<IAdaptiveMediaSourceDownloadRequestedEventArgs3?> = (elements as
        Array<IAdaptiveMediaSourceDownloadRequestedEventArgs3?>).castToImpl<IAdaptiveMediaSourceDownloadRequestedEventArgs3,IAdaptiveMediaSourceDownloadRequestedEventArgs3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveMediaSourceDownloadRequestedEventArgs3?>
        = arrayOfNulls<IAdaptiveMediaSourceDownloadRequestedEventArgs3_Impl>(size) as
        Array<IAdaptiveMediaSourceDownloadRequestedEventArgs3?>
  }
}
