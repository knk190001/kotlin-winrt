package Windows.UI.Composition

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
@Signature("rc(Windows.UI.Composition.CompositionProjectedShadowReceiver;{1377985a-6a49-536a-9be4-a96a8e5298a9})")
@WinRTByReference(brClass = CompositionProjectedShadowReceiver.ByReference::class)
public class CompositionProjectedShadowReceiver(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionProjectedShadowReceiver.WithDefault, IWinRTObject {
  private val __1944354325_Interface: ICompositionProjectedShadowReceiver.WithDefault by lazy {
    as_1944354325()
  }


  public override val __1944354325_Ptr: JNAPointer? by lazy {
    __1944354325_Interface.__1944354325_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1944354325_Interface)

  private fun as_1944354325(): ICompositionProjectedShadowReceiver.WithDefault {
    if(pointer == NULL) {
      return(ICompositionProjectedShadowReceiver.ABI.makeICompositionProjectedShadowReceiver(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionProjectedShadowReceiver>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionProjectedShadowReceiver.ABI.makeICompositionProjectedShadowReceiver(ref.value))
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
