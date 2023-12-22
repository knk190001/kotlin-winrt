package Windows.UI.Xaml.Automation

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

@ABIMarker(DropTargetPatternIdentifiers.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.DropTargetPatternIdentifiers;{11865133-a6fe-4634-bd18-0ef612b7b208})")
@WinRTByReference(brClass = DropTargetPatternIdentifiers.ByReference::class)
public class DropTargetPatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDropTargetPatternIdentifiers.WithDefault, IWinRTObject {
  private val __1511602645_Interface: IDropTargetPatternIdentifiers.WithDefault by lazy {
    as_1511602645()
  }


  public override val __1511602645_Ptr: JNAPointer? by lazy {
    __1511602645_Interface.__1511602645_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1511602645_Interface)

  private fun as_1511602645(): IDropTargetPatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(IDropTargetPatternIdentifiers.ABI.makeIDropTargetPatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDropTargetPatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDropTargetPatternIdentifiers.ABI.makeIDropTargetPatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DropTargetPatternIdentifiers> {
    public override fun getValue() = DropTargetPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: DropTargetPatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DropTargetPatternIdentifiers, MemoryAddress> {
    public val IDropTargetPatternIdentifiersStatics_Instance: IDropTargetPatternIdentifiersStatics
        by lazy {
      createIDropTargetPatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDropTargetPatternIdentifiersStatics(): IDropTargetPatternIdentifiersStatics {
      val refiid = Guid.REFIID(IDropTargetPatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.DropTargetPatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IDropTargetPatternIdentifiersStatics.ABI.makeIDropTargetPatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DropTargetPatternIdentifiers {
      val address = segment.toRawLongValue()
      return DropTargetPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: DropTargetPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DropTargetEffectProperty() =
        ABI.IDropTargetPatternIdentifiersStatics_Instance.get_DropTargetEffectProperty()

    public fun get_DropTargetEffectsProperty() =
        ABI.IDropTargetPatternIdentifiersStatics_Instance.get_DropTargetEffectsProperty()
  }
}
