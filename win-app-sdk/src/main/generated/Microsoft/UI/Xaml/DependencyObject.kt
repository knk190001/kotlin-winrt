package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.IDependencyObjectFactory.ABI.IID
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
@Signature("rc(Microsoft.UI.Xaml.DependencyObject;{e7beaee7-160e-50f7-8789-d63463f979fa})")
@WinRTByReference(brClass = DependencyObject.ByReference::class)
public open class DependencyObject(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDependencyObject.WithDefault, IWinRTObject {
  private val __709572431_Interface: IDependencyObject.WithDefault by lazy {
    as_709572431()
  }


  public override val __709572431_Ptr: JNAPointer? by lazy {
    __709572431_Interface.__709572431_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__709572431_Interface)

  public constructor() : this(ABI.activate())

  private fun as_709572431(): IDependencyObject.WithDefault {
    if(pointer == NULL) {
      return(IDependencyObject.ABI.makeIDependencyObject(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDependencyObject>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDependencyObject.ABI.makeIDependencyObject(ref.value))
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
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.DependencyObject".toHandle(),refiid,factoryActivatorPtr)
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
