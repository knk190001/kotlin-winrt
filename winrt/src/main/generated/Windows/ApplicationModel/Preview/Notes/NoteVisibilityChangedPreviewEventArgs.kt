package Windows.ApplicationModel.Preview.Notes

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

@ABIMarker(NoteVisibilityChangedPreviewEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Preview.Notes.NoteVisibilityChangedPreviewEventArgs;{0e34649e-3815-4ff6-83b3-a14d17120e24})")
@WinRTByReference(brClass = NoteVisibilityChangedPreviewEventArgs.ByReference::class)
public class NoteVisibilityChangedPreviewEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INoteVisibilityChangedPreviewEventArgs.WithDefault, IWinRTObject {
  private val __1351422425_Interface: INoteVisibilityChangedPreviewEventArgs.WithDefault by lazy {
    as_1351422425()
  }


  public override val __1351422425_Ptr: JNAPointer? by lazy {
    __1351422425_Interface.__1351422425_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1351422425_Interface)

  private fun as_1351422425(): INoteVisibilityChangedPreviewEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INoteVisibilityChangedPreviewEventArgs.ABI.makeINoteVisibilityChangedPreviewEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INoteVisibilityChangedPreviewEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INoteVisibilityChangedPreviewEventArgs.ABI.makeINoteVisibilityChangedPreviewEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NoteVisibilityChangedPreviewEventArgs> {
    public override fun getValue() = NoteVisibilityChangedPreviewEventArgs(pointer.getPointer(0))

    public fun setValue(value: NoteVisibilityChangedPreviewEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NoteVisibilityChangedPreviewEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NoteVisibilityChangedPreviewEventArgs {
      val address = segment.toRawLongValue()
      return NoteVisibilityChangedPreviewEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NoteVisibilityChangedPreviewEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
