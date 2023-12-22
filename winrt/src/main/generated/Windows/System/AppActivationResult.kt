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

@ABIMarker(AppActivationResult.ABI::class)
@Signature("rc(Windows.System.AppActivationResult;{6b528900-f46e-4eb0-aa6c-38af557cf9ed})")
@WinRTByReference(brClass = AppActivationResult.ByReference::class)
public class AppActivationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppActivationResult.WithDefault, IWinRTObject {
  private val __191408827_Interface: IAppActivationResult.WithDefault by lazy {
    as_191408827()
  }


  public override val __191408827_Ptr: JNAPointer? by lazy {
    __191408827_Interface.__191408827_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__191408827_Interface)

  private fun as_191408827(): IAppActivationResult.WithDefault {
    if(pointer == NULL) {
      return(IAppActivationResult.ABI.makeIAppActivationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppActivationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppActivationResult.ABI.makeIAppActivationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppActivationResult> {
    public override fun getValue() = AppActivationResult(pointer.getPointer(0))

    public fun setValue(value: AppActivationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppActivationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppActivationResult {
      val address = segment.toRawLongValue()
      return AppActivationResult(Pointer(address))
    }

    public override fun toNative(obj: AppActivationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
