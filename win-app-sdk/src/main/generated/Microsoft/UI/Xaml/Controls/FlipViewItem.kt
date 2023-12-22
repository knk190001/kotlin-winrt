package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IFlipViewItemFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Primitives.SelectorItem
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

@ABIMarker(FlipViewItem.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.FlipViewItem;{516f2058-af67-5eb3-b796-e75b34f3fd92})")
@WinRTByReference(brClass = FlipViewItem.ByReference::class)
public open class FlipViewItem(
  ptr: JNAPointer? = NULL
) : SelectorItem(ptr), IFlipViewItem.WithDefault, IWinRTObject {
  private val __179940820_Interface: IFlipViewItem.WithDefault by lazy {
    as_179940820()
  }


  public override val __179940820_Ptr: JNAPointer? by lazy {
    __179940820_Interface.__179940820_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__179940820_Interface)

  public constructor() : this(ABI.activate())

  private fun as_179940820(): IFlipViewItem.WithDefault {
    if(pointer == NULL) {
      return(IFlipViewItem.ABI.makeIFlipViewItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlipViewItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlipViewItem.ABI.makeIFlipViewItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FlipViewItem> {
    public override fun getValue() = FlipViewItem(pointer.getPointer(0))

    public fun setValue(value: FlipViewItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FlipViewItem, MemoryAddress> {
    public val IFlipViewItemFactory_Instance: IFlipViewItemFactory by lazy {
      createIFlipViewItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFlipViewItemFactory(): IFlipViewItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.FlipViewItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFlipViewItemFactory.ABI.makeIFlipViewItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IFlipViewItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): FlipViewItem {
      val address = segment.toRawLongValue()
      return FlipViewItem(Pointer(address))
    }

    public override fun toNative(obj: FlipViewItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
