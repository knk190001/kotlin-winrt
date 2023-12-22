package Microsoft.UI.Composition.Interactions

import Microsoft.UI.Composition.CompositionObject
import Microsoft.UI.Composition.Compositor
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(CompositionConditionalValue.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Interactions.CompositionConditionalValue;{3743dda0-fbe2-5ecf-9e80-4638a011f707})")
@WinRTByReference(brClass = CompositionConditionalValue.ByReference::class)
public class CompositionConditionalValue(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionConditionalValue.WithDefault, IWinRTObject {
  private val __593035925_Interface: ICompositionConditionalValue.WithDefault by lazy {
    as_593035925()
  }


  public override val __593035925_Ptr: JNAPointer? by lazy {
    __593035925_Interface.__593035925_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__593035925_Interface)

  private fun as_593035925(): ICompositionConditionalValue.WithDefault {
    if(pointer == NULL) {
      return(ICompositionConditionalValue.ABI.makeICompositionConditionalValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionConditionalValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionConditionalValue.ABI.makeICompositionConditionalValue(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionConditionalValue> {
    public override fun getValue() = CompositionConditionalValue(pointer.getPointer(0))

    public fun setValue(value: CompositionConditionalValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionConditionalValue, MemoryAddress> {
    public val ICompositionConditionalValueStatics_Instance: ICompositionConditionalValueStatics by
        lazy {
      createICompositionConditionalValueStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICompositionConditionalValueStatics(): ICompositionConditionalValueStatics {
      val refiid = Guid.REFIID(ICompositionConditionalValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.Interactions.CompositionConditionalValue".toHandle(),refiid,interfacePtr)
      val result =
          ICompositionConditionalValueStatics.ABI.makeICompositionConditionalValueStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CompositionConditionalValue {
      val address = segment.toRawLongValue()
      return CompositionConditionalValue(Pointer(address))
    }

    public override fun toNative(obj: CompositionConditionalValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(compositor: Compositor) =
        ABI.ICompositionConditionalValueStatics_Instance.Create(compositor)
  }
}
