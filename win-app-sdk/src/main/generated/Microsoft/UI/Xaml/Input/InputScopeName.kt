package Microsoft.UI.Xaml.Input

import Microsoft.UI.Xaml.DependencyObject
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(InputScopeName.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.InputScopeName;{ee99a66d-28d0-53cb-82ee-1b6ee58bcc35})")
@WinRTByReference(brClass = InputScopeName.ByReference::class)
public class InputScopeName(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IInputScopeName.WithDefault, IWinRTObject {
  private val __2027596832_Interface: IInputScopeName.WithDefault by lazy {
    as_2027596832()
  }


  public override val __2027596832_Ptr: JNAPointer? by lazy {
    __2027596832_Interface.__2027596832_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2027596832_Interface)

  public constructor() : this(ABI.activate())

  public constructor(nameValue: InputScopeNameValue) : this(ABI.activate(nameValue))

  private fun as_2027596832(): IInputScopeName.WithDefault {
    if(pointer == NULL) {
      return(IInputScopeName.ABI.makeIInputScopeName(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputScopeName>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputScopeName.ABI.makeIInputScopeName(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InputScopeName>
      {
    public override fun getValue() = InputScopeName(pointer.getPointer(0))

    public fun setValue(value: InputScopeName): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputScopeName, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IInputScopeNameFactory_Instance: IInputScopeNameFactory by lazy {
      createIInputScopeNameFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Input.InputScopeName".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIInputScopeNameFactory(): IInputScopeNameFactory {
      val refiid = Guid.REFIID(IInputScopeNameFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Input.InputScopeName".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInputScopeNameFactory.ABI.makeIInputScopeNameFactory(factoryActivatorPtr.value))
    }

    public fun activate(nameValue: InputScopeNameValue): JNAPointer? =
        IInputScopeNameFactory_Instance.CreateInstance(nameValue)?.pointer

    public override fun fromNative(segment: MemoryAddress): InputScopeName {
      val address = segment.toRawLongValue()
      return InputScopeName(Pointer(address))
    }

    public override fun toNative(obj: InputScopeName): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
