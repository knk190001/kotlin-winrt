package Windows.UI.Xaml.Documents

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Text.TextDecorations
import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.Input.AccessKeyDisplayDismissedEventArgs
import Windows.UI.Xaml.Input.AccessKeyDisplayRequestedEventArgs
import Windows.UI.Xaml.Input.AccessKeyInvokedEventArgs
import Windows.UI.Xaml.Input.KeyTipPlacementMode
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextElement4.ABI::class)
@Signature("{b196e222-ca0e-48a9-83bc-36ce50566ac7}")
@Guid("b196e222ca0e48a983bc36ce50566ac7")
@WinRTInterface("b196e222ca0e48a983bc36ce50566ac7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextElement4.ByReference::class)
public interface ITextElement4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TextDecorations(): TextDecorations?

  @InterfaceMethod(1)
  public fun put_TextDecorations(value: TextDecorations?): Unit

  @InterfaceMethod(2)
  public fun get_IsAccessKeyScope(): Boolean

  @InterfaceMethod(3)
  public fun put_IsAccessKeyScope(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_AccessKeyScopeOwner(): DependencyObject?

  @InterfaceMethod(5)
  public fun put_AccessKeyScopeOwner(value: DependencyObject?): Unit

  @InterfaceMethod(6)
  public fun get_KeyTipPlacementMode(): KeyTipPlacementMode?

  @InterfaceMethod(7)
  public fun put_KeyTipPlacementMode(value: KeyTipPlacementMode?): Unit

  @InterfaceMethod(8)
  public fun get_KeyTipHorizontalOffset(): Double

  @InterfaceMethod(9)
  public fun put_KeyTipHorizontalOffset(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_KeyTipVerticalOffset(): Double

  @InterfaceMethod(11)
  public fun put_KeyTipVerticalOffset(value: Double): Unit

  @InterfaceMethod(12)
  public fun add_AccessKeyDisplayRequested(handler: TypedEventHandler<TextElement?,
      AccessKeyDisplayRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_AccessKeyDisplayRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun add_AccessKeyDisplayDismissed(handler: TypedEventHandler<TextElement?,
      AccessKeyDisplayDismissedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_AccessKeyDisplayDismissed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun add_AccessKeyInvoked(handler: TypedEventHandler<TextElement?,
      AccessKeyInvokedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_AccessKeyInvoked(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextElement4>
      {
    public override fun getValue() = ABI.makeITextElement4(pointer.getPointer(0))

    public fun setValue(value: ITextElement4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextElement4 {
    public val __791160621_Ptr: Pointer?

    public val _791160621_VtblPtr: Pointer?
      get() = __791160621_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TextDecorations(): TextDecorations? {
      val fnPtr = _791160621_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextDecorations>()
      val hr = fn.invokeHR(arrayOf(__791160621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextDecorations>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TextDecorations(value: TextDecorations?): Unit {
      val fnPtr = _791160621_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__791160621_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsAccessKeyScope(): Boolean {
      val fnPtr = _791160621_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__791160621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsAccessKeyScope(value: Boolean): Unit {
      val fnPtr = _791160621_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__791160621_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AccessKeyScopeOwner(): DependencyObject? {
      val fnPtr = _791160621_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__791160621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_AccessKeyScopeOwner(value: DependencyObject?): Unit {
      val fnPtr = _791160621_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__791160621_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_KeyTipPlacementMode(): KeyTipPlacementMode? {
      val fnPtr = _791160621_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyTipPlacementMode>()
      val hr = fn.invokeHR(arrayOf(__791160621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyTipPlacementMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_KeyTipPlacementMode(value: KeyTipPlacementMode?): Unit {
      val fnPtr = _791160621_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__791160621_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_KeyTipHorizontalOffset(): Double {
      val fnPtr = _791160621_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__791160621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_KeyTipHorizontalOffset(value: Double): Unit {
      val fnPtr = _791160621_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__791160621_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_KeyTipVerticalOffset(): Double {
      val fnPtr = _791160621_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__791160621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_KeyTipVerticalOffset(value: Double): Unit {
      val fnPtr = _791160621_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__791160621_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_AccessKeyDisplayRequested(handler: TypedEventHandler<TextElement?,
        AccessKeyDisplayRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _791160621_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__791160621_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_AccessKeyDisplayRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _791160621_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__791160621_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_AccessKeyDisplayDismissed(handler: TypedEventHandler<TextElement?,
        AccessKeyDisplayDismissedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _791160621_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__791160621_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_AccessKeyDisplayDismissed(token: EventRegistrationToken?): Unit {
      val fnPtr = _791160621_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__791160621_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun add_AccessKeyInvoked(handler: TypedEventHandler<TextElement?,
        AccessKeyInvokedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _791160621_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__791160621_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_AccessKeyInvoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _791160621_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__791160621_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextElement4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __791160621_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextElement4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b196e222ca0e48a983bc36ce50566ac7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextElement4(ptr: Pointer?): WithDefault = ITextElement4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextElement4 {
      val address = segment.toRawLongValue()
      return makeITextElement4(Pointer(address))
    }

    public override fun toNative(obj: ITextElement4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__791160621_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextElement4): Array<ITextElement4?> = (elements as
        Array<ITextElement4?>).castToImpl<ITextElement4,ITextElement4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextElement4?> =
        arrayOfNulls<ITextElement4_Impl>(size) as Array<ITextElement4?>
  }
}
