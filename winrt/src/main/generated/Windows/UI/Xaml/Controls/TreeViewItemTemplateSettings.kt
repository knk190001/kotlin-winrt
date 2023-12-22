package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.ITreeViewItemTemplateSettingsFactory.ABI.IID
import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(TreeViewItemTemplateSettings.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.TreeViewItemTemplateSettings;{ec323744-de31-4936-bfc2-1cb37ba1dc08})")
@WinRTByReference(brClass = TreeViewItemTemplateSettings.ByReference::class)
public open class TreeViewItemTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ITreeViewItemTemplateSettings.WithDefault, IWinRTObject {
  private val __2108019185_Interface: ITreeViewItemTemplateSettings.WithDefault by lazy {
    as_2108019185()
  }


  public override val __2108019185_Ptr: JNAPointer? by lazy {
    __2108019185_Interface.__2108019185_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2108019185_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2108019185(): ITreeViewItemTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(ITreeViewItemTemplateSettings.ABI.makeITreeViewItemTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeViewItemTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeViewItemTemplateSettings.ABI.makeITreeViewItemTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TreeViewItemTemplateSettings> {
    public override fun getValue() = TreeViewItemTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: TreeViewItemTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TreeViewItemTemplateSettings, MemoryAddress> {
    public val ITreeViewItemTemplateSettingsStatics_Instance: ITreeViewItemTemplateSettingsStatics
        by lazy {
      createITreeViewItemTemplateSettingsStatics()
    }


    public val ITreeViewItemTemplateSettingsFactory_Instance: ITreeViewItemTemplateSettingsFactory
        by lazy {
      createITreeViewItemTemplateSettingsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITreeViewItemTemplateSettingsStatics(): ITreeViewItemTemplateSettingsStatics {
      val refiid = Guid.REFIID(ITreeViewItemTemplateSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TreeViewItemTemplateSettings".toHandle(),refiid,interfacePtr)
      val result =
          ITreeViewItemTemplateSettingsStatics.ABI.makeITreeViewItemTemplateSettingsStatics(interfacePtr.value)
      return result
    }

    public fun createITreeViewItemTemplateSettingsFactory(): ITreeViewItemTemplateSettingsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TreeViewItemTemplateSettings".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITreeViewItemTemplateSettingsFactory.ABI.makeITreeViewItemTemplateSettingsFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        ITreeViewItemTemplateSettingsFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TreeViewItemTemplateSettings {
      val address = segment.toRawLongValue()
      return TreeViewItemTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: TreeViewItemTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ExpandedGlyphVisibilityProperty() =
        ABI.ITreeViewItemTemplateSettingsStatics_Instance.get_ExpandedGlyphVisibilityProperty()

    public fun get_CollapsedGlyphVisibilityProperty() =
        ABI.ITreeViewItemTemplateSettingsStatics_Instance.get_CollapsedGlyphVisibilityProperty()

    public fun get_IndentationProperty() =
        ABI.ITreeViewItemTemplateSettingsStatics_Instance.get_IndentationProperty()

    public fun get_DragItemsCountProperty() =
        ABI.ITreeViewItemTemplateSettingsStatics_Instance.get_DragItemsCountProperty()
  }
}
