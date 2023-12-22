package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IGridViewHeaderItemFactory.ABI.IID
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

@ABIMarker(GridViewHeaderItem.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.GridViewHeaderItem;{2c90c3e0-3245-55d6-9d98-0fd9540e920f})")
@WinRTByReference(brClass = GridViewHeaderItem.ByReference::class)
public open class GridViewHeaderItem(
  ptr: JNAPointer? = NULL
) : ListViewBaseHeaderItem(ptr), IGridViewHeaderItem.WithDefault, IWinRTObject {
  private val __1148272306_Interface: IGridViewHeaderItem.WithDefault by lazy {
    as_1148272306()
  }


  public override val __1148272306_Ptr: JNAPointer? by lazy {
    __1148272306_Interface.__1148272306_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1148272306_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1148272306(): IGridViewHeaderItem.WithDefault {
    if(pointer == NULL) {
      return(IGridViewHeaderItem.ABI.makeIGridViewHeaderItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGridViewHeaderItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGridViewHeaderItem.ABI.makeIGridViewHeaderItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GridViewHeaderItem> {
    public override fun getValue() = GridViewHeaderItem(pointer.getPointer(0))

    public fun setValue(value: GridViewHeaderItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GridViewHeaderItem, MemoryAddress> {
    public val IGridViewHeaderItemFactory_Instance: IGridViewHeaderItemFactory by lazy {
      createIGridViewHeaderItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGridViewHeaderItemFactory(): IGridViewHeaderItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.GridViewHeaderItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGridViewHeaderItemFactory.ABI.makeIGridViewHeaderItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IGridViewHeaderItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): GridViewHeaderItem {
      val address = segment.toRawLongValue()
      return GridViewHeaderItem(Pointer(address))
    }

    public override fun toNative(obj: GridViewHeaderItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
