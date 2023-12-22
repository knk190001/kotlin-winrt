package Microsoft.Windows.AppLifecycle

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

@ABIMarker(AppActivationArguments.ABI::class)
@Signature("rc(Microsoft.Windows.AppLifecycle.AppActivationArguments;{14f99eaf-1580-5062-bdc8-d5d1c31138fb})")
@WinRTByReference(brClass = AppActivationArguments.ByReference::class)
public class AppActivationArguments(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppActivationArguments.WithDefault, IWinRTObject {
  private val __208932084_Interface: IAppActivationArguments.WithDefault by lazy {
    as_208932084()
  }


  public override val __208932084_Ptr: JNAPointer? by lazy {
    __208932084_Interface.__208932084_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__208932084_Interface)

  private fun as_208932084(): IAppActivationArguments.WithDefault {
    if(pointer == NULL) {
      return(IAppActivationArguments.ABI.makeIAppActivationArguments(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppActivationArguments>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppActivationArguments.ABI.makeIAppActivationArguments(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppActivationArguments> {
    public override fun getValue() = AppActivationArguments(pointer.getPointer(0))

    public fun setValue(value: AppActivationArguments): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppActivationArguments, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppActivationArguments {
      val address = segment.toRawLongValue()
      return AppActivationArguments(Pointer(address))
    }

    public override fun toNative(obj: AppActivationArguments): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
