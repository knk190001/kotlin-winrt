package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IGridFactory.ABI.IID
import Microsoft.UI.Xaml.FrameworkElement
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
@Signature("rc(Microsoft.UI.Xaml.Controls.Grid;{c4496219-9014-58a1-b4ad-c5044913a5bb})")
@WinRTByReference(brClass = Grid.ByReference::class)
public open class Grid(
  ptr: JNAPointer? = NULL
) : Panel(ptr), IGrid.WithDefault, IWinRTObject {
  private val __1874730381_Interface: IGrid.WithDefault by lazy {
    as_1874730381()
  }


  public override val __1874730381_Ptr: JNAPointer? by lazy {
    __1874730381_Interface.__1874730381_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1874730381_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1874730381(): IGrid.WithDefault {
    if(pointer == NULL) {
      return(IGrid.ABI.makeIGrid(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGrid>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGrid.ABI.makeIGrid(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Grid> {
    public override fun getValue() = Grid(pointer.getPointer(0))

    public fun setValue(value: Grid): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Grid, MemoryAddress> {
    public val IGridStatics_Instance: IGridStatics by lazy {
      createIGridStatics()
    }


    public val IGridFactory_Instance: IGridFactory by lazy {
      createIGridFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGridStatics(): IGridStatics {
      val refiid = Guid.REFIID(IGridStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Grid".toHandle(),refiid,interfacePtr)
      val result = IGridStatics.ABI.makeIGridStatics(interfacePtr.value)
      return result
    }

    public fun createIGridFactory(): IGridFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Grid".toHandle(),refiid,factoryActivatorPtr)
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
    public fun get_BackgroundSizingProperty() =
        ABI.IGridStatics_Instance.get_BackgroundSizingProperty()

    public fun get_BorderBrushProperty() = ABI.IGridStatics_Instance.get_BorderBrushProperty()

    public fun get_BorderThicknessProperty() =
        ABI.IGridStatics_Instance.get_BorderThicknessProperty()

    public fun get_CornerRadiusProperty() = ABI.IGridStatics_Instance.get_CornerRadiusProperty()

    public fun get_PaddingProperty() = ABI.IGridStatics_Instance.get_PaddingProperty()

    public fun get_RowSpacingProperty() = ABI.IGridStatics_Instance.get_RowSpacingProperty()

    public fun get_ColumnSpacingProperty() = ABI.IGridStatics_Instance.get_ColumnSpacingProperty()

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
  }
}
