package Windows.ApplicationModel.AppService

import Windows.Foundation.Collections.ValueSet
import Windows.Foundation.IClosable
import Windows.System.RemoteSystems.RemoteSystemConnectionRequest
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(AppServiceConnection.ABI::class)
@Signature("rc(Windows.ApplicationModel.AppService.AppServiceConnection;{9dd474a2-871f-4d52-89a9-9e090531bd27})")
@WinRTByReference(brClass = AppServiceConnection.ByReference::class)
public class AppServiceConnection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppServiceConnection.WithDefault, IAppServiceConnection2.WithDefault,
    IClosable.WithDefault, IWinRTObject {
  private val __1369690531_Interface: IAppServiceConnection.WithDefault by lazy {
    as_1369690531()
  }


  private val __489266549_Interface: IAppServiceConnection2.WithDefault by lazy {
    as_489266549()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1369690531_Ptr: JNAPointer? by lazy {
    __1369690531_Interface.__1369690531_Ptr
  }


  public override val __489266549_Ptr: JNAPointer? by lazy {
    __489266549_Interface.__489266549_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1369690531_Interface, __489266549_Interface, __1260617006_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1369690531(): IAppServiceConnection.WithDefault {
    if(pointer == NULL) {
      return(IAppServiceConnection.ABI.makeIAppServiceConnection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppServiceConnection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppServiceConnection.ABI.makeIAppServiceConnection(ref.value))
  }

  private fun as_489266549(): IAppServiceConnection2.WithDefault {
    if(pointer == NULL) {
      return(IAppServiceConnection2.ABI.makeIAppServiceConnection2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppServiceConnection2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppServiceConnection2.ABI.makeIAppServiceConnection2(ref.value))
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
      IByReference<AppServiceConnection> {
    public override fun getValue() = AppServiceConnection(pointer.getPointer(0))

    public fun setValue(value: AppServiceConnection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppServiceConnection, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IAppServiceConnectionStatics_Instance: IAppServiceConnectionStatics by lazy {
      createIAppServiceConnectionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.AppService.AppServiceConnection".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIAppServiceConnectionStatics(): IAppServiceConnectionStatics {
      val refiid = Guid.REFIID(IAppServiceConnectionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.AppService.AppServiceConnection".toHandle(),refiid,interfacePtr)
      val result =
          IAppServiceConnectionStatics.ABI.makeIAppServiceConnectionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppServiceConnection {
      val address = segment.toRawLongValue()
      return AppServiceConnection(Pointer(address))
    }

    public override fun toNative(obj: AppServiceConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun SendStatelessMessageAsync(
      connection: AppServiceConnection,
      connectionRequest: RemoteSystemConnectionRequest,
      message: ValueSet
    ) = ABI.IAppServiceConnectionStatics_Instance.SendStatelessMessageAsync(connection,
        connectionRequest, message)
  }
}
