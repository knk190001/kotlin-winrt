package Windows.System.Profile

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

@ABIMarker(HardwareToken.ABI::class)
@Signature("rc(Windows.System.Profile.HardwareToken;{28f6d4c0-fb12-40a4-8167-7f4e03d2724c})")
@WinRTByReference(brClass = HardwareToken.ByReference::class)
public class HardwareToken(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHardwareToken.WithDefault, IWinRTObject {
  private val __1574803907_Interface: IHardwareToken.WithDefault by lazy {
    as_1574803907()
  }


  public override val __1574803907_Ptr: JNAPointer? by lazy {
    __1574803907_Interface.__1574803907_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1574803907_Interface)

  private fun as_1574803907(): IHardwareToken.WithDefault {
    if(pointer == NULL) {
      return(IHardwareToken.ABI.makeIHardwareToken(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHardwareToken>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHardwareToken.ABI.makeIHardwareToken(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<HardwareToken>
      {
    public override fun getValue() = HardwareToken(pointer.getPointer(0))

    public fun setValue(value: HardwareToken): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HardwareToken, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HardwareToken {
      val address = segment.toRawLongValue()
      return HardwareToken(Pointer(address))
    }

    public override fun toNative(obj: HardwareToken): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
