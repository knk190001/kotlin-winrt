package Windows.UI.UIAutomation.Core

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

@ABIMarker(RemoteAutomationServer.ABI::class)
@WinRTByReference(brClass = RemoteAutomationServer.ByReference::class)
public class RemoteAutomationServer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteAutomationServer> {
    public override fun getValue() = RemoteAutomationServer(pointer.getPointer(0))

    public fun setValue(value: RemoteAutomationServer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteAutomationServer, MemoryAddress> {
    public val IRemoteAutomationServerStatics_Instance: IRemoteAutomationServerStatics by lazy {
      createIRemoteAutomationServerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRemoteAutomationServerStatics(): IRemoteAutomationServerStatics {
      val refiid = Guid.REFIID(IRemoteAutomationServerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.UIAutomation.Core.RemoteAutomationServer".toHandle(),refiid,interfacePtr)
      val result =
          IRemoteAutomationServerStatics.ABI.makeIRemoteAutomationServerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RemoteAutomationServer {
      val address = segment.toRawLongValue()
      return RemoteAutomationServer(Pointer(address))
    }

    public override fun toNative(obj: RemoteAutomationServer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ReportSession(sessionId: Guid.GUID) =
        ABI.IRemoteAutomationServerStatics_Instance.ReportSession(sessionId)
  }
}
