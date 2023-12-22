package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IListBoxItemFactory.ABI.IID
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

@ABIMarker(ListBoxItem.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ListBoxItem;{cc67fb35-04f1-5ead-96c5-b2ea67b225c6})")
@WinRTByReference(brClass = ListBoxItem.ByReference::class)
public open class ListBoxItem(
  ptr: JNAPointer? = NULL
) : SelectorItem(ptr), IListBoxItem.WithDefault, IWinRTObject {
  private val __1178482471_Interface: IListBoxItem.WithDefault by lazy {
    as_1178482471()
  }


  public override val __1178482471_Ptr: JNAPointer? by lazy {
    __1178482471_Interface.__1178482471_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1178482471_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1178482471(): IListBoxItem.WithDefault {
    if(pointer == NULL) {
      return(IListBoxItem.ABI.makeIListBoxItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListBoxItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListBoxItem.ABI.makeIListBoxItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ListBoxItem> {
    public override fun getValue() = ListBoxItem(pointer.getPointer(0))

    public fun setValue(value: ListBoxItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListBoxItem, MemoryAddress> {
    public val IListBoxItemFactory_Instance: IListBoxItemFactory by lazy {
      createIListBoxItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIListBoxItemFactory(): IListBoxItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ListBoxItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IListBoxItemFactory.ABI.makeIListBoxItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IListBoxItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ListBoxItem {
      val address = segment.toRawLongValue()
      return ListBoxItem(Pointer(address))
    }

    public override fun toNative(obj: ListBoxItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
