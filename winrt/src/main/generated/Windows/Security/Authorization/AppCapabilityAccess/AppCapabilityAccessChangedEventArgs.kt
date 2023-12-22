package Windows.Security.Authorization.AppCapabilityAccess

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

@ABIMarker(AppCapabilityAccessChangedEventArgs.ABI::class)
@Signature("rc(Windows.Security.Authorization.AppCapabilityAccess.AppCapabilityAccessChangedEventArgs;{0a578d15-bdd7-457e-8cca-6f53bd2e5944})")
@WinRTByReference(brClass = AppCapabilityAccessChangedEventArgs.ByReference::class)
public class AppCapabilityAccessChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppCapabilityAccessChangedEventArgs.WithDefault, IWinRTObject {
  private val __566227268_Interface: IAppCapabilityAccessChangedEventArgs.WithDefault by lazy {
    as_566227268()
  }


  public override val __566227268_Ptr: JNAPointer? by lazy {
    __566227268_Interface.__566227268_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__566227268_Interface)

  private fun as_566227268(): IAppCapabilityAccessChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppCapabilityAccessChangedEventArgs.ABI.makeIAppCapabilityAccessChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppCapabilityAccessChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppCapabilityAccessChangedEventArgs.ABI.makeIAppCapabilityAccessChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppCapabilityAccessChangedEventArgs> {
    public override fun getValue() = AppCapabilityAccessChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppCapabilityAccessChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppCapabilityAccessChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppCapabilityAccessChangedEventArgs {
      val address = segment.toRawLongValue()
      return AppCapabilityAccessChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppCapabilityAccessChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
