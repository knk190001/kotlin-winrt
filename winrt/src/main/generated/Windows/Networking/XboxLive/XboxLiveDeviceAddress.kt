package Windows.Networking.XboxLive

import Windows.Storage.Streams.IBuffer
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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Byte
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(XboxLiveDeviceAddress.ABI::class)
@Signature("rc(Windows.Networking.XboxLive.XboxLiveDeviceAddress;{f5bbd279-3c86-4b57-a31a-b9462408fd01})")
@WinRTByReference(brClass = XboxLiveDeviceAddress.ByReference::class)
public class XboxLiveDeviceAddress(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXboxLiveDeviceAddress.WithDefault, IWinRTObject {
  private val __809820828_Interface: IXboxLiveDeviceAddress.WithDefault by lazy {
    as_809820828()
  }


  public override val __809820828_Ptr: JNAPointer? by lazy {
    __809820828_Interface.__809820828_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__809820828_Interface)

  private fun as_809820828(): IXboxLiveDeviceAddress.WithDefault {
    if(pointer == NULL) {
      return(IXboxLiveDeviceAddress.ABI.makeIXboxLiveDeviceAddress(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXboxLiveDeviceAddress>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXboxLiveDeviceAddress.ABI.makeIXboxLiveDeviceAddress(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XboxLiveDeviceAddress> {
    public override fun getValue() = XboxLiveDeviceAddress(pointer.getPointer(0))

    public fun setValue(value: XboxLiveDeviceAddress): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XboxLiveDeviceAddress, MemoryAddress> {
    public val IXboxLiveDeviceAddressStatics_Instance: IXboxLiveDeviceAddressStatics by lazy {
      createIXboxLiveDeviceAddressStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIXboxLiveDeviceAddressStatics(): IXboxLiveDeviceAddressStatics {
      val refiid = Guid.REFIID(IXboxLiveDeviceAddressStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.XboxLive.XboxLiveDeviceAddress".toHandle(),refiid,interfacePtr)
      val result =
          IXboxLiveDeviceAddressStatics.ABI.makeIXboxLiveDeviceAddressStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): XboxLiveDeviceAddress {
      val address = segment.toRawLongValue()
      return XboxLiveDeviceAddress(Pointer(address))
    }

    public override fun toNative(obj: XboxLiveDeviceAddress): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromSnapshotBase64(base64: String) =
        ABI.IXboxLiveDeviceAddressStatics_Instance.CreateFromSnapshotBase64(base64)

    public fun CreateFromSnapshotBuffer(buffer: IBuffer) =
        ABI.IXboxLiveDeviceAddressStatics_Instance.CreateFromSnapshotBuffer(buffer)

    public fun CreateFromSnapshotBytes(buffer: Array<Byte>) =
        ABI.IXboxLiveDeviceAddressStatics_Instance.CreateFromSnapshotBytes(buffer)

    public fun GetLocal() = ABI.IXboxLiveDeviceAddressStatics_Instance.GetLocal()

    public fun get_MaxSnapshotBytesSize() =
        ABI.IXboxLiveDeviceAddressStatics_Instance.get_MaxSnapshotBytesSize()
  }
}
