package Windows.UI.Xaml.Input

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

@ABIMarker(CanExecuteRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.CanExecuteRequestedEventArgs;{c8e75256-1950-505d-993b-75907ef96830})")
@WinRTByReference(brClass = CanExecuteRequestedEventArgs.ByReference::class)
public class CanExecuteRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICanExecuteRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1009782012_Interface: ICanExecuteRequestedEventArgs.WithDefault by lazy {
    as_1009782012()
  }


  public override val __1009782012_Ptr: JNAPointer? by lazy {
    __1009782012_Interface.__1009782012_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1009782012_Interface)

  private fun as_1009782012(): ICanExecuteRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICanExecuteRequestedEventArgs.ABI.makeICanExecuteRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICanExecuteRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICanExecuteRequestedEventArgs.ABI.makeICanExecuteRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CanExecuteRequestedEventArgs> {
    public override fun getValue() = CanExecuteRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CanExecuteRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CanExecuteRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CanExecuteRequestedEventArgs {
      val address = segment.toRawLongValue()
      return CanExecuteRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CanExecuteRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
