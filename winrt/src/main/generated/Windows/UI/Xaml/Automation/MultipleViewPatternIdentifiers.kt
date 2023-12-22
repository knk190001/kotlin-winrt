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

@ABIMarker(MultipleViewPatternIdentifiers.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.MultipleViewPatternIdentifiers;{5d5cd3b8-1e12-488b-b0ea-5e6cb89816e1})")
@WinRTByReference(brClass = MultipleViewPatternIdentifiers.ByReference::class)
public class MultipleViewPatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMultipleViewPatternIdentifiers.WithDefault, IWinRTObject {
  private val __1196836022_Interface: IMultipleViewPatternIdentifiers.WithDefault by lazy {
    as_1196836022()
  }


  public override val __1196836022_Ptr: JNAPointer? by lazy {
    __1196836022_Interface.__1196836022_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1196836022_Interface)

  private fun as_1196836022(): IMultipleViewPatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(IMultipleViewPatternIdentifiers.ABI.makeIMultipleViewPatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMultipleViewPatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMultipleViewPatternIdentifiers.ABI.makeIMultipleViewPatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MultipleViewPatternIdentifiers> {
    public override fun getValue() = MultipleViewPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: MultipleViewPatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MultipleViewPatternIdentifiers, MemoryAddress> {
    public val IMultipleViewPatternIdentifiersStatics_Instance:
        IMultipleViewPatternIdentifiersStatics by lazy {
      createIMultipleViewPatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMultipleViewPatternIdentifiersStatics():
        IMultipleViewPatternIdentifiersStatics {
      val refiid = Guid.REFIID(IMultipleViewPatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.MultipleViewPatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IMultipleViewPatternIdentifiersStatics.ABI.makeIMultipleViewPatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MultipleViewPatternIdentifiers {
      val address = segment.toRawLongValue()
      return MultipleViewPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: MultipleViewPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CurrentViewProperty() =
        ABI.IMultipleViewPatternIdentifiersStatics_Instance.get_CurrentViewProperty()

    public fun get_SupportedViewsProperty() =
        ABI.IMultipleViewPatternIdentifiersStatics_Instance.get_SupportedViewsProperty()
  }
}
