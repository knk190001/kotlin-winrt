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

@ABIMarker(PickerClosingOperation.ABI::class)
@Signature("rc(Windows.Storage.Pickers.Provider.PickerClosingOperation;{4ce9fb84-beee-4e39-a773-fc5f0eae328d})")
@WinRTByReference(brClass = PickerClosingOperation.ByReference::class)
public class PickerClosingOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPickerClosingOperation.WithDefault, IWinRTObject {
  private val __688666415_Interface: IPickerClosingOperation.WithDefault by lazy {
    as_688666415()
  }


  public override val __688666415_Ptr: JNAPointer? by lazy {
    __688666415_Interface.__688666415_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__688666415_Interface)

  private fun as_688666415(): IPickerClosingOperation.WithDefault {
    if(pointer == NULL) {
      return(IPickerClosingOperation.ABI.makeIPickerClosingOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPickerClosingOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPickerClosingOperation.ABI.makeIPickerClosingOperation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PickerClosingOperation> {
    public override fun getValue() = PickerClosingOperation(pointer.getPointer(0))

    public fun setValue(value: PickerClosingOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PickerClosingOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PickerClosingOperation {
      val address = segment.toRawLongValue()
      return PickerClosingOperation(Pointer(address))
    }

    public override fun toNative(obj: PickerClosingOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
