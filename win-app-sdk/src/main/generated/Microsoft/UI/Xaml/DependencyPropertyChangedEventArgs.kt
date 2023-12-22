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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DependencyPropertyChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.DependencyPropertyChangedEventArgs;{84ead020-7849-5e98-8030-488a80d164ec})")
@WinRTByReference(brClass = DependencyPropertyChangedEventArgs.ByReference::class)
public class DependencyPropertyChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDependencyPropertyChangedEventArgs.WithDefault, IWinRTObject {
  private val __684828458_Interface: IDependencyPropertyChangedEventArgs.WithDefault by lazy {
    as_684828458()
  }


  public override val __684828458_Ptr: JNAPointer? by lazy {
    __684828458_Interface.__684828458_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__684828458_Interface)

  private fun as_684828458(): IDependencyPropertyChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDependencyPropertyChangedEventArgs.ABI.makeIDependencyPropertyChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDependencyPropertyChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDependencyPropertyChangedEventArgs.ABI.makeIDependencyPropertyChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DependencyPropertyChangedEventArgs> {
    public override fun getValue() = DependencyPropertyChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DependencyPropertyChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DependencyPropertyChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DependencyPropertyChangedEventArgs {
      val address = segment.toRawLongValue()
      return DependencyPropertyChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DependencyPropertyChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
