package Windows.UI.Xaml.Interop

import Windows.UI.Xaml.Interop.INotifyCollectionChangedEventArgsFactory.ABI.IID
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
@Signature("rc(Windows.UI.Xaml.Interop.NotifyCollectionChangedEventArgs;{4cf68d33-e3f2-4964-b85e-945b4f7e2f21})")
@WinRTByReference(brClass = NotifyCollectionChangedEventArgs.ByReference::class)
public open class NotifyCollectionChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INotifyCollectionChangedEventArgs.WithDefault, IWinRTObject {
  private val __1469298349_Interface: INotifyCollectionChangedEventArgs.WithDefault by lazy {
    as_1469298349()
  }


  public override val __1469298349_Ptr: JNAPointer? by lazy {
    __1469298349_Interface.__1469298349_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1469298349_Interface)

  public constructor(
    action: NotifyCollectionChangedAction,
    newItems: IBindableVector,
    oldItems: IBindableVector,
    newIndex: Int,
    oldIndex: Int
  ) : this(ABI.activate(action, newItems, oldItems, newIndex, oldIndex))

  private fun as_1469298349(): INotifyCollectionChangedEventArgs.WithDefault {
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
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Interop.NotifyCollectionChangedEventArgs".toHandle(),refiid,factoryActivatorPtr)
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
