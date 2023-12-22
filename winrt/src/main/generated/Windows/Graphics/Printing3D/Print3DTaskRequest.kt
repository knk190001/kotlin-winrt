package Windows.Graphics.Printing3D

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

@ABIMarker(Print3DTaskRequest.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Print3DTaskRequest;{2595c46f-2245-4c5a-8731-0d604dc6bc3c})")
@WinRTByReference(brClass = Print3DTaskRequest.ByReference::class)
public class Print3DTaskRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrint3DTaskRequest.WithDefault, IWinRTObject {
  private val __562093705_Interface: IPrint3DTaskRequest.WithDefault by lazy {
    as_562093705()
  }


  public override val __562093705_Ptr: JNAPointer? by lazy {
    __562093705_Interface.__562093705_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__562093705_Interface)

  private fun as_562093705(): IPrint3DTaskRequest.WithDefault {
    if(pointer == NULL) {
      return(IPrint3DTaskRequest.ABI.makeIPrint3DTaskRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrint3DTaskRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrint3DTaskRequest.ABI.makeIPrint3DTaskRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Print3DTaskRequest> {
    public override fun getValue() = Print3DTaskRequest(pointer.getPointer(0))

    public fun setValue(value: Print3DTaskRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Print3DTaskRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Print3DTaskRequest {
      val address = segment.toRawLongValue()
      return Print3DTaskRequest(Pointer(address))
    }

    public override fun toNative(obj: Print3DTaskRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
