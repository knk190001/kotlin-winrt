package Windows.Storage.AccessCache

import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(StorageApplicationPermissions.ABI::class)
@WinRTByReference(brClass = StorageApplicationPermissions.ByReference::class)
public class StorageApplicationPermissions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageApplicationPermissions> {
    public override fun getValue() = StorageApplicationPermissions(pointer.getPointer(0))

    public fun setValue(value: StorageApplicationPermissions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageApplicationPermissions, MemoryAddress> {
    public val IStorageApplicationPermissionsStatics2_Instance:
        IStorageApplicationPermissionsStatics2 by lazy {
      createIStorageApplicationPermissionsStatics2()
    }


    public val IStorageApplicationPermissionsStatics_Instance: IStorageApplicationPermissionsStatics
        by lazy {
      createIStorageApplicationPermissionsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStorageApplicationPermissionsStatics2():
        IStorageApplicationPermissionsStatics2 {
      val refiid = Guid.REFIID(IStorageApplicationPermissionsStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.AccessCache.StorageApplicationPermissions".toHandle(),refiid,interfacePtr)
      val result =
          IStorageApplicationPermissionsStatics2.ABI.makeIStorageApplicationPermissionsStatics2(interfacePtr.value)
      return result
    }

    public fun createIStorageApplicationPermissionsStatics():
        IStorageApplicationPermissionsStatics {
      val refiid = Guid.REFIID(IStorageApplicationPermissionsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.AccessCache.StorageApplicationPermissions".toHandle(),refiid,interfacePtr)
      val result =
          IStorageApplicationPermissionsStatics.ABI.makeIStorageApplicationPermissionsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StorageApplicationPermissions {
      val address = segment.toRawLongValue()
      return StorageApplicationPermissions(Pointer(address))
    }

    public override fun toNative(obj: StorageApplicationPermissions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetFutureAccessListForUser(user: User) =
        ABI.IStorageApplicationPermissionsStatics2_Instance.GetFutureAccessListForUser(user)

    public fun GetMostRecentlyUsedListForUser(user: User) =
        ABI.IStorageApplicationPermissionsStatics2_Instance.GetMostRecentlyUsedListForUser(user)

    public fun get_FutureAccessList() =
        ABI.IStorageApplicationPermissionsStatics_Instance.get_FutureAccessList()

    public fun get_MostRecentlyUsedList() =
        ABI.IStorageApplicationPermissionsStatics_Instance.get_MostRecentlyUsedList()
  }
}
