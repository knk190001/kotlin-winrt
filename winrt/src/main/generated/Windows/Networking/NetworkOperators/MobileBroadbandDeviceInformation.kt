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

@ABIMarker(MobileBroadbandDeviceInformation.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation;{e6d08168-e381-4c6e-9be8-fe156969a446})")
@WinRTByReference(brClass = MobileBroadbandDeviceInformation.ByReference::class)
public class MobileBroadbandDeviceInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandDeviceInformation.WithDefault,
    IMobileBroadbandDeviceInformation2.WithDefault, IMobileBroadbandDeviceInformation3.WithDefault,
    IMobileBroadbandDeviceInformation4.WithDefault, IWinRTObject {
  private val __286274106_Interface: IMobileBroadbandDeviceInformation.WithDefault by lazy {
    as_286274106()
  }


  private val __284562744_Interface: IMobileBroadbandDeviceInformation2.WithDefault by lazy {
    as_284562744()
  }


  private val __284562745_Interface: IMobileBroadbandDeviceInformation3.WithDefault by lazy {
    as_284562745()
  }


  private val __284562746_Interface: IMobileBroadbandDeviceInformation4.WithDefault by lazy {
    as_284562746()
  }


  public override val __286274106_Ptr: JNAPointer? by lazy {
    __286274106_Interface.__286274106_Ptr
  }


  public override val __284562744_Ptr: JNAPointer? by lazy {
    __284562744_Interface.__284562744_Ptr
  }


  public override val __284562745_Ptr: JNAPointer? by lazy {
    __284562745_Interface.__284562745_Ptr
  }


  public override val __284562746_Ptr: JNAPointer? by lazy {
    __284562746_Interface.__284562746_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__286274106_Interface, __284562744_Interface, __284562745_Interface,
        __284562746_Interface)

  private fun as_286274106(): IMobileBroadbandDeviceInformation.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandDeviceInformation.ABI.makeIMobileBroadbandDeviceInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandDeviceInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandDeviceInformation.ABI.makeIMobileBroadbandDeviceInformation(ref.value))
  }

  private fun as_284562744(): IMobileBroadbandDeviceInformation2.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandDeviceInformation2.ABI.makeIMobileBroadbandDeviceInformation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandDeviceInformation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandDeviceInformation2.ABI.makeIMobileBroadbandDeviceInformation2(ref.value))
  }

  private fun as_284562745(): IMobileBroadbandDeviceInformation3.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandDeviceInformation3.ABI.makeIMobileBroadbandDeviceInformation3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandDeviceInformation3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandDeviceInformation3.ABI.makeIMobileBroadbandDeviceInformation3(ref.value))
  }

  private fun as_284562746(): IMobileBroadbandDeviceInformation4.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandDeviceInformation4.ABI.makeIMobileBroadbandDeviceInformation4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandDeviceInformation4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandDeviceInformation4.ABI.makeIMobileBroadbandDeviceInformation4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandDeviceInformation> {
    public override fun getValue() = MobileBroadbandDeviceInformation(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandDeviceInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandDeviceInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandDeviceInformation {
      val address = segment.toRawLongValue()
      return MobileBroadbandDeviceInformation(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandDeviceInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
