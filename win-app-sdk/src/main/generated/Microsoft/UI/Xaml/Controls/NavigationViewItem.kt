package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.INavigationViewItemFactory.ABI.IID
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

@ABIMarker(NavigationViewItem.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.NavigationViewItem;{3ab3d503-a37c-5836-8adb-2882062e73a1})")
@WinRTByReference(brClass = NavigationViewItem.ByReference::class)
public open class NavigationViewItem(
  ptr: JNAPointer? = NULL
) : NavigationViewItemBase(ptr), INavigationViewItem.WithDefault, INavigationViewItem2.WithDefault,
    INavigationViewItem3.WithDefault, IWinRTObject {
  private val __1494348691_Interface: INavigationViewItem.WithDefault by lazy {
    as_1494348691()
  }


  private val __919830785_Interface: INavigationViewItem2.WithDefault by lazy {
    as_919830785()
  }


  private val __919830784_Interface: INavigationViewItem3.WithDefault by lazy {
    as_919830784()
  }


  public override val __1494348691_Ptr: JNAPointer? by lazy {
    __1494348691_Interface.__1494348691_Ptr
  }


  public override val __919830785_Ptr: JNAPointer? by lazy {
    __919830785_Interface.__919830785_Ptr
  }


  public override val __919830784_Ptr: JNAPointer? by lazy {
    __919830784_Interface.__919830784_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1494348691_Interface, __919830785_Interface, __919830784_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1494348691(): INavigationViewItem.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewItem.ABI.makeINavigationViewItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewItem.ABI.makeINavigationViewItem(ref.value))
  }

  private fun as_919830785(): INavigationViewItem2.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewItem2.ABI.makeINavigationViewItem2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewItem2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewItem2.ABI.makeINavigationViewItem2(ref.value))
  }

  private fun as_919830784(): INavigationViewItem3.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewItem3.ABI.makeINavigationViewItem3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewItem3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewItem3.ABI.makeINavigationViewItem3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationViewItem> {
    public override fun getValue() = NavigationViewItem(pointer.getPointer(0))

    public fun setValue(value: NavigationViewItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationViewItem, MemoryAddress> {
    public val INavigationViewItemStatics_Instance: INavigationViewItemStatics by lazy {
      createINavigationViewItemStatics()
    }


    public val INavigationViewItemStatics3_Instance: INavigationViewItemStatics3 by lazy {
      createINavigationViewItemStatics3()
    }


    public val INavigationViewItemStatics2_Instance: INavigationViewItemStatics2 by lazy {
      createINavigationViewItemStatics2()
    }


    public val INavigationViewItemFactory_Instance: INavigationViewItemFactory by lazy {
      createINavigationViewItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINavigationViewItemStatics(): INavigationViewItemStatics {
      val refiid = Guid.REFIID(INavigationViewItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.NavigationViewItem".toHandle(),refiid,interfacePtr)
      val result = INavigationViewItemStatics.ABI.makeINavigationViewItemStatics(interfacePtr.value)
      return result
    }

    public fun createINavigationViewItemStatics3(): INavigationViewItemStatics3 {
      val refiid = Guid.REFIID(INavigationViewItemStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.NavigationViewItem".toHandle(),refiid,interfacePtr)
      val result =
          INavigationViewItemStatics3.ABI.makeINavigationViewItemStatics3(interfacePtr.value)
      return result
    }

    public fun createINavigationViewItemStatics2(): INavigationViewItemStatics2 {
      val refiid = Guid.REFIID(INavigationViewItemStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.NavigationViewItem".toHandle(),refiid,interfacePtr)
      val result =
          INavigationViewItemStatics2.ABI.makeINavigationViewItemStatics2(interfacePtr.value)
      return result
    }

    public fun createINavigationViewItemFactory(): INavigationViewItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.NavigationViewItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INavigationViewItemFactory.ABI.makeINavigationViewItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = INavigationViewItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): NavigationViewItem {
      val address = segment.toRawLongValue()
      return NavigationViewItem(Pointer(address))
    }

    public override fun toNative(obj: NavigationViewItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IconProperty() = ABI.INavigationViewItemStatics_Instance.get_IconProperty()

    public fun get_CompactPaneLengthProperty() =
        ABI.INavigationViewItemStatics_Instance.get_CompactPaneLengthProperty()

    public fun get_InfoBadgeProperty() =
        ABI.INavigationViewItemStatics3_Instance.get_InfoBadgeProperty()

    public fun get_SelectsOnInvokedProperty() =
        ABI.INavigationViewItemStatics2_Instance.get_SelectsOnInvokedProperty()

    public fun get_IsExpandedProperty() =
        ABI.INavigationViewItemStatics2_Instance.get_IsExpandedProperty()

    public fun get_HasUnrealizedChildrenProperty() =
        ABI.INavigationViewItemStatics2_Instance.get_HasUnrealizedChildrenProperty()

    public fun get_IsChildSelectedProperty() =
        ABI.INavigationViewItemStatics2_Instance.get_IsChildSelectedProperty()

    public fun get_MenuItemsProperty() =
        ABI.INavigationViewItemStatics2_Instance.get_MenuItemsProperty()

    public fun get_MenuItemsSourceProperty() =
        ABI.INavigationViewItemStatics2_Instance.get_MenuItemsSourceProperty()
  }
}
