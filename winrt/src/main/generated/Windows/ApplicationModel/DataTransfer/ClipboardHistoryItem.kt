package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(ClipboardHistoryItem.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.ClipboardHistoryItem;{0173bd8a-afff-5c50-ab92-3d19f481ec58})")
@WinRTByReference(brClass = ClipboardHistoryItem.ByReference::class)
public class ClipboardHistoryItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IClipboardHistoryItem.WithDefault, IWinRTObject {
  private val __855427557_Interface: IClipboardHistoryItem.WithDefault by lazy {
    as_855427557()
  }


  public override val __855427557_Ptr: JNAPointer? by lazy {
    __855427557_Interface.__855427557_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__855427557_Interface)

  private fun as_855427557(): IClipboardHistoryItem.WithDefault {
    if(pointer == NULL) {
      return(IClipboardHistoryItem.ABI.makeIClipboardHistoryItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClipboardHistoryItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClipboardHistoryItem.ABI.makeIClipboardHistoryItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ClipboardHistoryItem> {
    public override fun getValue() = ClipboardHistoryItem(pointer.getPointer(0))

    public fun setValue(value: ClipboardHistoryItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ClipboardHistoryItem, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ClipboardHistoryItem {
      val address = segment.toRawLongValue()
      return ClipboardHistoryItem(Pointer(address))
    }

    public override fun toNative(obj: ClipboardHistoryItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
