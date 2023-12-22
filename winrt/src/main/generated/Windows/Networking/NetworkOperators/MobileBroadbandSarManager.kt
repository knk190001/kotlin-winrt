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

@ABIMarker(MobileBroadbandSarManager.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandSarManager;{e5b26833-967e-40c9-a485-19c0dd209e22})")
@WinRTByReference(brClass = MobileBroadbandSarManager.ByReference::class)
public class MobileBroadbandSarManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandSarManager.WithDefault, IWinRTObject {
  private val __1898397083_Interface: IMobileBroadbandSarManager.WithDefault by lazy {
    as_1898397083()
  }


  public override val __1898397083_Ptr: JNAPointer? by lazy {
    __1898397083_Interface.__1898397083_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1898397083_Interface)

  private fun as_1898397083(): IMobileBroadbandSarManager.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandSarManager.ABI.makeIMobileBroadbandSarManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandSarManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandSarManager.ABI.makeIMobileBroadbandSarManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandSarManager> {
    public override fun getValue() = MobileBroadbandSarManager(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandSarManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandSarManager, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandSarManager {
      val address = segment.toRawLongValue()
      return MobileBroadbandSarManager(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandSarManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
