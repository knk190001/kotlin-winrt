package Windows.Devices.Lights

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

@ABIMarker(LampInfo.ABI::class)
@Signature("rc(Windows.Devices.Lights.LampInfo;{30bb521c-0acf-49da-8c10-150b9cf62713})")
@WinRTByReference(brClass = LampInfo.ByReference::class)
public class LampInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILampInfo.WithDefault, IWinRTObject {
  private val __1923392842_Interface: ILampInfo.WithDefault by lazy {
    as_1923392842()
  }


  public override val __1923392842_Ptr: JNAPointer? by lazy {
    __1923392842_Interface.__1923392842_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1923392842_Interface)

  private fun as_1923392842(): ILampInfo.WithDefault {
    if(pointer == NULL) {
      return(ILampInfo.ABI.makeILampInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILampInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILampInfo.ABI.makeILampInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<LampInfo> {
    public override fun getValue() = LampInfo(pointer.getPointer(0))

    public fun setValue(value: LampInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LampInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LampInfo {
      val address = segment.toRawLongValue()
      return LampInfo(Pointer(address))
    }

    public override fun toNative(obj: LampInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
