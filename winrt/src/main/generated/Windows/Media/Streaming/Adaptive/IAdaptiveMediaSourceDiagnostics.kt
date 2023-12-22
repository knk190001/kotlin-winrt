package Windows.Media.Streaming.Adaptive

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IAdaptiveMediaSourceDiagnostics.ABI::class)
@Signature("{9b24ee68-962e-448c-aebf-b29b56098e23}")
@Guid("9b24ee68962e448caebfb29b56098e23")
@WinRTInterface("9b24ee68962e448caebfb29b56098e23")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSourceDiagnostics.ByReference::class)
public interface IAdaptiveMediaSourceDiagnostics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_DiagnosticAvailable(handler: TypedEventHandler<AdaptiveMediaSourceDiagnostics?,
      AdaptiveMediaSourceDiagnosticAvailableEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_DiagnosticAvailable(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSourceDiagnostics> {
    public override fun getValue() = ABI.makeIAdaptiveMediaSourceDiagnostics(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSourceDiagnostics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSourceDiagnostics {
    public val __602263915_Ptr: Pointer?

    public val _602263915_VtblPtr: Pointer?
      get() = __602263915_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_DiagnosticAvailable(handler: TypedEventHandler<AdaptiveMediaSourceDiagnostics?,
        AdaptiveMediaSourceDiagnosticAvailableEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _602263915_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__602263915_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_DiagnosticAvailable(token: EventRegistrationToken?): Unit {
      val fnPtr = _602263915_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__602263915_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAdaptiveMediaSourceDiagnostics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __602263915_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSourceDiagnostics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b24ee68962e448caebfb29b56098e23")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSourceDiagnostics(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSourceDiagnostics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdaptiveMediaSourceDiagnostics {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSourceDiagnostics(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSourceDiagnostics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__602263915_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSourceDiagnostics):
        Array<IAdaptiveMediaSourceDiagnostics?> = (elements as
        Array<IAdaptiveMediaSourceDiagnostics?>).castToImpl<IAdaptiveMediaSourceDiagnostics,IAdaptiveMediaSourceDiagnostics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveMediaSourceDiagnostics?> =
        arrayOfNulls<IAdaptiveMediaSourceDiagnostics_Impl>(size) as
        Array<IAdaptiveMediaSourceDiagnostics?>
  }
}
