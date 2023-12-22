package Windows.Services.TargetedContent

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

@ABIMarker(TargetedContentValue.ABI::class)
@Signature("rc(Windows.Services.TargetedContent.TargetedContentValue;{aafde4b3-4215-4bf8-867f-43f04865f9bf})")
@WinRTByReference(brClass = TargetedContentValue.ByReference::class)
public class TargetedContentValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITargetedContentValue.WithDefault, IWinRTObject {
  private val __1802794259_Interface: ITargetedContentValue.WithDefault by lazy {
    as_1802794259()
  }


  public override val __1802794259_Ptr: JNAPointer? by lazy {
    __1802794259_Interface.__1802794259_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1802794259_Interface)

  private fun as_1802794259(): ITargetedContentValue.WithDefault {
    if(pointer == NULL) {
      return(ITargetedContentValue.ABI.makeITargetedContentValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITargetedContentValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITargetedContentValue.ABI.makeITargetedContentValue(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TargetedContentValue> {
    public override fun getValue() = TargetedContentValue(pointer.getPointer(0))

    public fun setValue(value: TargetedContentValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TargetedContentValue, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TargetedContentValue {
      val address = segment.toRawLongValue()
      return TargetedContentValue(Pointer(address))
    }

    public override fun toNative(obj: TargetedContentValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
