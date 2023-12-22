package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyObject
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(ItemsPickedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ItemsPickedEventArgs;{f95b9aac-a621-488e-9156-8ee31165be04})")
@WinRTByReference(brClass = ItemsPickedEventArgs.ByReference::class)
public class ItemsPickedEventArgs(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IItemsPickedEventArgs.WithDefault, IWinRTObject {
  private val __1561923635_Interface: IItemsPickedEventArgs.WithDefault by lazy {
    as_1561923635()
  }


  public override val __1561923635_Ptr: JNAPointer? by lazy {
    __1561923635_Interface.__1561923635_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1561923635_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1561923635(): IItemsPickedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IItemsPickedEventArgs.ABI.makeIItemsPickedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsPickedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsPickedEventArgs.ABI.makeIItemsPickedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ItemsPickedEventArgs> {
    public override fun getValue() = ItemsPickedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ItemsPickedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemsPickedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ItemsPickedEventArgs".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): ItemsPickedEventArgs {
      val address = segment.toRawLongValue()
      return ItemsPickedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ItemsPickedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
