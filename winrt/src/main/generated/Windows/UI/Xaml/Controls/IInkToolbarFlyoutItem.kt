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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IInkToolbarFlyoutItem.ABI::class)
@Signature("{92b68786-37ee-4915-9e89-e187564a889a}")
@Guid("92b6878637ee49159e89e187564a889a")
@WinRTInterface("92b6878637ee49159e89e187564a889a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarFlyoutItem.ByReference::class)
public interface IInkToolbarFlyoutItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): InkToolbarFlyoutItemKind?

  @InterfaceMethod(1)
  public fun put_Kind(value: InkToolbarFlyoutItemKind?): Unit

  @InterfaceMethod(2)
  public fun get_IsChecked(): Boolean

  @InterfaceMethod(3)
  public fun put_IsChecked(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun add_Checked(handler: TypedEventHandler<InkToolbarFlyoutItem?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Checked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_Unchecked(handler: TypedEventHandler<InkToolbarFlyoutItem?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_Unchecked(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarFlyoutItem> {
    public override fun getValue() = ABI.makeIInkToolbarFlyoutItem(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarFlyoutItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarFlyoutItem {
    public val __446311329_Ptr: Pointer?

    public val _446311329_VtblPtr: Pointer?
      get() = __446311329_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): InkToolbarFlyoutItemKind? {
      val fnPtr = _446311329_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarFlyoutItemKind>()
      val hr = fn.invokeHR(arrayOf(__446311329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarFlyoutItemKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Kind(value: InkToolbarFlyoutItemKind?): Unit {
      val fnPtr = _446311329_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__446311329_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsChecked(): Boolean {
      val fnPtr = _446311329_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__446311329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsChecked(value: Boolean): Unit {
      val fnPtr = _446311329_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__446311329_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_Checked(handler: TypedEventHandler<InkToolbarFlyoutItem?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _446311329_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__446311329_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Checked(token: EventRegistrationToken?): Unit {
      val fnPtr = _446311329_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__446311329_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_Unchecked(handler: TypedEventHandler<InkToolbarFlyoutItem?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _446311329_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__446311329_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_Unchecked(token: EventRegistrationToken?): Unit {
      val fnPtr = _446311329_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__446311329_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkToolbarFlyoutItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __446311329_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarFlyoutItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("92b6878637ee49159e89e187564a889a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarFlyoutItem(ptr: Pointer?): WithDefault =
        IInkToolbarFlyoutItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarFlyoutItem {
      val address = segment.toRawLongValue()
      return makeIInkToolbarFlyoutItem(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarFlyoutItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__446311329_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarFlyoutItem): Array<IInkToolbarFlyoutItem?> =
        (elements as
        Array<IInkToolbarFlyoutItem?>).castToImpl<IInkToolbarFlyoutItem,IInkToolbarFlyoutItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarFlyoutItem?> =
        arrayOfNulls<IInkToolbarFlyoutItem_Impl>(size) as Array<IInkToolbarFlyoutItem?>
  }
}
