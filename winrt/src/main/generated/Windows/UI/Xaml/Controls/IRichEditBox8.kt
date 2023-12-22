package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Text.RichEditTextDocument
import Windows.UI.Xaml.Controls.Primitives.FlyoutBase
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRichEditBox8.ABI::class)
@Signature("{a098e0b8-18e2-513e-9d8d-4e9703410c03}")
@Guid("a098e0b818e2513e9d8d4e9703410c03")
@WinRTInterface("a098e0b818e2513e9d8d4e9703410c03")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichEditBox8.ByReference::class)
public interface IRichEditBox8 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TextDocument(): RichEditTextDocument?

  @InterfaceMethod(1)
  public fun get_SelectionFlyout(): FlyoutBase?

  @InterfaceMethod(2)
  public fun put_SelectionFlyout(value: FlyoutBase?): Unit

  @InterfaceMethod(3)
  public fun get_ProofingMenuFlyout(): FlyoutBase?

  @InterfaceMethod(4)
  public fun get_Description(): IUnknown?

  @InterfaceMethod(5)
  public fun put_Description(value: IUnknown?): Unit

  @InterfaceMethod(6)
  public fun add_SelectionChanging(handler: TypedEventHandler<RichEditBox?,
      RichEditBoxSelectionChangingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_SelectionChanging(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRichEditBox8>
      {
    public override fun getValue() = ABI.makeIRichEditBox8(pointer.getPointer(0))

    public fun setValue(value: IRichEditBox8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichEditBox8 {
    public val __409646065_Ptr: Pointer?

    public val _409646065_VtblPtr: Pointer?
      get() = __409646065_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TextDocument(): RichEditTextDocument? {
      val fnPtr = _409646065_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RichEditTextDocument>()
      val hr = fn.invokeHR(arrayOf(__409646065_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RichEditTextDocument>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SelectionFlyout(): FlyoutBase? {
      val fnPtr = _409646065_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__409646065_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_SelectionFlyout(value: FlyoutBase?): Unit {
      val fnPtr = _409646065_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646065_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ProofingMenuFlyout(): FlyoutBase? {
      val fnPtr = _409646065_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__409646065_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Description(): IUnknown? {
      val fnPtr = _409646065_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__409646065_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Description(value: IUnknown?): Unit {
      val fnPtr = _409646065_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646065_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_SelectionChanging(handler: TypedEventHandler<RichEditBox?,
        RichEditBoxSelectionChangingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _409646065_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__409646065_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_SelectionChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _409646065_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646065_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRichEditBox8_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __409646065_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichEditBox8, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a098e0b818e2513e9d8d4e9703410c03")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichEditBox8(ptr: Pointer?): WithDefault = IRichEditBox8_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichEditBox8 {
      val address = segment.toRawLongValue()
      return makeIRichEditBox8(Pointer(address))
    }

    public override fun toNative(obj: IRichEditBox8): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__409646065_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichEditBox8): Array<IRichEditBox8?> = (elements as
        Array<IRichEditBox8?>).castToImpl<IRichEditBox8,IRichEditBox8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichEditBox8?> =
        arrayOfNulls<IRichEditBox8_Impl>(size) as Array<IRichEditBox8?>
  }
}
