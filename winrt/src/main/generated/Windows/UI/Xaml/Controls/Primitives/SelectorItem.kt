package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Controls.ContentControl
import Windows.UI.Xaml.Controls.Primitives.ISelectorItemFactory.ABI.IID
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

@ABIMarker(SelectorItem.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.SelectorItem;{541c8d6c-0283-4581-b945-2a64c28a0646})")
@WinRTByReference(brClass = SelectorItem.ByReference::class)
public open class SelectorItem(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), ISelectorItem.WithDefault, IWinRTObject {
  private val __1870775186_Interface: ISelectorItem.WithDefault by lazy {
    as_1870775186()
  }


  public override val __1870775186_Ptr: JNAPointer? by lazy {
    __1870775186_Interface.__1870775186_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1870775186_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1870775186(): ISelectorItem.WithDefault {
    if(pointer == NULL) {
      return(ISelectorItem.ABI.makeISelectorItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISelectorItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelectorItem.ABI.makeISelectorItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SelectorItem> {
    public override fun getValue() = SelectorItem(pointer.getPointer(0))

    public fun setValue(value: SelectorItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SelectorItem, MemoryAddress> {
    public val ISelectorItemStatics_Instance: ISelectorItemStatics by lazy {
      createISelectorItemStatics()
    }


    public val ISelectorItemFactory_Instance: ISelectorItemFactory by lazy {
      createISelectorItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISelectorItemStatics(): ISelectorItemStatics {
      val refiid = Guid.REFIID(ISelectorItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.SelectorItem".toHandle(),refiid,interfacePtr)
      val result = ISelectorItemStatics.ABI.makeISelectorItemStatics(interfacePtr.value)
      return result
    }

    public fun createISelectorItemFactory(): ISelectorItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.SelectorItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISelectorItemFactory.ABI.makeISelectorItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ISelectorItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SelectorItem {
      val address = segment.toRawLongValue()
      return SelectorItem(Pointer(address))
    }

    public override fun toNative(obj: SelectorItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsSelectedProperty() = ABI.ISelectorItemStatics_Instance.get_IsSelectedProperty()
  }
}
