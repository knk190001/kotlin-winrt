package Windows.Networking.NetworkOperators

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

@ABIMarker(MobileBroadbandAccount.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandAccount;{36c24ccd-cee2-43e0-a603-ee86a36d6570})")
@WinRTByReference(brClass = MobileBroadbandAccount.ByReference::class)
public class MobileBroadbandAccount(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandAccount.WithDefault, IMobileBroadbandAccount2.WithDefault,
    IMobileBroadbandAccount3.WithDefault, IWinRTObject {
  private val __1423766641_Interface: IMobileBroadbandAccount.WithDefault by lazy {
    as_1423766641()
  }


  private val __1187092961_Interface: IMobileBroadbandAccount2.WithDefault by lazy {
    as_1187092961()
  }


  private val __1187092962_Interface: IMobileBroadbandAccount3.WithDefault by lazy {
    as_1187092962()
  }


  public override val __1423766641_Ptr: JNAPointer? by lazy {
    __1423766641_Interface.__1423766641_Ptr
  }


  public override val __1187092961_Ptr: JNAPointer? by lazy {
    __1187092961_Interface.__1187092961_Ptr
  }


  public override val __1187092962_Ptr: JNAPointer? by lazy {
    __1187092962_Interface.__1187092962_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1423766641_Interface, __1187092961_Interface, __1187092962_Interface)

  private fun as_1423766641(): IMobileBroadbandAccount.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandAccount.ABI.makeIMobileBroadbandAccount(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandAccount>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandAccount.ABI.makeIMobileBroadbandAccount(ref.value))
  }

  private fun as_1187092961(): IMobileBroadbandAccount2.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandAccount2.ABI.makeIMobileBroadbandAccount2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandAccount2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandAccount2.ABI.makeIMobileBroadbandAccount2(ref.value))
  }

  private fun as_1187092962(): IMobileBroadbandAccount3.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandAccount3.ABI.makeIMobileBroadbandAccount3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandAccount3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandAccount3.ABI.makeIMobileBroadbandAccount3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandAccount> {
    public override fun getValue() = MobileBroadbandAccount(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandAccount): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandAccount, MemoryAddress> {
    public val IMobileBroadbandAccountStatics_Instance: IMobileBroadbandAccountStatics by lazy {
      createIMobileBroadbandAccountStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMobileBroadbandAccountStatics(): IMobileBroadbandAccountStatics {
      val refiid = Guid.REFIID(IMobileBroadbandAccountStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.NetworkOperators.MobileBroadbandAccount".toHandle(),refiid,interfacePtr)
      val result =
          IMobileBroadbandAccountStatics.ABI.makeIMobileBroadbandAccountStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandAccount {
      val address = segment.toRawLongValue()
      return MobileBroadbandAccount(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandAccount): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AvailableNetworkAccountIds() =
        ABI.IMobileBroadbandAccountStatics_Instance.get_AvailableNetworkAccountIds()

    public fun CreateFromNetworkAccountId(networkAccountId: String) =
        ABI.IMobileBroadbandAccountStatics_Instance.CreateFromNetworkAccountId(networkAccountId)
  }
}
