package Windows.Networking

import Windows.Foundation.IStringable
import Windows.Networking.IHostNameFactory.ABI.IID
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

@ABIMarker(HostName.ABI::class)
@Signature("rc(Windows.Networking.HostName;{bf8ecaad-ed96-49a7-9084-d416cae88dcb})")
@WinRTByReference(brClass = HostName.ByReference::class)
public class HostName(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHostName.WithDefault, IStringable.WithDefault, IWinRTObject {
  private val __175440099_Interface: IHostName.WithDefault by lazy {
    as_175440099()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __175440099_Ptr: JNAPointer? by lazy {
    __175440099_Interface.__175440099_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__175440099_Interface, __328683030_Interface)

  public constructor(hostName: String) : this(ABI.activate(hostName))

  private fun as_175440099(): IHostName.WithDefault {
    if(pointer == NULL) {
      return(IHostName.ABI.makeIHostName(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHostName>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHostName.ABI.makeIHostName(ref.value))
  }

  private fun as_328683030(): IStringable.WithDefault {
    if(pointer == NULL) {
      return(IStringable.ABI.makeIStringable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStringable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStringable.ABI.makeIStringable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<HostName> {
    public override fun getValue() = HostName(pointer.getPointer(0))

    public fun setValue(value: HostName): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HostName, MemoryAddress> {
    public val IHostNameStatics_Instance: IHostNameStatics by lazy {
      createIHostNameStatics()
    }


    public val IHostNameFactory_Instance: IHostNameFactory by lazy {
      createIHostNameFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHostNameStatics(): IHostNameStatics {
      val refiid = Guid.REFIID(IHostNameStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.HostName".toHandle(),refiid,interfacePtr)
      val result = IHostNameStatics.ABI.makeIHostNameStatics(interfacePtr.value)
      return result
    }

    public fun createIHostNameFactory(): IHostNameFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.HostName".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHostNameFactory.ABI.makeIHostNameFactory(factoryActivatorPtr.value))
    }

    public fun activate(hostName: String): JNAPointer? =
        IHostNameFactory_Instance.CreateHostName(hostName)?.pointer

    public override fun fromNative(segment: MemoryAddress): HostName {
      val address = segment.toRawLongValue()
      return HostName(Pointer(address))
    }

    public override fun toNative(obj: HostName): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Compare(value1: String, value2: String) =
        ABI.IHostNameStatics_Instance.Compare(value1, value2)
  }
}
