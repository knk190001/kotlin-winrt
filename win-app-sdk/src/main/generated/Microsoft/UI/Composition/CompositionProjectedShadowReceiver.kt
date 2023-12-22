package Microsoft.UI.Composition

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

@ABIMarker(CompositionProjectedShadowReceiver.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionProjectedShadowReceiver;{29fe12b0-f1a0-50e1-af28-2e943bc819d6})")
@WinRTByReference(brClass = CompositionProjectedShadowReceiver.ByReference::class)
public class CompositionProjectedShadowReceiver(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionProjectedShadowReceiver.WithDefault,
    IExpCompositionProjectedShadowReceiver.WithDefault, IWinRTObject {
  private val __385582998_Interface: ICompositionProjectedShadowReceiver.WithDefault by lazy {
    as_385582998()
  }


  private val __682346561_Interface: IExpCompositionProjectedShadowReceiver.WithDefault by lazy {
    as_682346561()
  }


  public override val __385582998_Ptr: JNAPointer? by lazy {
    __385582998_Interface.__385582998_Ptr
  }


  public override val __682346561_Ptr: JNAPointer? by lazy {
    __682346561_Interface.__682346561_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__385582998_Interface, __682346561_Interface)

  private fun as_385582998(): ICompositionProjectedShadowReceiver.WithDefault {
    if(pointer == NULL) {
      return(ICompositionProjectedShadowReceiver.ABI.makeICompositionProjectedShadowReceiver(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionProjectedShadowReceiver>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionProjectedShadowReceiver.ABI.makeICompositionProjectedShadowReceiver(ref.value))
  }

  private fun as_682346561(): IExpCompositionProjectedShadowReceiver.WithDefault {
    if(pointer == NULL) {
      return(IExpCompositionProjectedShadowReceiver.ABI.makeIExpCompositionProjectedShadowReceiver(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpCompositionProjectedShadowReceiver>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpCompositionProjectedShadowReceiver.ABI.makeIExpCompositionProjectedShadowReceiver(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionProjectedShadowReceiver> {
    public override fun getValue() = CompositionProjectedShadowReceiver(pointer.getPointer(0))

    public fun setValue(value: CompositionProjectedShadowReceiver): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionProjectedShadowReceiver, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionProjectedShadowReceiver {
      val address = segment.toRawLongValue()
      return CompositionProjectedShadowReceiver(Pointer(address))
    }

    public override fun toNative(obj: CompositionProjectedShadowReceiver): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
