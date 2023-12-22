package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ISelectionChangedEventArgsFactory.ABI.IID
import Microsoft.UI.Xaml.RoutedEventArgs
import Windows.Foundation.Collections.IVector
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(SelectionChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.SelectionChangedEventArgs;{b6c18076-4b76-5416-ad29-e2dc20c46246})")
@WinRTByReference(brClass = SelectionChangedEventArgs.ByReference::class)
public open class SelectionChangedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), ISelectionChangedEventArgs.WithDefault, IWinRTObject {
  private val __402132984_Interface: ISelectionChangedEventArgs.WithDefault by lazy {
    as_402132984()
  }


  public override val __402132984_Ptr: JNAPointer? by lazy {
    __402132984_Interface.__402132984_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__402132984_Interface)

  public constructor(removedItems: IVector<IUnknown?>, addedItems: IVector<IUnknown?>) :
      this(ABI.activate(removedItems, addedItems))

  private fun as_402132984(): ISelectionChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISelectionChangedEventArgs.ABI.makeISelectionChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISelectionChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelectionChangedEventArgs.ABI.makeISelectionChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SelectionChangedEventArgs> {
    public override fun getValue() = SelectionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SelectionChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SelectionChangedEventArgs, MemoryAddress> {
    public val ISelectionChangedEventArgsFactory_Instance: ISelectionChangedEventArgsFactory by
        lazy {
      createISelectionChangedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISelectionChangedEventArgsFactory(): ISelectionChangedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.SelectionChangedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISelectionChangedEventArgsFactory.ABI.makeISelectionChangedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(removedItems: IVector<IUnknown?>, addedItems: IVector<IUnknown?>):
        JNAPointer? =
        ISelectionChangedEventArgsFactory_Instance.CreateInstanceWithRemovedItemsAndAddedItems(removedItems,
        addedItems, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SelectionChangedEventArgs {
      val address = segment.toRawLongValue()
      return SelectionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SelectionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
