package Windows.System.UserProfile

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

@ABIMarker(AdvertisingManager.ABI::class)
@WinRTByReference(brClass = AdvertisingManager.ByReference::class)
public class AdvertisingManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdvertisingManager> {
    public override fun getValue() = AdvertisingManager(pointer.getPointer(0))

    public fun setValue(value: AdvertisingManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdvertisingManager, MemoryAddress> {
    public val IAdvertisingManagerStatics_Instance: IAdvertisingManagerStatics by lazy {
      createIAdvertisingManagerStatics()
    }


    public val IAdvertisingManagerStatics2_Instance: IAdvertisingManagerStatics2 by lazy {
      createIAdvertisingManagerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAdvertisingManagerStatics(): IAdvertisingManagerStatics {
      val refiid = Guid.REFIID(IAdvertisingManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.UserProfile.AdvertisingManager".toHandle(),refiid,interfacePtr)
      val result = IAdvertisingManagerStatics.ABI.makeIAdvertisingManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIAdvertisingManagerStatics2(): IAdvertisingManagerStatics2 {
      val refiid = Guid.REFIID(IAdvertisingManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.UserProfile.AdvertisingManager".toHandle(),refiid,interfacePtr)
      val result =
          IAdvertisingManagerStatics2.ABI.makeIAdvertisingManagerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AdvertisingManager {
      val address = segment.toRawLongValue()
      return AdvertisingManager(Pointer(address))
    }

    public override fun toNative(obj: AdvertisingManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AdvertisingId() = ABI.IAdvertisingManagerStatics_Instance.get_AdvertisingId()

    public fun GetForUser(user: User) = ABI.IAdvertisingManagerStatics2_Instance.GetForUser(user)
  }
}
