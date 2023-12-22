package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IAppBarFactory.ABI.IID
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

@ABIMarker(AppBar.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.AppBar;{7b0fc253-86a5-4b43-9872-0b8a6234b74b})")
@WinRTByReference(brClass = AppBar.ByReference::class)
public open class AppBar(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IAppBar.WithDefault, IAppBar2.WithDefault, IAppBar3.WithDefault,
    IAppBar4.WithDefault, IAppBarOverrides.WithDefault, IAppBarOverrides3.WithDefault, IWinRTObject
    {
  private val __224141646_Interface: IAppBar.WithDefault by lazy {
    as_224141646()
  }


  private val __1641543516_Interface: IAppBar2.WithDefault by lazy {
    as_1641543516()
  }


  private val __1641543515_Interface: IAppBar3.WithDefault by lazy {
    as_1641543515()
  }


  private val __1641543514_Interface: IAppBar4.WithDefault by lazy {
    as_1641543514()
  }


  private val __1792537721_Interface: IAppBarOverrides.WithDefault by lazy {
    as_1792537721()
  }


  private val __265905446_Interface: IAppBarOverrides3.WithDefault by lazy {
    as_265905446()
  }


  public override val __224141646_Ptr: JNAPointer? by lazy {
    __224141646_Interface.__224141646_Ptr
  }


  public override val __1641543516_Ptr: JNAPointer? by lazy {
    __1641543516_Interface.__1641543516_Ptr
  }


  public override val __1641543515_Ptr: JNAPointer? by lazy {
    __1641543515_Interface.__1641543515_Ptr
  }


  public override val __1641543514_Ptr: JNAPointer? by lazy {
    __1641543514_Interface.__1641543514_Ptr
  }


  public override val __1792537721_Ptr: JNAPointer? by lazy {
    __1792537721_Interface.__1792537721_Ptr
  }


  public override val __265905446_Ptr: JNAPointer? by lazy {
    __265905446_Interface.__265905446_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__224141646_Interface, __1641543516_Interface, __1641543515_Interface,
        __1641543514_Interface, __1792537721_Interface, __265905446_Interface)

  public constructor() : this(ABI.activate())

  private fun as_224141646(): IAppBar.WithDefault {
    if(pointer == NULL) {
      return(IAppBar.ABI.makeIAppBar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBar.ABI.makeIAppBar(ref.value))
  }

  private fun as_1641543516(): IAppBar2.WithDefault {
    if(pointer == NULL) {
      return(IAppBar2.ABI.makeIAppBar2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBar2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBar2.ABI.makeIAppBar2(ref.value))
  }

  private fun as_1641543515(): IAppBar3.WithDefault {
    if(pointer == NULL) {
      return(IAppBar3.ABI.makeIAppBar3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBar3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBar3.ABI.makeIAppBar3(ref.value))
  }

  private fun as_1641543514(): IAppBar4.WithDefault {
    if(pointer == NULL) {
      return(IAppBar4.ABI.makeIAppBar4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBar4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBar4.ABI.makeIAppBar4(ref.value))
  }

  private fun as_1792537721(): IAppBarOverrides.WithDefault {
    if(pointer == NULL) {
      return(IAppBarOverrides.ABI.makeIAppBarOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarOverrides.ABI.makeIAppBarOverrides(ref.value))
  }

  private fun as_265905446(): IAppBarOverrides3.WithDefault {
    if(pointer == NULL) {
      return(IAppBarOverrides3.ABI.makeIAppBarOverrides3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarOverrides3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarOverrides3.ABI.makeIAppBarOverrides3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AppBar> {
    public override fun getValue() = AppBar(pointer.getPointer(0))

    public fun setValue(value: AppBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBar, MemoryAddress> {
    public val IAppBarStatics4_Instance: IAppBarStatics4 by lazy {
      createIAppBarStatics4()
    }


    public val IAppBarStatics_Instance: IAppBarStatics by lazy {
      createIAppBarStatics()
    }


    public val IAppBarStatics2_Instance: IAppBarStatics2 by lazy {
      createIAppBarStatics2()
    }


    public val IAppBarFactory_Instance: IAppBarFactory by lazy {
      createIAppBarFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppBarStatics4(): IAppBarStatics4 {
      val refiid = Guid.REFIID(IAppBarStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AppBar".toHandle(),refiid,interfacePtr)
      val result = IAppBarStatics4.ABI.makeIAppBarStatics4(interfacePtr.value)
      return result
    }

    public fun createIAppBarStatics(): IAppBarStatics {
      val refiid = Guid.REFIID(IAppBarStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AppBar".toHandle(),refiid,interfacePtr)
      val result = IAppBarStatics.ABI.makeIAppBarStatics(interfacePtr.value)
      return result
    }

    public fun createIAppBarStatics2(): IAppBarStatics2 {
      val refiid = Guid.REFIID(IAppBarStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AppBar".toHandle(),refiid,interfacePtr)
      val result = IAppBarStatics2.ABI.makeIAppBarStatics2(interfacePtr.value)
      return result
    }

    public fun createIAppBarFactory(): IAppBarFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AppBar".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAppBarFactory.ABI.makeIAppBarFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IAppBarFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): AppBar {
      val address = segment.toRawLongValue()
      return AppBar(Pointer(address))
    }

    public override fun toNative(obj: AppBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_LightDismissOverlayModeProperty() =
        ABI.IAppBarStatics4_Instance.get_LightDismissOverlayModeProperty()

    public fun get_IsOpenProperty() = ABI.IAppBarStatics_Instance.get_IsOpenProperty()

    public fun get_IsStickyProperty() = ABI.IAppBarStatics_Instance.get_IsStickyProperty()

    public fun get_ClosedDisplayModeProperty() =
        ABI.IAppBarStatics2_Instance.get_ClosedDisplayModeProperty()
  }
}
