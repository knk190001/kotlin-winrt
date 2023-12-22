package Microsoft.UI.Xaml.Input

import Microsoft.UI.Xaml.DependencyObject
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

@ABIMarker(InputScope.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.InputScope;{76ea58b1-e910-5176-9147-695cc95e7da2})")
@WinRTByReference(brClass = InputScope.ByReference::class)
public class InputScope(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IInputScope.WithDefault, IWinRTObject {
  private val __1068548085_Interface: IInputScope.WithDefault by lazy {
    as_1068548085()
  }


  public override val __1068548085_Ptr: JNAPointer? by lazy {
    __1068548085_Interface.__1068548085_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1068548085_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1068548085(): IInputScope.WithDefault {
    if(pointer == NULL) {
      return(IInputScope.ABI.makeIInputScope(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputScope>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputScope.ABI.makeIInputScope(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InputScope> {
    public override fun getValue() = InputScope(pointer.getPointer(0))

    public fun setValue(value: InputScope): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputScope, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Input.InputScope".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): InputScope {
      val address = segment.toRawLongValue()
      return InputScope(Pointer(address))
    }

    public override fun toNative(obj: InputScope): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
