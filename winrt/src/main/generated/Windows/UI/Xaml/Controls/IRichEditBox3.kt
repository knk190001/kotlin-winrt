package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.TextReadingOrder
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

@ABIMarker(IRichEditBox3.ABI::class)
@Signature("{6b17a462-fbb6-4fff-9991-9399cb9c0b90}")
@Guid("6b17a462fbb64fff99919399cb9c0b90")
@WinRTInterface("6b17a462fbb64fff99919399cb9c0b90")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichEditBox3.ByReference::class)
public interface IRichEditBox3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_TextCompositionStarted(handler: TypedEventHandler<RichEditBox?,
      TextCompositionStartedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_TextCompositionStarted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_TextCompositionChanged(handler: TypedEventHandler<RichEditBox?,
      TextCompositionChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_TextCompositionChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_TextCompositionEnded(handler: TypedEventHandler<RichEditBox?,
      TextCompositionEndedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_TextCompositionEnded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun get_TextReadingOrder(): TextReadingOrder?

  @InterfaceMethod(7)
  public fun put_TextReadingOrder(value: TextReadingOrder?): Unit

  @InterfaceMethod(8)
  public fun get_DesiredCandidateWindowAlignment(): CandidateWindowAlignment?

  @InterfaceMethod(9)
  public fun put_DesiredCandidateWindowAlignment(value: CandidateWindowAlignment?): Unit

  @InterfaceMethod(10)
  public fun add_CandidateWindowBoundsChanged(handler: TypedEventHandler<RichEditBox?,
      CandidateWindowBoundsChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_CandidateWindowBoundsChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_TextChanging(handler: TypedEventHandler<RichEditBox?,
      RichEditBoxTextChangingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_TextChanging(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRichEditBox3>
      {
    public override fun getValue() = ABI.makeIRichEditBox3(pointer.getPointer(0))

    public fun setValue(value: IRichEditBox3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichEditBox3 {
    public val __409646070_Ptr: Pointer?

    public val _409646070_VtblPtr: Pointer?
      get() = __409646070_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_TextCompositionStarted(handler: TypedEventHandler<RichEditBox?,
        TextCompositionStartedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _409646070_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__409646070_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_TextCompositionStarted(token: EventRegistrationToken?): Unit {
      val fnPtr = _409646070_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646070_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_TextCompositionChanged(handler: TypedEventHandler<RichEditBox?,
        TextCompositionChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _409646070_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__409646070_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_TextCompositionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _409646070_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646070_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_TextCompositionEnded(handler: TypedEventHandler<RichEditBox?,
        TextCompositionEndedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _409646070_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__409646070_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_TextCompositionEnded(token: EventRegistrationToken?): Unit {
      val fnPtr = _409646070_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646070_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_TextReadingOrder(): TextReadingOrder? {
      val fnPtr = _409646070_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextReadingOrder>()
      val hr = fn.invokeHR(arrayOf(__409646070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextReadingOrder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_TextReadingOrder(value: TextReadingOrder?): Unit {
      val fnPtr = _409646070_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646070_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_DesiredCandidateWindowAlignment(): CandidateWindowAlignment? {
      val fnPtr = _409646070_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CandidateWindowAlignment>()
      val hr = fn.invokeHR(arrayOf(__409646070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CandidateWindowAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_DesiredCandidateWindowAlignment(value: CandidateWindowAlignment?):
        Unit {
      val fnPtr = _409646070_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646070_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_CandidateWindowBoundsChanged(handler: TypedEventHandler<RichEditBox?,
        CandidateWindowBoundsChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _409646070_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__409646070_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_CandidateWindowBoundsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _409646070_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646070_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_TextChanging(handler: TypedEventHandler<RichEditBox?,
        RichEditBoxTextChangingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _409646070_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__409646070_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_TextChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _409646070_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646070_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRichEditBox3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __409646070_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichEditBox3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b17a462fbb64fff99919399cb9c0b90")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichEditBox3(ptr: Pointer?): WithDefault = IRichEditBox3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichEditBox3 {
      val address = segment.toRawLongValue()
      return makeIRichEditBox3(Pointer(address))
    }

    public override fun toNative(obj: IRichEditBox3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__409646070_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichEditBox3): Array<IRichEditBox3?> = (elements as
        Array<IRichEditBox3?>).castToImpl<IRichEditBox3,IRichEditBox3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichEditBox3?> =
        arrayOfNulls<IRichEditBox3_Impl>(size) as Array<IRichEditBox3?>
  }
}
