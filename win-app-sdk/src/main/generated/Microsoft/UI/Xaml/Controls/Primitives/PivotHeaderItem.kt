package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.ContentControl
import Microsoft.UI.Xaml.Controls.Primitives.IPivotHeaderItemFactory.ABI.IID
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

@ABIMarker(PivotHeaderItem.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.PivotHeaderItem;{612d6f77-6c76-5239-8894-efbab0f53e3e})")
@WinRTByReference(brClass = PivotHeaderItem.ByReference::class)
public open class PivotHeaderItem(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IPivotHeaderItem.WithDefault, IWinRTObject {
  private val __965379249_Interface: IPivotHeaderItem.WithDefault by lazy {
    as_965379249()
  }


  public override val __965379249_Ptr: JNAPointer? by lazy {
    __965379249_Interface.__965379249_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__965379249_Interface)

  public constructor() : this(ABI.activate())

  private fun as_965379249(): IPivotHeaderItem.WithDefault {
    if(pointer == NULL) {
      return(IPivotHeaderItem.ABI.makeIPivotHeaderItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPivotHeaderItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPivotHeaderItem.ABI.makeIPivotHeaderItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PivotHeaderItem> {
    public override fun getValue() = PivotHeaderItem(pointer.getPointer(0))

    public fun setValue(value: PivotHeaderItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PivotHeaderItem, MemoryAddress> {
    public val IPivotHeaderItemFactory_Instance: IPivotHeaderItemFactory by lazy {
      createIPivotHeaderItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPivotHeaderItemFactory(): IPivotHeaderItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.PivotHeaderItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPivotHeaderItemFactory.ABI.makeIPivotHeaderItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IPivotHeaderItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): PivotHeaderItem {
      val address = segment.toRawLongValue()
      return PivotHeaderItem(Pointer(address))
    }

    public override fun toNative(obj: PivotHeaderItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
