package Windows.UI.Xaml.Data

import Windows.UI.Xaml.Data.IItemIndexRangeFactory.ABI.IID
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ItemIndexRange.ABI::class)
@Signature("rc(Windows.UI.Xaml.Data.ItemIndexRange;{83b834be-0583-4a26-9b64-8bf4a2f65704})")
@WinRTByReference(brClass = ItemIndexRange.ByReference::class)
public open class ItemIndexRange(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IItemIndexRange.WithDefault, IWinRTObject {
  private val __307877670_Interface: IItemIndexRange.WithDefault by lazy {
    as_307877670()
  }


  public override val __307877670_Ptr: JNAPointer? by lazy {
    __307877670_Interface.__307877670_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__307877670_Interface)

  public constructor(firstIndex: Int, length: WinDef.UINT) : this(ABI.activate(firstIndex, length))

  private fun as_307877670(): IItemIndexRange.WithDefault {
    if(pointer == NULL) {
      return(IItemIndexRange.ABI.makeIItemIndexRange(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemIndexRange>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemIndexRange.ABI.makeIItemIndexRange(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ItemIndexRange>
      {
    public override fun getValue() = ItemIndexRange(pointer.getPointer(0))

    public fun setValue(value: ItemIndexRange): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemIndexRange, MemoryAddress> {
    public val IItemIndexRangeFactory_Instance: IItemIndexRangeFactory by lazy {
      createIItemIndexRangeFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIItemIndexRangeFactory(): IItemIndexRangeFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Data.ItemIndexRange".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IItemIndexRangeFactory.ABI.makeIItemIndexRangeFactory(factoryActivatorPtr.value))
    }

    public fun activate(firstIndex: Int, length: WinDef.UINT): JNAPointer? =
        IItemIndexRangeFactory_Instance.CreateInstance(firstIndex, length, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ItemIndexRange {
      val address = segment.toRawLongValue()
      return ItemIndexRange(Pointer(address))
    }

    public override fun toNative(obj: ItemIndexRange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
