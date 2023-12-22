package Windows.ApplicationModel.Holographic

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

@ABIMarker(HolographicKeyboard.ABI::class)
@Signature("rc(Windows.ApplicationModel.Holographic.HolographicKeyboard;{07dd0893-aa21-5e6f-a91b-11b2b3fd7be3})")
@WinRTByReference(brClass = HolographicKeyboard.ByReference::class)
public class HolographicKeyboard(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHolographicKeyboard.WithDefault, IWinRTObject {
  private val __138997840_Interface: IHolographicKeyboard.WithDefault by lazy {
    as_138997840()
  }


  public override val __138997840_Ptr: JNAPointer? by lazy {
    __138997840_Interface.__138997840_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__138997840_Interface)

  private fun as_138997840(): IHolographicKeyboard.WithDefault {
    if(pointer == NULL) {
      return(IHolographicKeyboard.ABI.makeIHolographicKeyboard(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicKeyboard>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicKeyboard.ABI.makeIHolographicKeyboard(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HolographicKeyboard> {
    public override fun getValue() = HolographicKeyboard(pointer.getPointer(0))

    public fun setValue(value: HolographicKeyboard): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicKeyboard, MemoryAddress> {
    public val IHolographicKeyboardStatics_Instance: IHolographicKeyboardStatics by lazy {
      createIHolographicKeyboardStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHolographicKeyboardStatics(): IHolographicKeyboardStatics {
      val refiid = Guid.REFIID(IHolographicKeyboardStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Holographic.HolographicKeyboard".toHandle(),refiid,interfacePtr)
      val result =
          IHolographicKeyboardStatics.ABI.makeIHolographicKeyboardStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): HolographicKeyboard {
      val address = segment.toRawLongValue()
      return HolographicKeyboard(Pointer(address))
    }

    public override fun toNative(obj: HolographicKeyboard): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IHolographicKeyboardStatics_Instance.GetDefault()
  }
}
