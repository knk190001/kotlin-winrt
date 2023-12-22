package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.ITreeViewItemFactory.ABI.IID
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

@ABIMarker(TreeViewItem.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.TreeViewItem;{4e05d3e6-6167-44e7-9c74-291ddd6df6eb})")
@WinRTByReference(brClass = TreeViewItem.ByReference::class)
public open class TreeViewItem(
  ptr: JNAPointer? = NULL
) : ListViewItem(ptr), ITreeViewItem.WithDefault, ITreeViewItem2.WithDefault, IWinRTObject {
  private val __1184217906_Interface: ITreeViewItem.WithDefault by lazy {
    as_1184217906()
  }


  private val __1943950528_Interface: ITreeViewItem2.WithDefault by lazy {
    as_1943950528()
  }


  public override val __1184217906_Ptr: JNAPointer? by lazy {
    __1184217906_Interface.__1184217906_Ptr
  }


  public override val __1943950528_Ptr: JNAPointer? by lazy {
    __1943950528_Interface.__1943950528_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1184217906_Interface, __1943950528_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1184217906(): ITreeViewItem.WithDefault {
    if(pointer == NULL) {
      return(ITreeViewItem.ABI.makeITreeViewItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeViewItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeViewItem.ABI.makeITreeViewItem(ref.value))
  }

  private fun as_1943950528(): ITreeViewItem2.WithDefault {
    if(pointer == NULL) {
      return(ITreeViewItem2.ABI.makeITreeViewItem2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeViewItem2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeViewItem2.ABI.makeITreeViewItem2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TreeViewItem> {
    public override fun getValue() = TreeViewItem(pointer.getPointer(0))

    public fun setValue(value: TreeViewItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TreeViewItem, MemoryAddress> {
    public val ITreeViewItemStatics_Instance: ITreeViewItemStatics by lazy {
      createITreeViewItemStatics()
    }


    public val ITreeViewItemStatics2_Instance: ITreeViewItemStatics2 by lazy {
      createITreeViewItemStatics2()
    }


    public val ITreeViewItemFactory_Instance: ITreeViewItemFactory by lazy {
      createITreeViewItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITreeViewItemStatics(): ITreeViewItemStatics {
      val refiid = Guid.REFIID(ITreeViewItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TreeViewItem".toHandle(),refiid,interfacePtr)
      val result = ITreeViewItemStatics.ABI.makeITreeViewItemStatics(interfacePtr.value)
      return result
    }

    public fun createITreeViewItemStatics2(): ITreeViewItemStatics2 {
      val refiid = Guid.REFIID(ITreeViewItemStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TreeViewItem".toHandle(),refiid,interfacePtr)
      val result = ITreeViewItemStatics2.ABI.makeITreeViewItemStatics2(interfacePtr.value)
      return result
    }

    public fun createITreeViewItemFactory(): ITreeViewItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TreeViewItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITreeViewItemFactory.ABI.makeITreeViewItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ITreeViewItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TreeViewItem {
      val address = segment.toRawLongValue()
      return TreeViewItem(Pointer(address))
    }

    public override fun toNative(obj: TreeViewItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_GlyphOpacityProperty() =
        ABI.ITreeViewItemStatics_Instance.get_GlyphOpacityProperty()

    public fun get_GlyphBrushProperty() = ABI.ITreeViewItemStatics_Instance.get_GlyphBrushProperty()

    public fun get_ExpandedGlyphProperty() =
        ABI.ITreeViewItemStatics_Instance.get_ExpandedGlyphProperty()

    public fun get_CollapsedGlyphProperty() =
        ABI.ITreeViewItemStatics_Instance.get_CollapsedGlyphProperty()

    public fun get_GlyphSizeProperty() = ABI.ITreeViewItemStatics_Instance.get_GlyphSizeProperty()

    public fun get_IsExpandedProperty() = ABI.ITreeViewItemStatics_Instance.get_IsExpandedProperty()

    public fun get_TreeViewItemTemplateSettingsProperty() =
        ABI.ITreeViewItemStatics_Instance.get_TreeViewItemTemplateSettingsProperty()

    public fun get_HasUnrealizedChildrenProperty() =
        ABI.ITreeViewItemStatics2_Instance.get_HasUnrealizedChildrenProperty()

    public fun get_ItemsSourceProperty() =
        ABI.ITreeViewItemStatics2_Instance.get_ItemsSourceProperty()
  }
}
