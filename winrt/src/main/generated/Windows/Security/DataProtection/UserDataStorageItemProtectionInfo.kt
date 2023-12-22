package Windows.Security.DataProtection

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

@ABIMarker(UserDataStorageItemProtectionInfo.ABI::class)
@Signature("rc(Windows.Security.DataProtection.UserDataStorageItemProtectionInfo;{5b6680f6-e87f-40a1-b19d-a6187a0c662f})")
@WinRTByReference(brClass = UserDataStorageItemProtectionInfo.ByReference::class)
public class UserDataStorageItemProtectionInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataStorageItemProtectionInfo.WithDefault, IWinRTObject {
  private val __1574210973_Interface: IUserDataStorageItemProtectionInfo.WithDefault by lazy {
    as_1574210973()
  }


  public override val __1574210973_Ptr: JNAPointer? by lazy {
    __1574210973_Interface.__1574210973_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1574210973_Interface)

  private fun as_1574210973(): IUserDataStorageItemProtectionInfo.WithDefault {
    if(pointer == NULL) {
      return(IUserDataStorageItemProtectionInfo.ABI.makeIUserDataStorageItemProtectionInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataStorageItemProtectionInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataStorageItemProtectionInfo.ABI.makeIUserDataStorageItemProtectionInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataStorageItemProtectionInfo> {
    public override fun getValue() = UserDataStorageItemProtectionInfo(pointer.getPointer(0))

    public fun setValue(value: UserDataStorageItemProtectionInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataStorageItemProtectionInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserDataStorageItemProtectionInfo {
      val address = segment.toRawLongValue()
      return UserDataStorageItemProtectionInfo(Pointer(address))
    }

    public override fun toNative(obj: UserDataStorageItemProtectionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
