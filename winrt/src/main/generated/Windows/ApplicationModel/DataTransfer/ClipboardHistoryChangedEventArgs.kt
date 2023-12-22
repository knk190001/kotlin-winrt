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

@ABIMarker(ClipboardHistoryChangedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.ClipboardHistoryChangedEventArgs;{c0be453f-8ea2-53ce-9aba-8d2212573452})")
@WinRTByReference(brClass = ClipboardHistoryChangedEventArgs.ByReference::class)
public class ClipboardHistoryChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IClipboardHistoryChangedEventArgs.WithDefault, IWinRTObject {
  private val __809971381_Interface: IClipboardHistoryChangedEventArgs.WithDefault by lazy {
    as_809971381()
  }


  public override val __809971381_Ptr: JNAPointer? by lazy {
    __809971381_Interface.__809971381_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__809971381_Interface)

  private fun as_809971381(): IClipboardHistoryChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IClipboardHistoryChangedEventArgs.ABI.makeIClipboardHistoryChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClipboardHistoryChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClipboardHistoryChangedEventArgs.ABI.makeIClipboardHistoryChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ClipboardHistoryChangedEventArgs> {
    public override fun getValue() = ClipboardHistoryChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ClipboardHistoryChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ClipboardHistoryChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ClipboardHistoryChangedEventArgs {
      val address = segment.toRawLongValue()
      return ClipboardHistoryChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ClipboardHistoryChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
