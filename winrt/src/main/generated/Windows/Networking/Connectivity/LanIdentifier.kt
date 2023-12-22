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

@ABIMarker(LanIdentifier.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.LanIdentifier;{48aa53aa-1108-4546-a6cb-9a74da4b7ba0})")
@WinRTByReference(brClass = LanIdentifier.ByReference::class)
public class LanIdentifier(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILanIdentifier.WithDefault, IWinRTObject {
  private val __103737665_Interface: ILanIdentifier.WithDefault by lazy {
    as_103737665()
  }


  public override val __103737665_Ptr: JNAPointer? by lazy {
    __103737665_Interface.__103737665_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__103737665_Interface)

  private fun as_103737665(): ILanIdentifier.WithDefault {
    if(pointer == NULL) {
      return(ILanIdentifier.ABI.makeILanIdentifier(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILanIdentifier>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILanIdentifier.ABI.makeILanIdentifier(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<LanIdentifier>
      {
    public override fun getValue() = LanIdentifier(pointer.getPointer(0))

    public fun setValue(value: LanIdentifier): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LanIdentifier, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LanIdentifier {
      val address = segment.toRawLongValue()
      return LanIdentifier(Pointer(address))
    }

    public override fun toNative(obj: LanIdentifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
