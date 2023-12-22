package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IGridViewFactory.ABI.IID
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

@ABIMarker(GridView.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.GridView;{d495f2fa-594d-5170-b1e8-8629a179f9fb})")
@WinRTByReference(brClass = GridView.ByReference::class)
public open class GridView(
  ptr: JNAPointer? = NULL
) : ListViewBase(ptr), IGridView.WithDefault, IWinRTObject {
  private val __22232530_Interface: IGridView.WithDefault by lazy {
    as_22232530()
  }


  public override val __22232530_Ptr: JNAPointer? by lazy {
    __22232530_Interface.__22232530_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__22232530_Interface)

  public constructor() : this(ABI.activate())

  private fun as_22232530(): IGridView.WithDefault {
    if(pointer == NULL) {
      return(IGridView.ABI.makeIGridView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGridView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGridView.ABI.makeIGridView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GridView> {
    public override fun getValue() = GridView(pointer.getPointer(0))

    public fun setValue(value: GridView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GridView, MemoryAddress> {
    public val IGridViewFactory_Instance: IGridViewFactory by lazy {
      createIGridViewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGridViewFactory(): IGridViewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.GridView".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGridViewFactory.ABI.makeIGridViewFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IGridViewFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): GridView {
      val address = segment.toRawLongValue()
      return GridView(Pointer(address))
    }

    public override fun toNative(obj: GridView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
