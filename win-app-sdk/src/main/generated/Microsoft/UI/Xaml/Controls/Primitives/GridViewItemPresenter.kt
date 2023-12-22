package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.ContentPresenter
import Microsoft.UI.Xaml.Controls.Primitives.IGridViewItemPresenterFactory.ABI.IID
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

@ABIMarker(GridViewItemPresenter.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.GridViewItemPresenter;{22772fd8-fe30-5b6f-9b17-5eea5d70d860})")
@WinRTByReference(brClass = GridViewItemPresenter.ByReference::class)
public open class GridViewItemPresenter(
  ptr: JNAPointer? = NULL
) : ContentPresenter(ptr), IGridViewItemPresenter.WithDefault, IWinRTObject {
  private val __839621593_Interface: IGridViewItemPresenter.WithDefault by lazy {
    as_839621593()
  }


  public override val __839621593_Ptr: JNAPointer? by lazy {
    __839621593_Interface.__839621593_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__839621593_Interface)

  public constructor() : this(ABI.activate())

  private fun as_839621593(): IGridViewItemPresenter.WithDefault {
    if(pointer == NULL) {
      return(IGridViewItemPresenter.ABI.makeIGridViewItemPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGridViewItemPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGridViewItemPresenter.ABI.makeIGridViewItemPresenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GridViewItemPresenter> {
    public override fun getValue() = GridViewItemPresenter(pointer.getPointer(0))

    public fun setValue(value: GridViewItemPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GridViewItemPresenter, MemoryAddress> {
    public val IGridViewItemPresenterStatics_Instance: IGridViewItemPresenterStatics by lazy {
      createIGridViewItemPresenterStatics()
    }


    public val IGridViewItemPresenterFactory_Instance: IGridViewItemPresenterFactory by lazy {
      createIGridViewItemPresenterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGridViewItemPresenterStatics(): IGridViewItemPresenterStatics {
      val refiid = Guid.REFIID(IGridViewItemPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.GridViewItemPresenter".toHandle(),refiid,interfacePtr)
      val result =
          IGridViewItemPresenterStatics.ABI.makeIGridViewItemPresenterStatics(interfacePtr.value)
      return result
    }

    public fun createIGridViewItemPresenterFactory(): IGridViewItemPresenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.GridViewItemPresenter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGridViewItemPresenterFactory.ABI.makeIGridViewItemPresenterFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IGridViewItemPresenterFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): GridViewItemPresenter {
      val address = segment.toRawLongValue()
      return GridViewItemPresenter(Pointer(address))
    }

    public override fun toNative(obj: GridViewItemPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SelectionCheckMarkVisualEnabledProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_SelectionCheckMarkVisualEnabledProperty()

    public fun get_CheckHintBrushProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_CheckHintBrushProperty()

    public fun get_CheckSelectingBrushProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_CheckSelectingBrushProperty()

    public fun get_CheckBrushProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_CheckBrushProperty()

    public fun get_DragBackgroundProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_DragBackgroundProperty()

    public fun get_DragForegroundProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_DragForegroundProperty()

    public fun get_FocusBorderBrushProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_FocusBorderBrushProperty()

    public fun get_PlaceholderBackgroundProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_PlaceholderBackgroundProperty()

    public fun get_PointerOverBackgroundProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_PointerOverBackgroundProperty()

    public fun get_SelectedBackgroundProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_SelectedBackgroundProperty()

    public fun get_SelectedForegroundProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_SelectedForegroundProperty()

    public fun get_SelectedPointerOverBackgroundProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_SelectedPointerOverBackgroundProperty()

    public fun get_SelectedPointerOverBorderBrushProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_SelectedPointerOverBorderBrushProperty()

    public fun get_SelectedBorderThicknessProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_SelectedBorderThicknessProperty()

    public fun get_DisabledOpacityProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_DisabledOpacityProperty()

    public fun get_DragOpacityProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_DragOpacityProperty()

    public fun get_ReorderHintOffsetProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_ReorderHintOffsetProperty()

    public fun get_GridViewItemPresenterHorizontalContentAlignmentProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_GridViewItemPresenterHorizontalContentAlignmentProperty()

    public fun get_GridViewItemPresenterVerticalContentAlignmentProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_GridViewItemPresenterVerticalContentAlignmentProperty()

    public fun get_GridViewItemPresenterPaddingProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_GridViewItemPresenterPaddingProperty()

    public fun get_PointerOverBackgroundMarginProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_PointerOverBackgroundMarginProperty()

    public fun get_ContentMarginProperty() =
        ABI.IGridViewItemPresenterStatics_Instance.get_ContentMarginProperty()
  }
}
