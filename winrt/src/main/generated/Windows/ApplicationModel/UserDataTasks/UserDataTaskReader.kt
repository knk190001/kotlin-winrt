package Windows.ApplicationModel.UserDataTasks

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

@ABIMarker(UserDataTaskReader.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataTasks.UserDataTaskReader;{03e688b1-4ccf-4500-883b-e76290cfed63})")
@WinRTByReference(brClass = UserDataTaskReader.ByReference::class)
public class UserDataTaskReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataTaskReader.WithDefault, IWinRTObject {
  private val __386961289_Interface: IUserDataTaskReader.WithDefault by lazy {
    as_386961289()
  }


  public override val __386961289_Ptr: JNAPointer? by lazy {
    __386961289_Interface.__386961289_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__386961289_Interface)

  private fun as_386961289(): IUserDataTaskReader.WithDefault {
    if(pointer == NULL) {
      return(IUserDataTaskReader.ABI.makeIUserDataTaskReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataTaskReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataTaskReader.ABI.makeIUserDataTaskReader(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataTaskReader> {
    public override fun getValue() = UserDataTaskReader(pointer.getPointer(0))

    public fun setValue(value: UserDataTaskReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataTaskReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserDataTaskReader {
      val address = segment.toRawLongValue()
      return UserDataTaskReader(Pointer(address))
    }

    public override fun toNative(obj: UserDataTaskReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
