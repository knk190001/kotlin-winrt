package Windows.Media.Miracast

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

@ABIMarker(MiracastTransmitter.ABI::class)
@Signature("rc(Windows.Media.Miracast.MiracastTransmitter;{342d79fd-2e64-5508-8a30-833d1eac70d0})")
@WinRTByReference(brClass = MiracastTransmitter.ByReference::class)
public class MiracastTransmitter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMiracastTransmitter.WithDefault, IWinRTObject {
  private val __343977597_Interface: IMiracastTransmitter.WithDefault by lazy {
    as_343977597()
  }


  public override val __343977597_Ptr: JNAPointer? by lazy {
    __343977597_Interface.__343977597_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__343977597_Interface)

  private fun as_343977597(): IMiracastTransmitter.WithDefault {
    if(pointer == NULL) {
      return(IMiracastTransmitter.ABI.makeIMiracastTransmitter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMiracastTransmitter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMiracastTransmitter.ABI.makeIMiracastTransmitter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MiracastTransmitter> {
    public override fun getValue() = MiracastTransmitter(pointer.getPointer(0))

    public fun setValue(value: MiracastTransmitter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MiracastTransmitter, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MiracastTransmitter {
      val address = segment.toRawLongValue()
      return MiracastTransmitter(Pointer(address))
    }

    public override fun toNative(obj: MiracastTransmitter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
