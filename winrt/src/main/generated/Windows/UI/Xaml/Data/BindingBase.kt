package Windows.UI.Xaml.Data

import Windows.UI.Xaml.Data.IBindingBaseFactory.ABI.IID
import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(BindingBase.ABI::class)
@Signature("rc(Windows.UI.Xaml.Data.BindingBase;{1589a2ab-3d15-49bc-a447-8a5448e58870})")
@WinRTByReference(brClass = BindingBase.ByReference::class)
public open class BindingBase(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IBindingBase.WithDefault, IWinRTObject {
  private val __942303182_Interface: IBindingBase.WithDefault by lazy {
    as_942303182()
  }


  public override val __942303182_Ptr: JNAPointer? by lazy {
    __942303182_Interface.__942303182_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__942303182_Interface)

  public constructor() : this(ABI.activate())

  private fun as_942303182(): IBindingBase.WithDefault {
    if(pointer == NULL) {
      return(IBindingBase.ABI.makeIBindingBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBindingBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBindingBase.ABI.makeIBindingBase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<BindingBase> {
    public override fun getValue() = BindingBase(pointer.getPointer(0))

    public fun setValue(value: BindingBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BindingBase, MemoryAddress> {
    public val IBindingBaseFactory_Instance: IBindingBaseFactory by lazy {
      createIBindingBaseFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBindingBaseFactory(): IBindingBaseFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Data.BindingBase".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBindingBaseFactory.ABI.makeIBindingBaseFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IBindingBaseFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): BindingBase {
      val address = segment.toRawLongValue()
      return BindingBase(Pointer(address))
    }

    public override fun toNative(obj: BindingBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
