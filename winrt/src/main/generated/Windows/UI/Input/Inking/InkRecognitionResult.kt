package Windows.UI.Input.Inking

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

@ABIMarker(InkRecognitionResult.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkRecognitionResult;{36461a94-5068-40ef-8a05-2c2fb60908a2})")
@WinRTByReference(brClass = InkRecognitionResult.ByReference::class)
public class InkRecognitionResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkRecognitionResult.WithDefault, IWinRTObject {
  private val __1007263752_Interface: IInkRecognitionResult.WithDefault by lazy {
    as_1007263752()
  }


  public override val __1007263752_Ptr: JNAPointer? by lazy {
    __1007263752_Interface.__1007263752_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1007263752_Interface)

  private fun as_1007263752(): IInkRecognitionResult.WithDefault {
    if(pointer == NULL) {
      return(IInkRecognitionResult.ABI.makeIInkRecognitionResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkRecognitionResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkRecognitionResult.ABI.makeIInkRecognitionResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkRecognitionResult> {
    public override fun getValue() = InkRecognitionResult(pointer.getPointer(0))

    public fun setValue(value: InkRecognitionResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkRecognitionResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkRecognitionResult {
      val address = segment.toRawLongValue()
      return InkRecognitionResult(Pointer(address))
    }

    public override fun toNative(obj: InkRecognitionResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
