package Windows.UI.WebUI.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.WebUI.Core.IWebUICommandBarElement.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IWebUICommandBarConfirmationButton.ABI::class)
@Signature("{86e7824a-e3d5-4eb6-b2ff-8f018a172105}")
@Guid("86e7824ae3d54eb6b2ff8f018a172105")
@WinRTInterface("86e7824ae3d54eb6b2ff8f018a172105")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUICommandBarConfirmationButton.ByReference::class)
public interface IWebUICommandBarConfirmationButton : NativeMapped, IWinRTInterface,
    IWebUICommandBarElement {
  @InterfaceMethod(0)
  public fun get_Text(): String?

  @InterfaceMethod(1)
  public fun put_Text(value: String?): Unit

  @InterfaceMethod(2)
  public fun add_ItemInvoked(handler: TypedEventHandler<WebUICommandBarConfirmationButton?,
      WebUICommandBarItemInvokedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_ItemInvoked(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUICommandBarConfirmationButton> {
    public override fun getValue() =
        ABI.makeIWebUICommandBarConfirmationButton(pointer.getPointer(0))

    public fun setValue(value: IWebUICommandBarConfirmationButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUICommandBarConfirmationButton,
      IWebUICommandBarElement.WithDefault {
    public val __732256226_Ptr: Pointer?

    public val _732256226_VtblPtr: Pointer?
      get() = __732256226_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Text(): String? {
      val fnPtr = _732256226_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__732256226_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _732256226_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__732256226_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_ItemInvoked(handler: TypedEventHandler<WebUICommandBarConfirmationButton?,
        WebUICommandBarItemInvokedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _732256226_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__732256226_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_ItemInvoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _732256226_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__732256226_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebUICommandBarConfirmationButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IWebUICommandBarElement {
    public override val __357838273_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_732256226_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __732256226_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUICommandBarConfirmationButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("86e7824ae3d54eb6b2ff8f018a172105")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUICommandBarConfirmationButton(ptr: Pointer?): WithDefault =
        IWebUICommandBarConfirmationButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUICommandBarConfirmationButton {
      val address = segment.toRawLongValue()
      return makeIWebUICommandBarConfirmationButton(Pointer(address))
    }

    public override fun toNative(obj: IWebUICommandBarConfirmationButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__732256226_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUICommandBarConfirmationButton):
        Array<IWebUICommandBarConfirmationButton?> = (elements as
        Array<IWebUICommandBarConfirmationButton?>).castToImpl<IWebUICommandBarConfirmationButton,IWebUICommandBarConfirmationButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUICommandBarConfirmationButton?> =
        arrayOfNulls<IWebUICommandBarConfirmationButton_Impl>(size) as
        Array<IWebUICommandBarConfirmationButton?>
  }
}
