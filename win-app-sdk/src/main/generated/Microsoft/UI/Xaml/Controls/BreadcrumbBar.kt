package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IBreadcrumbBarFactory.ABI.IID
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

@ABIMarker(BreadcrumbBar.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.BreadcrumbBar;{2e47b7d6-5fbd-54c7-b0b1-ceff4a19c744})")
@WinRTByReference(brClass = BreadcrumbBar.ByReference::class)
public open class BreadcrumbBar(
  ptr: JNAPointer? = NULL
) : Control(ptr), IBreadcrumbBar.WithDefault, IWinRTObject {
  private val __562938199_Interface: IBreadcrumbBar.WithDefault by lazy {
    as_562938199()
  }


  public override val __562938199_Ptr: JNAPointer? by lazy {
    __562938199_Interface.__562938199_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__562938199_Interface)

  public constructor() : this(ABI.activate())

  private fun as_562938199(): IBreadcrumbBar.WithDefault {
    if(pointer == NULL) {
      return(IBreadcrumbBar.ABI.makeIBreadcrumbBar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBreadcrumbBar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBreadcrumbBar.ABI.makeIBreadcrumbBar(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<BreadcrumbBar>
      {
    public override fun getValue() = BreadcrumbBar(pointer.getPointer(0))

    public fun setValue(value: BreadcrumbBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BreadcrumbBar, MemoryAddress> {
    public val IBreadcrumbBarStatics_Instance: IBreadcrumbBarStatics by lazy {
      createIBreadcrumbBarStatics()
    }


    public val IBreadcrumbBarFactory_Instance: IBreadcrumbBarFactory by lazy {
      createIBreadcrumbBarFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBreadcrumbBarStatics(): IBreadcrumbBarStatics {
      val refiid = Guid.REFIID(IBreadcrumbBarStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.BreadcrumbBar".toHandle(),refiid,interfacePtr)
      val result = IBreadcrumbBarStatics.ABI.makeIBreadcrumbBarStatics(interfacePtr.value)
      return result
    }

    public fun createIBreadcrumbBarFactory(): IBreadcrumbBarFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.BreadcrumbBar".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBreadcrumbBarFactory.ABI.makeIBreadcrumbBarFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IBreadcrumbBarFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): BreadcrumbBar {
      val address = segment.toRawLongValue()
      return BreadcrumbBar(Pointer(address))
    }

    public override fun toNative(obj: BreadcrumbBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ItemsSourceProperty() =
        ABI.IBreadcrumbBarStatics_Instance.get_ItemsSourceProperty()

    public fun get_ItemTemplateProperty() =
        ABI.IBreadcrumbBarStatics_Instance.get_ItemTemplateProperty()
  }
}
