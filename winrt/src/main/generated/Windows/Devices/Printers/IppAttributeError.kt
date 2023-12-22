package Windows.Devices.Printers

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

@ABIMarker(IppAttributeError.ABI::class)
@Signature("rc(Windows.Devices.Printers.IppAttributeError;{750feda1-9eef-5c39-93e4-46149bbcef27})")
@WinRTByReference(brClass = IppAttributeError.ByReference::class)
public class IppAttributeError(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIppAttributeError.WithDefault, IWinRTObject {
  private val __180382015_Interface: IIppAttributeError.WithDefault by lazy {
    as_180382015()
  }


  public override val __180382015_Ptr: JNAPointer? by lazy {
    __180382015_Interface.__180382015_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__180382015_Interface)

  private fun as_180382015(): IIppAttributeError.WithDefault {
    if(pointer == NULL) {
      return(IIppAttributeError.ABI.makeIIppAttributeError(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIppAttributeError>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIppAttributeError.ABI.makeIIppAttributeError(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IppAttributeError> {
    public override fun getValue() = IppAttributeError(pointer.getPointer(0))

    public fun setValue(value: IppAttributeError): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IppAttributeError, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): IppAttributeError {
      val address = segment.toRawLongValue()
      return IppAttributeError(Pointer(address))
    }

    public override fun toNative(obj: IppAttributeError): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
