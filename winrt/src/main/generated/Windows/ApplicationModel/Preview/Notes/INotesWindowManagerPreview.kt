package Windows.ApplicationModel.Preview.Notes

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.Size
import Windows.Foundation.TypedEventHandler
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(INotesWindowManagerPreview.ABI::class)
@Signature("{dc2ac23e-4850-4f13-9cc7-ff487efdfcde}")
@Guid("dc2ac23e48504f139cc7ff487efdfcde")
@WinRTInterface("dc2ac23e48504f139cc7ff487efdfcde")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INotesWindowManagerPreview.ByReference::class)
public interface INotesWindowManagerPreview : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsScreenLocked(): Boolean

  @InterfaceMethod(1)
  public fun ShowNote(noteViewId: Int): Unit

  @InterfaceMethod(2)
  public fun ShowNoteRelativeTo(noteViewId: Int, anchorNoteViewId: Int): Unit

  @InterfaceMethod(3)
  public fun ShowNoteWithPlacement(noteViewId: Int, `data`: IBuffer?): Unit

  @InterfaceMethod(4)
  public fun HideNote(noteViewId: Int): Unit

  @InterfaceMethod(5)
  public fun GetNotePlacement(noteViewId: Int): IBuffer?

  @InterfaceMethod(6)
  public fun TrySetNoteSize(noteViewId: Int, size: Size?): Boolean

  @InterfaceMethod(7)
  public fun SetFocusToNextView(): Unit

  @InterfaceMethod(8)
  public fun SetNotesThumbnailAsync(thumbnail: IBuffer?): IAsyncAction?

  @InterfaceMethod(9)
  public fun add_SystemLockStateChanged(handler: TypedEventHandler<NotesWindowManagerPreview?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_SystemLockStateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_NotePlacementChanged(handler: TypedEventHandler<NotesWindowManagerPreview?,
      NotePlacementChangedPreviewEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_NotePlacementChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun add_NoteVisibilityChanged(handler: TypedEventHandler<NotesWindowManagerPreview?,
      NoteVisibilityChangedPreviewEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_NoteVisibilityChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INotesWindowManagerPreview> {
    public override fun getValue() = ABI.makeINotesWindowManagerPreview(pointer.getPointer(0))

    public fun setValue(value: INotesWindowManagerPreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INotesWindowManagerPreview {
    public val __1577600844_Ptr: Pointer?

    public val _1577600844_VtblPtr: Pointer?
      get() = __1577600844_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsScreenLocked(): Boolean {
      val fnPtr = _1577600844_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1577600844_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun ShowNote(noteViewId: Int): Unit {
      val fnPtr = _1577600844_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1577600844_Ptr, noteViewId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ShowNoteRelativeTo(noteViewId: Int, anchorNoteViewId: Int): Unit {
      val fnPtr = _1577600844_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1577600844_Ptr, noteViewId, anchorNoteViewId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun ShowNoteWithPlacement(noteViewId: Int, `data`: IBuffer?): Unit {
      val fnPtr = _1577600844_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1577600844_Ptr, noteViewId, marshalToNative(data),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun HideNote(noteViewId: Int): Unit {
      val fnPtr = _1577600844_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1577600844_Ptr, noteViewId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun GetNotePlacement(noteViewId: Int): IBuffer? {
      val fnPtr = _1577600844_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1577600844_Ptr, noteViewId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun TrySetNoteSize(noteViewId: Int, size: Size?): Boolean {
      val fnPtr = _1577600844_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1577600844_Ptr, noteViewId, marshalToNative(size), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun SetFocusToNextView(): Unit {
      val fnPtr = _1577600844_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1577600844_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun SetNotesThumbnailAsync(thumbnail: IBuffer?): IAsyncAction? {
      val fnPtr = _1577600844_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1577600844_Ptr, marshalToNative(thumbnail), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override
        fun add_SystemLockStateChanged(handler: TypedEventHandler<NotesWindowManagerPreview?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1577600844_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1577600844_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_SystemLockStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1577600844_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1577600844_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override
        fun add_NotePlacementChanged(handler: TypedEventHandler<NotesWindowManagerPreview?,
        NotePlacementChangedPreviewEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1577600844_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1577600844_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_NotePlacementChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1577600844_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1577600844_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override
        fun add_NoteVisibilityChanged(handler: TypedEventHandler<NotesWindowManagerPreview?,
        NoteVisibilityChangedPreviewEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1577600844_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1577600844_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_NoteVisibilityChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1577600844_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1577600844_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INotesWindowManagerPreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1577600844_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INotesWindowManagerPreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dc2ac23e48504f139cc7ff487efdfcde")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINotesWindowManagerPreview(ptr: Pointer?): WithDefault =
        INotesWindowManagerPreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INotesWindowManagerPreview {
      val address = segment.toRawLongValue()
      return makeINotesWindowManagerPreview(Pointer(address))
    }

    public override fun toNative(obj: INotesWindowManagerPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1577600844_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INotesWindowManagerPreview):
        Array<INotesWindowManagerPreview?> = (elements as
        Array<INotesWindowManagerPreview?>).castToImpl<INotesWindowManagerPreview,INotesWindowManagerPreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotesWindowManagerPreview?> =
        arrayOfNulls<INotesWindowManagerPreview_Impl>(size) as Array<INotesWindowManagerPreview?>
  }
}
