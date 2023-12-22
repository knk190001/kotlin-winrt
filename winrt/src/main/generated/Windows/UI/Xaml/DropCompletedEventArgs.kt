package Windows.UI.Xaml

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DropCompletedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.DropCompletedEventArgs;{6c4fc188-95bc-4261-9ec5-21cab677b734})")
@WinRTByReference(brClass = DropCompletedEventArgs.ByReference::class)
public class DropCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IDropCompletedEventArgs.WithDefault, IWinRTObject {
  private val __1379142995_Interface: IDropCompletedEventArgs.WithDefault by lazy {
    as_1379142995()
  }


  public override val __1379142995_Ptr: JNAPointer? by lazy {
    __1379142995_Interface.__1379142995_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1379142995_Interface)

  private fun as_1379142995(): IDropCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDropCompletedEventArgs.ABI.makeIDropCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDropCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDropCompletedEventArgs.ABI.makeIDropCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DropCompletedEventArgs> {
    public override fun getValue() = DropCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DropCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DropCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DropCompletedEventArgs {
      val address = segment.toRawLongValue()
      return DropCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DropCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
