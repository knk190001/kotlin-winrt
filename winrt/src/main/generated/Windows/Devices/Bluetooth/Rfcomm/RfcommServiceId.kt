package Windows.Devices.Bluetooth.Rfcomm

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RfcommServiceId.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId;{22629204-7e02-4017-8136-da1b6a1b9bbf})")
@WinRTByReference(brClass = RfcommServiceId.ByReference::class)
public class RfcommServiceId(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRfcommServiceId.WithDefault, IWinRTObject {
  private val __498423613_Interface: IRfcommServiceId.WithDefault by lazy {
    as_498423613()
  }


  public override val __498423613_Ptr: JNAPointer? by lazy {
    __498423613_Interface.__498423613_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__498423613_Interface)

  private fun as_498423613(): IRfcommServiceId.WithDefault {
    if(pointer == NULL) {
      return(IRfcommServiceId.ABI.makeIRfcommServiceId(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRfcommServiceId>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRfcommServiceId.ABI.makeIRfcommServiceId(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RfcommServiceId> {
    public override fun getValue() = RfcommServiceId(pointer.getPointer(0))

    public fun setValue(value: RfcommServiceId): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RfcommServiceId, MemoryAddress> {
    public val IRfcommServiceIdStatics_Instance: IRfcommServiceIdStatics by lazy {
      createIRfcommServiceIdStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRfcommServiceIdStatics(): IRfcommServiceIdStatics {
      val refiid = Guid.REFIID(IRfcommServiceIdStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId".toHandle(),refiid,interfacePtr)
      val result = IRfcommServiceIdStatics.ABI.makeIRfcommServiceIdStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RfcommServiceId {
      val address = segment.toRawLongValue()
      return RfcommServiceId(Pointer(address))
    }

    public override fun toNative(obj: RfcommServiceId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromUuid(uuid: Guid.GUID) = ABI.IRfcommServiceIdStatics_Instance.FromUuid(uuid)

    public fun FromShortId(shortId: WinDef.UINT) =
        ABI.IRfcommServiceIdStatics_Instance.FromShortId(shortId)

    public fun get_SerialPort() = ABI.IRfcommServiceIdStatics_Instance.get_SerialPort()

    public fun get_ObexObjectPush() = ABI.IRfcommServiceIdStatics_Instance.get_ObexObjectPush()

    public fun get_ObexFileTransfer() = ABI.IRfcommServiceIdStatics_Instance.get_ObexFileTransfer()

    public fun get_PhoneBookAccessPce() =
        ABI.IRfcommServiceIdStatics_Instance.get_PhoneBookAccessPce()

    public fun get_PhoneBookAccessPse() =
        ABI.IRfcommServiceIdStatics_Instance.get_PhoneBookAccessPse()

    public fun get_GenericFileTransfer() =
        ABI.IRfcommServiceIdStatics_Instance.get_GenericFileTransfer()
  }
}
