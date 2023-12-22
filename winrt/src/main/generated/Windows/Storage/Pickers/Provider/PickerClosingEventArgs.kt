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

@ABIMarker(PickerClosingEventArgs.ABI::class)
@Signature("rc(Windows.Storage.Pickers.Provider.PickerClosingEventArgs;{7e59f224-b332-4f12-8b9f-a8c2f06b32cd})")
@WinRTByReference(brClass = PickerClosingEventArgs.ByReference::class)
public class PickerClosingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPickerClosingEventArgs.WithDefault, IWinRTObject {
  private val __1974455809_Interface: IPickerClosingEventArgs.WithDefault by lazy {
    as_1974455809()
  }


  public override val __1974455809_Ptr: JNAPointer? by lazy {
    __1974455809_Interface.__1974455809_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1974455809_Interface)

  private fun as_1974455809(): IPickerClosingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPickerClosingEventArgs.ABI.makeIPickerClosingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPickerClosingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPickerClosingEventArgs.ABI.makeIPickerClosingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PickerClosingEventArgs> {
    public override fun getValue() = PickerClosingEventArgs(pointer.getPointer(0))

    public fun setValue(value: PickerClosingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PickerClosingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PickerClosingEventArgs {
      val address = segment.toRawLongValue()
      return PickerClosingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PickerClosingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
