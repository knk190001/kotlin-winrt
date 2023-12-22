package Microsoft.UI.Xaml.Interop

import Microsoft.UI.Xaml.Interop.INotifyCollectionChangedEventArgsFactory.ABI.IID
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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(NotifyCollectionChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Interop.NotifyCollectionChangedEventArgs;{da049ff2-d2e0-5fe8-8c7b-f87f26060b6f})")
@WinRTByReference(brClass = NotifyCollectionChangedEventArgs.ByReference::class)
public open class NotifyCollectionChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INotifyCollectionChangedEventArgs.WithDefault, IWinRTObject {
  private val __2098646946_Interface: INotifyCollectionChangedEventArgs.WithDefault by lazy {
    as_2098646946()
  }


  public override val __2098646946_Ptr: JNAPointer? by lazy {
    __2098646946_Interface.__2098646946_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2098646946_Interface)

  public constructor(
    action: NotifyCollectionChangedAction,
    newItems: IBindableVector,
    oldItems: IBindableVector,
    newIndex: Int,
    oldIndex: Int
  ) : this(ABI.activate(action, newItems, oldItems, newIndex, oldIndex))

  private fun as_2098646946(): INotifyCollectionChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INotifyCollectionChangedEventArgs.ABI.makeINotifyCollectionChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INotifyCollectionChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INotifyCollectionChangedEventArgs.ABI.makeINotifyCollectionChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NotifyCollectionChangedEventArgs> {
    public override fun getValue() = NotifyCollectionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: NotifyCollectionChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NotifyCollectionChangedEventArgs, MemoryAddress> {
    public val INotifyCollectionChangedEventArgsFactory_Instance:
        INotifyCollectionChangedEventArgsFactory by lazy {
      createINotifyCollectionChangedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINotifyCollectionChangedEventArgsFactory():
        INotifyCollectionChangedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Interop.NotifyCollectionChangedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INotifyCollectionChangedEventArgsFactory.ABI.makeINotifyCollectionChangedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      action: NotifyCollectionChangedAction,
      newItems: IBindableVector,
      oldItems: IBindableVector,
      newIndex: Int,
      oldIndex: Int
    ): JNAPointer? =
        INotifyCollectionChangedEventArgsFactory_Instance.CreateInstanceWithAllParameters(action,
        newItems, oldItems, newIndex, oldIndex, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): NotifyCollectionChangedEventArgs {
      val address = segment.toRawLongValue()
      return NotifyCollectionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NotifyCollectionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
