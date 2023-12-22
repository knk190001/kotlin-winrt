package Windows.Networking.Connectivity

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

@ABIMarker(LanIdentifierData.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.LanIdentifierData;{a74e83c3-d639-45be-a36a-c4e4aeaf6d9b})")
@WinRTByReference(brClass = LanIdentifierData.ByReference::class)
public class LanIdentifierData(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILanIdentifierData.WithDefault, IWinRTObject {
  private val __369491191_Interface: ILanIdentifierData.WithDefault by lazy {
    as_369491191()
  }


  public override val __369491191_Ptr: JNAPointer? by lazy {
    __369491191_Interface.__369491191_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__369491191_Interface)

  private fun as_369491191(): ILanIdentifierData.WithDefault {
    if(pointer == NULL) {
      return(ILanIdentifierData.ABI.makeILanIdentifierData(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILanIdentifierData>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILanIdentifierData.ABI.makeILanIdentifierData(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LanIdentifierData> {
    public override fun getValue() = LanIdentifierData(pointer.getPointer(0))

    public fun setValue(value: LanIdentifierData): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LanIdentifierData, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LanIdentifierData {
      val address = segment.toRawLongValue()
      return LanIdentifierData(Pointer(address))
    }

    public override fun toNative(obj: LanIdentifierData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
