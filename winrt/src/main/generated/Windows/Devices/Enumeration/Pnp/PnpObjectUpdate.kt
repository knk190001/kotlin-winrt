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

@ABIMarker(PnpObjectUpdate.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.Pnp.PnpObjectUpdate;{6f59e812-001e-4844-bcc6-432886856a17})")
@WinRTByReference(brClass = PnpObjectUpdate.ByReference::class)
public class PnpObjectUpdate(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPnpObjectUpdate.WithDefault, IWinRTObject {
  private val __398427840_Interface: IPnpObjectUpdate.WithDefault by lazy {
    as_398427840()
  }


  public override val __398427840_Ptr: JNAPointer? by lazy {
    __398427840_Interface.__398427840_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__398427840_Interface)

  private fun as_398427840(): IPnpObjectUpdate.WithDefault {
    if(pointer == NULL) {
      return(IPnpObjectUpdate.ABI.makeIPnpObjectUpdate(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPnpObjectUpdate>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPnpObjectUpdate.ABI.makeIPnpObjectUpdate(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PnpObjectUpdate> {
    public override fun getValue() = PnpObjectUpdate(pointer.getPointer(0))

    public fun setValue(value: PnpObjectUpdate): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PnpObjectUpdate, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PnpObjectUpdate {
      val address = segment.toRawLongValue()
      return PnpObjectUpdate(Pointer(address))
    }

    public override fun toNative(obj: PnpObjectUpdate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
