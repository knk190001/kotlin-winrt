package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IItemContainerFactory.ABI.IID
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

@ABIMarker(ItemContainer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ItemContainer;{6332a67f-7fd9-53c7-afd8-cfa1237cf6d1})")
@WinRTByReference(brClass = ItemContainer.ByReference::class)
public open class ItemContainer(
  ptr: JNAPointer? = NULL
) : Control(ptr), IItemContainer.WithDefault, IWinRTObject {
  private val __760953785_Interface: IItemContainer.WithDefault by lazy {
    as_760953785()
  }


  public override val __760953785_Ptr: JNAPointer? by lazy {
    __760953785_Interface.__760953785_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__760953785_Interface)

  public constructor() : this(ABI.activate())

  private fun as_760953785(): IItemContainer.WithDefault {
    if(pointer == NULL) {
      return(IItemContainer.ABI.makeIItemContainer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemContainer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemContainer.ABI.makeIItemContainer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ItemContainer>
      {
    public override fun getValue() = ItemContainer(pointer.getPointer(0))

    public fun setValue(value: ItemContainer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemContainer, MemoryAddress> {
    public val IItemContainerStatics_Instance: IItemContainerStatics by lazy {
      createIItemContainerStatics()
    }


    public val IItemContainerFactory_Instance: IItemContainerFactory by lazy {
      createIItemContainerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIItemContainerStatics(): IItemContainerStatics {
      val refiid = Guid.REFIID(IItemContainerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ItemContainer".toHandle(),refiid,interfacePtr)
      val result = IItemContainerStatics.ABI.makeIItemContainerStatics(interfacePtr.value)
      return result
    }

    public fun createIItemContainerFactory(): IItemContainerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ItemContainer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IItemContainerFactory.ABI.makeIItemContainerFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IItemContainerFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ItemContainer {
      val address = segment.toRawLongValue()
      return ItemContainer(Pointer(address))
    }

    public override fun toNative(obj: ItemContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ChildProperty() = ABI.IItemContainerStatics_Instance.get_ChildProperty()

    public fun get_IsSelectedProperty() =
        ABI.IItemContainerStatics_Instance.get_IsSelectedProperty()
  }
}
