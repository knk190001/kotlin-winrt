package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IGridViewItemFactory.ABI.IID
import Windows.UI.Xaml.Controls.Primitives.SelectorItem
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

@ABIMarker(GridViewItem.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.GridViewItem;{7d9901f1-e7c1-4e83-b470-c9d6d7bda9f5})")
@WinRTByReference(brClass = GridViewItem.ByReference::class)
public open class GridViewItem(
  ptr: JNAPointer? = NULL
) : SelectorItem(ptr), IGridViewItem.WithDefault, IWinRTObject {
  private val __527543002_Interface: IGridViewItem.WithDefault by lazy {
    as_527543002()
  }


  public override val __527543002_Ptr: JNAPointer? by lazy {
    __527543002_Interface.__527543002_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__527543002_Interface)

  public constructor() : this(ABI.activate())

  private fun as_527543002(): IGridViewItem.WithDefault {
    if(pointer == NULL) {
      return(IGridViewItem.ABI.makeIGridViewItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGridViewItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGridViewItem.ABI.makeIGridViewItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GridViewItem> {
    public override fun getValue() = GridViewItem(pointer.getPointer(0))

    public fun setValue(value: GridViewItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GridViewItem, MemoryAddress> {
    public val IGridViewItemFactory_Instance: IGridViewItemFactory by lazy {
      createIGridViewItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGridViewItemFactory(): IGridViewItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.GridViewItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGridViewItemFactory.ABI.makeIGridViewItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IGridViewItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): GridViewItem {
      val address = segment.toRawLongValue()
      return GridViewItem(Pointer(address))
    }

    public override fun toNative(obj: GridViewItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
