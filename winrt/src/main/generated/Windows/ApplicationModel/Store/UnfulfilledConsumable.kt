package Windows.ApplicationModel.Store

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

@ABIMarker(UnfulfilledConsumable.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.UnfulfilledConsumable;{2df7fbbb-1cdd-4cb8-a014-7b9cf8986927})")
@WinRTByReference(brClass = UnfulfilledConsumable.ByReference::class)
public class UnfulfilledConsumable(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUnfulfilledConsumable.WithDefault, IWinRTObject {
  private val __1118556151_Interface: IUnfulfilledConsumable.WithDefault by lazy {
    as_1118556151()
  }


  public override val __1118556151_Ptr: JNAPointer? by lazy {
    __1118556151_Interface.__1118556151_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1118556151_Interface)

  private fun as_1118556151(): IUnfulfilledConsumable.WithDefault {
    if(pointer == NULL) {
      return(IUnfulfilledConsumable.ABI.makeIUnfulfilledConsumable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUnfulfilledConsumable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUnfulfilledConsumable.ABI.makeIUnfulfilledConsumable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UnfulfilledConsumable> {
    public override fun getValue() = UnfulfilledConsumable(pointer.getPointer(0))

    public fun setValue(value: UnfulfilledConsumable): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UnfulfilledConsumable, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UnfulfilledConsumable {
      val address = segment.toRawLongValue()
      return UnfulfilledConsumable(Pointer(address))
    }

    public override fun toNative(obj: UnfulfilledConsumable): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
