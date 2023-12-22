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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebUICommandBarIconButton.ABI::class)
@Signature("{8f1bc93a-3a7c-4842-a0cf-aff6ea308586}")
@Guid("8f1bc93a3a7c4842a0cfaff6ea308586")
@WinRTInterface("8f1bc93a3a7c4842a0cfaff6ea308586")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUICommandBarIconButton.ByReference::class)
public interface IWebUICommandBarIconButton : NativeMapped, IWinRTInterface, IWebUICommandBarElement
    {
  @InterfaceMethod(0)
  public fun get_Enabled(): Boolean

  @InterfaceMethod(1)
  public fun put_Enabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Label(): String?

  @InterfaceMethod(3)
  public fun put_Label(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_IsToggleButton(): Boolean

  @InterfaceMethod(5)
  public fun put_IsToggleButton(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsChecked(): Boolean

  @InterfaceMethod(7)
  public fun put_IsChecked(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_Icon(): IWebUICommandBarIcon?

  @InterfaceMethod(9)
  public fun put_Icon(value: IWebUICommandBarIcon?): Unit

  @InterfaceMethod(10)
  public fun add_ItemInvoked(handler: TypedEventHandler<WebUICommandBarIconButton?,
      WebUICommandBarItemInvokedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_ItemInvoked(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUICommandBarIconButton> {
    public override fun getValue() = ABI.makeIWebUICommandBarIconButton(pointer.getPointer(0))

    public fun setValue(value: IWebUICommandBarIconButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUICommandBarIconButton, IWebUICommandBarElement.WithDefault {
    public val __1307373530_Ptr: Pointer?

    public val _1307373530_VtblPtr: Pointer?
      get() = __1307373530_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Enabled(): Boolean {
      val fnPtr = _1307373530_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1307373530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Enabled(value: Boolean): Unit {
      val fnPtr = _1307373530_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1307373530_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Label(): String? {
      val fnPtr = _1307373530_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1307373530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Label(value: String?): Unit {
      val fnPtr = _1307373530_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1307373530_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsToggleButton(): Boolean {
      val fnPtr = _1307373530_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1307373530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsToggleButton(value: Boolean): Unit {
      val fnPtr = _1307373530_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1307373530_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsChecked(): Boolean {
      val fnPtr = _1307373530_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1307373530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsChecked(value: Boolean): Unit {
      val fnPtr = _1307373530_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1307373530_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Icon(): IWebUICommandBarIcon? {
      val fnPtr = _1307373530_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IWebUICommandBarIcon>()
      val hr = fn.invokeHR(arrayOf(__1307373530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IWebUICommandBarIcon>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Icon(value: IWebUICommandBarIcon?): Unit {
      val fnPtr = _1307373530_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1307373530_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_ItemInvoked(handler: TypedEventHandler<WebUICommandBarIconButton?,
        WebUICommandBarItemInvokedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1307373530_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1307373530_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_ItemInvoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _1307373530_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1307373530_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebUICommandBarIconButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IWebUICommandBarElement {
    public override val __357838273_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1307373530_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1307373530_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUICommandBarIconButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f1bc93a3a7c4842a0cfaff6ea308586")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUICommandBarIconButton(ptr: Pointer?): WithDefault =
        IWebUICommandBarIconButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUICommandBarIconButton {
      val address = segment.toRawLongValue()
      return makeIWebUICommandBarIconButton(Pointer(address))
    }

    public override fun toNative(obj: IWebUICommandBarIconButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1307373530_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUICommandBarIconButton):
        Array<IWebUICommandBarIconButton?> = (elements as
        Array<IWebUICommandBarIconButton?>).castToImpl<IWebUICommandBarIconButton,IWebUICommandBarIconButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUICommandBarIconButton?> =
        arrayOfNulls<IWebUICommandBarIconButton_Impl>(size) as Array<IWebUICommandBarIconButton?>
  }
}
