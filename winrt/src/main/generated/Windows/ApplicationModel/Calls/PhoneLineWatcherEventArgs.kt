package Windows.ApplicationModel.Calls

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

@ABIMarker(PhoneLineWatcherEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneLineWatcherEventArgs;{d07c753e-9e12-4a37-82b7-ad535dad6a67})")
@WinRTByReference(brClass = PhoneLineWatcherEventArgs.ByReference::class)
public class PhoneLineWatcherEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneLineWatcherEventArgs.WithDefault, IWinRTObject {
  private val __1829617183_Interface: IPhoneLineWatcherEventArgs.WithDefault by lazy {
    as_1829617183()
  }


  public override val __1829617183_Ptr: JNAPointer? by lazy {
    __1829617183_Interface.__1829617183_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1829617183_Interface)

  private fun as_1829617183(): IPhoneLineWatcherEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPhoneLineWatcherEventArgs.ABI.makeIPhoneLineWatcherEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneLineWatcherEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneLineWatcherEventArgs.ABI.makeIPhoneLineWatcherEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneLineWatcherEventArgs> {
    public override fun getValue() = PhoneLineWatcherEventArgs(pointer.getPointer(0))

    public fun setValue(value: PhoneLineWatcherEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneLineWatcherEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneLineWatcherEventArgs {
      val address = segment.toRawLongValue()
      return PhoneLineWatcherEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PhoneLineWatcherEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
