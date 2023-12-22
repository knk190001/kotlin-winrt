package Windows.System.RemoteSystems

import Windows.System.User
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

@ABIMarker(RemoteSystemAppRegistration.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemAppRegistration;{b47947b5-7035-4a5a-b8df-962d8f8431f4})")
@WinRTByReference(brClass = RemoteSystemAppRegistration.ByReference::class)
public class RemoteSystemAppRegistration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemAppRegistration.WithDefault, IWinRTObject {
  private val __558319558_Interface: IRemoteSystemAppRegistration.WithDefault by lazy {
    as_558319558()
  }


  public override val __558319558_Ptr: JNAPointer? by lazy {
    __558319558_Interface.__558319558_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__558319558_Interface)

  private fun as_558319558(): IRemoteSystemAppRegistration.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemAppRegistration.ABI.makeIRemoteSystemAppRegistration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemAppRegistration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemAppRegistration.ABI.makeIRemoteSystemAppRegistration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemAppRegistration> {
    public override fun getValue() = RemoteSystemAppRegistration(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemAppRegistration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemAppRegistration, MemoryAddress> {
    public val IRemoteSystemAppRegistrationStatics_Instance: IRemoteSystemAppRegistrationStatics by
        lazy {
      createIRemoteSystemAppRegistrationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRemoteSystemAppRegistrationStatics(): IRemoteSystemAppRegistrationStatics {
      val refiid = Guid.REFIID(IRemoteSystemAppRegistrationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystemAppRegistration".toHandle(),refiid,interfacePtr)
      val result =
          IRemoteSystemAppRegistrationStatics.ABI.makeIRemoteSystemAppRegistrationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RemoteSystemAppRegistration {
      val address = segment.toRawLongValue()
      return RemoteSystemAppRegistration(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemAppRegistration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IRemoteSystemAppRegistrationStatics_Instance.GetDefault()

    public fun GetForUser(user: User) =
        ABI.IRemoteSystemAppRegistrationStatics_Instance.GetForUser(user)
  }
}
