package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ITabViewItemFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(TabViewItem.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TabViewItem;{64980afa-97af-5190-90b3-4ba277b1113d})")
@WinRTByReference(brClass = TabViewItem.ByReference::class)
public open class TabViewItem(
  ptr: JNAPointer? = NULL
) : ListViewItem(ptr), ITabViewItem.WithDefault, IWinRTObject {
  private val __1214140954_Interface: ITabViewItem.WithDefault by lazy {
    as_1214140954()
  }


  public override val __1214140954_Ptr: JNAPointer? by lazy {
    __1214140954_Interface.__1214140954_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1214140954_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1214140954(): ITabViewItem.WithDefault {
    if(pointer == NULL) {
      return(ITabViewItem.ABI.makeITabViewItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITabViewItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITabViewItem.ABI.makeITabViewItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TabViewItem> {
    public override fun getValue() = TabViewItem(pointer.getPointer(0))

    public fun setValue(value: TabViewItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TabViewItem, MemoryAddress> {
    public val ITabViewItemStatics_Instance: ITabViewItemStatics by lazy {
      createITabViewItemStatics()
    }


    public val ITabViewItemFactory_Instance: ITabViewItemFactory by lazy {
      createITabViewItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITabViewItemStatics(): ITabViewItemStatics {
      val refiid = Guid.REFIID(ITabViewItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TabViewItem".toHandle(),refiid,interfacePtr)
      val result = ITabViewItemStatics.ABI.makeITabViewItemStatics(interfacePtr.value)
      return result
    }

    public fun createITabViewItemFactory(): ITabViewItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TabViewItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITabViewItemFactory.ABI.makeITabViewItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ITabViewItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TabViewItem {
      val address = segment.toRawLongValue()
      return TabViewItem(Pointer(address))
    }

    public override fun toNative(obj: TabViewItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_HeaderProperty() = ABI.ITabViewItemStatics_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.ITabViewItemStatics_Instance.get_HeaderTemplateProperty()

    public fun get_IconSourceProperty() = ABI.ITabViewItemStatics_Instance.get_IconSourceProperty()

    public fun get_IsClosableProperty() = ABI.ITabViewItemStatics_Instance.get_IsClosableProperty()

    public fun get_TabViewTemplateSettingsProperty() =
        ABI.ITabViewItemStatics_Instance.get_TabViewTemplateSettingsProperty()
  }
}
