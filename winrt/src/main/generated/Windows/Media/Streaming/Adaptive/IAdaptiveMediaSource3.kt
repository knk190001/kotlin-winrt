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

@ABIMarker(IAdaptiveMediaSource3.ABI::class)
@Signature("{ba7023fd-c334-461b-a36e-c99f54f7174a}")
@Guid("ba7023fdc334461ba36ec99f54f7174a")
@WinRTInterface("ba7023fdc334461ba36ec99f54f7174a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSource3.ByReference::class)
public interface IAdaptiveMediaSource3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MinLiveOffset(): IReference<TimeSpan?>?

  @InterfaceMethod(1)
  public fun get_MaxSeekableWindowSize(): IReference<TimeSpan?>?

  @InterfaceMethod(2)
  public fun get_DesiredSeekableWindowSize(): IReference<TimeSpan?>?

  @InterfaceMethod(3)
  public fun put_DesiredSeekableWindowSize(value: IReference<TimeSpan?>?): Unit

  @InterfaceMethod(4)
  public fun get_Diagnostics(): AdaptiveMediaSourceDiagnostics?

  @InterfaceMethod(5)
  public fun GetCorrelatedTimes(): AdaptiveMediaSourceCorrelatedTimes?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSource3> {
    public override fun getValue() = ABI.makeIAdaptiveMediaSource3(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSource3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSource3 {
    public val __1929114748_Ptr: Pointer?

    public val _1929114748_VtblPtr: Pointer?
      get() = __1929114748_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MinLiveOffset(): IReference<TimeSpan?>? {
      val fnPtr = _1929114748_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1929114748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaxSeekableWindowSize(): IReference<TimeSpan?>? {
      val fnPtr = _1929114748_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1929114748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DesiredSeekableWindowSize(): IReference<TimeSpan?>? {
      val fnPtr = _1929114748_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1929114748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DesiredSeekableWindowSize(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _1929114748_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1929114748_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Diagnostics(): AdaptiveMediaSourceDiagnostics? {
      val fnPtr = _1929114748_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdaptiveMediaSourceDiagnostics>()
      val hr = fn.invokeHR(arrayOf(__1929114748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdaptiveMediaSourceDiagnostics>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetCorrelatedTimes(): AdaptiveMediaSourceCorrelatedTimes? {
      val fnPtr = _1929114748_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdaptiveMediaSourceCorrelatedTimes>()
      val hr = fn.invokeHR(arrayOf(__1929114748_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdaptiveMediaSourceCorrelatedTimes>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveMediaSource3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1929114748_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSource3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ba7023fdc334461ba36ec99f54f7174a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSource3(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSource3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdaptiveMediaSource3 {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSource3(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSource3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1929114748_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSource3): Array<IAdaptiveMediaSource3?> =
        (elements as
        Array<IAdaptiveMediaSource3?>).castToImpl<IAdaptiveMediaSource3,IAdaptiveMediaSource3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveMediaSource3?> =
        arrayOfNulls<IAdaptiveMediaSource3_Impl>(size) as Array<IAdaptiveMediaSource3?>
  }
}
