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

@ABIMarker(UserCertificateEnrollmentManager.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Certificates.UserCertificateEnrollmentManager;{96313718-22e1-4819-b20b-ab46a6eca06e})")
@WinRTByReference(brClass = UserCertificateEnrollmentManager.ByReference::class)
public class UserCertificateEnrollmentManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserCertificateEnrollmentManager.WithDefault,
    IUserCertificateEnrollmentManager2.WithDefault, IWinRTObject {
  private val __2005174923_Interface: IUserCertificateEnrollmentManager.WithDefault by lazy {
    as_2005174923()
  }


  private val __2030880519_Interface: IUserCertificateEnrollmentManager2.WithDefault by lazy {
    as_2030880519()
  }


  public override val __2005174923_Ptr: JNAPointer? by lazy {
    __2005174923_Interface.__2005174923_Ptr
  }


  public override val __2030880519_Ptr: JNAPointer? by lazy {
    __2030880519_Interface.__2030880519_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2005174923_Interface, __2030880519_Interface)

  private fun as_2005174923(): IUserCertificateEnrollmentManager.WithDefault {
    if(pointer == NULL) {
      return(IUserCertificateEnrollmentManager.ABI.makeIUserCertificateEnrollmentManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserCertificateEnrollmentManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserCertificateEnrollmentManager.ABI.makeIUserCertificateEnrollmentManager(ref.value))
  }

  private fun as_2030880519(): IUserCertificateEnrollmentManager2.WithDefault {
    if(pointer == NULL) {
      return(IUserCertificateEnrollmentManager2.ABI.makeIUserCertificateEnrollmentManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserCertificateEnrollmentManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserCertificateEnrollmentManager2.ABI.makeIUserCertificateEnrollmentManager2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserCertificateEnrollmentManager> {
    public override fun getValue() = UserCertificateEnrollmentManager(pointer.getPointer(0))

    public fun setValue(value: UserCertificateEnrollmentManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserCertificateEnrollmentManager, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserCertificateEnrollmentManager {
      val address = segment.toRawLongValue()
      return UserCertificateEnrollmentManager(Pointer(address))
    }

    public override fun toNative(obj: UserCertificateEnrollmentManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
