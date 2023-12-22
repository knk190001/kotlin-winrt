package Windows.Media.Protection.PlayReady

import Windows.Media.Protection.PlayReady.INDTCPMessengerFactory.ABI.IID
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

@ABIMarker(NDTCPMessenger.ABI::class)
@Signature("rc(Windows.Media.Protection.PlayReady.NDTCPMessenger;{d42df95d-a75b-47bf-8249-bc83820da38a})")
@WinRTByReference(brClass = NDTCPMessenger.ByReference::class)
public class NDTCPMessenger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INDMessenger.WithDefault, IWinRTObject {
  private val __1426051043_Interface: INDMessenger.WithDefault by lazy {
    as_1426051043()
  }


  public override val __1426051043_Ptr: JNAPointer? by lazy {
    __1426051043_Interface.__1426051043_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1426051043_Interface)

  public constructor(remoteHostName: String, remoteHostPort: WinDef.UINT) :
      this(ABI.activate(remoteHostName, remoteHostPort))

  private fun as_1426051043(): INDMessenger.WithDefault {
    if(pointer == NULL) {
      return(INDMessenger.ABI.makeINDMessenger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INDMessenger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INDMessenger.ABI.makeINDMessenger(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<NDTCPMessenger>
      {
    public override fun getValue() = NDTCPMessenger(pointer.getPointer(0))

    public fun setValue(value: NDTCPMessenger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NDTCPMessenger, MemoryAddress> {
    public val INDTCPMessengerFactory_Instance: INDTCPMessengerFactory by lazy {
      createINDTCPMessengerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINDTCPMessengerFactory(): INDTCPMessengerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.NDTCPMessenger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INDTCPMessengerFactory.ABI.makeINDTCPMessengerFactory(factoryActivatorPtr.value))
    }

    public fun activate(remoteHostName: String, remoteHostPort: WinDef.UINT): JNAPointer? =
        INDTCPMessengerFactory_Instance.CreateInstance(remoteHostName, remoteHostPort)?.pointer

    public override fun fromNative(segment: MemoryAddress): NDTCPMessenger {
      val address = segment.toRawLongValue()
      return NDTCPMessenger(Pointer(address))
    }

    public override fun toNative(obj: NDTCPMessenger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
