package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRichEditBox6.ABI::class)
@Signature("{0c89d500-e8d8-4eae-8804-33649205d7d2}")
@Guid("0c89d500e8d84eae880433649205d7d2")
@WinRTInterface("0c89d500e8d84eae880433649205d7d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichEditBox6.ByReference::class)
public interface IRichEditBox6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalTextAlignment(): TextAlignment?

  @InterfaceMethod(1)
  public fun put_HorizontalTextAlignment(value: TextAlignment?): Unit

  @InterfaceMethod(2)
  public fun get_CharacterCasing(): CharacterCasing?

  @InterfaceMethod(3)
  public fun put_CharacterCasing(value: CharacterCasing?): Unit

  @InterfaceMethod(4)
  public fun get_DisabledFormattingAccelerators(): DisabledFormattingAccelerators?

  @InterfaceMethod(5)
  public fun put_DisabledFormattingAccelerators(value: DisabledFormattingAccelerators?): Unit

  @InterfaceMethod(6)
  public fun add_CopyingToClipboard(handler: TypedEventHandler<RichEditBox?,
      TextControlCopyingToClipboardEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_CopyingToClipboard(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_CuttingToClipboard(handler: TypedEventHandler<RichEditBox?,
      TextControlCuttingToClipboardEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_CuttingToClipboard(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRichEditBox6>
      {
    public override fun getValue() = ABI.makeIRichEditBox6(pointer.getPointer(0))

    public fun setValue(value: IRichEditBox6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichEditBox6 {
    public val __409646067_Ptr: Pointer?

    public val _409646067_VtblPtr: Pointer?
      get() = __409646067_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalTextAlignment(): TextAlignment? {
      val fnPtr = _409646067_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextAlignment>()
      val hr = fn.invokeHR(arrayOf(__409646067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_HorizontalTextAlignment(value: TextAlignment?): Unit {
      val fnPtr = _409646067_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646067_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CharacterCasing(): CharacterCasing? {
      val fnPtr = _409646067_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CharacterCasing>()
      val hr = fn.invokeHR(arrayOf(__409646067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CharacterCasing>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CharacterCasing(value: CharacterCasing?): Unit {
      val fnPtr = _409646067_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646067_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DisabledFormattingAccelerators(): DisabledFormattingAccelerators? {
      val fnPtr = _409646067_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisabledFormattingAccelerators>()
      val hr = fn.invokeHR(arrayOf(__409646067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisabledFormattingAccelerators>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_DisabledFormattingAccelerators(value: DisabledFormattingAccelerators?):
        Unit {
      val fnPtr = _409646067_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646067_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_CopyingToClipboard(handler: TypedEventHandler<RichEditBox?,
        TextControlCopyingToClipboardEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _409646067_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__409646067_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_CopyingToClipboard(token: EventRegistrationToken?): Unit {
      val fnPtr = _409646067_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646067_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_CuttingToClipboard(handler: TypedEventHandler<RichEditBox?,
        TextControlCuttingToClipboardEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _409646067_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__409646067_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_CuttingToClipboard(token: EventRegistrationToken?): Unit {
      val fnPtr = _409646067_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646067_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRichEditBox6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __409646067_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichEditBox6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c89d500e8d84eae880433649205d7d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichEditBox6(ptr: Pointer?): WithDefault = IRichEditBox6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichEditBox6 {
      val address = segment.toRawLongValue()
      return makeIRichEditBox6(Pointer(address))
    }

    public override fun toNative(obj: IRichEditBox6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__409646067_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichEditBox6): Array<IRichEditBox6?> = (elements as
        Array<IRichEditBox6?>).castToImpl<IRichEditBox6,IRichEditBox6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichEditBox6?> =
        arrayOfNulls<IRichEditBox6_Impl>(size) as Array<IRichEditBox6?>
  }
}
