package Windows.Devices.Enumeration.Pnp

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

@ABIMarker(PnpObjectWatcher.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.Pnp.PnpObjectWatcher;{83c95ca8-4772-4a7a-aca8-e48c42a89c44})")
@WinRTByReference(brClass = PnpObjectWatcher.ByReference::class)
public class PnpObjectWatcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPnpObjectWatcher.WithDefault, IWinRTObject {
  private val __826755749_Interface: IPnpObjectWatcher.WithDefault by lazy {
    as_826755749()
  }


  public override val __826755749_Ptr: JNAPointer? by lazy {
    __826755749_Interface.__826755749_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__826755749_Interface)

  private fun as_826755749(): IPnpObjectWatcher.WithDefault {
    if(pointer == NULL) {
      return(IPnpObjectWatcher.ABI.makeIPnpObjectWatcher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPnpObjectWatcher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPnpObjectWatcher.ABI.makeIPnpObjectWatcher(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PnpObjectWatcher> {
    public override fun getValue() = PnpObjectWatcher(pointer.getPointer(0))

    public fun setValue(value: PnpObjectWatcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PnpObjectWatcher, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PnpObjectWatcher {
      val address = segment.toRawLongValue()
      return PnpObjectWatcher(Pointer(address))
    }

    public override fun toNative(obj: PnpObjectWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
