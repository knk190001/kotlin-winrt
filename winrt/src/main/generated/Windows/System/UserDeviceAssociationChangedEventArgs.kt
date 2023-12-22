package Windows.System

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

@ABIMarker(UserDeviceAssociationChangedEventArgs.ABI::class)
@Signature("rc(Windows.System.UserDeviceAssociationChangedEventArgs;{bd1f6f6c-bb5d-4d7b-a5f0-c8cd11a38d42})")
@WinRTByReference(brClass = UserDeviceAssociationChangedEventArgs.ByReference::class)
public class UserDeviceAssociationChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDeviceAssociationChangedEventArgs.WithDefault, IWinRTObject {
  private val __689340396_Interface: IUserDeviceAssociationChangedEventArgs.WithDefault by lazy {
    as_689340396()
  }


  public override val __689340396_Ptr: JNAPointer? by lazy {
    __689340396_Interface.__689340396_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__689340396_Interface)

  private fun as_689340396(): IUserDeviceAssociationChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IUserDeviceAssociationChangedEventArgs.ABI.makeIUserDeviceAssociationChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDeviceAssociationChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDeviceAssociationChangedEventArgs.ABI.makeIUserDeviceAssociationChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDeviceAssociationChangedEventArgs> {
    public override fun getValue() = UserDeviceAssociationChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: UserDeviceAssociationChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDeviceAssociationChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserDeviceAssociationChangedEventArgs {
      val address = segment.toRawLongValue()
      return UserDeviceAssociationChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: UserDeviceAssociationChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
