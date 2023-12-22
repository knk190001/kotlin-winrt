package Microsoft.UI.Xaml.Automation

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DragPatternIdentifiers.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.DragPatternIdentifiers;{aa2fdfd5-fb45-5d2b-8d92-a8e7b07061c2})")
@WinRTByReference(brClass = DragPatternIdentifiers.ByReference::class)
public class DragPatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDragPatternIdentifiers.WithDefault, IWinRTObject {
  private val __60895852_Interface: IDragPatternIdentifiers.WithDefault by lazy {
    as_60895852()
  }


  public override val __60895852_Ptr: JNAPointer? by lazy {
    __60895852_Interface.__60895852_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__60895852_Interface)

  private fun as_60895852(): IDragPatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(IDragPatternIdentifiers.ABI.makeIDragPatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDragPatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDragPatternIdentifiers.ABI.makeIDragPatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DragPatternIdentifiers> {
    public override fun getValue() = DragPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: DragPatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DragPatternIdentifiers, MemoryAddress> {
    public val IDragPatternIdentifiersStatics_Instance: IDragPatternIdentifiersStatics by lazy {
      createIDragPatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDragPatternIdentifiersStatics(): IDragPatternIdentifiersStatics {
      val refiid = Guid.REFIID(IDragPatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.DragPatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IDragPatternIdentifiersStatics.ABI.makeIDragPatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DragPatternIdentifiers {
      val address = segment.toRawLongValue()
      return DragPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: DragPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DropEffectProperty() =
        ABI.IDragPatternIdentifiersStatics_Instance.get_DropEffectProperty()

    public fun get_DropEffectsProperty() =
        ABI.IDragPatternIdentifiersStatics_Instance.get_DropEffectsProperty()

    public fun get_GrabbedItemsProperty() =
        ABI.IDragPatternIdentifiersStatics_Instance.get_GrabbedItemsProperty()

    public fun get_IsGrabbedProperty() =
        ABI.IDragPatternIdentifiersStatics_Instance.get_IsGrabbedProperty()
  }
}
