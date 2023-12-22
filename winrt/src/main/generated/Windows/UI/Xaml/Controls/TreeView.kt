package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.ITreeViewFactory.ABI.IID
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

@ABIMarker(TreeView.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.TreeView;{9353cc5c-dd6e-453c-aedd-0c3ac993978b})")
@WinRTByReference(brClass = TreeView.ByReference::class)
public open class TreeView(
  ptr: JNAPointer? = NULL
) : Control(ptr), ITreeView.WithDefault, ITreeView2.WithDefault, IWinRTObject {
  private val __897491839_Interface: ITreeView.WithDefault by lazy {
    as_897491839()
  }


  private val __2052443283_Interface: ITreeView2.WithDefault by lazy {
    as_2052443283()
  }


  public override val __897491839_Ptr: JNAPointer? by lazy {
    __897491839_Interface.__897491839_Ptr
  }


  public override val __2052443283_Ptr: JNAPointer? by lazy {
    __2052443283_Interface.__2052443283_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__897491839_Interface, __2052443283_Interface)

  public constructor() : this(ABI.activate())

  private fun as_897491839(): ITreeView.WithDefault {
    if(pointer == NULL) {
      return(ITreeView.ABI.makeITreeView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeView.ABI.makeITreeView(ref.value))
  }

  private fun as_2052443283(): ITreeView2.WithDefault {
    if(pointer == NULL) {
      return(ITreeView2.ABI.makeITreeView2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeView2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeView2.ABI.makeITreeView2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TreeView> {
    public override fun getValue() = TreeView(pointer.getPointer(0))

    public fun setValue(value: TreeView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TreeView, MemoryAddress> {
    public val ITreeViewStatics2_Instance: ITreeViewStatics2 by lazy {
      createITreeViewStatics2()
    }


    public val ITreeViewStatics_Instance: ITreeViewStatics by lazy {
      createITreeViewStatics()
    }


    public val ITreeViewFactory_Instance: ITreeViewFactory by lazy {
      createITreeViewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITreeViewStatics2(): ITreeViewStatics2 {
      val refiid = Guid.REFIID(ITreeViewStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TreeView".toHandle(),refiid,interfacePtr)
      val result = ITreeViewStatics2.ABI.makeITreeViewStatics2(interfacePtr.value)
      return result
    }

    public fun createITreeViewStatics(): ITreeViewStatics {
      val refiid = Guid.REFIID(ITreeViewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TreeView".toHandle(),refiid,interfacePtr)
      val result = ITreeViewStatics.ABI.makeITreeViewStatics(interfacePtr.value)
      return result
    }

    public fun createITreeViewFactory(): ITreeViewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TreeView".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITreeViewFactory.ABI.makeITreeViewFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ITreeViewFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TreeView {
      val address = segment.toRawLongValue()
      return TreeView(Pointer(address))
    }

    public override fun toNative(obj: TreeView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CanDragItemsProperty() =
        ABI.ITreeViewStatics2_Instance.get_CanDragItemsProperty()

    public fun get_CanReorderItemsProperty() =
        ABI.ITreeViewStatics2_Instance.get_CanReorderItemsProperty()

    public fun get_ItemTemplateProperty() =
        ABI.ITreeViewStatics2_Instance.get_ItemTemplateProperty()

    public fun get_ItemTemplateSelectorProperty() =
        ABI.ITreeViewStatics2_Instance.get_ItemTemplateSelectorProperty()

    public fun get_ItemContainerStyleProperty() =
        ABI.ITreeViewStatics2_Instance.get_ItemContainerStyleProperty()

    public fun get_ItemContainerStyleSelectorProperty() =
        ABI.ITreeViewStatics2_Instance.get_ItemContainerStyleSelectorProperty()

    public fun get_ItemContainerTransitionsProperty() =
        ABI.ITreeViewStatics2_Instance.get_ItemContainerTransitionsProperty()

    public fun get_ItemsSourceProperty() = ABI.ITreeViewStatics2_Instance.get_ItemsSourceProperty()

    public fun get_SelectionModeProperty() =
        ABI.ITreeViewStatics_Instance.get_SelectionModeProperty()
  }
}
