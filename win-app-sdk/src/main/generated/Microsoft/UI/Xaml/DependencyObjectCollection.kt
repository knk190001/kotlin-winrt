package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.IDependencyObjectCollectionFactory.ABI.IID
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IObservableVector
import Windows.Foundation.Collections.IVector
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
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(DependencyObjectCollection.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.DependencyObjectCollection;pinterface({5917eb53-50b4-4a0d-b309-65862b3f1dbc};rc(Microsoft.UI.Xaml.DependencyObject;{e7beaee7-160e-50f7-8789-d63463f979fa})))")
@WinRTByReference(brClass = DependencyObjectCollection.ByReference::class)
public open class DependencyObjectCollection(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IObservableVector<DependencyObject?>, IVector<DependencyObject?>,
    IIterable<DependencyObject?>, IWinRTObject {
  private val __1493305514_Interface: IObservableVector<DependencyObject?> by lazy {
    as_1493305514()
  }


  private val __1070388601_Interface: IVector<DependencyObject?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<DependencyObject?> by lazy {
    as_1449643190()
  }


  public override val __1493305514_Type: KType = typeOf<IObservableVector<DependencyObject?>>()

  public override val __1070388601_Type: KType = typeOf<IVector<DependencyObject?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<DependencyObject?>>()

  public override val __1493305514_Ptr: JNAPointer? by lazy {
    __1493305514_Interface.__1493305514_Ptr
  }


  public override val __1070388601_Ptr: JNAPointer? by lazy {
    __1070388601_Interface.__1070388601_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1493305514_Interface, __1070388601_Interface, __1449643190_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1493305514(): IObservableVector<DependencyObject?> {
    if(pointer == NULL) {
      return(IObservableVector.ABI.makeIObservableVector<DependencyObject?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IObservableVector<DependencyObject?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IObservableVector.ABI.makeIObservableVector<DependencyObject?>(ref.value))
  }

  private fun as_1070388601(): IVector<DependencyObject?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<DependencyObject?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<DependencyObject?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<DependencyObject?>(ref.value))
  }

  private fun as_1449643190(): IIterable<DependencyObject?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<DependencyObject?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<DependencyObject?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<DependencyObject?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DependencyObjectCollection> {
    public override fun getValue() = DependencyObjectCollection(pointer.getPointer(0))

    public fun setValue(value: DependencyObjectCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DependencyObjectCollection, MemoryAddress> {
    public val IDependencyObjectCollectionFactory_Instance: IDependencyObjectCollectionFactory by
        lazy {
      createIDependencyObjectCollectionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDependencyObjectCollectionFactory(): IDependencyObjectCollectionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.DependencyObjectCollection".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDependencyObjectCollectionFactory.ABI.makeIDependencyObjectCollectionFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IDependencyObjectCollectionFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): DependencyObjectCollection {
      val address = segment.toRawLongValue()
      return DependencyObjectCollection(Pointer(address))
    }

    public override fun toNative(obj: DependencyObjectCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
