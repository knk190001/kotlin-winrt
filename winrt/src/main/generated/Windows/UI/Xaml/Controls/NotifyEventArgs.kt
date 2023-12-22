package Windows.UI.Xaml.Controls

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

@ABIMarker(NotifyEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.NotifyEventArgs;{af0e05f7-c4b7-44c5-b09d-5cb7052b3a97})")
@WinRTByReference(brClass = NotifyEventArgs.ByReference::class)
public class NotifyEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INotifyEventArgs.WithDefault, INotifyEventArgs2.WithDefault, IWinRTObject {
  private val __1002508878_Interface: INotifyEventArgs.WithDefault by lazy {
    as_1002508878()
  }


  private val __1013004096_Interface: INotifyEventArgs2.WithDefault by lazy {
    as_1013004096()
  }


  public override val __1002508878_Ptr: JNAPointer? by lazy {
    __1002508878_Interface.__1002508878_Ptr
  }


  public override val __1013004096_Ptr: JNAPointer? by lazy {
    __1013004096_Interface.__1013004096_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1002508878_Interface, __1013004096_Interface)

  private fun as_1002508878(): INotifyEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INotifyEventArgs.ABI.makeINotifyEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INotifyEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INotifyEventArgs.ABI.makeINotifyEventArgs(ref.value))
  }

  private fun as_1013004096(): INotifyEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(INotifyEventArgs2.ABI.makeINotifyEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INotifyEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INotifyEventArgs2.ABI.makeINotifyEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NotifyEventArgs> {
    public override fun getValue() = NotifyEventArgs(pointer.getPointer(0))

    public fun setValue(value: NotifyEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NotifyEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NotifyEventArgs {
      val address = segment.toRawLongValue()
      return NotifyEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NotifyEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
