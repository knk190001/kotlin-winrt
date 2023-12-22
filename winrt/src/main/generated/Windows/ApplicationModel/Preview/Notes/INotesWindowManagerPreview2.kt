package Windows.ApplicationModel.Preview.Notes

import Windows.Foundation.IAsyncAction
import Windows.Graphics.Imaging.SoftwareBitmap
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(INotesWindowManagerPreview2.ABI::class)
@Signature("{edfe864a-1f54-4b09-9823-ff477f6fa3bc}")
@Guid("edfe864a1f544b099823ff477f6fa3bc")
@WinRTInterface("edfe864a1f544b099823ff477f6fa3bc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INotesWindowManagerPreview2.ByReference::class)
public interface INotesWindowManagerPreview2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShowNoteRelativeTo(
    noteViewId: Int,
    anchorNoteViewId: Int,
    options: NotesWindowManagerPreviewShowNoteOptions?
  ): Unit

  @InterfaceMethod(1)
  public fun ShowNoteWithPlacement(
    noteViewId: Int,
    `data`: IBuffer?,
    options: NotesWindowManagerPreviewShowNoteOptions?
  ): Unit

  @InterfaceMethod(2)
  public fun SetFocusToPreviousView(): Unit

  @InterfaceMethod(3)
  public fun SetThumbnailImageForTaskSwitcherAsync(bitmap: SoftwareBitmap?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INotesWindowManagerPreview2> {
    public override fun getValue() = ABI.makeINotesWindowManagerPreview2(pointer.getPointer(0))

    public fun setValue(value: INotesWindowManagerPreview2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INotesWindowManagerPreview2 {
    public val __1660985858_Ptr: Pointer?

    public val _1660985858_VtblPtr: Pointer?
      get() = __1660985858_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowNoteRelativeTo(
      noteViewId: Int,
      anchorNoteViewId: Int,
      options: NotesWindowManagerPreviewShowNoteOptions?
    ): Unit {
      val fnPtr = _1660985858_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1660985858_Ptr, noteViewId, anchorNoteViewId,
          marshalToNative(options),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun ShowNoteWithPlacement(
      noteViewId: Int,
      `data`: IBuffer?,
      options: NotesWindowManagerPreviewShowNoteOptions?
    ): Unit {
      val fnPtr = _1660985858_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1660985858_Ptr, noteViewId, marshalToNative(data),
          marshalToNative(options),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetFocusToPreviousView(): Unit {
      val fnPtr = _1660985858_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1660985858_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun SetThumbnailImageForTaskSwitcherAsync(bitmap: SoftwareBitmap?):
        IAsyncAction? {
      val fnPtr = _1660985858_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1660985858_Ptr, marshalToNative(bitmap), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class INotesWindowManagerPreview2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1660985858_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INotesWindowManagerPreview2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("edfe864a1f544b099823ff477f6fa3bc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINotesWindowManagerPreview2(ptr: Pointer?): WithDefault =
        INotesWindowManagerPreview2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INotesWindowManagerPreview2 {
      val address = segment.toRawLongValue()
      return makeINotesWindowManagerPreview2(Pointer(address))
    }

    public override fun toNative(obj: INotesWindowManagerPreview2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1660985858_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INotesWindowManagerPreview2):
        Array<INotesWindowManagerPreview2?> = (elements as
        Array<INotesWindowManagerPreview2?>).castToImpl<INotesWindowManagerPreview2,INotesWindowManagerPreview2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotesWindowManagerPreview2?> =
        arrayOfNulls<INotesWindowManagerPreview2_Impl>(size) as Array<INotesWindowManagerPreview2?>
  }
}
