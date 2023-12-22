package Windows.Security.Cryptography.Certificates

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

@ABIMarker(UserCertificateStore.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Certificates.UserCertificateStore;{c9fb1d83-789f-4b4e-9180-045a757aac6d})")
@WinRTByReference(brClass = UserCertificateStore.ByReference::class)
public class UserCertificateStore(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserCertificateStore.WithDefault, IWinRTObject {
  private val __2088755613_Interface: IUserCertificateStore.WithDefault by lazy {
    as_2088755613()
  }


  public override val __2088755613_Ptr: JNAPointer? by lazy {
    __2088755613_Interface.__2088755613_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2088755613_Interface)

  private fun as_2088755613(): IUserCertificateStore.WithDefault {
    if(pointer == NULL) {
      return(IUserCertificateStore.ABI.makeIUserCertificateStore(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserCertificateStore>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserCertificateStore.ABI.makeIUserCertificateStore(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserCertificateStore> {
    public override fun getValue() = UserCertificateStore(pointer.getPointer(0))

    public fun setValue(value: UserCertificateStore): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserCertificateStore, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserCertificateStore {
      val address = segment.toRawLongValue()
      return UserCertificateStore(Pointer(address))
    }

    public override fun toNative(obj: UserCertificateStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
