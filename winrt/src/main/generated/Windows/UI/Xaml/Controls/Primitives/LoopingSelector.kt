package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Controls.Control
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

@ABIMarker(LoopingSelector.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.LoopingSelector;{4c9a3e04-4827-49d9-8806-093957b0fd21})")
@WinRTByReference(brClass = LoopingSelector.ByReference::class)
public class LoopingSelector(
  ptr: JNAPointer? = NULL
) : Control(ptr), ILoopingSelector.WithDefault, IWinRTObject {
  private val __1731200415_Interface: ILoopingSelector.WithDefault by lazy {
    as_1731200415()
  }


  public override val __1731200415_Ptr: JNAPointer? by lazy {
    __1731200415_Interface.__1731200415_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1731200415_Interface)

  private fun as_1731200415(): ILoopingSelector.WithDefault {
    if(pointer == NULL) {
      return(ILoopingSelector.ABI.makeILoopingSelector(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoopingSelector>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoopingSelector.ABI.makeILoopingSelector(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LoopingSelector> {
    public override fun getValue() = LoopingSelector(pointer.getPointer(0))

    public fun setValue(value: LoopingSelector): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LoopingSelector, MemoryAddress> {
    public val ILoopingSelectorStatics_Instance: ILoopingSelectorStatics by lazy {
      createILoopingSelectorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILoopingSelectorStatics(): ILoopingSelectorStatics {
      val refiid = Guid.REFIID(ILoopingSelectorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.LoopingSelector".toHandle(),refiid,interfacePtr)
      val result = ILoopingSelectorStatics.ABI.makeILoopingSelectorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LoopingSelector {
      val address = segment.toRawLongValue()
      return LoopingSelector(Pointer(address))
    }

    public override fun toNative(obj: LoopingSelector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ShouldLoopProperty() =
        ABI.ILoopingSelectorStatics_Instance.get_ShouldLoopProperty()

    public fun get_ItemsProperty() = ABI.ILoopingSelectorStatics_Instance.get_ItemsProperty()

    public fun get_SelectedIndexProperty() =
        ABI.ILoopingSelectorStatics_Instance.get_SelectedIndexProperty()

    public fun get_SelectedItemProperty() =
        ABI.ILoopingSelectorStatics_Instance.get_SelectedItemProperty()

    public fun get_ItemWidthProperty() =
        ABI.ILoopingSelectorStatics_Instance.get_ItemWidthProperty()

    public fun get_ItemHeightProperty() =
        ABI.ILoopingSelectorStatics_Instance.get_ItemHeightProperty()

    public fun get_ItemTemplateProperty() =
        ABI.ILoopingSelectorStatics_Instance.get_ItemTemplateProperty()
  }
}
