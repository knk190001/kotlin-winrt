package Windows.System.RemoteSystems

import Windows.Foundation.Collections.IIterable
import Windows.Networking.HostName
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RemoteSystem.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystem;{ed5838cd-1e10-4a8c-b4a6-4e5fd6f97721})")
@WinRTByReference(brClass = RemoteSystem.ByReference::class)
public class RemoteSystem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystem.WithDefault, IRemoteSystem2.WithDefault,
    IRemoteSystem3.WithDefault, IRemoteSystem4.WithDefault, IRemoteSystem5.WithDefault,
    IRemoteSystem6.WithDefault, IWinRTObject {
  private val __1225133292_Interface: IRemoteSystem.WithDefault by lazy {
    as_1225133292()
  }


  private val __675573662_Interface: IRemoteSystem2.WithDefault by lazy {
    as_675573662()
  }


  private val __675573663_Interface: IRemoteSystem3.WithDefault by lazy {
    as_675573663()
  }


  private val __675573664_Interface: IRemoteSystem4.WithDefault by lazy {
    as_675573664()
  }


  private val __675573665_Interface: IRemoteSystem5.WithDefault by lazy {
    as_675573665()
  }


  private val __675573666_Interface: IRemoteSystem6.WithDefault by lazy {
    as_675573666()
  }


  public override val __1225133292_Ptr: JNAPointer? by lazy {
    __1225133292_Interface.__1225133292_Ptr
  }


  public override val __675573662_Ptr: JNAPointer? by lazy {
    __675573662_Interface.__675573662_Ptr
  }


  public override val __675573663_Ptr: JNAPointer? by lazy {
    __675573663_Interface.__675573663_Ptr
  }


  public override val __675573664_Ptr: JNAPointer? by lazy {
    __675573664_Interface.__675573664_Ptr
  }


  public override val __675573665_Ptr: JNAPointer? by lazy {
    __675573665_Interface.__675573665_Ptr
  }


  public override val __675573666_Ptr: JNAPointer? by lazy {
    __675573666_Interface.__675573666_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1225133292_Interface, __675573662_Interface, __675573663_Interface,
        __675573664_Interface, __675573665_Interface, __675573666_Interface)

  private fun as_1225133292(): IRemoteSystem.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystem.ABI.makeIRemoteSystem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystem.ABI.makeIRemoteSystem(ref.value))
  }

  private fun as_675573662(): IRemoteSystem2.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystem2.ABI.makeIRemoteSystem2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystem2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystem2.ABI.makeIRemoteSystem2(ref.value))
  }

  private fun as_675573663(): IRemoteSystem3.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystem3.ABI.makeIRemoteSystem3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystem3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystem3.ABI.makeIRemoteSystem3(ref.value))
  }

  private fun as_675573664(): IRemoteSystem4.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystem4.ABI.makeIRemoteSystem4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystem4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystem4.ABI.makeIRemoteSystem4(ref.value))
  }

  private fun as_675573665(): IRemoteSystem5.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystem5.ABI.makeIRemoteSystem5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystem5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystem5.ABI.makeIRemoteSystem5(ref.value))
  }

  private fun as_675573666(): IRemoteSystem6.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystem6.ABI.makeIRemoteSystem6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystem6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystem6.ABI.makeIRemoteSystem6(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RemoteSystem> {
    public override fun getValue() = RemoteSystem(pointer.getPointer(0))

    public fun setValue(value: RemoteSystem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystem, MemoryAddress> {
    public val IRemoteSystemStatics2_Instance: IRemoteSystemStatics2 by lazy {
      createIRemoteSystemStatics2()
    }


    public val IRemoteSystemStatics3_Instance: IRemoteSystemStatics3 by lazy {
      createIRemoteSystemStatics3()
    }


    public val IRemoteSystemStatics_Instance: IRemoteSystemStatics by lazy {
      createIRemoteSystemStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRemoteSystemStatics2(): IRemoteSystemStatics2 {
      val refiid = Guid.REFIID(IRemoteSystemStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystem".toHandle(),refiid,interfacePtr)
      val result = IRemoteSystemStatics2.ABI.makeIRemoteSystemStatics2(interfacePtr.value)
      return result
    }

    public fun createIRemoteSystemStatics3(): IRemoteSystemStatics3 {
      val refiid = Guid.REFIID(IRemoteSystemStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystem".toHandle(),refiid,interfacePtr)
      val result = IRemoteSystemStatics3.ABI.makeIRemoteSystemStatics3(interfacePtr.value)
      return result
    }

    public fun createIRemoteSystemStatics(): IRemoteSystemStatics {
      val refiid = Guid.REFIID(IRemoteSystemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystem".toHandle(),refiid,interfacePtr)
      val result = IRemoteSystemStatics.ABI.makeIRemoteSystemStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RemoteSystem {
      val address = segment.toRawLongValue()
      return RemoteSystem(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsAuthorizationKindEnabled(kind: RemoteSystemAuthorizationKind) =
        ABI.IRemoteSystemStatics2_Instance.IsAuthorizationKindEnabled(kind)

    public fun CreateWatcherForUser(user: User) =
        ABI.IRemoteSystemStatics3_Instance.CreateWatcherForUser(user)

    public fun CreateWatcherForUser(user: User, filters: IIterable<IRemoteSystemFilter?>) =
        ABI.IRemoteSystemStatics3_Instance.CreateWatcherForUser(user, filters)

    public fun FindByHostNameAsync(hostName: HostName) =
        ABI.IRemoteSystemStatics_Instance.FindByHostNameAsync(hostName)

    public fun CreateWatcher() = ABI.IRemoteSystemStatics_Instance.CreateWatcher()

    public fun CreateWatcher(filters: IIterable<IRemoteSystemFilter?>) =
        ABI.IRemoteSystemStatics_Instance.CreateWatcher(filters)

    public fun RequestAccessAsync() = ABI.IRemoteSystemStatics_Instance.RequestAccessAsync()
  }
}
