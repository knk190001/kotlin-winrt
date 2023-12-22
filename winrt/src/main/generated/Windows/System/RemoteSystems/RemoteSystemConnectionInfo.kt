package Windows.System.RemoteSystems

import Windows.ApplicationModel.AppService.AppServiceConnection
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RemoteSystemConnectionInfo.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemConnectionInfo;{23278bc3-0d09-52cb-9c6a-eed2940bee43})")
@WinRTByReference(brClass = RemoteSystemConnectionInfo.ByReference::class)
public class RemoteSystemConnectionInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemConnectionInfo.WithDefault, IWinRTObject {
  private val __365919008_Interface: IRemoteSystemConnectionInfo.WithDefault by lazy {
    as_365919008()
  }


  public override val __365919008_Ptr: JNAPointer? by lazy {
    __365919008_Interface.__365919008_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__365919008_Interface)

  private fun as_365919008(): IRemoteSystemConnectionInfo.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemConnectionInfo.ABI.makeIRemoteSystemConnectionInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemConnectionInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemConnectionInfo.ABI.makeIRemoteSystemConnectionInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemConnectionInfo> {
    public override fun getValue() = RemoteSystemConnectionInfo(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemConnectionInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemConnectionInfo, MemoryAddress> {
    public val IRemoteSystemConnectionInfoStatics_Instance: IRemoteSystemConnectionInfoStatics by
        lazy {
      createIRemoteSystemConnectionInfoStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRemoteSystemConnectionInfoStatics(): IRemoteSystemConnectionInfoStatics {
      val refiid = Guid.REFIID(IRemoteSystemConnectionInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystemConnectionInfo".toHandle(),refiid,interfacePtr)
      val result =
          IRemoteSystemConnectionInfoStatics.ABI.makeIRemoteSystemConnectionInfoStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RemoteSystemConnectionInfo {
      val address = segment.toRawLongValue()
      return RemoteSystemConnectionInfo(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemConnectionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryCreateFromAppServiceConnection(connection: AppServiceConnection) =
        ABI.IRemoteSystemConnectionInfoStatics_Instance.TryCreateFromAppServiceConnection(connection)
  }
}
