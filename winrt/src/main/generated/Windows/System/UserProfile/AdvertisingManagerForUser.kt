package Windows.System.UserProfile

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

@ABIMarker(AdvertisingManagerForUser.ABI::class)
@Signature("rc(Windows.System.UserProfile.AdvertisingManagerForUser;{928bf3d0-cf7c-4ab0-a7dc-6dc5bcd44252})")
@WinRTByReference(brClass = AdvertisingManagerForUser.ByReference::class)
public class AdvertisingManagerForUser(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdvertisingManagerForUser.WithDefault, IWinRTObject {
  private val __1065562828_Interface: IAdvertisingManagerForUser.WithDefault by lazy {
    as_1065562828()
  }


  public override val __1065562828_Ptr: JNAPointer? by lazy {
    __1065562828_Interface.__1065562828_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1065562828_Interface)

  private fun as_1065562828(): IAdvertisingManagerForUser.WithDefault {
    if(pointer == NULL) {
      return(IAdvertisingManagerForUser.ABI.makeIAdvertisingManagerForUser(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdvertisingManagerForUser>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdvertisingManagerForUser.ABI.makeIAdvertisingManagerForUser(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdvertisingManagerForUser> {
    public override fun getValue() = AdvertisingManagerForUser(pointer.getPointer(0))

    public fun setValue(value: AdvertisingManagerForUser): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdvertisingManagerForUser, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AdvertisingManagerForUser {
      val address = segment.toRawLongValue()
      return AdvertisingManagerForUser(Pointer(address))
    }

    public override fun toNative(obj: AdvertisingManagerForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
