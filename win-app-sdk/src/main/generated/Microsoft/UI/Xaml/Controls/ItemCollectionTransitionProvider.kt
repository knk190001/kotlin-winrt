package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IItemCollectionTransitionProviderFactory.ABI.IID
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

@ABIMarker(ItemCollectionTransitionProvider.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ItemCollectionTransitionProvider;{32132262-e07d-51f7-a688-9528042f7e0b})")
@WinRTByReference(brClass = ItemCollectionTransitionProvider.ByReference::class)
public open class ItemCollectionTransitionProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IItemCollectionTransitionProvider.WithDefault,
    IItemCollectionTransitionProviderOverrides.WithDefault, IWinRTObject {
  private val __995551262_Interface: IItemCollectionTransitionProvider.WithDefault by lazy {
    as_995551262()
  }


  private val __1622681687_Interface: IItemCollectionTransitionProviderOverrides.WithDefault by
      lazy {
    as_1622681687()
  }


  public override val __995551262_Ptr: JNAPointer? by lazy {
    __995551262_Interface.__995551262_Ptr
  }


  public override val __1622681687_Ptr: JNAPointer? by lazy {
    __1622681687_Interface.__1622681687_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__995551262_Interface, __1622681687_Interface)

  public constructor() : this(ABI.activate())

  private fun as_995551262(): IItemCollectionTransitionProvider.WithDefault {
    if(pointer == NULL) {
      return(IItemCollectionTransitionProvider.ABI.makeIItemCollectionTransitionProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemCollectionTransitionProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemCollectionTransitionProvider.ABI.makeIItemCollectionTransitionProvider(ref.value))
  }

  private fun as_1622681687(): IItemCollectionTransitionProviderOverrides.WithDefault {
    if(pointer == NULL) {
      return(IItemCollectionTransitionProviderOverrides.ABI.makeIItemCollectionTransitionProviderOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemCollectionTransitionProviderOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemCollectionTransitionProviderOverrides.ABI.makeIItemCollectionTransitionProviderOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ItemCollectionTransitionProvider> {
    public override fun getValue() = ItemCollectionTransitionProvider(pointer.getPointer(0))

    public fun setValue(value: ItemCollectionTransitionProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemCollectionTransitionProvider, MemoryAddress> {
    public val IItemCollectionTransitionProviderFactory_Instance:
        IItemCollectionTransitionProviderFactory by lazy {
      createIItemCollectionTransitionProviderFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIItemCollectionTransitionProviderFactory():
        IItemCollectionTransitionProviderFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ItemCollectionTransitionProvider".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IItemCollectionTransitionProviderFactory.ABI.makeIItemCollectionTransitionProviderFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IItemCollectionTransitionProviderFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ItemCollectionTransitionProvider {
      val address = segment.toRawLongValue()
      return ItemCollectionTransitionProvider(Pointer(address))
    }

    public override fun toNative(obj: ItemCollectionTransitionProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
