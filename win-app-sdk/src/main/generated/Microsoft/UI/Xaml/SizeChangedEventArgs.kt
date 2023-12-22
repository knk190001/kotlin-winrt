package Microsoft.UI.Xaml

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

@ABIMarker(SizeChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.SizeChangedEventArgs;{fe76324e-6dfb-58b1-9dcd-886ca8f9a2ea})")
@WinRTByReference(brClass = SizeChangedEventArgs.ByReference::class)
public class SizeChangedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), ISizeChangedEventArgs.WithDefault, IWinRTObject {
  private val __129905451_Interface: ISizeChangedEventArgs.WithDefault by lazy {
    as_129905451()
  }


  public override val __129905451_Ptr: JNAPointer? by lazy {
    __129905451_Interface.__129905451_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__129905451_Interface)

  private fun as_129905451(): ISizeChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISizeChangedEventArgs.ABI.makeISizeChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISizeChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISizeChangedEventArgs.ABI.makeISizeChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SizeChangedEventArgs> {
    public override fun getValue() = SizeChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SizeChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SizeChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SizeChangedEventArgs {
      val address = segment.toRawLongValue()
      return SizeChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SizeChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
