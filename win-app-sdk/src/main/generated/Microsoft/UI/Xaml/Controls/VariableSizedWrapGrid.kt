package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.UIElement
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(VariableSizedWrapGrid.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.VariableSizedWrapGrid;{bfecd12b-e16a-58a0-af5f-4672627462d5})")
@WinRTByReference(brClass = VariableSizedWrapGrid.ByReference::class)
public class VariableSizedWrapGrid(
  ptr: JNAPointer? = NULL
) : Panel(ptr), IVariableSizedWrapGrid.WithDefault, IWinRTObject {
  private val __1338665008_Interface: IVariableSizedWrapGrid.WithDefault by lazy {
    as_1338665008()
  }


  public override val __1338665008_Ptr: JNAPointer? by lazy {
    __1338665008_Interface.__1338665008_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1338665008_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1338665008(): IVariableSizedWrapGrid.WithDefault {
    if(pointer == NULL) {
      return(IVariableSizedWrapGrid.ABI.makeIVariableSizedWrapGrid(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVariableSizedWrapGrid>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVariableSizedWrapGrid.ABI.makeIVariableSizedWrapGrid(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VariableSizedWrapGrid> {
    public override fun getValue() = VariableSizedWrapGrid(pointer.getPointer(0))

    public fun setValue(value: VariableSizedWrapGrid): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VariableSizedWrapGrid, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IVariableSizedWrapGridStatics_Instance: IVariableSizedWrapGridStatics by lazy {
      createIVariableSizedWrapGridStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.VariableSizedWrapGrid".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIVariableSizedWrapGridStatics(): IVariableSizedWrapGridStatics {
      val refiid = Guid.REFIID(IVariableSizedWrapGridStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.VariableSizedWrapGrid".toHandle(),refiid,interfacePtr)
      val result =
          IVariableSizedWrapGridStatics.ABI.makeIVariableSizedWrapGridStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): VariableSizedWrapGrid {
      val address = segment.toRawLongValue()
      return VariableSizedWrapGrid(Pointer(address))
    }

    public override fun toNative(obj: VariableSizedWrapGrid): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ItemHeightProperty() =
        ABI.IVariableSizedWrapGridStatics_Instance.get_ItemHeightProperty()

    public fun get_ItemWidthProperty() =
        ABI.IVariableSizedWrapGridStatics_Instance.get_ItemWidthProperty()

    public fun get_OrientationProperty() =
        ABI.IVariableSizedWrapGridStatics_Instance.get_OrientationProperty()

    public fun get_HorizontalChildrenAlignmentProperty() =
        ABI.IVariableSizedWrapGridStatics_Instance.get_HorizontalChildrenAlignmentProperty()

    public fun get_VerticalChildrenAlignmentProperty() =
        ABI.IVariableSizedWrapGridStatics_Instance.get_VerticalChildrenAlignmentProperty()

    public fun get_MaximumRowsOrColumnsProperty() =
        ABI.IVariableSizedWrapGridStatics_Instance.get_MaximumRowsOrColumnsProperty()

    public fun get_RowSpanProperty() =
        ABI.IVariableSizedWrapGridStatics_Instance.get_RowSpanProperty()

    public fun GetRowSpan(element: UIElement) =
        ABI.IVariableSizedWrapGridStatics_Instance.GetRowSpan(element)

    public fun SetRowSpan(element: UIElement, value: Int) =
        ABI.IVariableSizedWrapGridStatics_Instance.SetRowSpan(element, value)

    public fun get_ColumnSpanProperty() =
        ABI.IVariableSizedWrapGridStatics_Instance.get_ColumnSpanProperty()

    public fun GetColumnSpan(element: UIElement) =
        ABI.IVariableSizedWrapGridStatics_Instance.GetColumnSpan(element)

    public fun SetColumnSpan(element: UIElement, value: Int) =
        ABI.IVariableSizedWrapGridStatics_Instance.SetColumnSpan(element, value)
  }
}
