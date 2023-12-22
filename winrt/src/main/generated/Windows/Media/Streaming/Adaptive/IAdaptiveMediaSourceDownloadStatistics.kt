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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IAdaptiveMediaSourceDownloadStatistics.ABI::class)
@Signature("{a306cefb-e96a-4dff-a9b8-1ae08c01ae98}")
@Guid("a306cefbe96a4dffa9b81ae08c01ae98")
@WinRTInterface("a306cefbe96a4dffa9b81ae08c01ae98")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSourceDownloadStatistics.ByReference::class)
public interface IAdaptiveMediaSourceDownloadStatistics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentBytesReceivedCount(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun get_TimeToHeadersReceived(): IReference<TimeSpan?>?

  @InterfaceMethod(2)
  public fun get_TimeToFirstByteReceived(): IReference<TimeSpan?>?

  @InterfaceMethod(3)
  public fun get_TimeToLastByteReceived(): IReference<TimeSpan?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSourceDownloadStatistics> {
    public override fun getValue() =
        ABI.makeIAdaptiveMediaSourceDownloadStatistics(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSourceDownloadStatistics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSourceDownloadStatistics {
    public val __2083917506_Ptr: Pointer?

    public val _2083917506_VtblPtr: Pointer?
      get() = __2083917506_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentBytesReceivedCount(): WinDef.ULONG {
      val fnPtr = _2083917506_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__2083917506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_TimeToHeadersReceived(): IReference<TimeSpan?>? {
      val fnPtr = _2083917506_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__2083917506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TimeToFirstByteReceived(): IReference<TimeSpan?>? {
      val fnPtr = _2083917506_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__2083917506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_TimeToLastByteReceived(): IReference<TimeSpan?>? {
      val fnPtr = _2083917506_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__2083917506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveMediaSourceDownloadStatistics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2083917506_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSourceDownloadStatistics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a306cefbe96a4dffa9b81ae08c01ae98")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSourceDownloadStatistics(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSourceDownloadStatistics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdaptiveMediaSourceDownloadStatistics {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSourceDownloadStatistics(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSourceDownloadStatistics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2083917506_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSourceDownloadStatistics):
        Array<IAdaptiveMediaSourceDownloadStatistics?> = (elements as
        Array<IAdaptiveMediaSourceDownloadStatistics?>).castToImpl<IAdaptiveMediaSourceDownloadStatistics,IAdaptiveMediaSourceDownloadStatistics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveMediaSourceDownloadStatistics?> =
        arrayOfNulls<IAdaptiveMediaSourceDownloadStatistics_Impl>(size) as
        Array<IAdaptiveMediaSourceDownloadStatistics?>
  }
}
