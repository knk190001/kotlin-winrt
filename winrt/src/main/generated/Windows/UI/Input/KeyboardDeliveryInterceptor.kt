package Windows.UI.Input

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

@ABIMarker(KeyboardDeliveryInterceptor.ABI::class)
@Signature("rc(Windows.UI.Input.KeyboardDeliveryInterceptor;{b4baf068-8f49-446c-8db5-8c0ffe85cc9e})")
@WinRTByReference(brClass = KeyboardDeliveryInterceptor.ByReference::class)
public class KeyboardDeliveryInterceptor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IKeyboardDeliveryInterceptor.WithDefault, IWinRTObject {
  private val __1513613156_Interface: IKeyboardDeliveryInterceptor.WithDefault by lazy {
    as_1513613156()
  }


  public override val __1513613156_Ptr: JNAPointer? by lazy {
    __1513613156_Interface.__1513613156_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1513613156_Interface)

  private fun as_1513613156(): IKeyboardDeliveryInterceptor.WithDefault {
    if(pointer == NULL) {
      return(IKeyboardDeliveryInterceptor.ABI.makeIKeyboardDeliveryInterceptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyboardDeliveryInterceptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyboardDeliveryInterceptor.ABI.makeIKeyboardDeliveryInterceptor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KeyboardDeliveryInterceptor> {
    public override fun getValue() = KeyboardDeliveryInterceptor(pointer.getPointer(0))

    public fun setValue(value: KeyboardDeliveryInterceptor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyboardDeliveryInterceptor, MemoryAddress> {
    public val IKeyboardDeliveryInterceptorStatics_Instance: IKeyboardDeliveryInterceptorStatics by
        lazy {
      createIKeyboardDeliveryInterceptorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKeyboardDeliveryInterceptorStatics(): IKeyboardDeliveryInterceptorStatics {
      val refiid = Guid.REFIID(IKeyboardDeliveryInterceptorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.KeyboardDeliveryInterceptor".toHandle(),refiid,interfacePtr)
      val result =
          IKeyboardDeliveryInterceptorStatics.ABI.makeIKeyboardDeliveryInterceptorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KeyboardDeliveryInterceptor {
      val address = segment.toRawLongValue()
      return KeyboardDeliveryInterceptor(Pointer(address))
    }

    public override fun toNative(obj: KeyboardDeliveryInterceptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() =
        ABI.IKeyboardDeliveryInterceptorStatics_Instance.GetForCurrentView()
  }
}
