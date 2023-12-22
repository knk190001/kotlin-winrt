package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IGridFactory.ABI.IID
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
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Grid.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Grid;{fd104460-2e15-4ba3-8b8f-fa693a4161e9})")
@WinRTByReference(brClass = Grid.ByReference::class)
public open class Grid(
  ptr: JNAPointer? = NULL
) : Panel(ptr), IGrid.WithDefault, IGrid2.WithDefault, IGrid3.WithDefault, IGrid4.WithDefault,
    IWinRTObject {
  private val __1800701598_Interface: IGrid.WithDefault by lazy {
    as_1800701598()
  }


  private val __12825360_Interface: IGrid2.WithDefault by lazy {
    as_12825360()
  }


  private val __12825361_Interface: IGrid3.WithDefault by lazy {
    as_12825361()
  }


  private val __12825362_Interface: IGrid4.WithDefault by lazy {
    as_12825362()
  }


  public override val __1800701598_Ptr: JNAPointer? by lazy {
    __1800701598_Interface.__1800701598_Ptr
  }


  public override val __12825360_Ptr: JNAPointer? by lazy {
    __12825360_Interface.__12825360_Ptr
  }


  public override val __12825361_Ptr: JNAPointer? by lazy {
    __12825361_Interface.__12825361_Ptr
  }


  public override val __12825362_Ptr: JNAPointer? by lazy {
    __12825362_Interface.__12825362_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1800701598_Interface, __12825360_Interface, __12825361_Interface,
        __12825362_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1800701598(): IGrid.WithDefault {
    if(pointer == NULL) {
      return(IGrid.ABI.makeIGrid(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGrid>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGrid.ABI.makeIGrid(ref.value))
  }

  private fun as_12825360(): IGrid2.WithDefault {
    if(pointer == NULL) {
      return(IGrid2.ABI.makeIGrid2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGrid2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGrid2.ABI.makeIGrid2(ref.value))
  }

  private fun as_12825361(): IGrid3.WithDefault {
    if(pointer == NULL) {
      return(IGrid3.ABI.makeIGrid3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGrid3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGrid3.ABI.makeIGrid3(ref.value))
  }

  private fun as_12825362(): IGrid4.WithDefault {
    if(pointer == NULL) {
      return(IGrid4.ABI.makeIGrid4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGrid4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGrid4.ABI.makeIGrid4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Grid> {
    public override fun getValue() = Grid(pointer.getPointer(0))

    public fun setValue(value: Grid): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Grid, MemoryAddress> {
    public val IGridStatics3_Instance: IGridStatics3 by lazy {
      createIGridStatics3()
    }


    public val IGridStatics_Instance: IGridStatics by lazy {
      createIGridStatics()
    }


    public val IGridStatics2_Instance: IGridStatics2 by lazy {
      createIGridStatics2()
    }


    public val IGridStatics4_Instance: IGridStatics4 by lazy {
      createIGridStatics4()
    }


    public val IGridFactory_Instance: IGridFactory by lazy {
      createIGridFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGridStatics3(): IGridStatics3 {
      val refiid = Guid.REFIID(IGridStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Grid".toHandle(),refiid,interfacePtr)
      val result = IGridStatics3.ABI.makeIGridStatics3(interfacePtr.value)
      return result
    }

    public fun createIGridStatics(): IGridStatics {
      val refiid = Guid.REFIID(IGridStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Grid".toHandle(),refiid,interfacePtr)
      val result = IGridStatics.ABI.makeIGridStatics(interfacePtr.value)
      return result
    }

    public fun createIGridStatics2(): IGridStatics2 {
      val refiid = Guid.REFIID(IGridStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Grid".toHandle(),refiid,interfacePtr)
      val result = IGridStatics2.ABI.makeIGridStatics2(interfacePtr.value)
      return result
    }

    public fun createIGridStatics4(): IGridStatics4 {
      val refiid = Guid.REFIID(IGridStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Grid".toHandle(),refiid,interfacePtr)
      val result = IGridStatics4.ABI.makeIGridStatics4(interfacePtr.value)
      return result
    }

    public fun createIGridFactory(): IGridFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Grid".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGridFactory.ABI.makeIGridFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IGridFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Grid {
      val address = segment.toRawLongValue()
      return Grid(Pointer(address))
    }

    public override fun toNative(obj: Grid): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_RowSpacingProperty() = ABI.IGridStatics3_Instance.get_RowSpacingProperty()

    public fun get_ColumnSpacingProperty() = ABI.IGridStatics3_Instance.get_ColumnSpacingProperty()

    public fun get_RowProperty() = ABI.IGridStatics_Instance.get_RowProperty()

    public fun GetRow(element: FrameworkElement) = ABI.IGridStatics_Instance.GetRow(element)

    public fun SetRow(element: FrameworkElement, value: Int) =
        ABI.IGridStatics_Instance.SetRow(element, value)

    public fun get_ColumnProperty() = ABI.IGridStatics_Instance.get_ColumnProperty()

    public fun GetColumn(element: FrameworkElement) = ABI.IGridStatics_Instance.GetColumn(element)

    public fun SetColumn(element: FrameworkElement, value: Int) =
        ABI.IGridStatics_Instance.SetColumn(element, value)

    public fun get_RowSpanProperty() = ABI.IGridStatics_Instance.get_RowSpanProperty()

    public fun GetRowSpan(element: FrameworkElement) = ABI.IGridStatics_Instance.GetRowSpan(element)

    public fun SetRowSpan(element: FrameworkElement, value: Int) =
        ABI.IGridStatics_Instance.SetRowSpan(element, value)

    public fun get_ColumnSpanProperty() = ABI.IGridStatics_Instance.get_ColumnSpanProperty()

    public fun GetColumnSpan(element: FrameworkElement) =
        ABI.IGridStatics_Instance.GetColumnSpan(element)

    public fun SetColumnSpan(element: FrameworkElement, value: Int) =
        ABI.IGridStatics_Instance.SetColumnSpan(element, value)

    public fun get_BorderBrushProperty() = ABI.IGridStatics2_Instance.get_BorderBrushProperty()

    public fun get_BorderThicknessProperty() =
        ABI.IGridStatics2_Instance.get_BorderThicknessProperty()

    public fun get_CornerRadiusProperty() = ABI.IGridStatics2_Instance.get_CornerRadiusProperty()

    public fun get_PaddingProperty() = ABI.IGridStatics2_Instance.get_PaddingProperty()

    public fun get_BackgroundSizingProperty() =
        ABI.IGridStatics4_Instance.get_BackgroundSizingProperty()
  }
}
