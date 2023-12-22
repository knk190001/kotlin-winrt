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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInputFocusController.ABI::class)
@Signature("{8dfdc26c-8b8d-515d-8ddd-4685b3a540e9}")
@Guid("8dfdc26c8b8d515d8ddd4685b3a540e9")
@WinRTInterface("8dfdc26c8b8d515d8ddd4685b3a540e9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputFocusController.ByReference::class)
public interface IInputFocusController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HasFocus(): Boolean

  @InterfaceMethod(1)
  public fun TrySetFocus(): Boolean

  @InterfaceMethod(2)
  public fun add_GotFocus(handler: TypedEventHandler<InputFocusController?,
      FocusChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_GotFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_LostFocus(handler: TypedEventHandler<InputFocusController?,
      FocusChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_LostFocus(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputFocusController> {
    public override fun getValue() = ABI.makeIInputFocusController(pointer.getPointer(0))

    public fun setValue(value: IInputFocusController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputFocusController {
    public val __842620003_Ptr: Pointer?

    public val _842620003_VtblPtr: Pointer?
      get() = __842620003_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HasFocus(): Boolean {
      val fnPtr = _842620003_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__842620003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun TrySetFocus(): Boolean {
      val fnPtr = _842620003_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__842620003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun add_GotFocus(handler: TypedEventHandler<InputFocusController?,
        FocusChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _842620003_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__842620003_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_GotFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _842620003_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__842620003_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_LostFocus(handler: TypedEventHandler<InputFocusController?,
        FocusChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _842620003_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__842620003_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_LostFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _842620003_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__842620003_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInputFocusController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __842620003_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputFocusController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8dfdc26c8b8d515d8ddd4685b3a540e9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputFocusController(ptr: Pointer?): WithDefault =
        IInputFocusController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputFocusController {
      val address = segment.toRawLongValue()
      return makeIInputFocusController(Pointer(address))
    }

    public override fun toNative(obj: IInputFocusController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__842620003_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputFocusController): Array<IInputFocusController?> =
        (elements as
        Array<IInputFocusController?>).castToImpl<IInputFocusController,IInputFocusController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputFocusController?> =
        arrayOfNulls<IInputFocusController_Impl>(size) as Array<IInputFocusController?>
  }
}
