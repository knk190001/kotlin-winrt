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

@ABIMarker(IInputLightDismissAction.ABI::class)
@Signature("{e8a39502-a860-502f-8c10-3646d43aecf1}")
@Guid("e8a39502a860502f8c103646d43aecf1")
@WinRTInterface("e8a39502a860502f8c103646d43aecf1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputLightDismissAction.ByReference::class)
public interface IInputLightDismissAction : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Dismissed(handler: TypedEventHandler<InputLightDismissAction?,
      InputLightDismissEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Dismissed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputLightDismissAction> {
    public override fun getValue() = ABI.makeIInputLightDismissAction(pointer.getPointer(0))

    public fun setValue(value: IInputLightDismissAction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputLightDismissAction {
    public val __1118568517_Ptr: Pointer?

    public val _1118568517_VtblPtr: Pointer?
      get() = __1118568517_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Dismissed(handler: TypedEventHandler<InputLightDismissAction?,
        InputLightDismissEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1118568517_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1118568517_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Dismissed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1118568517_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1118568517_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInputLightDismissAction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1118568517_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputLightDismissAction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e8a39502a860502f8c103646d43aecf1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputLightDismissAction(ptr: Pointer?): WithDefault =
        IInputLightDismissAction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputLightDismissAction {
      val address = segment.toRawLongValue()
      return makeIInputLightDismissAction(Pointer(address))
    }

    public override fun toNative(obj: IInputLightDismissAction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1118568517_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputLightDismissAction):
        Array<IInputLightDismissAction?> = (elements as
        Array<IInputLightDismissAction?>).castToImpl<IInputLightDismissAction,IInputLightDismissAction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputLightDismissAction?> =
        arrayOfNulls<IInputLightDismissAction_Impl>(size) as Array<IInputLightDismissAction?>
  }
}
