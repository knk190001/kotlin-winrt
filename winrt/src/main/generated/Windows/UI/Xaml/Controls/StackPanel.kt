package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IStackPanelFactory.ABI.IID
import Windows.UI.Xaml.Controls.Primitives.IScrollSnapPointsInfo
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

@ABIMarker(StackPanel.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.StackPanel;{b8ae8fe2-d641-4fd7-80b4-7439207d2798})")
@WinRTByReference(brClass = StackPanel.ByReference::class)
public open class StackPanel(
  ptr: JNAPointer? = NULL
) : Panel(ptr), IStackPanel.WithDefault, IStackPanel2.WithDefault, IStackPanel4.WithDefault,
    IStackPanel5.WithDefault, IScrollSnapPointsInfo.WithDefault, IInsertionPanel.WithDefault,
    IWinRTObject {
  private val __499488120_Interface: IStackPanel.WithDefault by lazy {
    as_499488120()
  }


  private val __1695737414_Interface: IStackPanel2.WithDefault by lazy {
    as_1695737414()
  }


  private val __1695737412_Interface: IStackPanel4.WithDefault by lazy {
    as_1695737412()
  }


  private val __1695737411_Interface: IStackPanel5.WithDefault by lazy {
    as_1695737411()
  }


  private val __1877225636_Interface: IScrollSnapPointsInfo.WithDefault by lazy {
    as_1877225636()
  }


  private val __1101609905_Interface: IInsertionPanel.WithDefault by lazy {
    as_1101609905()
  }


  public override val __499488120_Ptr: JNAPointer? by lazy {
    __499488120_Interface.__499488120_Ptr
  }


  public override val __1695737414_Ptr: JNAPointer? by lazy {
    __1695737414_Interface.__1695737414_Ptr
  }


  public override val __1695737412_Ptr: JNAPointer? by lazy {
    __1695737412_Interface.__1695737412_Ptr
  }


  public override val __1695737411_Ptr: JNAPointer? by lazy {
    __1695737411_Interface.__1695737411_Ptr
  }


  public override val __1877225636_Ptr: JNAPointer? by lazy {
    __1877225636_Interface.__1877225636_Ptr
  }


  public override val __1101609905_Ptr: JNAPointer? by lazy {
    __1101609905_Interface.__1101609905_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__499488120_Interface, __1695737414_Interface, __1695737412_Interface,
        __1695737411_Interface, __1877225636_Interface, __1101609905_Interface)

  public constructor() : this(ABI.activate())

  private fun as_499488120(): IStackPanel.WithDefault {
    if(pointer == NULL) {
      return(IStackPanel.ABI.makeIStackPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStackPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStackPanel.ABI.makeIStackPanel(ref.value))
  }

  private fun as_1695737414(): IStackPanel2.WithDefault {
    if(pointer == NULL) {
      return(IStackPanel2.ABI.makeIStackPanel2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStackPanel2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStackPanel2.ABI.makeIStackPanel2(ref.value))
  }

  private fun as_1695737412(): IStackPanel4.WithDefault {
    if(pointer == NULL) {
      return(IStackPanel4.ABI.makeIStackPanel4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStackPanel4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStackPanel4.ABI.makeIStackPanel4(ref.value))
  }

  private fun as_1695737411(): IStackPanel5.WithDefault {
    if(pointer == NULL) {
      return(IStackPanel5.ABI.makeIStackPanel5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStackPanel5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStackPanel5.ABI.makeIStackPanel5(ref.value))
  }

  private fun as_1877225636(): IScrollSnapPointsInfo.WithDefault {
    if(pointer == NULL) {
      return(IScrollSnapPointsInfo.ABI.makeIScrollSnapPointsInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollSnapPointsInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollSnapPointsInfo.ABI.makeIScrollSnapPointsInfo(ref.value))
  }

  private fun as_1101609905(): IInsertionPanel.WithDefault {
    if(pointer == NULL) {
      return(IInsertionPanel.ABI.makeIInsertionPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInsertionPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInsertionPanel.ABI.makeIInsertionPanel(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<StackPanel> {
    public override fun getValue() = StackPanel(pointer.getPointer(0))

    public fun setValue(value: StackPanel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StackPanel, MemoryAddress> {
    public val IStackPanelStatics2_Instance: IStackPanelStatics2 by lazy {
      createIStackPanelStatics2()
    }


    public val IStackPanelStatics4_Instance: IStackPanelStatics4 by lazy {
      createIStackPanelStatics4()
    }


    public val IStackPanelStatics5_Instance: IStackPanelStatics5 by lazy {
      createIStackPanelStatics5()
    }


    public val IStackPanelStatics_Instance: IStackPanelStatics by lazy {
      createIStackPanelStatics()
    }


    public val IStackPanelFactory_Instance: IStackPanelFactory by lazy {
      createIStackPanelFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStackPanelStatics2(): IStackPanelStatics2 {
      val refiid = Guid.REFIID(IStackPanelStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.StackPanel".toHandle(),refiid,interfacePtr)
      val result = IStackPanelStatics2.ABI.makeIStackPanelStatics2(interfacePtr.value)
      return result
    }

    public fun createIStackPanelStatics4(): IStackPanelStatics4 {
      val refiid = Guid.REFIID(IStackPanelStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.StackPanel".toHandle(),refiid,interfacePtr)
      val result = IStackPanelStatics4.ABI.makeIStackPanelStatics4(interfacePtr.value)
      return result
    }

    public fun createIStackPanelStatics5(): IStackPanelStatics5 {
      val refiid = Guid.REFIID(IStackPanelStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.StackPanel".toHandle(),refiid,interfacePtr)
      val result = IStackPanelStatics5.ABI.makeIStackPanelStatics5(interfacePtr.value)
      return result
    }

    public fun createIStackPanelStatics(): IStackPanelStatics {
      val refiid = Guid.REFIID(IStackPanelStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.StackPanel".toHandle(),refiid,interfacePtr)
      val result = IStackPanelStatics.ABI.makeIStackPanelStatics(interfacePtr.value)
      return result
    }

    public fun createIStackPanelFactory(): IStackPanelFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.StackPanel".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IStackPanelFactory.ABI.makeIStackPanelFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IStackPanelFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): StackPanel {
      val address = segment.toRawLongValue()
      return StackPanel(Pointer(address))
    }

    public override fun toNative(obj: StackPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_BorderBrushProperty() =
        ABI.IStackPanelStatics2_Instance.get_BorderBrushProperty()

    public fun get_BorderThicknessProperty() =
        ABI.IStackPanelStatics2_Instance.get_BorderThicknessProperty()

    public fun get_CornerRadiusProperty() =
        ABI.IStackPanelStatics2_Instance.get_CornerRadiusProperty()

    public fun get_PaddingProperty() = ABI.IStackPanelStatics2_Instance.get_PaddingProperty()

    public fun get_SpacingProperty() = ABI.IStackPanelStatics4_Instance.get_SpacingProperty()

    public fun get_BackgroundSizingProperty() =
        ABI.IStackPanelStatics5_Instance.get_BackgroundSizingProperty()

    public fun get_AreScrollSnapPointsRegularProperty() =
        ABI.IStackPanelStatics_Instance.get_AreScrollSnapPointsRegularProperty()

    public fun get_OrientationProperty() = ABI.IStackPanelStatics_Instance.get_OrientationProperty()
  }
}
