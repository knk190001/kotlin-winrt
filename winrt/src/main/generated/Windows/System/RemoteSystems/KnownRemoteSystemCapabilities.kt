package Windows.System.RemoteSystems

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(KnownRemoteSystemCapabilities.ABI::class)
@WinRTByReference(brClass = KnownRemoteSystemCapabilities.ByReference::class)
public class KnownRemoteSystemCapabilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownRemoteSystemCapabilities> {
    public override fun getValue() = KnownRemoteSystemCapabilities(pointer.getPointer(0))

    public fun setValue(value: KnownRemoteSystemCapabilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownRemoteSystemCapabilities, MemoryAddress> {
    public val IKnownRemoteSystemCapabilitiesStatics_Instance: IKnownRemoteSystemCapabilitiesStatics
        by lazy {
      createIKnownRemoteSystemCapabilitiesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownRemoteSystemCapabilitiesStatics():
        IKnownRemoteSystemCapabilitiesStatics {
      val refiid = Guid.REFIID(IKnownRemoteSystemCapabilitiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.KnownRemoteSystemCapabilities".toHandle(),refiid,interfacePtr)
      val result =
          IKnownRemoteSystemCapabilitiesStatics.ABI.makeIKnownRemoteSystemCapabilitiesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KnownRemoteSystemCapabilities {
      val address = segment.toRawLongValue()
      return KnownRemoteSystemCapabilities(Pointer(address))
    }

    public override fun toNative(obj: KnownRemoteSystemCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AppService() =
        ABI.IKnownRemoteSystemCapabilitiesStatics_Instance.get_AppService()

    public fun get_LaunchUri() = ABI.IKnownRemoteSystemCapabilitiesStatics_Instance.get_LaunchUri()

    public fun get_RemoteSession() =
        ABI.IKnownRemoteSystemCapabilitiesStatics_Instance.get_RemoteSession()

    public fun get_SpatialEntity() =
        ABI.IKnownRemoteSystemCapabilitiesStatics_Instance.get_SpatialEntity()
  }
}
