package Windows.UI.UIAutomation.Core

import Windows.UI.UIAutomation.Core.IRemoteAutomationClientSessionFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RemoteAutomationClientSession.ABI::class)
@Signature("rc(Windows.UI.UIAutomation.Core.RemoteAutomationClientSession;{5c8a091d-94cc-5b33-afdb-678cded2bd54})")
@WinRTByReference(brClass = RemoteAutomationClientSession.ByReference::class)
public class RemoteAutomationClientSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteAutomationClientSession.WithDefault, IWinRTObject {
  private val __382673176_Interface: IRemoteAutomationClientSession.WithDefault by lazy {
    as_382673176()
  }


  public override val __382673176_Ptr: JNAPointer? by lazy {
    __382673176_Interface.__382673176_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__382673176_Interface)

  public constructor(name: String) : this(ABI.activate(name))

  public constructor(name: String, sessionId: Guid.GUID) : this(ABI.activate(name, sessionId))

  private fun as_382673176(): IRemoteAutomationClientSession.WithDefault {
    if(pointer == NULL) {
      return(IRemoteAutomationClientSession.ABI.makeIRemoteAutomationClientSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteAutomationClientSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteAutomationClientSession.ABI.makeIRemoteAutomationClientSession(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteAutomationClientSession> {
    public override fun getValue() = RemoteAutomationClientSession(pointer.getPointer(0))

    public fun setValue(value: RemoteAutomationClientSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteAutomationClientSession, MemoryAddress> {
    public val IRemoteAutomationClientSessionFactory_Instance: IRemoteAutomationClientSessionFactory
        by lazy {
      createIRemoteAutomationClientSessionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRemoteAutomationClientSessionFactory():
        IRemoteAutomationClientSessionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.UIAutomation.Core.RemoteAutomationClientSession".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRemoteAutomationClientSessionFactory.ABI.makeIRemoteAutomationClientSessionFactory(factoryActivatorPtr.value))
    }

    public fun activate(name: String): JNAPointer? =
        IRemoteAutomationClientSessionFactory_Instance.CreateInstance(name)?.pointer

    public fun activate(name: String, sessionId: Guid.GUID): JNAPointer? =
        IRemoteAutomationClientSessionFactory_Instance.CreateInstance2(name, sessionId)?.pointer

    public override fun fromNative(segment: MemoryAddress): RemoteAutomationClientSession {
      val address = segment.toRawLongValue()
      return RemoteAutomationClientSession(Pointer(address))
    }

    public override fun toNative(obj: RemoteAutomationClientSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
