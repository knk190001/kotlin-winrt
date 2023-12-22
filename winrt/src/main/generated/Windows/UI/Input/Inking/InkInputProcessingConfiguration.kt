package Windows.UI.Input.Inking

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

@ABIMarker(InkInputProcessingConfiguration.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkInputProcessingConfiguration;{2778d85e-33ca-4b06-a6d3-ac3945116d37})")
@WinRTByReference(brClass = InkInputProcessingConfiguration.ByReference::class)
public class InkInputProcessingConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkInputProcessingConfiguration.WithDefault, IWinRTObject {
  private val __1696365477_Interface: IInkInputProcessingConfiguration.WithDefault by lazy {
    as_1696365477()
  }


  public override val __1696365477_Ptr: JNAPointer? by lazy {
    __1696365477_Interface.__1696365477_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1696365477_Interface)

  private fun as_1696365477(): IInkInputProcessingConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IInkInputProcessingConfiguration.ABI.makeIInkInputProcessingConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkInputProcessingConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkInputProcessingConfiguration.ABI.makeIInkInputProcessingConfiguration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkInputProcessingConfiguration> {
    public override fun getValue() = InkInputProcessingConfiguration(pointer.getPointer(0))

    public fun setValue(value: InkInputProcessingConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkInputProcessingConfiguration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkInputProcessingConfiguration {
      val address = segment.toRawLongValue()
      return InkInputProcessingConfiguration(Pointer(address))
    }

    public override fun toNative(obj: InkInputProcessingConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
