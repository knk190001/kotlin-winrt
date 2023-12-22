package Microsoft.UI.Input

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

@ABIMarker(IInputActivationListener.ABI::class)
@Signature("{3b818627-6ce7-5e0d-a0f5-6684fd1aec78}")
@Guid("3b8186276ce75e0da0f56684fd1aec78")
@WinRTInterface("3b8186276ce75e0da0f56684fd1aec78")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputActivationListener.ByReference::class)
public interface IInputActivationListener : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_State(): InputActivationState?

  @InterfaceMethod(1)
  public fun add_InputActivationChanged(handler: TypedEventHandler<InputActivationListener?,
      InputActivationListenerActivationChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_InputActivationChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputActivationListener> {
    public override fun getValue() = ABI.makeIInputActivationListener(pointer.getPointer(0))

    public fun setValue(value: IInputActivationListener_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputActivationListener {
    public val __1049217093_Ptr: Pointer?

    public val _1049217093_VtblPtr: Pointer?
      get() = __1049217093_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): InputActivationState? {
      val fnPtr = _1049217093_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputActivationState>()
      val hr = fn.invokeHR(arrayOf(__1049217093_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputActivationState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun add_InputActivationChanged(handler: TypedEventHandler<InputActivationListener?,
        InputActivationListenerActivationChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1049217093_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1049217093_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_InputActivationChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1049217093_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1049217093_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInputActivationListener_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1049217093_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputActivationListener, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3b8186276ce75e0da0f56684fd1aec78")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputActivationListener(ptr: Pointer?): WithDefault =
        IInputActivationListener_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputActivationListener {
      val address = segment.toRawLongValue()
      return makeIInputActivationListener(Pointer(address))
    }

    public override fun toNative(obj: IInputActivationListener): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1049217093_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputActivationListener):
        Array<IInputActivationListener?> = (elements as
        Array<IInputActivationListener?>).castToImpl<IInputActivationListener,IInputActivationListener_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputActivationListener?> =
        arrayOfNulls<IInputActivationListener_Impl>(size) as Array<IInputActivationListener?>
  }
}
