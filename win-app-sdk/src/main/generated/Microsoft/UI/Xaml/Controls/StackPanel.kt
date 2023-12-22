package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IStackPanelFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Primitives.IScrollSnapPointsInfo
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
@Signature("rc(Microsoft.UI.Xaml.Controls.StackPanel;{493ab00b-3a6a-5e4a-9452-407cd5197406})")
@WinRTByReference(brClass = StackPanel.ByReference::class)
public open class StackPanel(
  ptr: JNAPointer? = NULL
) : Panel(ptr), IStackPanel.WithDefault, IScrollSnapPointsInfo.WithDefault,
    IInsertionPanel.WithDefault, IWinRTObject {
  private val __1140403555_Interface: IStackPanel.WithDefault by lazy {
    as_1140403555()
  }


  private val __1788393063_Interface: IScrollSnapPointsInfo.WithDefault by lazy {
    as_1788393063()
  }


  private val __1932060188_Interface: IInsertionPanel.WithDefault by lazy {
    as_1932060188()
  }


  public override val __1140403555_Ptr: JNAPointer? by lazy {
    __1140403555_Interface.__1140403555_Ptr
  }


  public override val __1788393063_Ptr: JNAPointer? by lazy {
    __1788393063_Interface.__1788393063_Ptr
  }


  public override val __1932060188_Ptr: JNAPointer? by lazy {
    __1932060188_Interface.__1932060188_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1140403555_Interface, __1788393063_Interface, __1932060188_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1140403555(): IStackPanel.WithDefault {
    if(pointer == NULL) {
      return(IStackPanel.ABI.makeIStackPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStackPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStackPanel.ABI.makeIStackPanel(ref.value))
  }

  private fun as_1788393063(): IScrollSnapPointsInfo.WithDefault {
    if(pointer == NULL) {
      return(IScrollSnapPointsInfo.ABI.makeIScrollSnapPointsInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollSnapPointsInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollSnapPointsInfo.ABI.makeIScrollSnapPointsInfo(ref.value))
  }

  private fun as_1932060188(): IInsertionPanel.WithDefault {
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
    public val IStackPanelStatics_Instance: IStackPanelStatics by lazy {
      createIStackPanelStatics()
    }


    public val IStackPanelFactory_Instance: IStackPanelFactory by lazy {
      createIStackPanelFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStackPanelStatics(): IStackPanelStatics {
      val refiid = Guid.REFIID(IStackPanelStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.StackPanel".toHandle(),refiid,interfacePtr)
      val result = IStackPanelStatics.ABI.makeIStackPanelStatics(interfacePtr.value)
      return result
    }

    public fun createIStackPanelFactory(): IStackPanelFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.StackPanel".toHandle(),refiid,factoryActivatorPtr)
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
    public fun get_AreScrollSnapPointsRegularProperty() =
        ABI.IStackPanelStatics_Instance.get_AreScrollSnapPointsRegularProperty()

    public fun get_OrientationProperty() = ABI.IStackPanelStatics_Instance.get_OrientationProperty()

    public fun get_BackgroundSizingProperty() =
        ABI.IStackPanelStatics_Instance.get_BackgroundSizingProperty()

    public fun get_BorderBrushProperty() = ABI.IStackPanelStatics_Instance.get_BorderBrushProperty()

    public fun get_BorderThicknessProperty() =
        ABI.IStackPanelStatics_Instance.get_BorderThicknessProperty()

    public fun get_CornerRadiusProperty() =
        ABI.IStackPanelStatics_Instance.get_CornerRadiusProperty()

    public fun get_PaddingProperty() = ABI.IStackPanelStatics_Instance.get_PaddingProperty()

    public fun get_SpacingProperty() = ABI.IStackPanelStatics_Instance.get_SpacingProperty()
  }
}
