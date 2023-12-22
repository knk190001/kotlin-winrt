package Windows.Networking.BackgroundTransfer

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

@ABIMarker(ResponseInformation.ABI::class)
@Signature("rc(Windows.Networking.BackgroundTransfer.ResponseInformation;{f8bb9a12-f713-4792-8b68-d9d297f91d2e})")
@WinRTByReference(brClass = ResponseInformation.ByReference::class)
public class ResponseInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IResponseInformation.WithDefault, IWinRTObject {
  private val __92445002_Interface: IResponseInformation.WithDefault by lazy {
    as_92445002()
  }


  public override val __92445002_Ptr: JNAPointer? by lazy {
    __92445002_Interface.__92445002_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__92445002_Interface)

  private fun as_92445002(): IResponseInformation.WithDefault {
    if(pointer == NULL) {
      return(IResponseInformation.ABI.makeIResponseInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResponseInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResponseInformation.ABI.makeIResponseInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ResponseInformation> {
    public override fun getValue() = ResponseInformation(pointer.getPointer(0))

    public fun setValue(value: ResponseInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ResponseInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ResponseInformation {
      val address = segment.toRawLongValue()
      return ResponseInformation(Pointer(address))
    }

    public override fun toNative(obj: ResponseInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
