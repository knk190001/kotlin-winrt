package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IPageFactory.ABI.IID
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

@ABIMarker(Page.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Page;{c4b27075-e641-453e-824d-012fc7cf95cf})")
@WinRTByReference(brClass = Page.ByReference::class)
public open class Page(
  ptr: JNAPointer? = NULL
) : UserControl(ptr), IPage.WithDefault, IPageOverrides.WithDefault, IWinRTObject {
  private val __1800449877_Interface: IPage.WithDefault by lazy {
    as_1800449877()
  }


  private val __1420313156_Interface: IPageOverrides.WithDefault by lazy {
    as_1420313156()
  }


  public override val __1800449877_Ptr: JNAPointer? by lazy {
    __1800449877_Interface.__1800449877_Ptr
  }


  public override val __1420313156_Ptr: JNAPointer? by lazy {
    __1420313156_Interface.__1420313156_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1800449877_Interface, __1420313156_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1800449877(): IPage.WithDefault {
    if(pointer == NULL) {
      return(IPage.ABI.makeIPage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPage.ABI.makeIPage(ref.value))
  }

  private fun as_1420313156(): IPageOverrides.WithDefault {
    if(pointer == NULL) {
      return(IPageOverrides.ABI.makeIPageOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPageOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPageOverrides.ABI.makeIPageOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Page> {
    public override fun getValue() = Page(pointer.getPointer(0))

    public fun setValue(value: Page): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Page, MemoryAddress> {
    public val IPageStatics_Instance: IPageStatics by lazy {
      createIPageStatics()
    }


    public val IPageFactory_Instance: IPageFactory by lazy {
      createIPageFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPageStatics(): IPageStatics {
      val refiid = Guid.REFIID(IPageStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Page".toHandle(),refiid,interfacePtr)
      val result = IPageStatics.ABI.makeIPageStatics(interfacePtr.value)
      return result
    }

    public fun createIPageFactory(): IPageFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Page".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPageFactory.ABI.makeIPageFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IPageFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Page {
      val address = segment.toRawLongValue()
      return Page(Pointer(address))
    }

    public override fun toNative(obj: Page): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FrameProperty() = ABI.IPageStatics_Instance.get_FrameProperty()

    public fun get_TopAppBarProperty() = ABI.IPageStatics_Instance.get_TopAppBarProperty()

    public fun get_BottomAppBarProperty() = ABI.IPageStatics_Instance.get_BottomAppBarProperty()
  }
}
