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

@ABIMarker(MobileBroadbandUiccAppReadRecordResult.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandUiccAppReadRecordResult;{64c95285-358e-47c5-8249-695f383b2bdb})")
@WinRTByReference(brClass = MobileBroadbandUiccAppReadRecordResult.ByReference::class)
public class MobileBroadbandUiccAppReadRecordResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandUiccAppReadRecordResult.WithDefault, IWinRTObject {
  private val __542822517_Interface: IMobileBroadbandUiccAppReadRecordResult.WithDefault by lazy {
    as_542822517()
  }


  public override val __542822517_Ptr: JNAPointer? by lazy {
    __542822517_Interface.__542822517_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__542822517_Interface)

  private fun as_542822517(): IMobileBroadbandUiccAppReadRecordResult.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandUiccAppReadRecordResult.ABI.makeIMobileBroadbandUiccAppReadRecordResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandUiccAppReadRecordResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandUiccAppReadRecordResult.ABI.makeIMobileBroadbandUiccAppReadRecordResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandUiccAppReadRecordResult> {
    public override fun getValue() = MobileBroadbandUiccAppReadRecordResult(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandUiccAppReadRecordResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandUiccAppReadRecordResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandUiccAppReadRecordResult {
      val address = segment.toRawLongValue()
      return MobileBroadbandUiccAppReadRecordResult(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandUiccAppReadRecordResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
