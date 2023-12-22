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

@ABIMarker(MobileBroadbandAccountUpdatedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandAccountUpdatedEventArgs;{7bc31d88-a6bd-49e1-80ab-6b91354a57d4})")
@WinRTByReference(brClass = MobileBroadbandAccountUpdatedEventArgs.ByReference::class)
public class MobileBroadbandAccountUpdatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandAccountUpdatedEventArgs.WithDefault, IWinRTObject {
  private val __1881673043_Interface: IMobileBroadbandAccountUpdatedEventArgs.WithDefault by lazy {
    as_1881673043()
  }


  public override val __1881673043_Ptr: JNAPointer? by lazy {
    __1881673043_Interface.__1881673043_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1881673043_Interface)

  private fun as_1881673043(): IMobileBroadbandAccountUpdatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandAccountUpdatedEventArgs.ABI.makeIMobileBroadbandAccountUpdatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandAccountUpdatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandAccountUpdatedEventArgs.ABI.makeIMobileBroadbandAccountUpdatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandAccountUpdatedEventArgs> {
    public override fun getValue() = MobileBroadbandAccountUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandAccountUpdatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandAccountUpdatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandAccountUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return MobileBroadbandAccountUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandAccountUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
