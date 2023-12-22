package Windows.UI.Xaml.Controls

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

@ABIMarker(IInkToolbar2.ABI::class)
@Signature("{86f0c111-b484-454a-ae78-1d25a33d1c67}")
@Guid("86f0c111b484454aae781d25a33d1c67")
@WinRTInterface("86f0c111b484454aae781d25a33d1c67")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbar2.ByReference::class)
public interface IInkToolbar2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsStencilButtonChecked(): Boolean

  @InterfaceMethod(1)
  public fun put_IsStencilButtonChecked(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_ButtonFlyoutPlacement(): InkToolbarButtonFlyoutPlacement?

  @InterfaceMethod(3)
  public fun put_ButtonFlyoutPlacement(value: InkToolbarButtonFlyoutPlacement?): Unit

  @InterfaceMethod(4)
  public fun get_Orientation(): Orientation?

  @InterfaceMethod(5)
  public fun put_Orientation(value: Orientation?): Unit

  @InterfaceMethod(6)
  public fun add_IsStencilButtonCheckedChanged(handler: TypedEventHandler<InkToolbar?,
      InkToolbarIsStencilButtonCheckedChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_IsStencilButtonCheckedChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun GetMenuButton(menu: InkToolbarMenuKind?): InkToolbarMenuButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInkToolbar2> {
    public override fun getValue() = ABI.makeIInkToolbar2(pointer.getPointer(0))

    public fun setValue(value: IInkToolbar2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbar2 {
    public val __841689983_Ptr: Pointer?

    public val _841689983_VtblPtr: Pointer?
      get() = __841689983_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsStencilButtonChecked(): Boolean {
      val fnPtr = _841689983_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__841689983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsStencilButtonChecked(value: Boolean): Unit {
      val fnPtr = _841689983_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__841689983_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ButtonFlyoutPlacement(): InkToolbarButtonFlyoutPlacement? {
      val fnPtr = _841689983_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarButtonFlyoutPlacement>()
      val hr = fn.invokeHR(arrayOf(__841689983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarButtonFlyoutPlacement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ButtonFlyoutPlacement(value: InkToolbarButtonFlyoutPlacement?): Unit {
      val fnPtr = _841689983_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__841689983_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Orientation(): Orientation? {
      val fnPtr = _841689983_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Orientation>()
      val hr = fn.invokeHR(arrayOf(__841689983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Orientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Orientation(value: Orientation?): Unit {
      val fnPtr = _841689983_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__841689983_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_IsStencilButtonCheckedChanged(handler: TypedEventHandler<InkToolbar?,
        InkToolbarIsStencilButtonCheckedChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _841689983_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__841689983_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_IsStencilButtonCheckedChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _841689983_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__841689983_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun GetMenuButton(menu: InkToolbarMenuKind?): InkToolbarMenuButton? {
      val fnPtr = _841689983_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarMenuButton>()
      val hr = fn.invokeHR(arrayOf(__841689983_Ptr, marshalToNative(menu), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarMenuButton>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbar2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __841689983_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbar2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("86f0c111b484454aae781d25a33d1c67")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbar2(ptr: Pointer?): WithDefault = IInkToolbar2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbar2 {
      val address = segment.toRawLongValue()
      return makeIInkToolbar2(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbar2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__841689983_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbar2): Array<IInkToolbar2?> = (elements as
        Array<IInkToolbar2?>).castToImpl<IInkToolbar2,IInkToolbar2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbar2?> =
        arrayOfNulls<IInkToolbar2_Impl>(size) as Array<IInkToolbar2?>
  }
}
