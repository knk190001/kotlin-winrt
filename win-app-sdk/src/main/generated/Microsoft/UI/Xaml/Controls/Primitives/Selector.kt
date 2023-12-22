package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.ItemsControl
import Microsoft.UI.Xaml.DependencyObject
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

@ABIMarker(Selector.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.Selector;{8f7e2159-e61d-576f-8476-f83fde3d689e})")
@WinRTByReference(brClass = Selector.ByReference::class)
public open class Selector(
  ptr: JNAPointer? = NULL
) : ItemsControl(ptr), ISelector.WithDefault, IWinRTObject {
  private val __2076328752_Interface: ISelector.WithDefault by lazy {
    as_2076328752()
  }


  public override val __2076328752_Ptr: JNAPointer? by lazy {
    __2076328752_Interface.__2076328752_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2076328752_Interface)

  private fun as_2076328752(): ISelector.WithDefault {
    if(pointer == NULL) {
      return(ISelector.ABI.makeISelector(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISelector>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelector.ABI.makeISelector(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Selector> {
    public override fun getValue() = Selector(pointer.getPointer(0))

    public fun setValue(value: Selector): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Selector, MemoryAddress> {
    public val ISelectorStatics_Instance: ISelectorStatics by lazy {
      createISelectorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISelectorStatics(): ISelectorStatics {
      val refiid = Guid.REFIID(ISelectorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.Selector".toHandle(),refiid,interfacePtr)
      val result = ISelectorStatics.ABI.makeISelectorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Selector {
      val address = segment.toRawLongValue()
      return Selector(Pointer(address))
    }

    public override fun toNative(obj: Selector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SelectedIndexProperty() =
        ABI.ISelectorStatics_Instance.get_SelectedIndexProperty()

    public fun get_SelectedItemProperty() = ABI.ISelectorStatics_Instance.get_SelectedItemProperty()

    public fun get_SelectedValueProperty() =
        ABI.ISelectorStatics_Instance.get_SelectedValueProperty()

    public fun get_SelectedValuePathProperty() =
        ABI.ISelectorStatics_Instance.get_SelectedValuePathProperty()

    public fun get_IsSynchronizedWithCurrentItemProperty() =
        ABI.ISelectorStatics_Instance.get_IsSynchronizedWithCurrentItemProperty()

    public fun GetIsSelectionActive(element: DependencyObject) =
        ABI.ISelectorStatics_Instance.GetIsSelectionActive(element)
  }
}
