package Windows.Networking.Proximity

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

@ABIMarker(PeerInformation.ABI::class)
@Signature("rc(Windows.Networking.Proximity.PeerInformation;{20024f08-9fff-45f4-b6e9-408b2ebef373})")
@WinRTByReference(brClass = PeerInformation.ByReference::class)
public class PeerInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPeerInformation.WithDefault, IPeerInformation3.WithDefault,
    IPeerInformationWithHostAndService.WithDefault, IWinRTObject {
  private val __2055291793_Interface: IPeerInformation.WithDefault by lazy {
    as_2055291793()
  }


  private val __710463806_Interface: IPeerInformation3.WithDefault by lazy {
    as_710463806()
  }


  private val __219046787_Interface: IPeerInformationWithHostAndService.WithDefault by lazy {
    as_219046787()
  }


  public override val __2055291793_Ptr: JNAPointer? by lazy {
    __2055291793_Interface.__2055291793_Ptr
  }


  public override val __710463806_Ptr: JNAPointer? by lazy {
    __710463806_Interface.__710463806_Ptr
  }


  public override val __219046787_Ptr: JNAPointer? by lazy {
    __219046787_Interface.__219046787_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2055291793_Interface, __710463806_Interface, __219046787_Interface)

  private fun as_2055291793(): IPeerInformation.WithDefault {
    if(pointer == NULL) {
      return(IPeerInformation.ABI.makeIPeerInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPeerInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPeerInformation.ABI.makeIPeerInformation(ref.value))
  }

  private fun as_710463806(): IPeerInformation3.WithDefault {
    if(pointer == NULL) {
      return(IPeerInformation3.ABI.makeIPeerInformation3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPeerInformation3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPeerInformation3.ABI.makeIPeerInformation3(ref.value))
  }

  private fun as_219046787(): IPeerInformationWithHostAndService.WithDefault {
    if(pointer == NULL) {
      return(IPeerInformationWithHostAndService.ABI.makeIPeerInformationWithHostAndService(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPeerInformationWithHostAndService>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPeerInformationWithHostAndService.ABI.makeIPeerInformationWithHostAndService(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PeerInformation> {
    public override fun getValue() = PeerInformation(pointer.getPointer(0))

    public fun setValue(value: PeerInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PeerInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PeerInformation {
      val address = segment.toRawLongValue()
      return PeerInformation(Pointer(address))
    }

    public override fun toNative(obj: PeerInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
