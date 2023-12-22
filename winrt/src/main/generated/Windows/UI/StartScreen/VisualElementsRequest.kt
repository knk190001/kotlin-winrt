package Windows.UI.StartScreen

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

@ABIMarker(VisualElementsRequest.ABI::class)
@Signature("rc(Windows.UI.StartScreen.VisualElementsRequest;{c138333a-9308-4072-88cc-d068db347c68})")
@WinRTByReference(brClass = VisualElementsRequest.ByReference::class)
public class VisualElementsRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVisualElementsRequest.WithDefault, IWinRTObject {
  private val __1559419406_Interface: IVisualElementsRequest.WithDefault by lazy {
    as_1559419406()
  }


  public override val __1559419406_Ptr: JNAPointer? by lazy {
    __1559419406_Interface.__1559419406_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1559419406_Interface)

  private fun as_1559419406(): IVisualElementsRequest.WithDefault {
    if(pointer == NULL) {
      return(IVisualElementsRequest.ABI.makeIVisualElementsRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualElementsRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualElementsRequest.ABI.makeIVisualElementsRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VisualElementsRequest> {
    public override fun getValue() = VisualElementsRequest(pointer.getPointer(0))

    public fun setValue(value: VisualElementsRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VisualElementsRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VisualElementsRequest {
      val address = segment.toRawLongValue()
      return VisualElementsRequest(Pointer(address))
    }

    public override fun toNative(obj: VisualElementsRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
