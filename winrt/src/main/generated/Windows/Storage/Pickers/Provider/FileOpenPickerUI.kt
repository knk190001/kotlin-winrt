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

@ABIMarker(FileOpenPickerUI.ABI::class)
@Signature("rc(Windows.Storage.Pickers.Provider.FileOpenPickerUI;{dda45a10-f9d4-40c4-8af5-c5b6b5a61d1d})")
@WinRTByReference(brClass = FileOpenPickerUI.ByReference::class)
public class FileOpenPickerUI(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFileOpenPickerUI.WithDefault, IWinRTObject {
  private val __1516307545_Interface: IFileOpenPickerUI.WithDefault by lazy {
    as_1516307545()
  }


  public override val __1516307545_Ptr: JNAPointer? by lazy {
    __1516307545_Interface.__1516307545_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1516307545_Interface)

  private fun as_1516307545(): IFileOpenPickerUI.WithDefault {
    if(pointer == NULL) {
      return(IFileOpenPickerUI.ABI.makeIFileOpenPickerUI(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileOpenPickerUI>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileOpenPickerUI.ABI.makeIFileOpenPickerUI(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FileOpenPickerUI> {
    public override fun getValue() = FileOpenPickerUI(pointer.getPointer(0))

    public fun setValue(value: FileOpenPickerUI): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FileOpenPickerUI, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FileOpenPickerUI {
      val address = segment.toRawLongValue()
      return FileOpenPickerUI(Pointer(address))
    }

    public override fun toNative(obj: FileOpenPickerUI): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
