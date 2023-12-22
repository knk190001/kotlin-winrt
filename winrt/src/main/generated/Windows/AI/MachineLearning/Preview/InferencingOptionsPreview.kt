package Windows.AI.MachineLearning.Preview

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

@ABIMarker(InferencingOptionsPreview.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.Preview.InferencingOptionsPreview;{47bc8205-4d36-47a9-8f68-ffcb339dd0fc})")
@WinRTByReference(brClass = InferencingOptionsPreview.ByReference::class)
public class InferencingOptionsPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInferencingOptionsPreview.WithDefault, IWinRTObject {
  private val __516320261_Interface: IInferencingOptionsPreview.WithDefault by lazy {
    as_516320261()
  }


  public override val __516320261_Ptr: JNAPointer? by lazy {
    __516320261_Interface.__516320261_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__516320261_Interface)

  private fun as_516320261(): IInferencingOptionsPreview.WithDefault {
    if(pointer == NULL) {
      return(IInferencingOptionsPreview.ABI.makeIInferencingOptionsPreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInferencingOptionsPreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInferencingOptionsPreview.ABI.makeIInferencingOptionsPreview(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InferencingOptionsPreview> {
    public override fun getValue() = InferencingOptionsPreview(pointer.getPointer(0))

    public fun setValue(value: InferencingOptionsPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InferencingOptionsPreview, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InferencingOptionsPreview {
      val address = segment.toRawLongValue()
      return InferencingOptionsPreview(Pointer(address))
    }

    public override fun toNative(obj: InferencingOptionsPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
