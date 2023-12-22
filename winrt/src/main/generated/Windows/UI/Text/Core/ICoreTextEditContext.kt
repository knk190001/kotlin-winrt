package Windows.UI.Text.Core

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreTextEditContext.ABI::class)
@Signature("{bf6608af-4041-47c3-b263-a918eb5eaef2}")
@Guid("bf6608af404147c3b263a918eb5eaef2")
@WinRTInterface("bf6608af404147c3b263a918eb5eaef2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreTextEditContext.ByReference::class)
public interface ICoreTextEditContext : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun put_Name(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_InputScope(): CoreTextInputScope?

  @InterfaceMethod(3)
  public fun put_InputScope(value: CoreTextInputScope?): Unit

  @InterfaceMethod(4)
  public fun get_IsReadOnly(): Boolean

  @InterfaceMethod(5)
  public fun put_IsReadOnly(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_InputPaneDisplayPolicy(): CoreTextInputPaneDisplayPolicy?

  @InterfaceMethod(7)
  public fun put_InputPaneDisplayPolicy(value: CoreTextInputPaneDisplayPolicy?): Unit

  @InterfaceMethod(8)
  public fun add_TextRequested(handler: TypedEventHandler<CoreTextEditContext?,
      CoreTextTextRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_TextRequested(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_SelectionRequested(handler: TypedEventHandler<CoreTextEditContext?,
      CoreTextSelectionRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_SelectionRequested(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_LayoutRequested(handler: TypedEventHandler<CoreTextEditContext?,
      CoreTextLayoutRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_LayoutRequested(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun add_TextUpdating(handler: TypedEventHandler<CoreTextEditContext?,
      CoreTextTextUpdatingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_TextUpdating(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun add_SelectionUpdating(handler: TypedEventHandler<CoreTextEditContext?,
      CoreTextSelectionUpdatingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_SelectionUpdating(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public fun add_FormatUpdating(handler: TypedEventHandler<CoreTextEditContext?,
      CoreTextFormatUpdatingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(19)
  public fun remove_FormatUpdating(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(20)
  public fun add_CompositionStarted(handler: TypedEventHandler<CoreTextEditContext?,
      CoreTextCompositionStartedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(21)
  public fun remove_CompositionStarted(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(22)
  public fun add_CompositionCompleted(handler: TypedEventHandler<CoreTextEditContext?,
      CoreTextCompositionCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(23)
  public fun remove_CompositionCompleted(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(24)
  public fun add_FocusRemoved(handler: TypedEventHandler<CoreTextEditContext?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(25)
  public fun remove_FocusRemoved(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(26)
  public fun NotifyFocusEnter(): Unit

  @InterfaceMethod(27)
  public fun NotifyFocusLeave(): Unit

  @InterfaceMethod(28)
  public fun NotifyTextChanged(
    modifiedRange: CoreTextRange?,
    newLength: Int,
    newSelection: CoreTextRange?
  ): Unit

  @InterfaceMethod(29)
  public fun NotifySelectionChanged(selection: CoreTextRange?): Unit

  @InterfaceMethod(30)
  public fun NotifyLayoutChanged(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreTextEditContext> {
    public override fun getValue() = ABI.makeICoreTextEditContext(pointer.getPointer(0))

    public fun setValue(value: ICoreTextEditContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreTextEditContext {
    public val __467561537_Ptr: Pointer?

    public val _467561537_VtblPtr: Pointer?
      get() = __467561537_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _467561537_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Name(value: String?): Unit {
      val fnPtr = _467561537_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_InputScope(): CoreTextInputScope? {
      val fnPtr = _467561537_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextInputScope>()
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextInputScope>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_InputScope(value: CoreTextInputScope?): Unit {
      val fnPtr = _467561537_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsReadOnly(): Boolean {
      val fnPtr = _467561537_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsReadOnly(value: Boolean): Unit {
      val fnPtr = _467561537_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_InputPaneDisplayPolicy(): CoreTextInputPaneDisplayPolicy? {
      val fnPtr = _467561537_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextInputPaneDisplayPolicy>()
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextInputPaneDisplayPolicy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_InputPaneDisplayPolicy(value: CoreTextInputPaneDisplayPolicy?): Unit {
      val fnPtr = _467561537_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_TextRequested(handler: TypedEventHandler<CoreTextEditContext?,
        CoreTextTextRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _467561537_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_TextRequested(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _467561537_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_SelectionRequested(handler: TypedEventHandler<CoreTextEditContext?,
        CoreTextSelectionRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _467561537_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_SelectionRequested(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _467561537_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_LayoutRequested(handler: TypedEventHandler<CoreTextEditContext?,
        CoreTextLayoutRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _467561537_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_LayoutRequested(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _467561537_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_TextUpdating(handler: TypedEventHandler<CoreTextEditContext?,
        CoreTextTextUpdatingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _467561537_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_TextUpdating(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _467561537_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun add_SelectionUpdating(handler: TypedEventHandler<CoreTextEditContext?,
        CoreTextSelectionUpdatingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _467561537_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_SelectionUpdating(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _467561537_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun add_FormatUpdating(handler: TypedEventHandler<CoreTextEditContext?,
        CoreTextFormatUpdatingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _467561537_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun remove_FormatUpdating(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _467561537_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun add_CompositionStarted(handler: TypedEventHandler<CoreTextEditContext?,
        CoreTextCompositionStartedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _467561537_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun remove_CompositionStarted(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _467561537_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun add_CompositionCompleted(handler: TypedEventHandler<CoreTextEditContext?,
        CoreTextCompositionCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _467561537_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun remove_CompositionCompleted(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _467561537_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun add_FocusRemoved(handler: TypedEventHandler<CoreTextEditContext?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _467561537_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun remove_FocusRemoved(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _467561537_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun NotifyFocusEnter(): Unit {
      val fnPtr = _467561537_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun NotifyFocusLeave(): Unit {
      val fnPtr = _467561537_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun NotifyTextChanged(
      modifiedRange: CoreTextRange?,
      newLength: Int,
      newSelection: CoreTextRange?
    ): Unit {
      val fnPtr = _467561537_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(modifiedRange), newLength,
          marshalToNative(newSelection),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun NotifySelectionChanged(selection: CoreTextRange?): Unit {
      val fnPtr = _467561537_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, marshalToNative(selection),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun NotifyLayoutChanged(): Unit {
      val fnPtr = _467561537_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467561537_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreTextEditContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __467561537_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreTextEditContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bf6608af404147c3b263a918eb5eaef2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreTextEditContext(ptr: Pointer?): WithDefault = ICoreTextEditContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreTextEditContext {
      val address = segment.toRawLongValue()
      return makeICoreTextEditContext(Pointer(address))
    }

    public override fun toNative(obj: ICoreTextEditContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__467561537_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreTextEditContext): Array<ICoreTextEditContext?> =
        (elements as
        Array<ICoreTextEditContext?>).castToImpl<ICoreTextEditContext,ICoreTextEditContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreTextEditContext?> =
        arrayOfNulls<ICoreTextEditContext_Impl>(size) as Array<ICoreTextEditContext?>
  }
}
