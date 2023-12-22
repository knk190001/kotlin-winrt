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

@ABIMarker(MiracastReceiverConnectionCreatedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Miracast.MiracastReceiverConnectionCreatedEventArgs;{7d8dfa39-307a-5c0f-94bd-d0c69d169982})")
@WinRTByReference(brClass = MiracastReceiverConnectionCreatedEventArgs.ByReference::class)
public class MiracastReceiverConnectionCreatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMiracastReceiverConnectionCreatedEventArgs.WithDefault, IWinRTObject {
  private val __892585040_Interface: IMiracastReceiverConnectionCreatedEventArgs.WithDefault by
      lazy {
    as_892585040()
  }


  public override val __892585040_Ptr: JNAPointer? by lazy {
    __892585040_Interface.__892585040_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__892585040_Interface)

  private fun as_892585040(): IMiracastReceiverConnectionCreatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMiracastReceiverConnectionCreatedEventArgs.ABI.makeIMiracastReceiverConnectionCreatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMiracastReceiverConnectionCreatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMiracastReceiverConnectionCreatedEventArgs.ABI.makeIMiracastReceiverConnectionCreatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MiracastReceiverConnectionCreatedEventArgs> {
    public override fun getValue() =
        MiracastReceiverConnectionCreatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MiracastReceiverConnectionCreatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MiracastReceiverConnectionCreatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MiracastReceiverConnectionCreatedEventArgs {
      val address = segment.toRawLongValue()
      return MiracastReceiverConnectionCreatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MiracastReceiverConnectionCreatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
