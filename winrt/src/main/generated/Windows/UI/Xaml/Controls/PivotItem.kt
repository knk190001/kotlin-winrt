package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IPivotItemFactory.ABI.IID
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

@ABIMarker(PivotItem.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.PivotItem;{a4764371-a502-47a3-915e-4aa096daf87f})")
@WinRTByReference(brClass = PivotItem.ByReference::class)
public open class PivotItem(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IPivotItem.WithDefault, IWinRTObject {
  private val __407653849_Interface: IPivotItem.WithDefault by lazy {
    as_407653849()
  }


  public override val __407653849_Ptr: JNAPointer? by lazy {
    __407653849_Interface.__407653849_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__407653849_Interface)

  public constructor() : this(ABI.activate())

  private fun as_407653849(): IPivotItem.WithDefault {
    if(pointer == NULL) {
      return(IPivotItem.ABI.makeIPivotItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPivotItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPivotItem.ABI.makeIPivotItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PivotItem> {
    public override fun getValue() = PivotItem(pointer.getPointer(0))

    public fun setValue(value: PivotItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PivotItem, MemoryAddress> {
    public val IPivotItemStatics_Instance: IPivotItemStatics by lazy {
      createIPivotItemStatics()
    }


    public val IPivotItemFactory_Instance: IPivotItemFactory by lazy {
      createIPivotItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPivotItemStatics(): IPivotItemStatics {
      val refiid = Guid.REFIID(IPivotItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.PivotItem".toHandle(),refiid,interfacePtr)
      val result = IPivotItemStatics.ABI.makeIPivotItemStatics(interfacePtr.value)
      return result
    }

    public fun createIPivotItemFactory(): IPivotItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.PivotItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPivotItemFactory.ABI.makeIPivotItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IPivotItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): PivotItem {
      val address = segment.toRawLongValue()
      return PivotItem(Pointer(address))
    }

    public override fun toNative(obj: PivotItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_HeaderProperty() = ABI.IPivotItemStatics_Instance.get_HeaderProperty()
  }
}
