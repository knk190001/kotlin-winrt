package Windows.UI.Xaml.Data

import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(BindingOperations.ABI::class)
@Signature("rc(Windows.UI.Xaml.Data.BindingOperations;{6fffd738-9839-419c-a17a-4b3604e1524e})")
@WinRTByReference(brClass = BindingOperations.ByReference::class)
public class BindingOperations(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBindingOperations.WithDefault, IWinRTObject {
  private val __386087127_Interface: IBindingOperations.WithDefault by lazy {
    as_386087127()
  }


  public override val __386087127_Ptr: JNAPointer? by lazy {
    __386087127_Interface.__386087127_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__386087127_Interface)

  private fun as_386087127(): IBindingOperations.WithDefault {
    if(pointer == NULL) {
      return(IBindingOperations.ABI.makeIBindingOperations(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBindingOperations>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBindingOperations.ABI.makeIBindingOperations(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BindingOperations> {
    public override fun getValue() = BindingOperations(pointer.getPointer(0))

    public fun setValue(value: BindingOperations): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BindingOperations, MemoryAddress> {
    public val IBindingOperationsStatics_Instance: IBindingOperationsStatics by lazy {
      createIBindingOperationsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBindingOperationsStatics(): IBindingOperationsStatics {
      val refiid = Guid.REFIID(IBindingOperationsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Data.BindingOperations".toHandle(),refiid,interfacePtr)
      val result = IBindingOperationsStatics.ABI.makeIBindingOperationsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BindingOperations {
      val address = segment.toRawLongValue()
      return BindingOperations(Pointer(address))
    }

    public override fun toNative(obj: BindingOperations): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun SetBinding(
      target: DependencyObject,
      dp: DependencyProperty,
      binding: BindingBase
    ) = ABI.IBindingOperationsStatics_Instance.SetBinding(target, dp, binding)
  }
}
