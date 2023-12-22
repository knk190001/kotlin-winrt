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

@ABIMarker(ExceptionRoutedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.ExceptionRoutedEventArgs;{e8bcb6d2-d3f5-5393-a84f-dfcd44a2df34})")
@WinRTByReference(brClass = ExceptionRoutedEventArgs.ByReference::class)
public open class ExceptionRoutedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IExceptionRoutedEventArgs.WithDefault, IWinRTObject {
  private val __222873748_Interface: IExceptionRoutedEventArgs.WithDefault by lazy {
    as_222873748()
  }


  public override val __222873748_Ptr: JNAPointer? by lazy {
    __222873748_Interface.__222873748_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__222873748_Interface)

  private fun as_222873748(): IExceptionRoutedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IExceptionRoutedEventArgs.ABI.makeIExceptionRoutedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExceptionRoutedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExceptionRoutedEventArgs.ABI.makeIExceptionRoutedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExceptionRoutedEventArgs> {
    public override fun getValue() = ExceptionRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ExceptionRoutedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExceptionRoutedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ExceptionRoutedEventArgs {
      val address = segment.toRawLongValue()
      return ExceptionRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ExceptionRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
