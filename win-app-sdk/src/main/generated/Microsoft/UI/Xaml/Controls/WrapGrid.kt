package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.OrientedVirtualizingPanel
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WrapGrid.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.WrapGrid;{2e570b6a-ff97-53b8-a887-348f59ee0544})")
@WinRTByReference(brClass = WrapGrid.ByReference::class)
public class WrapGrid(
  ptr: JNAPointer? = NULL
) : OrientedVirtualizingPanel(ptr), IWrapGrid.WithDefault, IWinRTObject {
  private val __1919005047_Interface: IWrapGrid.WithDefault by lazy {
    as_1919005047()
  }


  public override val __1919005047_Ptr: JNAPointer? by lazy {
    __1919005047_Interface.__1919005047_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1919005047_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1919005047(): IWrapGrid.WithDefault {
    if(pointer == NULL) {
      return(IWrapGrid.ABI.makeIWrapGrid(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWrapGrid>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWrapGrid.ABI.makeIWrapGrid(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<WrapGrid> {
    public override fun getValue() = WrapGrid(pointer.getPointer(0))

    public fun setValue(value: WrapGrid): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WrapGrid, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IWrapGridStatics_Instance: IWrapGridStatics by lazy {
      createIWrapGridStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.WrapGrid".toHandle(),
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

    public fun createIWrapGridStatics(): IWrapGridStatics {
      val refiid = Guid.REFIID(IWrapGridStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.WrapGrid".toHandle(),refiid,interfacePtr)
      val result = IWrapGridStatics.ABI.makeIWrapGridStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WrapGrid {
      val address = segment.toRawLongValue()
      return WrapGrid(Pointer(address))
    }

    public override fun toNative(obj: WrapGrid): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ItemWidthProperty() = ABI.IWrapGridStatics_Instance.get_ItemWidthProperty()

    public fun get_ItemHeightProperty() = ABI.IWrapGridStatics_Instance.get_ItemHeightProperty()

    public fun get_OrientationProperty() = ABI.IWrapGridStatics_Instance.get_OrientationProperty()

    public fun get_HorizontalChildrenAlignmentProperty() =
        ABI.IWrapGridStatics_Instance.get_HorizontalChildrenAlignmentProperty()

    public fun get_VerticalChildrenAlignmentProperty() =
        ABI.IWrapGridStatics_Instance.get_VerticalChildrenAlignmentProperty()

    public fun get_MaximumRowsOrColumnsProperty() =
        ABI.IWrapGridStatics_Instance.get_MaximumRowsOrColumnsProperty()
  }
}
