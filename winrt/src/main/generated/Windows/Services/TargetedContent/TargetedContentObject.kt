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

@ABIMarker(TargetedContentObject.ABI::class)
@Signature("rc(Windows.Services.TargetedContent.TargetedContentObject;{041d7969-2212-42d1-9dfa-88a8e3033aa3})")
@WinRTByReference(brClass = TargetedContentObject.ByReference::class)
public class TargetedContentObject(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITargetedContentObject.WithDefault, IWinRTObject {
  private val __251602621_Interface: ITargetedContentObject.WithDefault by lazy {
    as_251602621()
  }


  public override val __251602621_Ptr: JNAPointer? by lazy {
    __251602621_Interface.__251602621_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__251602621_Interface)

  private fun as_251602621(): ITargetedContentObject.WithDefault {
    if(pointer == NULL) {
      return(ITargetedContentObject.ABI.makeITargetedContentObject(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITargetedContentObject>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITargetedContentObject.ABI.makeITargetedContentObject(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TargetedContentObject> {
    public override fun getValue() = TargetedContentObject(pointer.getPointer(0))

    public fun setValue(value: TargetedContentObject): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TargetedContentObject, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TargetedContentObject {
      val address = segment.toRawLongValue()
      return TargetedContentObject(Pointer(address))
    }

    public override fun toNative(obj: TargetedContentObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
