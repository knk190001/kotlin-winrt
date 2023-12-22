package Windows.ApplicationModel.Preview.Notes

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(NotesWindowManagerPreviewShowNoteOptions.ABI::class)
@Signature("rc(Windows.ApplicationModel.Preview.Notes.NotesWindowManagerPreviewShowNoteOptions;{886b09d6-a6ae-4007-a56d-1ca70c84c0d2})")
@WinRTByReference(brClass = NotesWindowManagerPreviewShowNoteOptions.ByReference::class)
public class NotesWindowManagerPreviewShowNoteOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INotesWindowManagerPreviewShowNoteOptions.WithDefault, IWinRTObject {
  private val __854652859_Interface: INotesWindowManagerPreviewShowNoteOptions.WithDefault by lazy {
    as_854652859()
  }


  public override val __854652859_Ptr: JNAPointer? by lazy {
    __854652859_Interface.__854652859_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__854652859_Interface)

  public constructor() : this(ABI.activate())

  private fun as_854652859(): INotesWindowManagerPreviewShowNoteOptions.WithDefault {
    if(pointer == NULL) {
      return(INotesWindowManagerPreviewShowNoteOptions.ABI.makeINotesWindowManagerPreviewShowNoteOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INotesWindowManagerPreviewShowNoteOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INotesWindowManagerPreviewShowNoteOptions.ABI.makeINotesWindowManagerPreviewShowNoteOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NotesWindowManagerPreviewShowNoteOptions> {
    public override fun getValue() = NotesWindowManagerPreviewShowNoteOptions(pointer.getPointer(0))

    public fun setValue(value: NotesWindowManagerPreviewShowNoteOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NotesWindowManagerPreviewShowNoteOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Preview.Notes.NotesWindowManagerPreviewShowNoteOptions".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress):
        NotesWindowManagerPreviewShowNoteOptions {
      val address = segment.toRawLongValue()
      return NotesWindowManagerPreviewShowNoteOptions(Pointer(address))
    }

    public override fun toNative(obj: NotesWindowManagerPreviewShowNoteOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
