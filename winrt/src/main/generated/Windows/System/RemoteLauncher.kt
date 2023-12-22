package Windows.System

import Windows.Foundation.Collections.ValueSet
import Windows.Foundation.Uri
import Windows.System.RemoteSystems.RemoteSystemConnectionRequest
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

@ABIMarker(RemoteLauncher.ABI::class)
@WinRTByReference(brClass = RemoteLauncher.ByReference::class)
public class RemoteLauncher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RemoteLauncher>
      {
    public override fun getValue() = RemoteLauncher(pointer.getPointer(0))

    public fun setValue(value: RemoteLauncher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteLauncher, MemoryAddress> {
    public val IRemoteLauncherStatics_Instance: IRemoteLauncherStatics by lazy {
      createIRemoteLauncherStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRemoteLauncherStatics(): IRemoteLauncherStatics {
      val refiid = Guid.REFIID(IRemoteLauncherStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteLauncher".toHandle(),refiid,interfacePtr)
      val result = IRemoteLauncherStatics.ABI.makeIRemoteLauncherStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RemoteLauncher {
      val address = segment.toRawLongValue()
      return RemoteLauncher(Pointer(address))
    }

    public override fun toNative(obj: RemoteLauncher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun LaunchUriAsync(remoteSystemConnectionRequest: RemoteSystemConnectionRequest,
        uri: Uri) =
        ABI.IRemoteLauncherStatics_Instance.LaunchUriAsync(remoteSystemConnectionRequest, uri)

    public fun LaunchUriAsync(
      remoteSystemConnectionRequest: RemoteSystemConnectionRequest,
      uri: Uri,
      options: RemoteLauncherOptions
    ) = ABI.IRemoteLauncherStatics_Instance.LaunchUriAsync(remoteSystemConnectionRequest, uri,
        options)

    public fun LaunchUriAsync(
      remoteSystemConnectionRequest: RemoteSystemConnectionRequest,
      uri: Uri,
      options: RemoteLauncherOptions,
      inputData: ValueSet
    ) = ABI.IRemoteLauncherStatics_Instance.LaunchUriAsync(remoteSystemConnectionRequest, uri,
        options, inputData)
  }
}
