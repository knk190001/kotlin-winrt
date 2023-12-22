package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IFrameFactory.ABI.IID
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
@Signature("rc(Microsoft.UI.Xaml.Controls.Frame;{e6d50443-621e-5360-856a-75b01e1fcd22})")
@WinRTByReference(brClass = Frame.ByReference::class)
public open class Frame(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IFrame.WithDefault, INavigate.WithDefault, IWinRTObject {
  private val __2013831162_Interface: IFrame.WithDefault by lazy {
    as_2013831162()
  }


  private val __1806605368_Interface: INavigate.WithDefault by lazy {
    as_1806605368()
  }


  public override val __2013831162_Ptr: JNAPointer? by lazy {
    __2013831162_Interface.__2013831162_Ptr
  }


  public override val __1806605368_Ptr: JNAPointer? by lazy {
    __1806605368_Interface.__1806605368_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2013831162_Interface, __1806605368_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2013831162(): IFrame.WithDefault {
    if(pointer == NULL) {
      return(IFrame.ABI.makeIFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrame.ABI.makeIFrame(ref.value))
  }

  private fun as_1806605368(): INavigate.WithDefault {
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
    public val IFrameStatics_Instance: IFrameStatics by lazy {
      createIFrameStatics()
    }


    public val IFrameFactory_Instance: IFrameFactory by lazy {
      createIFrameFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFrameStatics(): IFrameStatics {
      val refiid = Guid.REFIID(IFrameStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Frame".toHandle(),refiid,interfacePtr)
      val result = IFrameStatics.ABI.makeIFrameStatics(interfacePtr.value)
      return result
    }

    public fun createIFrameFactory(): IFrameFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Frame".toHandle(),refiid,factoryActivatorPtr)
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
    public fun get_CacheSizeProperty() = ABI.IFrameStatics_Instance.get_CacheSizeProperty()

    public fun get_CanGoBackProperty() = ABI.IFrameStatics_Instance.get_CanGoBackProperty()

    public fun get_CanGoForwardProperty() = ABI.IFrameStatics_Instance.get_CanGoForwardProperty()

    public fun get_CurrentSourcePageTypeProperty() =
        ABI.IFrameStatics_Instance.get_CurrentSourcePageTypeProperty()

    public fun get_SourcePageTypeProperty() =
        ABI.IFrameStatics_Instance.get_SourcePageTypeProperty()

    public fun get_BackStackDepthProperty() =
        ABI.IFrameStatics_Instance.get_BackStackDepthProperty()

    public fun get_BackStackProperty() = ABI.IFrameStatics_Instance.get_BackStackProperty()

    public fun get_ForwardStackProperty() = ABI.IFrameStatics_Instance.get_ForwardStackProperty()

    public fun get_IsNavigationStackEnabledProperty() =
        ABI.IFrameStatics_Instance.get_IsNavigationStackEnabledProperty()
  }
}
