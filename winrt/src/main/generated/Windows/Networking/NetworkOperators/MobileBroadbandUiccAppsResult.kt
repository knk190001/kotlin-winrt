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

@ABIMarker(MobileBroadbandUiccAppsResult.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandUiccAppsResult;{744930eb-8157-4a41-8494-6bf54c9b1d2b})")
@WinRTByReference(brClass = MobileBroadbandUiccAppsResult.ByReference::class)
public class MobileBroadbandUiccAppsResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandUiccAppsResult.WithDefault, IWinRTObject {
  private val __1246534785_Interface: IMobileBroadbandUiccAppsResult.WithDefault by lazy {
    as_1246534785()
  }


  public override val __1246534785_Ptr: JNAPointer? by lazy {
    __1246534785_Interface.__1246534785_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1246534785_Interface)

  private fun as_1246534785(): IMobileBroadbandUiccAppsResult.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandUiccAppsResult.ABI.makeIMobileBroadbandUiccAppsResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandUiccAppsResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandUiccAppsResult.ABI.makeIMobileBroadbandUiccAppsResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandUiccAppsResult> {
    public override fun getValue() = MobileBroadbandUiccAppsResult(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandUiccAppsResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandUiccAppsResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandUiccAppsResult {
      val address = segment.toRawLongValue()
      return MobileBroadbandUiccAppsResult(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandUiccAppsResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
