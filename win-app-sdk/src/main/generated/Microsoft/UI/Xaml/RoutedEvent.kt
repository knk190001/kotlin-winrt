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

@ABIMarker(RoutedEvent.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.RoutedEvent;{b2b432bc-efca-575e-9d2a-703f8b9c380f})")
@WinRTByReference(brClass = RoutedEvent.ByReference::class)
public class RoutedEvent(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRoutedEvent.WithDefault, IWinRTObject {
  private val __921918840_Interface: IRoutedEvent.WithDefault by lazy {
    as_921918840()
  }


  public override val __921918840_Ptr: JNAPointer? by lazy {
    __921918840_Interface.__921918840_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__921918840_Interface)

  private fun as_921918840(): IRoutedEvent.WithDefault {
    if(pointer == NULL) {
      return(IRoutedEvent.ABI.makeIRoutedEvent(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRoutedEvent>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRoutedEvent.ABI.makeIRoutedEvent(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RoutedEvent> {
    public override fun getValue() = RoutedEvent(pointer.getPointer(0))

    public fun setValue(value: RoutedEvent): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RoutedEvent, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RoutedEvent {
      val address = segment.toRawLongValue()
      return RoutedEvent(Pointer(address))
    }

    public override fun toNative(obj: RoutedEvent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
