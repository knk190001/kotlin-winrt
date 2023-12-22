package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.Documents.TextHighlighter
import Windows.UI.Xaml.TextAlignment
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

@ABIMarker(ITextBlock6.ABI::class)
@Signature("{31816cd9-0404-410f-91ec-33b0a0bb92b2}")
@Guid("31816cd90404410f91ec33b0a0bb92b2")
@WinRTInterface("31816cd90404410f91ec33b0a0bb92b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBlock6.ByReference::class)
public interface ITextBlock6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTextTrimmed(): Boolean

  @InterfaceMethod(1)
  public fun get_HorizontalTextAlignment(): TextAlignment?

  @InterfaceMethod(2)
  public fun put_HorizontalTextAlignment(value: TextAlignment?): Unit

  @InterfaceMethod(3)
  public fun get_TextHighlighters(): IVector<TextHighlighter?>?

  @InterfaceMethod(4)
  public fun add_IsTextTrimmedChanged(handler: TypedEventHandler<TextBlock?,
      IsTextTrimmedChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_IsTextTrimmedChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextBlock6> {
    public override fun getValue() = ABI.makeITextBlock6(pointer.getPointer(0))

    public fun setValue(value: ITextBlock6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBlock6 {
    public val __164916750_Ptr: Pointer?

    public val _164916750_VtblPtr: Pointer?
      get() = __164916750_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTextTrimmed(): Boolean {
      val fnPtr = _164916750_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__164916750_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_HorizontalTextAlignment(): TextAlignment? {
      val fnPtr = _164916750_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextAlignment>()
      val hr = fn.invokeHR(arrayOf(__164916750_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_HorizontalTextAlignment(value: TextAlignment?): Unit {
      val fnPtr = _164916750_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__164916750_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_TextHighlighters(): IVector<TextHighlighter?>? {
      val fnPtr = _164916750_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<TextHighlighter?>>()
      val hr = fn.invokeHR(arrayOf(__164916750_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<TextHighlighter?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun add_IsTextTrimmedChanged(handler: TypedEventHandler<TextBlock?,
        IsTextTrimmedChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _164916750_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__164916750_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_IsTextTrimmedChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _164916750_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__164916750_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextBlock6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __164916750_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBlock6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("31816cd90404410f91ec33b0a0bb92b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBlock6(ptr: Pointer?): WithDefault = ITextBlock6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBlock6 {
      val address = segment.toRawLongValue()
      return makeITextBlock6(Pointer(address))
    }

    public override fun toNative(obj: ITextBlock6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__164916750_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBlock6): Array<ITextBlock6?> = (elements as
        Array<ITextBlock6?>).castToImpl<ITextBlock6,ITextBlock6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBlock6?> =
        arrayOfNulls<ITextBlock6_Impl>(size) as Array<ITextBlock6?>
  }
}
