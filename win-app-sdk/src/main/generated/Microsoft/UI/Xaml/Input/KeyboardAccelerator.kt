package Microsoft.UI.Xaml.Input

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.Input.IKeyboardAcceleratorFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(KeyboardAccelerator.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.KeyboardAccelerator;{6f8bf1e2-4e91-5cf9-a6be-4770caf3d770})")
@WinRTByReference(brClass = KeyboardAccelerator.ByReference::class)
public open class KeyboardAccelerator(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IKeyboardAccelerator.WithDefault, IWinRTObject {
  private val __468220185_Interface: IKeyboardAccelerator.WithDefault by lazy {
    as_468220185()
  }


  public override val __468220185_Ptr: JNAPointer? by lazy {
    __468220185_Interface.__468220185_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__468220185_Interface)

  public constructor() : this(ABI.activate())

  private fun as_468220185(): IKeyboardAccelerator.WithDefault {
    if(pointer == NULL) {
      return(IKeyboardAccelerator.ABI.makeIKeyboardAccelerator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyboardAccelerator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyboardAccelerator.ABI.makeIKeyboardAccelerator(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KeyboardAccelerator> {
    public override fun getValue() = KeyboardAccelerator(pointer.getPointer(0))

    public fun setValue(value: KeyboardAccelerator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyboardAccelerator, MemoryAddress> {
    public val IKeyboardAcceleratorStatics_Instance: IKeyboardAcceleratorStatics by lazy {
      createIKeyboardAcceleratorStatics()
    }


    public val IKeyboardAcceleratorFactory_Instance: IKeyboardAcceleratorFactory by lazy {
      createIKeyboardAcceleratorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKeyboardAcceleratorStatics(): IKeyboardAcceleratorStatics {
      val refiid = Guid.REFIID(IKeyboardAcceleratorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Input.KeyboardAccelerator".toHandle(),refiid,interfacePtr)
      val result =
          IKeyboardAcceleratorStatics.ABI.makeIKeyboardAcceleratorStatics(interfacePtr.value)
      return result
    }

    public fun createIKeyboardAcceleratorFactory(): IKeyboardAcceleratorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Input.KeyboardAccelerator".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IKeyboardAcceleratorFactory.ABI.makeIKeyboardAcceleratorFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IKeyboardAcceleratorFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): KeyboardAccelerator {
      val address = segment.toRawLongValue()
      return KeyboardAccelerator(Pointer(address))
    }

    public override fun toNative(obj: KeyboardAccelerator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_KeyProperty() = ABI.IKeyboardAcceleratorStatics_Instance.get_KeyProperty()

    public fun get_ModifiersProperty() =
        ABI.IKeyboardAcceleratorStatics_Instance.get_ModifiersProperty()

    public fun get_IsEnabledProperty() =
        ABI.IKeyboardAcceleratorStatics_Instance.get_IsEnabledProperty()

    public fun get_ScopeOwnerProperty() =
        ABI.IKeyboardAcceleratorStatics_Instance.get_ScopeOwnerProperty()
  }
}
