package Windows.Networking.NetworkOperators

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

@ABIMarker(MobileBroadbandAccountEventArgs.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandAccountEventArgs;{3853c880-77de-4c04-bead-a123b08c9f59})")
@WinRTByReference(brClass = MobileBroadbandAccountEventArgs.ByReference::class)
public class MobileBroadbandAccountEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandAccountEventArgs.WithDefault, IWinRTObject {
  private val __1339460314_Interface: IMobileBroadbandAccountEventArgs.WithDefault by lazy {
    as_1339460314()
  }


  public override val __1339460314_Ptr: JNAPointer? by lazy {
    __1339460314_Interface.__1339460314_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1339460314_Interface)

  private fun as_1339460314(): IMobileBroadbandAccountEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandAccountEventArgs.ABI.makeIMobileBroadbandAccountEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandAccountEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandAccountEventArgs.ABI.makeIMobileBroadbandAccountEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandAccountEventArgs> {
    public override fun getValue() = MobileBroadbandAccountEventArgs(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandAccountEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandAccountEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandAccountEventArgs {
      val address = segment.toRawLongValue()
      return MobileBroadbandAccountEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandAccountEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
