package Windows.UI.Input.Preview.Injection

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InputInjector.ABI::class)
@Signature("rc(Windows.UI.Input.Preview.Injection.InputInjector;{8ec26f84-0b02-4bd2-ad7a-3d4658be3e18})")
@WinRTByReference(brClass = InputInjector.ByReference::class)
public class InputInjector(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInputInjector.WithDefault, IInputInjector2.WithDefault, IWinRTObject {
  private val __625919853_Interface: IInputInjector.WithDefault by lazy {
    as_625919853()
  }


  private val __2071321087_Interface: IInputInjector2.WithDefault by lazy {
    as_2071321087()
  }


  public override val __625919853_Ptr: JNAPointer? by lazy {
    __625919853_Interface.__625919853_Ptr
  }


  public override val __2071321087_Ptr: JNAPointer? by lazy {
    __2071321087_Interface.__2071321087_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__625919853_Interface, __2071321087_Interface)

  private fun as_625919853(): IInputInjector.WithDefault {
    if(pointer == NULL) {
      return(IInputInjector.ABI.makeIInputInjector(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputInjector>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputInjector.ABI.makeIInputInjector(ref.value))
  }

  private fun as_2071321087(): IInputInjector2.WithDefault {
    if(pointer == NULL) {
      return(IInputInjector2.ABI.makeIInputInjector2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputInjector2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputInjector2.ABI.makeIInputInjector2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InputInjector>
      {
    public override fun getValue() = InputInjector(pointer.getPointer(0))

    public fun setValue(value: InputInjector): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputInjector, MemoryAddress> {
    public val IInputInjectorStatics2_Instance: IInputInjectorStatics2 by lazy {
      createIInputInjectorStatics2()
    }


    public val IInputInjectorStatics_Instance: IInputInjectorStatics by lazy {
      createIInputInjectorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInputInjectorStatics2(): IInputInjectorStatics2 {
      val refiid = Guid.REFIID(IInputInjectorStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Preview.Injection.InputInjector".toHandle(),refiid,interfacePtr)
      val result = IInputInjectorStatics2.ABI.makeIInputInjectorStatics2(interfacePtr.value)
      return result
    }

    public fun createIInputInjectorStatics(): IInputInjectorStatics {
      val refiid = Guid.REFIID(IInputInjectorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Preview.Injection.InputInjector".toHandle(),refiid,interfacePtr)
      val result = IInputInjectorStatics.ABI.makeIInputInjectorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InputInjector {
      val address = segment.toRawLongValue()
      return InputInjector(Pointer(address))
    }

    public override fun toNative(obj: InputInjector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryCreateForAppBroadcastOnly() =
        ABI.IInputInjectorStatics2_Instance.TryCreateForAppBroadcastOnly()

    public fun TryCreate() = ABI.IInputInjectorStatics_Instance.TryCreate()
  }
}
