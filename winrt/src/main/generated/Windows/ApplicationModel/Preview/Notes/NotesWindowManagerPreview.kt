package Windows.ApplicationModel.Preview.Notes

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(NotesWindowManagerPreview.ABI::class)
@Signature("rc(Windows.ApplicationModel.Preview.Notes.NotesWindowManagerPreview;{dc2ac23e-4850-4f13-9cc7-ff487efdfcde})")
@WinRTByReference(brClass = NotesWindowManagerPreview.ByReference::class)
public class NotesWindowManagerPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INotesWindowManagerPreview.WithDefault,
    INotesWindowManagerPreview2.WithDefault, IWinRTObject {
  private val __1577600844_Interface: INotesWindowManagerPreview.WithDefault by lazy {
    as_1577600844()
  }


  private val __1660985858_Interface: INotesWindowManagerPreview2.WithDefault by lazy {
    as_1660985858()
  }


  public override val __1577600844_Ptr: JNAPointer? by lazy {
    __1577600844_Interface.__1577600844_Ptr
  }


  public override val __1660985858_Ptr: JNAPointer? by lazy {
    __1660985858_Interface.__1660985858_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1577600844_Interface, __1660985858_Interface)

  private fun as_1577600844(): INotesWindowManagerPreview.WithDefault {
    if(pointer == NULL) {
      return(INotesWindowManagerPreview.ABI.makeINotesWindowManagerPreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INotesWindowManagerPreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INotesWindowManagerPreview.ABI.makeINotesWindowManagerPreview(ref.value))
  }

  private fun as_1660985858(): INotesWindowManagerPreview2.WithDefault {
    if(pointer == NULL) {
      return(INotesWindowManagerPreview2.ABI.makeINotesWindowManagerPreview2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INotesWindowManagerPreview2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INotesWindowManagerPreview2.ABI.makeINotesWindowManagerPreview2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NotesWindowManagerPreview> {
    public override fun getValue() = NotesWindowManagerPreview(pointer.getPointer(0))

    public fun setValue(value: NotesWindowManagerPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NotesWindowManagerPreview, MemoryAddress> {
    public val INotesWindowManagerPreviewStatics_Instance: INotesWindowManagerPreviewStatics by
        lazy {
      createINotesWindowManagerPreviewStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINotesWindowManagerPreviewStatics(): INotesWindowManagerPreviewStatics {
      val refiid = Guid.REFIID(INotesWindowManagerPreviewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Preview.Notes.NotesWindowManagerPreview".toHandle(),refiid,interfacePtr)
      val result =
          INotesWindowManagerPreviewStatics.ABI.makeINotesWindowManagerPreviewStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): NotesWindowManagerPreview {
      val address = segment.toRawLongValue()
      return NotesWindowManagerPreview(Pointer(address))
    }

    public override fun toNative(obj: NotesWindowManagerPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentApp() =
        ABI.INotesWindowManagerPreviewStatics_Instance.GetForCurrentApp()
  }
}
