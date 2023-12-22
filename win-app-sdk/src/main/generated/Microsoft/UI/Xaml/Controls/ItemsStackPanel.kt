package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(ItemsStackPanel.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ItemsStackPanel;{f7e52fdf-4779-5f63-9999-7d677e3fd2c1})")
@WinRTByReference(brClass = ItemsStackPanel.ByReference::class)
public class ItemsStackPanel(
  ptr: JNAPointer? = NULL
) : Panel(ptr), IItemsStackPanel.WithDefault, IWinRTObject {
  private val __516934549_Interface: IItemsStackPanel.WithDefault by lazy {
    as_516934549()
  }


  public override val __516934549_Ptr: JNAPointer? by lazy {
    __516934549_Interface.__516934549_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__516934549_Interface)

  public constructor() : this(ABI.activate())

  private fun as_516934549(): IItemsStackPanel.WithDefault {
    if(pointer == NULL) {
      return(IItemsStackPanel.ABI.makeIItemsStackPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsStackPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsStackPanel.ABI.makeIItemsStackPanel(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ItemsStackPanel> {
    public override fun getValue() = ItemsStackPanel(pointer.getPointer(0))

    public fun setValue(value: ItemsStackPanel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemsStackPanel, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IItemsStackPanelStatics_Instance: IItemsStackPanelStatics by lazy {
      createIItemsStackPanelStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ItemsStackPanel".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIItemsStackPanelStatics(): IItemsStackPanelStatics {
      val refiid = Guid.REFIID(IItemsStackPanelStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ItemsStackPanel".toHandle(),refiid,interfacePtr)
      val result = IItemsStackPanelStatics.ABI.makeIItemsStackPanelStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ItemsStackPanel {
      val address = segment.toRawLongValue()
      return ItemsStackPanel(Pointer(address))
    }

    public override fun toNative(obj: ItemsStackPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_GroupPaddingProperty() =
        ABI.IItemsStackPanelStatics_Instance.get_GroupPaddingProperty()

    public fun get_OrientationProperty() =
        ABI.IItemsStackPanelStatics_Instance.get_OrientationProperty()

    public fun get_GroupHeaderPlacementProperty() =
        ABI.IItemsStackPanelStatics_Instance.get_GroupHeaderPlacementProperty()

    public fun get_CacheLengthProperty() =
        ABI.IItemsStackPanelStatics_Instance.get_CacheLengthProperty()

    public fun get_AreStickyGroupHeadersEnabledProperty() =
        ABI.IItemsStackPanelStatics_Instance.get_AreStickyGroupHeadersEnabledProperty()
  }
}
