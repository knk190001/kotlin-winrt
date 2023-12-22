package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IBreadcrumbBarItemFactory.ABI.IID
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

@ABIMarker(BreadcrumbBarItem.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.BreadcrumbBarItem;{34582de4-6bef-5ba0-86ca-7cc1a3db37ee})")
@WinRTByReference(brClass = BreadcrumbBarItem.ByReference::class)
public open class BreadcrumbBarItem(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IBreadcrumbBarItem.WithDefault, IWinRTObject {
  private val __929844900_Interface: IBreadcrumbBarItem.WithDefault by lazy {
    as_929844900()
  }


  public override val __929844900_Ptr: JNAPointer? by lazy {
    __929844900_Interface.__929844900_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__929844900_Interface)

  public constructor() : this(ABI.activate())

  private fun as_929844900(): IBreadcrumbBarItem.WithDefault {
    if(pointer == NULL) {
      return(IBreadcrumbBarItem.ABI.makeIBreadcrumbBarItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBreadcrumbBarItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBreadcrumbBarItem.ABI.makeIBreadcrumbBarItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BreadcrumbBarItem> {
    public override fun getValue() = BreadcrumbBarItem(pointer.getPointer(0))

    public fun setValue(value: BreadcrumbBarItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BreadcrumbBarItem, MemoryAddress> {
    public val IBreadcrumbBarItemFactory_Instance: IBreadcrumbBarItemFactory by lazy {
      createIBreadcrumbBarItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBreadcrumbBarItemFactory(): IBreadcrumbBarItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.BreadcrumbBarItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBreadcrumbBarItemFactory.ABI.makeIBreadcrumbBarItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IBreadcrumbBarItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): BreadcrumbBarItem {
      val address = segment.toRawLongValue()
      return BreadcrumbBarItem(Pointer(address))
    }

    public override fun toNative(obj: BreadcrumbBarItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
