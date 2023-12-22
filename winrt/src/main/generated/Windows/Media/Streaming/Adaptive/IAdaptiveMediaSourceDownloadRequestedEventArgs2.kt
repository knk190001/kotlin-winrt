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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAdaptiveMediaSourceDownloadRequestedEventArgs2.ABI::class)
@Signature("{b37d8bfe-aa44-4d82-825b-611de3bcfecb}")
@Guid("b37d8bfeaa444d82825b611de3bcfecb")
@WinRTInterface("b37d8bfeaa444d82825b611de3bcfecb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSourceDownloadRequestedEventArgs2.ByReference::class)
public interface IAdaptiveMediaSourceDownloadRequestedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RequestId(): Int

  @InterfaceMethod(1)
  public fun get_Position(): IReference<TimeSpan?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSourceDownloadRequestedEventArgs2> {
    public override fun getValue() =
        ABI.makeIAdaptiveMediaSourceDownloadRequestedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSourceDownloadRequestedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSourceDownloadRequestedEventArgs2 {
    public val __1612480566_Ptr: Pointer?

    public val _1612480566_VtblPtr: Pointer?
      get() = __1612480566_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequestId(): Int {
      val fnPtr = _1612480566_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1612480566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Position(): IReference<TimeSpan?>? {
      val fnPtr = _1612480566_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1612480566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveMediaSourceDownloadRequestedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1612480566_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSourceDownloadRequestedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b37d8bfeaa444d82825b611de3bcfecb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSourceDownloadRequestedEventArgs2(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSourceDownloadRequestedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAdaptiveMediaSourceDownloadRequestedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSourceDownloadRequestedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSourceDownloadRequestedEventArgs2):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1612480566_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSourceDownloadRequestedEventArgs2):
        Array<IAdaptiveMediaSourceDownloadRequestedEventArgs2?> = (elements as
        Array<IAdaptiveMediaSourceDownloadRequestedEventArgs2?>).castToImpl<IAdaptiveMediaSourceDownloadRequestedEventArgs2,IAdaptiveMediaSourceDownloadRequestedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveMediaSourceDownloadRequestedEventArgs2?>
        = arrayOfNulls<IAdaptiveMediaSourceDownloadRequestedEventArgs2_Impl>(size) as
        Array<IAdaptiveMediaSourceDownloadRequestedEventArgs2?>
  }
}
