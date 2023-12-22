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

@ABIMarker(UserDataBufferUnprotectResult.ABI::class)
@Signature("rc(Windows.Security.DataProtection.UserDataBufferUnprotectResult;{8efd0e90-fa9a-46a4-a377-01cebf1e74d8})")
@WinRTByReference(brClass = UserDataBufferUnprotectResult.ByReference::class)
public class UserDataBufferUnprotectResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataBufferUnprotectResult.WithDefault, IWinRTObject {
  private val __1650074651_Interface: IUserDataBufferUnprotectResult.WithDefault by lazy {
    as_1650074651()
  }


  public override val __1650074651_Ptr: JNAPointer? by lazy {
    __1650074651_Interface.__1650074651_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1650074651_Interface)

  private fun as_1650074651(): IUserDataBufferUnprotectResult.WithDefault {
    if(pointer == NULL) {
      return(IUserDataBufferUnprotectResult.ABI.makeIUserDataBufferUnprotectResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataBufferUnprotectResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataBufferUnprotectResult.ABI.makeIUserDataBufferUnprotectResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataBufferUnprotectResult> {
    public override fun getValue() = UserDataBufferUnprotectResult(pointer.getPointer(0))

    public fun setValue(value: UserDataBufferUnprotectResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataBufferUnprotectResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserDataBufferUnprotectResult {
      val address = segment.toRawLongValue()
      return UserDataBufferUnprotectResult(Pointer(address))
    }

    public override fun toNative(obj: UserDataBufferUnprotectResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
