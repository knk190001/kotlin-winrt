package Windows.Security.Isolation

import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(IsolatedWindowsHostMessenger.ABI::class)
@WinRTByReference(brClass = IsolatedWindowsHostMessenger.ByReference::class)
public class IsolatedWindowsHostMessenger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsHostMessenger> {
    public override fun getValue() = IsolatedWindowsHostMessenger(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsHostMessenger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsHostMessenger, MemoryAddress> {
    public val IIsolatedWindowsHostMessengerStatics_Instance: IIsolatedWindowsHostMessengerStatics
        by lazy {
      createIIsolatedWindowsHostMessengerStatics()
    }


    public val IIsolatedWindowsHostMessengerStatics2_Instance: IIsolatedWindowsHostMessengerStatics2
        by lazy {
      createIIsolatedWindowsHostMessengerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIIsolatedWindowsHostMessengerStatics(): IIsolatedWindowsHostMessengerStatics {
      val refiid = Guid.REFIID(IIsolatedWindowsHostMessengerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Isolation.IsolatedWindowsHostMessenger".toHandle(),refiid,interfacePtr)
      val result =
          IIsolatedWindowsHostMessengerStatics.ABI.makeIIsolatedWindowsHostMessengerStatics(interfacePtr.value)
      return result
    }

    public fun createIIsolatedWindowsHostMessengerStatics2():
        IIsolatedWindowsHostMessengerStatics2 {
      val refiid = Guid.REFIID(IIsolatedWindowsHostMessengerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Isolation.IsolatedWindowsHostMessenger".toHandle(),refiid,interfacePtr)
      val result =
          IIsolatedWindowsHostMessengerStatics2.ABI.makeIIsolatedWindowsHostMessengerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): IsolatedWindowsHostMessenger {
      val address = segment.toRawLongValue()
      return IsolatedWindowsHostMessenger(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsHostMessenger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun PostMessageToReceiver(receiverId: Guid.GUID, message: IVectorView<IUnknown?>) =
        ABI.IIsolatedWindowsHostMessengerStatics_Instance.PostMessageToReceiver(receiverId, message)

    public fun GetFileId(filePath: String) =
        ABI.IIsolatedWindowsHostMessengerStatics_Instance.GetFileId(filePath)

    public fun RegisterHostMessageReceiver(receiverId: Guid.GUID,
        hostMessageReceivedCallback: HostMessageReceivedCallback) =
        ABI.IIsolatedWindowsHostMessengerStatics2_Instance.RegisterHostMessageReceiver(receiverId,
        hostMessageReceivedCallback)

    public fun UnregisterHostMessageReceiver(receiverId: Guid.GUID) =
        ABI.IIsolatedWindowsHostMessengerStatics2_Instance.UnregisterHostMessageReceiver(receiverId)
  }
}
