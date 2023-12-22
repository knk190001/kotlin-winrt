package Windows.System.RemoteSystems

import Windows.System.RemoteSystems.IRemoteSystemConnectionRequestFactory.ABI.IID
import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(RemoteSystemConnectionRequest.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemConnectionRequest;{84ed4104-8d5e-4d72-8238-7621576c7a67})")
@WinRTByReference(brClass = RemoteSystemConnectionRequest.ByReference::class)
public class RemoteSystemConnectionRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemConnectionRequest.WithDefault,
    IRemoteSystemConnectionRequest2.WithDefault, IRemoteSystemConnectionRequest3.WithDefault,
    IWinRTObject {
  private val __1315795683_Interface: IRemoteSystemConnectionRequest.WithDefault by lazy {
    as_1315795683()
  }


  private val __2134960459_Interface: IRemoteSystemConnectionRequest2.WithDefault by lazy {
    as_2134960459()
  }


  private val __2134960458_Interface: IRemoteSystemConnectionRequest3.WithDefault by lazy {
    as_2134960458()
  }


  public override val __1315795683_Ptr: JNAPointer? by lazy {
    __1315795683_Interface.__1315795683_Ptr
  }


  public override val __2134960459_Ptr: JNAPointer? by lazy {
    __2134960459_Interface.__2134960459_Ptr
  }


  public override val __2134960458_Ptr: JNAPointer? by lazy {
    __2134960458_Interface.__2134960458_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1315795683_Interface, __2134960459_Interface, __2134960458_Interface)

  public constructor(remoteSystem: RemoteSystem) : this(ABI.activate(remoteSystem))

  private fun as_1315795683(): IRemoteSystemConnectionRequest.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemConnectionRequest.ABI.makeIRemoteSystemConnectionRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemConnectionRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemConnectionRequest.ABI.makeIRemoteSystemConnectionRequest(ref.value))
  }

  private fun as_2134960459(): IRemoteSystemConnectionRequest2.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemConnectionRequest2.ABI.makeIRemoteSystemConnectionRequest2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemConnectionRequest2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemConnectionRequest2.ABI.makeIRemoteSystemConnectionRequest2(ref.value))
  }

  private fun as_2134960458(): IRemoteSystemConnectionRequest3.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemConnectionRequest3.ABI.makeIRemoteSystemConnectionRequest3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemConnectionRequest3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemConnectionRequest3.ABI.makeIRemoteSystemConnectionRequest3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemConnectionRequest> {
    public override fun getValue() = RemoteSystemConnectionRequest(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemConnectionRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemConnectionRequest, MemoryAddress> {
    public val IRemoteSystemConnectionRequestStatics_Instance: IRemoteSystemConnectionRequestStatics
        by lazy {
      createIRemoteSystemConnectionRequestStatics()
    }


    public val IRemoteSystemConnectionRequestStatics2_Instance:
        IRemoteSystemConnectionRequestStatics2 by lazy {
      createIRemoteSystemConnectionRequestStatics2()
    }


    public val IRemoteSystemConnectionRequestFactory_Instance: IRemoteSystemConnectionRequestFactory
        by lazy {
      createIRemoteSystemConnectionRequestFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRemoteSystemConnectionRequestStatics():
        IRemoteSystemConnectionRequestStatics {
      val refiid = Guid.REFIID(IRemoteSystemConnectionRequestStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystemConnectionRequest".toHandle(),refiid,interfacePtr)
      val result =
          IRemoteSystemConnectionRequestStatics.ABI.makeIRemoteSystemConnectionRequestStatics(interfacePtr.value)
      return result
    }

    public fun createIRemoteSystemConnectionRequestStatics2():
        IRemoteSystemConnectionRequestStatics2 {
      val refiid = Guid.REFIID(IRemoteSystemConnectionRequestStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystemConnectionRequest".toHandle(),refiid,interfacePtr)
      val result =
          IRemoteSystemConnectionRequestStatics2.ABI.makeIRemoteSystemConnectionRequestStatics2(interfacePtr.value)
      return result
    }

    public fun createIRemoteSystemConnectionRequestFactory():
        IRemoteSystemConnectionRequestFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystemConnectionRequest".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRemoteSystemConnectionRequestFactory.ABI.makeIRemoteSystemConnectionRequestFactory(factoryActivatorPtr.value))
    }

    public fun activate(remoteSystem: RemoteSystem): JNAPointer? =
        IRemoteSystemConnectionRequestFactory_Instance.Create(remoteSystem)?.pointer

    public override fun fromNative(segment: MemoryAddress): RemoteSystemConnectionRequest {
      val address = segment.toRawLongValue()
      return RemoteSystemConnectionRequest(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemConnectionRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateForApp(remoteSystemApp: RemoteSystemApp) =
        ABI.IRemoteSystemConnectionRequestStatics_Instance.CreateForApp(remoteSystemApp)

    public fun CreateFromConnectionToken(connectionToken: String) =
        ABI.IRemoteSystemConnectionRequestStatics2_Instance.CreateFromConnectionToken(connectionToken)

    public fun CreateFromConnectionTokenForUser(user: User, connectionToken: String) =
        ABI.IRemoteSystemConnectionRequestStatics2_Instance.CreateFromConnectionTokenForUser(user,
        connectionToken)
  }
}
