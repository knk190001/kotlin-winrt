package Windows.Storage.Pickers.Provider

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

@ABIMarker(FileSavePickerUI.ABI::class)
@Signature("rc(Windows.Storage.Pickers.Provider.FileSavePickerUI;{9656c1e7-3e56-43cc-8a39-33c73d9d542b})")
@WinRTByReference(brClass = FileSavePickerUI.ByReference::class)
public class FileSavePickerUI(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFileSavePickerUI.WithDefault, IWinRTObject {
  private val __1036403572_Interface: IFileSavePickerUI.WithDefault by lazy {
    as_1036403572()
  }


  public override val __1036403572_Ptr: JNAPointer? by lazy {
    __1036403572_Interface.__1036403572_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1036403572_Interface)

  private fun as_1036403572(): IFileSavePickerUI.WithDefault {
    if(pointer == NULL) {
      return(IFileSavePickerUI.ABI.makeIFileSavePickerUI(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileSavePickerUI>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileSavePickerUI.ABI.makeIFileSavePickerUI(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FileSavePickerUI> {
    public override fun getValue() = FileSavePickerUI(pointer.getPointer(0))

    public fun setValue(value: FileSavePickerUI): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FileSavePickerUI, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FileSavePickerUI {
      val address = segment.toRawLongValue()
      return FileSavePickerUI(Pointer(address))
    }

    public override fun toNative(obj: FileSavePickerUI): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
