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

@ABIMarker(MobileBroadbandUiccAppRecordDetailsResult.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandUiccAppRecordDetailsResult;{d919682f-be14-4934-981d-2f57b9ed83e6})")
@WinRTByReference(brClass = MobileBroadbandUiccAppRecordDetailsResult.ByReference::class)
public class MobileBroadbandUiccAppRecordDetailsResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandUiccAppRecordDetailsResult.WithDefault, IWinRTObject {
  private val __543017315_Interface: IMobileBroadbandUiccAppRecordDetailsResult.WithDefault by
      lazy {
    as_543017315()
  }


  public override val __543017315_Ptr: JNAPointer? by lazy {
    __543017315_Interface.__543017315_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__543017315_Interface)

  private fun as_543017315(): IMobileBroadbandUiccAppRecordDetailsResult.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandUiccAppRecordDetailsResult.ABI.makeIMobileBroadbandUiccAppRecordDetailsResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandUiccAppRecordDetailsResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandUiccAppRecordDetailsResult.ABI.makeIMobileBroadbandUiccAppRecordDetailsResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandUiccAppRecordDetailsResult> {
    public override fun getValue() =
        MobileBroadbandUiccAppRecordDetailsResult(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandUiccAppRecordDetailsResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandUiccAppRecordDetailsResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MobileBroadbandUiccAppRecordDetailsResult {
      val address = segment.toRawLongValue()
      return MobileBroadbandUiccAppRecordDetailsResult(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandUiccAppRecordDetailsResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
