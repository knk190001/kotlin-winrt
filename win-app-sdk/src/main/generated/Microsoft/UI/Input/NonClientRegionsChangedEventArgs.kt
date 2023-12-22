package Microsoft.UI.Input

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

@ABIMarker(NonClientRegionsChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Input.NonClientRegionsChangedEventArgs;{fe97ee95-1824-51b2-b8eb-10ff0665ce23})")
@WinRTByReference(brClass = NonClientRegionsChangedEventArgs.ByReference::class)
public class NonClientRegionsChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INonClientRegionsChangedEventArgs.WithDefault, IWinRTObject {
  private val __328956355_Interface: INonClientRegionsChangedEventArgs.WithDefault by lazy {
    as_328956355()
  }


  public override val __328956355_Ptr: JNAPointer? by lazy {
    __328956355_Interface.__328956355_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__328956355_Interface)

  private fun as_328956355(): INonClientRegionsChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INonClientRegionsChangedEventArgs.ABI.makeINonClientRegionsChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INonClientRegionsChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INonClientRegionsChangedEventArgs.ABI.makeINonClientRegionsChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NonClientRegionsChangedEventArgs> {
    public override fun getValue() = NonClientRegionsChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: NonClientRegionsChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NonClientRegionsChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NonClientRegionsChangedEventArgs {
      val address = segment.toRawLongValue()
      return NonClientRegionsChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NonClientRegionsChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
