package Windows.System.RemoteSystems

import Windows.System.RemoteSystems.IRemoteSystemSessionControllerFactory.ABI.IID
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

@ABIMarker(RemoteSystemSessionController.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemSessionController;{e48b2dd2-6820-4867-b425-d89c0a3ef7ba})")
@WinRTByReference(brClass = RemoteSystemSessionController.ByReference::class)
public class RemoteSystemSessionController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemSessionController.WithDefault, IWinRTObject {
  private val __1982114274_Interface: IRemoteSystemSessionController.WithDefault by lazy {
    as_1982114274()
  }


  public override val __1982114274_Ptr: JNAPointer? by lazy {
    __1982114274_Interface.__1982114274_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1982114274_Interface)

  public constructor(displayName: String) : this(ABI.activate(displayName))

  public constructor(displayName: String, options: RemoteSystemSessionOptions) :
      this(ABI.activate(displayName, options))

  private fun as_1982114274(): IRemoteSystemSessionController.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemSessionController.ABI.makeIRemoteSystemSessionController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemSessionController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemSessionController.ABI.makeIRemoteSystemSessionController(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemSessionController> {
    public override fun getValue() = RemoteSystemSessionController(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemSessionController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemSessionController, MemoryAddress> {
    public val IRemoteSystemSessionControllerFactory_Instance: IRemoteSystemSessionControllerFactory
        by lazy {
      createIRemoteSystemSessionControllerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRemoteSystemSessionControllerFactory():
        IRemoteSystemSessionControllerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystemSessionController".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRemoteSystemSessionControllerFactory.ABI.makeIRemoteSystemSessionControllerFactory(factoryActivatorPtr.value))
    }

    public fun activate(displayName: String): JNAPointer? =
        IRemoteSystemSessionControllerFactory_Instance.CreateController(displayName)?.pointer

    public fun activate(displayName: String, options: RemoteSystemSessionOptions): JNAPointer? =
        IRemoteSystemSessionControllerFactory_Instance.CreateController(displayName,
        options)?.pointer

    public override fun fromNative(segment: MemoryAddress): RemoteSystemSessionController {
      val address = segment.toRawLongValue()
      return RemoteSystemSessionController(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemSessionController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
