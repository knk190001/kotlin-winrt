package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.ITreeViewNodeFactory.ABI.IID
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

@ABIMarker(TreeViewNode.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.TreeViewNode;{c04c8ed3-9af2-4e75-a329-7497a110e7a8})")
@WinRTByReference(brClass = TreeViewNode.ByReference::class)
public open class TreeViewNode(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ITreeViewNode.WithDefault, IWinRTObject {
  private val __1184362017_Interface: ITreeViewNode.WithDefault by lazy {
    as_1184362017()
  }


  public override val __1184362017_Ptr: JNAPointer? by lazy {
    __1184362017_Interface.__1184362017_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1184362017_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1184362017(): ITreeViewNode.WithDefault {
    if(pointer == NULL) {
      return(ITreeViewNode.ABI.makeITreeViewNode(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITreeViewNode>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITreeViewNode.ABI.makeITreeViewNode(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TreeViewNode> {
    public override fun getValue() = TreeViewNode(pointer.getPointer(0))

    public fun setValue(value: TreeViewNode): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TreeViewNode, MemoryAddress> {
    public val ITreeViewNodeStatics_Instance: ITreeViewNodeStatics by lazy {
      createITreeViewNodeStatics()
    }


    public val ITreeViewNodeFactory_Instance: ITreeViewNodeFactory by lazy {
      createITreeViewNodeFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITreeViewNodeStatics(): ITreeViewNodeStatics {
      val refiid = Guid.REFIID(ITreeViewNodeStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TreeViewNode".toHandle(),refiid,interfacePtr)
      val result = ITreeViewNodeStatics.ABI.makeITreeViewNodeStatics(interfacePtr.value)
      return result
    }

    public fun createITreeViewNodeFactory(): ITreeViewNodeFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.TreeViewNode".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITreeViewNodeFactory.ABI.makeITreeViewNodeFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ITreeViewNodeFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TreeViewNode {
      val address = segment.toRawLongValue()
      return TreeViewNode(Pointer(address))
    }

    public override fun toNative(obj: TreeViewNode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ContentProperty() = ABI.ITreeViewNodeStatics_Instance.get_ContentProperty()

    public fun get_DepthProperty() = ABI.ITreeViewNodeStatics_Instance.get_DepthProperty()

    public fun get_IsExpandedProperty() = ABI.ITreeViewNodeStatics_Instance.get_IsExpandedProperty()

    public fun get_HasChildrenProperty() =
        ABI.ITreeViewNodeStatics_Instance.get_HasChildrenProperty()
  }
}
