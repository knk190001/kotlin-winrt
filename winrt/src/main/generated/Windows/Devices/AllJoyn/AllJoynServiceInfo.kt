package Windows.Devices.AllJoyn

import Windows.Devices.AllJoyn.IAllJoynServiceInfoFactory.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AllJoynServiceInfo.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynServiceInfo;{4cbe8209-b93e-4182-999b-ddd000f9c575})")
@WinRTByReference(brClass = AllJoynServiceInfo.ByReference::class)
public class AllJoynServiceInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynServiceInfo.WithDefault, IWinRTObject {
  private val __435459854_Interface: IAllJoynServiceInfo.WithDefault by lazy {
    as_435459854()
  }


  public override val __435459854_Ptr: JNAPointer? by lazy {
    __435459854_Interface.__435459854_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__435459854_Interface)

  public constructor(
    uniqueName: String,
    objectPath: String,
    sessionPort: WinDef.USHORT
  ) : this(ABI.activate(uniqueName, objectPath, sessionPort))

  private fun as_435459854(): IAllJoynServiceInfo.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynServiceInfo.ABI.makeIAllJoynServiceInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynServiceInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynServiceInfo.ABI.makeIAllJoynServiceInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AllJoynServiceInfo> {
    public override fun getValue() = AllJoynServiceInfo(pointer.getPointer(0))

    public fun setValue(value: AllJoynServiceInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynServiceInfo, MemoryAddress> {
    public val IAllJoynServiceInfoStatics_Instance: IAllJoynServiceInfoStatics by lazy {
      createIAllJoynServiceInfoStatics()
    }


    public val IAllJoynServiceInfoFactory_Instance: IAllJoynServiceInfoFactory by lazy {
      createIAllJoynServiceInfoFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAllJoynServiceInfoStatics(): IAllJoynServiceInfoStatics {
      val refiid = Guid.REFIID(IAllJoynServiceInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynServiceInfo".toHandle(),refiid,interfacePtr)
      val result = IAllJoynServiceInfoStatics.ABI.makeIAllJoynServiceInfoStatics(interfacePtr.value)
      return result
    }

    public fun createIAllJoynServiceInfoFactory(): IAllJoynServiceInfoFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynServiceInfo".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAllJoynServiceInfoFactory.ABI.makeIAllJoynServiceInfoFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      uniqueName: String,
      objectPath: String,
      sessionPort: WinDef.USHORT
    ): JNAPointer? = IAllJoynServiceInfoFactory_Instance.Create(uniqueName, objectPath,
        sessionPort)?.pointer

    public override fun fromNative(segment: MemoryAddress): AllJoynServiceInfo {
      val address = segment.toRawLongValue()
      return AllJoynServiceInfo(Pointer(address))
    }

    public override fun toNative(obj: AllJoynServiceInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromIdAsync(deviceId: String) =
        ABI.IAllJoynServiceInfoStatics_Instance.FromIdAsync(deviceId)
  }
}
