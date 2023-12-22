package Windows.UI.Xaml

import Windows.UI.Xaml.IDependencyObjectFactory.ABI.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DependencyObject.ABI::class)
@Signature("rc(Windows.UI.Xaml.DependencyObject;{5c526665-f60e-4912-af59-5fe0680f089d})")
@WinRTByReference(brClass = DependencyObject.ByReference::class)
public open class DependencyObject(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDependencyObject.WithDefault, IDependencyObject2.WithDefault, IWinRTObject {
  private val __392585404_Interface: IDependencyObject.WithDefault by lazy {
    as_392585404()
  }


  private val __714754314_Interface: IDependencyObject2.WithDefault by lazy {
    as_714754314()
  }


  public override val __392585404_Ptr: JNAPointer? by lazy {
    __392585404_Interface.__392585404_Ptr
  }


  public override val __714754314_Ptr: JNAPointer? by lazy {
    __714754314_Interface.__714754314_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__392585404_Interface, __714754314_Interface)

  public constructor() : this(ABI.activate())

  private fun as_392585404(): IDependencyObject.WithDefault {
    if(pointer == NULL) {
      return(IDependencyObject.ABI.makeIDependencyObject(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDependencyObject>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDependencyObject.ABI.makeIDependencyObject(ref.value))
  }

  private fun as_714754314(): IDependencyObject2.WithDefault {
    if(pointer == NULL) {
      return(IDependencyObject2.ABI.makeIDependencyObject2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDependencyObject2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDependencyObject2.ABI.makeIDependencyObject2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DependencyObject> {
    public override fun getValue() = DependencyObject(pointer.getPointer(0))

    public fun setValue(value: DependencyObject): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DependencyObject, MemoryAddress> {
    public val IDependencyObjectFactory_Instance: IDependencyObjectFactory by lazy {
      createIDependencyObjectFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDependencyObjectFactory(): IDependencyObjectFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.DependencyObject".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDependencyObjectFactory.ABI.makeIDependencyObjectFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IDependencyObjectFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): DependencyObject {
      val address = segment.toRawLongValue()
      return DependencyObject(Pointer(address))
    }

    public override fun toNative(obj: DependencyObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
