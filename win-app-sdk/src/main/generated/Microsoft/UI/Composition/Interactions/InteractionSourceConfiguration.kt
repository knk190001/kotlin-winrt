package Microsoft.UI.Composition.Interactions

import Microsoft.UI.Composition.CompositionObject
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

@ABIMarker(InteractionSourceConfiguration.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Interactions.InteractionSourceConfiguration;{099e0124-dadf-5bc6-a895-90387657550f})")
@WinRTByReference(brClass = InteractionSourceConfiguration.ByReference::class)
public class InteractionSourceConfiguration(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), IInteractionSourceConfiguration.WithDefault, IWinRTObject {
  private val __424579155_Interface: IInteractionSourceConfiguration.WithDefault by lazy {
    as_424579155()
  }


  public override val __424579155_Ptr: JNAPointer? by lazy {
    __424579155_Interface.__424579155_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__424579155_Interface)

  private fun as_424579155(): IInteractionSourceConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IInteractionSourceConfiguration.ABI.makeIInteractionSourceConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionSourceConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionSourceConfiguration.ABI.makeIInteractionSourceConfiguration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InteractionSourceConfiguration> {
    public override fun getValue() = InteractionSourceConfiguration(pointer.getPointer(0))

    public fun setValue(value: InteractionSourceConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InteractionSourceConfiguration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InteractionSourceConfiguration {
      val address = segment.toRawLongValue()
      return InteractionSourceConfiguration(Pointer(address))
    }

    public override fun toNative(obj: InteractionSourceConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
