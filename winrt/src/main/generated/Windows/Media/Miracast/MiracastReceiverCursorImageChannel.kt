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

@ABIMarker(MiracastReceiverCursorImageChannel.ABI::class)
@Signature("rc(Windows.Media.Miracast.MiracastReceiverCursorImageChannel;{d9ac332d-723a-5a9d-b90a-81153efa2a0f})")
@WinRTByReference(brClass = MiracastReceiverCursorImageChannel.ByReference::class)
public class MiracastReceiverCursorImageChannel(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMiracastReceiverCursorImageChannel.WithDefault, IWinRTObject {
  private val __2076867231_Interface: IMiracastReceiverCursorImageChannel.WithDefault by lazy {
    as_2076867231()
  }


  public override val __2076867231_Ptr: JNAPointer? by lazy {
    __2076867231_Interface.__2076867231_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2076867231_Interface)

  private fun as_2076867231(): IMiracastReceiverCursorImageChannel.WithDefault {
    if(pointer == NULL) {
      return(IMiracastReceiverCursorImageChannel.ABI.makeIMiracastReceiverCursorImageChannel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMiracastReceiverCursorImageChannel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMiracastReceiverCursorImageChannel.ABI.makeIMiracastReceiverCursorImageChannel(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MiracastReceiverCursorImageChannel> {
    public override fun getValue() = MiracastReceiverCursorImageChannel(pointer.getPointer(0))

    public fun setValue(value: MiracastReceiverCursorImageChannel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MiracastReceiverCursorImageChannel, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MiracastReceiverCursorImageChannel {
      val address = segment.toRawLongValue()
      return MiracastReceiverCursorImageChannel(Pointer(address))
    }

    public override fun toNative(obj: MiracastReceiverCursorImageChannel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
