package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.Documents.ContentLinkInvokedEventArgs
import Windows.UI.Xaml.Documents.ContentLinkProviderCollection
import Windows.UI.Xaml.Media.SolidColorBrush
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

@ABIMarker(IRichEditBox7.ABI::class)
@Signature("{980c93ea-241f-4f6a-a539-9d185c8cf18a}")
@Guid("980c93ea241f4f6aa5399d185c8cf18a")
@WinRTInterface("980c93ea241f4f6aa5399d185c8cf18a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichEditBox7.ByReference::class)
public interface IRichEditBox7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentLinkForegroundColor(): SolidColorBrush?

  @InterfaceMethod(1)
  public fun put_ContentLinkForegroundColor(value: SolidColorBrush?): Unit

  @InterfaceMethod(2)
  public fun get_ContentLinkBackgroundColor(): SolidColorBrush?

  @InterfaceMethod(3)
  public fun put_ContentLinkBackgroundColor(value: SolidColorBrush?): Unit

  @InterfaceMethod(4)
  public fun get_ContentLinkProviders(): ContentLinkProviderCollection?

  @InterfaceMethod(5)
  public fun put_ContentLinkProviders(value: ContentLinkProviderCollection?): Unit

  @InterfaceMethod(6)
  public fun get_HandwritingView(): HandwritingView?

  @InterfaceMethod(7)
  public fun put_HandwritingView(value: HandwritingView?): Unit

  @InterfaceMethod(8)
  public fun get_IsHandwritingViewEnabled(): Boolean

  @InterfaceMethod(9)
  public fun put_IsHandwritingViewEnabled(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun add_ContentLinkChanged(handler: TypedEventHandler<RichEditBox?,
      ContentLinkChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_ContentLinkChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_ContentLinkInvoked(handler: TypedEventHandler<RichEditBox?,
      ContentLinkInvokedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_ContentLinkInvoked(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRichEditBox7>
      {
    public override fun getValue() = ABI.makeIRichEditBox7(pointer.getPointer(0))

    public fun setValue(value: IRichEditBox7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichEditBox7 {
    public val __409646066_Ptr: Pointer?

    public val _409646066_VtblPtr: Pointer?
      get() = __409646066_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentLinkForegroundColor(): SolidColorBrush? {
      val fnPtr = _409646066_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SolidColorBrush>()
      val hr = fn.invokeHR(arrayOf(__409646066_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SolidColorBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ContentLinkForegroundColor(value: SolidColorBrush?): Unit {
      val fnPtr = _409646066_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646066_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ContentLinkBackgroundColor(): SolidColorBrush? {
      val fnPtr = _409646066_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SolidColorBrush>()
      val hr = fn.invokeHR(arrayOf(__409646066_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SolidColorBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ContentLinkBackgroundColor(value: SolidColorBrush?): Unit {
      val fnPtr = _409646066_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646066_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ContentLinkProviders(): ContentLinkProviderCollection? {
      val fnPtr = _409646066_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentLinkProviderCollection>()
      val hr = fn.invokeHR(arrayOf(__409646066_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentLinkProviderCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ContentLinkProviders(value: ContentLinkProviderCollection?): Unit {
      val fnPtr = _409646066_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646066_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_HandwritingView(): HandwritingView? {
      val fnPtr = _409646066_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HandwritingView>()
      val hr = fn.invokeHR(arrayOf(__409646066_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HandwritingView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_HandwritingView(value: HandwritingView?): Unit {
      val fnPtr = _409646066_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646066_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsHandwritingViewEnabled(): Boolean {
      val fnPtr = _409646066_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__409646066_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsHandwritingViewEnabled(value: Boolean): Unit {
      val fnPtr = _409646066_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646066_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_ContentLinkChanged(handler: TypedEventHandler<RichEditBox?,
        ContentLinkChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _409646066_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__409646066_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_ContentLinkChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _409646066_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646066_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_ContentLinkInvoked(handler: TypedEventHandler<RichEditBox?,
        ContentLinkInvokedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _409646066_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__409646066_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_ContentLinkInvoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _409646066_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646066_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRichEditBox7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __409646066_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichEditBox7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("980c93ea241f4f6aa5399d185c8cf18a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichEditBox7(ptr: Pointer?): WithDefault = IRichEditBox7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichEditBox7 {
      val address = segment.toRawLongValue()
      return makeIRichEditBox7(Pointer(address))
    }

    public override fun toNative(obj: IRichEditBox7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__409646066_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichEditBox7): Array<IRichEditBox7?> = (elements as
        Array<IRichEditBox7?>).castToImpl<IRichEditBox7,IRichEditBox7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichEditBox7?> =
        arrayOfNulls<IRichEditBox7_Impl>(size) as Array<IRichEditBox7?>
  }
}
