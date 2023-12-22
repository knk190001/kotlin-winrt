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

@ABIMarker(AllJoynCredentialsVerificationRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynCredentialsVerificationRequestedEventArgs;{800a7612-b805-44af-a2e1-792ab655a2d0})")
@WinRTByReference(brClass = AllJoynCredentialsVerificationRequestedEventArgs.ByReference::class)
public class AllJoynCredentialsVerificationRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynCredentialsVerificationRequestedEventArgs.WithDefault, IWinRTObject {
  private val __280662513_Interface: IAllJoynCredentialsVerificationRequestedEventArgs.WithDefault
      by lazy {
    as_280662513()
  }


  public override val __280662513_Ptr: JNAPointer? by lazy {
    __280662513_Interface.__280662513_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__280662513_Interface)

  private fun as_280662513(): IAllJoynCredentialsVerificationRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynCredentialsVerificationRequestedEventArgs.ABI.makeIAllJoynCredentialsVerificationRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynCredentialsVerificationRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynCredentialsVerificationRequestedEventArgs.ABI.makeIAllJoynCredentialsVerificationRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AllJoynCredentialsVerificationRequestedEventArgs> {
    public override fun getValue() =
        AllJoynCredentialsVerificationRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AllJoynCredentialsVerificationRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynCredentialsVerificationRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AllJoynCredentialsVerificationRequestedEventArgs {
      val address = segment.toRawLongValue()
      return AllJoynCredentialsVerificationRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AllJoynCredentialsVerificationRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
