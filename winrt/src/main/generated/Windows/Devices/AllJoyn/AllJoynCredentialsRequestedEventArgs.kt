package Windows.Devices.AllJoyn

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

@ABIMarker(AllJoynCredentialsRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynCredentialsRequestedEventArgs;{6a87e34e-b069-4b80-9e1a-41bc837c65d2})")
@WinRTByReference(brClass = AllJoynCredentialsRequestedEventArgs.ByReference::class)
public class AllJoynCredentialsRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynCredentialsRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1822218988_Interface: IAllJoynCredentialsRequestedEventArgs.WithDefault by lazy {
    as_1822218988()
  }


  public override val __1822218988_Ptr: JNAPointer? by lazy {
    __1822218988_Interface.__1822218988_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1822218988_Interface)

  private fun as_1822218988(): IAllJoynCredentialsRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynCredentialsRequestedEventArgs.ABI.makeIAllJoynCredentialsRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynCredentialsRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynCredentialsRequestedEventArgs.ABI.makeIAllJoynCredentialsRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AllJoynCredentialsRequestedEventArgs> {
    public override fun getValue() = AllJoynCredentialsRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AllJoynCredentialsRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynCredentialsRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AllJoynCredentialsRequestedEventArgs {
      val address = segment.toRawLongValue()
      return AllJoynCredentialsRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AllJoynCredentialsRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
