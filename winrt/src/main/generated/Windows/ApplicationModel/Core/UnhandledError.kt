package Windows.ApplicationModel.Core

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

@ABIMarker(UnhandledError.ABI::class)
@Signature("rc(Windows.ApplicationModel.Core.UnhandledError;{9459b726-53b5-4686-9eaf-fa8162dc3980})")
@WinRTByReference(brClass = UnhandledError.ByReference::class)
public class UnhandledError(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUnhandledError.WithDefault, IWinRTObject {
  private val __1820562277_Interface: IUnhandledError.WithDefault by lazy {
    as_1820562277()
  }


  public override val __1820562277_Ptr: JNAPointer? by lazy {
    __1820562277_Interface.__1820562277_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1820562277_Interface)

  private fun as_1820562277(): IUnhandledError.WithDefault {
    if(pointer == NULL) {
      return(IUnhandledError.ABI.makeIUnhandledError(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUnhandledError>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUnhandledError.ABI.makeIUnhandledError(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UnhandledError>
      {
    public override fun getValue() = UnhandledError(pointer.getPointer(0))

    public fun setValue(value: UnhandledError): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UnhandledError, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UnhandledError {
      val address = segment.toRawLongValue()
      return UnhandledError(Pointer(address))
    }

    public override fun toNative(obj: UnhandledError): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
