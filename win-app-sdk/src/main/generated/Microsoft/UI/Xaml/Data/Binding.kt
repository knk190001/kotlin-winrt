package Microsoft.UI.Xaml.Data

import Microsoft.UI.Xaml.Data.IBindingFactory.ABI.IID
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

@ABIMarker(Binding.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Data.Binding;{501ea0e8-edd4-59de-8845-76af2eabbe00})")
@WinRTByReference(brClass = Binding.ByReference::class)
public open class Binding(
  ptr: JNAPointer? = NULL
) : BindingBase(ptr), IBinding.WithDefault, IWinRTObject {
  private val __740782638_Interface: IBinding.WithDefault by lazy {
    as_740782638()
  }


  public override val __740782638_Ptr: JNAPointer? by lazy {
    __740782638_Interface.__740782638_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__740782638_Interface)

  public constructor() : this(ABI.activate())

  private fun as_740782638(): IBinding.WithDefault {
    if(pointer == NULL) {
      return(IBinding.ABI.makeIBinding(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBinding>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBinding.ABI.makeIBinding(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Binding> {
    public override fun getValue() = Binding(pointer.getPointer(0))

    public fun setValue(value: Binding): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Binding, MemoryAddress> {
    public val IBindingFactory_Instance: IBindingFactory by lazy {
      createIBindingFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBindingFactory(): IBindingFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Data.Binding".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBindingFactory.ABI.makeIBindingFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IBindingFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Binding {
      val address = segment.toRawLongValue()
      return Binding(Pointer(address))
    }

    public override fun toNative(obj: Binding): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
