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

@ABIMarker(MobileBroadbandUiccApp.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandUiccApp;{4d170556-98a1-43dd-b2ec-50c90cf248df})")
@WinRTByReference(brClass = MobileBroadbandUiccApp.ByReference::class)
public class MobileBroadbandUiccApp(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandUiccApp.WithDefault, IWinRTObject {
  private val __2129628719_Interface: IMobileBroadbandUiccApp.WithDefault by lazy {
    as_2129628719()
  }


  public override val __2129628719_Ptr: JNAPointer? by lazy {
    __2129628719_Interface.__2129628719_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2129628719_Interface)

  private fun as_2129628719(): IMobileBroadbandUiccApp.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandUiccApp.ABI.makeIMobileBroadbandUiccApp(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandUiccApp>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandUiccApp.ABI.makeIMobileBroadbandUiccApp(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandUiccApp> {
    public override fun getValue() = MobileBroadbandUiccApp(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandUiccApp): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandUiccApp, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandUiccApp {
      val address = segment.toRawLongValue()
      return MobileBroadbandUiccApp(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandUiccApp): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
