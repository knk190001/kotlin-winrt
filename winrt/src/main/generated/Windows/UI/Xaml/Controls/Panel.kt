package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IPanelFactory.ABI.IID
import Windows.UI.Xaml.FrameworkElement
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

@ABIMarker(Panel.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Panel;{a50a4bbd-8361-469c-90da-e9a40c7474df})")
@WinRTByReference(brClass = Panel.ByReference::class)
public open class Panel(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IPanel.WithDefault, IPanel2.WithDefault, IWinRTObject {
  private val __20635496_Interface: IPanel.WithDefault by lazy {
    as_20635496()
  }


  private val __639700426_Interface: IPanel2.WithDefault by lazy {
    as_639700426()
  }


  public override val __20635496_Ptr: JNAPointer? by lazy {
    __20635496_Interface.__20635496_Ptr
  }


  public override val __639700426_Ptr: JNAPointer? by lazy {
    __639700426_Interface.__639700426_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__20635496_Interface, __639700426_Interface)

  public constructor() : this(ABI.activate())

  private fun as_20635496(): IPanel.WithDefault {
    if(pointer == NULL) {
      return(IPanel.ABI.makeIPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPanel.ABI.makeIPanel(ref.value))
  }

  private fun as_639700426(): IPanel2.WithDefault {
    if(pointer == NULL) {
      return(IPanel2.ABI.makeIPanel2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPanel2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPanel2.ABI.makeIPanel2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Panel> {
    public override fun getValue() = Panel(pointer.getPointer(0))

    public fun setValue(value: Panel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Panel, MemoryAddress> {
    public val IPanelStatics_Instance: IPanelStatics by lazy {
      createIPanelStatics()
    }


    public val IPanelFactory_Instance: IPanelFactory by lazy {
      createIPanelFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPanelStatics(): IPanelStatics {
      val refiid = Guid.REFIID(IPanelStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Panel".toHandle(),refiid,interfacePtr)
      val result = IPanelStatics.ABI.makeIPanelStatics(interfacePtr.value)
      return result
    }

    public fun createIPanelFactory(): IPanelFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Panel".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPanelFactory.ABI.makeIPanelFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IPanelFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Panel {
      val address = segment.toRawLongValue()
      return Panel(Pointer(address))
    }

    public override fun toNative(obj: Panel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_BackgroundProperty() = ABI.IPanelStatics_Instance.get_BackgroundProperty()

    public fun get_IsItemsHostProperty() = ABI.IPanelStatics_Instance.get_IsItemsHostProperty()

    public fun get_ChildrenTransitionsProperty() =
        ABI.IPanelStatics_Instance.get_ChildrenTransitionsProperty()
  }
}
