package Windows.System.RemoteSystems

import Windows.Foundation.IClosable
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

@ABIMarker(RemoteSystemSession.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemSession;{69476a01-9ada-490f-9549-d31cb14c9e95})")
@WinRTByReference(brClass = RemoteSystemSession.ByReference::class)
public class RemoteSystemSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemSession.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __476100382_Interface: IRemoteSystemSession.WithDefault by lazy {
    as_476100382()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __476100382_Ptr: JNAPointer? by lazy {
    __476100382_Interface.__476100382_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__476100382_Interface, __1260617006_Interface)

  private fun as_476100382(): IRemoteSystemSession.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemSession.ABI.makeIRemoteSystemSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemSession.ABI.makeIRemoteSystemSession(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemSession> {
    public override fun getValue() = RemoteSystemSession(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemSession, MemoryAddress> {
    public val IRemoteSystemSessionStatics_Instance: IRemoteSystemSessionStatics by lazy {
      createIRemoteSystemSessionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRemoteSystemSessionStatics(): IRemoteSystemSessionStatics {
      val refiid = Guid.REFIID(IRemoteSystemSessionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystemSession".toHandle(),refiid,interfacePtr)
      val result =
          IRemoteSystemSessionStatics.ABI.makeIRemoteSystemSessionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RemoteSystemSession {
      val address = segment.toRawLongValue()
      return RemoteSystemSession(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateWatcher() = ABI.IRemoteSystemSessionStatics_Instance.CreateWatcher()
  }
}
