package Windows.UI.Input.Spatial

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

@ABIMarker(SpatialInteractionSourceState.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialInteractionSourceState;{d5c475ef-4b63-37ec-98b9-9fc652b9d2f2})")
@WinRTByReference(brClass = SpatialInteractionSourceState.ByReference::class)
public class SpatialInteractionSourceState(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialInteractionSourceState.WithDefault,
    ISpatialInteractionSourceState2.WithDefault, ISpatialInteractionSourceState3.WithDefault,
    IWinRTObject {
  private val __996687024_Interface: ISpatialInteractionSourceState.WithDefault by lazy {
    as_996687024()
  }


  private val __832526622_Interface: ISpatialInteractionSourceState2.WithDefault by lazy {
    as_832526622()
  }


  private val __832526621_Interface: ISpatialInteractionSourceState3.WithDefault by lazy {
    as_832526621()
  }


  public override val __996687024_Ptr: JNAPointer? by lazy {
    __996687024_Interface.__996687024_Ptr
  }


  public override val __832526622_Ptr: JNAPointer? by lazy {
    __832526622_Interface.__832526622_Ptr
  }


  public override val __832526621_Ptr: JNAPointer? by lazy {
    __832526621_Interface.__832526621_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__996687024_Interface, __832526622_Interface, __832526621_Interface)

  private fun as_996687024(): ISpatialInteractionSourceState.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionSourceState.ABI.makeISpatialInteractionSourceState(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionSourceState>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionSourceState.ABI.makeISpatialInteractionSourceState(ref.value))
  }

  private fun as_832526622(): ISpatialInteractionSourceState2.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionSourceState2.ABI.makeISpatialInteractionSourceState2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionSourceState2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionSourceState2.ABI.makeISpatialInteractionSourceState2(ref.value))
  }

  private fun as_832526621(): ISpatialInteractionSourceState3.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionSourceState3.ABI.makeISpatialInteractionSourceState3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionSourceState3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionSourceState3.ABI.makeISpatialInteractionSourceState3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialInteractionSourceState> {
    public override fun getValue() = SpatialInteractionSourceState(pointer.getPointer(0))

    public fun setValue(value: SpatialInteractionSourceState): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialInteractionSourceState, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialInteractionSourceState {
      val address = segment.toRawLongValue()
      return SpatialInteractionSourceState(Pointer(address))
    }

    public override fun toNative(obj: SpatialInteractionSourceState): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
