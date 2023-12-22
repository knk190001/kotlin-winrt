package Microsoft.UI.Xaml.Input

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

@ABIMarker(InertiaTranslationBehavior.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.InertiaTranslationBehavior;{d4f91cf5-3317-5914-b25a-ea6ee55b96d0})")
@WinRTByReference(brClass = InertiaTranslationBehavior.ByReference::class)
public class InertiaTranslationBehavior(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInertiaTranslationBehavior.WithDefault, IWinRTObject {
  private val __2022530132_Interface: IInertiaTranslationBehavior.WithDefault by lazy {
    as_2022530132()
  }


  public override val __2022530132_Ptr: JNAPointer? by lazy {
    __2022530132_Interface.__2022530132_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2022530132_Interface)

  private fun as_2022530132(): IInertiaTranslationBehavior.WithDefault {
    if(pointer == NULL) {
      return(IInertiaTranslationBehavior.ABI.makeIInertiaTranslationBehavior(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInertiaTranslationBehavior>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInertiaTranslationBehavior.ABI.makeIInertiaTranslationBehavior(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InertiaTranslationBehavior> {
    public override fun getValue() = InertiaTranslationBehavior(pointer.getPointer(0))

    public fun setValue(value: InertiaTranslationBehavior): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InertiaTranslationBehavior, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InertiaTranslationBehavior {
      val address = segment.toRawLongValue()
      return InertiaTranslationBehavior(Pointer(address))
    }

    public override fun toNative(obj: InertiaTranslationBehavior): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
