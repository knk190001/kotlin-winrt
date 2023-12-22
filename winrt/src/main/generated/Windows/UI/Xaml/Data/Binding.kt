package Windows.UI.Xaml.Data

import Windows.UI.Xaml.Data.IBindingFactory.ABI.IID
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
@Signature("rc(Windows.UI.Xaml.Data.Binding;{3f7a0c6b-d00f-4730-8c1d-48e16c46f9ca})")
@WinRTByReference(brClass = Binding.ByReference::class)
public open class Binding(
  ptr: JNAPointer? = NULL
) : BindingBase(ptr), IBinding.WithDefault, IBinding2.WithDefault, IWinRTObject {
  private val __110486365_Interface: IBinding.WithDefault by lazy {
    as_110486365()
  }


  private val __869889931_Interface: IBinding2.WithDefault by lazy {
    as_869889931()
  }


  public override val __110486365_Ptr: JNAPointer? by lazy {
    __110486365_Interface.__110486365_Ptr
  }


  public override val __869889931_Ptr: JNAPointer? by lazy {
    __869889931_Interface.__869889931_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__110486365_Interface, __869889931_Interface)

  public constructor() : this(ABI.activate())

  private fun as_110486365(): IBinding.WithDefault {
    if(pointer == NULL) {
      return(IBinding.ABI.makeIBinding(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBinding>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBinding.ABI.makeIBinding(ref.value))
  }

  private fun as_869889931(): IBinding2.WithDefault {
    if(pointer == NULL) {
      return(IBinding2.ABI.makeIBinding2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBinding2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBinding2.ABI.makeIBinding2(ref.value))
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
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Data.Binding".toHandle(),refiid,factoryActivatorPtr)
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
