package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IFrameFactory.ABI.IID
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

@ABIMarker(Frame.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Frame;{68ea500b-3fe9-4735-b6a0-e7601933b089})")
@WinRTByReference(brClass = Frame.ByReference::class)
public open class Frame(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IFrame.WithDefault, IFrame2.WithDefault, IFrame3.WithDefault,
    IFrame4.WithDefault, IFrame5.WithDefault, INavigate.WithDefault, IWinRTObject {
  private val __11894481_Interface: IFrame.WithDefault by lazy {
    as_11894481()
  }


  private val __368728961_Interface: IFrame2.WithDefault by lazy {
    as_368728961()
  }


  private val __368728962_Interface: IFrame3.WithDefault by lazy {
    as_368728962()
  }


  private val __368728963_Interface: IFrame4.WithDefault by lazy {
    as_368728963()
  }


  private val __368728964_Interface: IFrame5.WithDefault by lazy {
    as_368728964()
  }


  private val __1613759885_Interface: INavigate.WithDefault by lazy {
    as_1613759885()
  }


  public override val __11894481_Ptr: JNAPointer? by lazy {
    __11894481_Interface.__11894481_Ptr
  }


  public override val __368728961_Ptr: JNAPointer? by lazy {
    __368728961_Interface.__368728961_Ptr
  }


  public override val __368728962_Ptr: JNAPointer? by lazy {
    __368728962_Interface.__368728962_Ptr
  }


  public override val __368728963_Ptr: JNAPointer? by lazy {
    __368728963_Interface.__368728963_Ptr
  }


  public override val __368728964_Ptr: JNAPointer? by lazy {
    __368728964_Interface.__368728964_Ptr
  }


  public override val __1613759885_Ptr: JNAPointer? by lazy {
    __1613759885_Interface.__1613759885_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__11894481_Interface, __368728961_Interface, __368728962_Interface,
        __368728963_Interface, __368728964_Interface, __1613759885_Interface)

  public constructor() : this(ABI.activate())

  private fun as_11894481(): IFrame.WithDefault {
    if(pointer == NULL) {
      return(IFrame.ABI.makeIFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrame.ABI.makeIFrame(ref.value))
  }

  private fun as_368728961(): IFrame2.WithDefault {
    if(pointer == NULL) {
      return(IFrame2.ABI.makeIFrame2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrame2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrame2.ABI.makeIFrame2(ref.value))
  }

  private fun as_368728962(): IFrame3.WithDefault {
    if(pointer == NULL) {
      return(IFrame3.ABI.makeIFrame3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrame3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrame3.ABI.makeIFrame3(ref.value))
  }

  private fun as_368728963(): IFrame4.WithDefault {
    if(pointer == NULL) {
      return(IFrame4.ABI.makeIFrame4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrame4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrame4.ABI.makeIFrame4(ref.value))
  }

  private fun as_368728964(): IFrame5.WithDefault {
    if(pointer == NULL) {
      return(IFrame5.ABI.makeIFrame5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrame5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrame5.ABI.makeIFrame5(ref.value))
  }

  private fun as_1613759885(): INavigate.WithDefault {
    if(pointer == NULL) {
      return(INavigate.ABI.makeINavigate(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigate>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigate.ABI.makeINavigate(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Frame> {
    public override fun getValue() = Frame(pointer.getPointer(0))

    public fun setValue(value: Frame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Frame, MemoryAddress> {
    public val IFrameStatics2_Instance: IFrameStatics2 by lazy {
      createIFrameStatics2()
    }


    public val IFrameStatics_Instance: IFrameStatics by lazy {
      createIFrameStatics()
    }


    public val IFrameStatics5_Instance: IFrameStatics5 by lazy {
      createIFrameStatics5()
    }


    public val IFrameFactory_Instance: IFrameFactory by lazy {
      createIFrameFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFrameStatics2(): IFrameStatics2 {
      val refiid = Guid.REFIID(IFrameStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Frame".toHandle(),refiid,interfacePtr)
      val result = IFrameStatics2.ABI.makeIFrameStatics2(interfacePtr.value)
      return result
    }

    public fun createIFrameStatics(): IFrameStatics {
      val refiid = Guid.REFIID(IFrameStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Frame".toHandle(),refiid,interfacePtr)
      val result = IFrameStatics.ABI.makeIFrameStatics(interfacePtr.value)
      return result
    }

    public fun createIFrameStatics5(): IFrameStatics5 {
      val refiid = Guid.REFIID(IFrameStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Frame".toHandle(),refiid,interfacePtr)
      val result = IFrameStatics5.ABI.makeIFrameStatics5(interfacePtr.value)
      return result
    }

    public fun createIFrameFactory(): IFrameFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Frame".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFrameFactory.ABI.makeIFrameFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IFrameFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Frame {
      val address = segment.toRawLongValue()
      return Frame(Pointer(address))
    }

    public override fun toNative(obj: Frame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_BackStackProperty() = ABI.IFrameStatics2_Instance.get_BackStackProperty()

    public fun get_ForwardStackProperty() = ABI.IFrameStatics2_Instance.get_ForwardStackProperty()

    public fun get_CacheSizeProperty() = ABI.IFrameStatics_Instance.get_CacheSizeProperty()

    public fun get_CanGoBackProperty() = ABI.IFrameStatics_Instance.get_CanGoBackProperty()

    public fun get_CanGoForwardProperty() = ABI.IFrameStatics_Instance.get_CanGoForwardProperty()

    public fun get_CurrentSourcePageTypeProperty() =
        ABI.IFrameStatics_Instance.get_CurrentSourcePageTypeProperty()

    public fun get_SourcePageTypeProperty() =
        ABI.IFrameStatics_Instance.get_SourcePageTypeProperty()

    public fun get_BackStackDepthProperty() =
        ABI.IFrameStatics_Instance.get_BackStackDepthProperty()

    public fun get_IsNavigationStackEnabledProperty() =
        ABI.IFrameStatics5_Instance.get_IsNavigationStackEnabledProperty()
  }
}
