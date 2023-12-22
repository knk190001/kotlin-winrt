package Windows.Perception.Spatial

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

@ABIMarker(SpatialAnchorStore.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialAnchorStore;{b0bc3636-486a-3cb0-9e6f-1245165c4db6})")
@WinRTByReference(brClass = SpatialAnchorStore.ByReference::class)
public class SpatialAnchorStore(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialAnchorStore.WithDefault, IWinRTObject {
  private val __1685548085_Interface: ISpatialAnchorStore.WithDefault by lazy {
    as_1685548085()
  }


  public override val __1685548085_Ptr: JNAPointer? by lazy {
    __1685548085_Interface.__1685548085_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1685548085_Interface)

  private fun as_1685548085(): ISpatialAnchorStore.WithDefault {
    if(pointer == NULL) {
      return(ISpatialAnchorStore.ABI.makeISpatialAnchorStore(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialAnchorStore>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialAnchorStore.ABI.makeISpatialAnchorStore(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialAnchorStore> {
    public override fun getValue() = SpatialAnchorStore(pointer.getPointer(0))

    public fun setValue(value: SpatialAnchorStore): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialAnchorStore, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialAnchorStore {
      val address = segment.toRawLongValue()
      return SpatialAnchorStore(Pointer(address))
    }

    public override fun toNative(obj: SpatialAnchorStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
