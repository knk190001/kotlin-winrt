package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IComboBoxItemFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Primitives.SelectorItem
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

@ABIMarker(ComboBoxItem.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ComboBoxItem;{df65f6f4-863f-558d-bc4e-82c12f28062f})")
@WinRTByReference(brClass = ComboBoxItem.ByReference::class)
public open class ComboBoxItem(
  ptr: JNAPointer? = NULL
) : SelectorItem(ptr), IComboBoxItem.WithDefault, IWinRTObject {
  private val __2035291479_Interface: IComboBoxItem.WithDefault by lazy {
    as_2035291479()
  }


  public override val __2035291479_Ptr: JNAPointer? by lazy {
    __2035291479_Interface.__2035291479_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2035291479_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2035291479(): IComboBoxItem.WithDefault {
    if(pointer == NULL) {
      return(IComboBoxItem.ABI.makeIComboBoxItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IComboBoxItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IComboBoxItem.ABI.makeIComboBoxItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ComboBoxItem> {
    public override fun getValue() = ComboBoxItem(pointer.getPointer(0))

    public fun setValue(value: ComboBoxItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ComboBoxItem, MemoryAddress> {
    public val IComboBoxItemFactory_Instance: IComboBoxItemFactory by lazy {
      createIComboBoxItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIComboBoxItemFactory(): IComboBoxItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ComboBoxItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IComboBoxItemFactory.ABI.makeIComboBoxItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IComboBoxItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ComboBoxItem {
      val address = segment.toRawLongValue()
      return ComboBoxItem(Pointer(address))
    }

    public override fun toNative(obj: ComboBoxItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
