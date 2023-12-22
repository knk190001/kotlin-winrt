package Windows.Media.Streaming.Adaptive

import Windows.Foundation.HResult
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAdaptiveMediaSourceDownloadFailedEventArgs2.ABI::class)
@Signature("{70919568-967c-4986-90c5-c6fc4b31e2d8}")
@Guid("70919568967c498690c5c6fc4b31e2d8")
@WinRTInterface("70919568967c498690c5c6fc4b31e2d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSourceDownloadFailedEventArgs2.ByReference::class)
public interface IAdaptiveMediaSourceDownloadFailedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RequestId(): Int

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(2)
  public fun get_Statistics(): AdaptiveMediaSourceDownloadStatistics?

  @InterfaceMethod(3)
  public fun get_Position(): IReference<TimeSpan?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSourceDownloadFailedEventArgs2> {
    public override fun getValue() =
        ABI.makeIAdaptiveMediaSourceDownloadFailedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSourceDownloadFailedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSourceDownloadFailedEventArgs2 {
    public val __1956582665_Ptr: Pointer?

    public val _1956582665_VtblPtr: Pointer?
      get() = __1956582665_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequestId(): Int {
      val fnPtr = _1956582665_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1956582665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1956582665_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1956582665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Statistics(): AdaptiveMediaSourceDownloadStatistics? {
      val fnPtr = _1956582665_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdaptiveMediaSourceDownloadStatistics>()
      val hr = fn.invokeHR(arrayOf(__1956582665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdaptiveMediaSourceDownloadStatistics>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Position(): IReference<TimeSpan?>? {
      val fnPtr = _1956582665_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1956582665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveMediaSourceDownloadFailedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1956582665_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSourceDownloadFailedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("70919568967c498690c5c6fc4b31e2d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSourceDownloadFailedEventArgs2(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSourceDownloadFailedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAdaptiveMediaSourceDownloadFailedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSourceDownloadFailedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSourceDownloadFailedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1956582665_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSourceDownloadFailedEventArgs2):
        Array<IAdaptiveMediaSourceDownloadFailedEventArgs2?> = (elements as
        Array<IAdaptiveMediaSourceDownloadFailedEventArgs2?>).castToImpl<IAdaptiveMediaSourceDownloadFailedEventArgs2,IAdaptiveMediaSourceDownloadFailedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveMediaSourceDownloadFailedEventArgs2?> =
        arrayOfNulls<IAdaptiveMediaSourceDownloadFailedEventArgs2_Impl>(size) as
        Array<IAdaptiveMediaSourceDownloadFailedEventArgs2?>
  }
}
