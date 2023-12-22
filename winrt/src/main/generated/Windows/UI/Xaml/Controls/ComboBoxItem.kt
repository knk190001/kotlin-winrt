package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IComboBoxItemFactory.ABI.IID
import Windows.UI.Xaml.Controls.Primitives.SelectorItem
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
@Signature("rc(Windows.UI.Xaml.Controls.ComboBoxItem;{993fd6d2-2aae-4f3b-b44d-5648f4d06114})")
@WinRTByReference(brClass = ComboBoxItem.ByReference::class)
public open class ComboBoxItem(
  ptr: JNAPointer? = NULL
) : SelectorItem(ptr), IComboBoxItem.WithDefault, IWinRTObject {
  private val __295881772_Interface: IComboBoxItem.WithDefault by lazy {
    as_295881772()
  }


  public override val __295881772_Ptr: JNAPointer? by lazy {
    __295881772_Interface.__295881772_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__295881772_Interface)

  public constructor() : this(ABI.activate())

  private fun as_295881772(): IComboBoxItem.WithDefault {
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
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ComboBoxItem".toHandle(),refiid,factoryActivatorPtr)
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
