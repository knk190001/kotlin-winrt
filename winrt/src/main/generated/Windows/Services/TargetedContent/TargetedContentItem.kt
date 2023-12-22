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

@ABIMarker(TargetedContentItem.ABI::class)
@Signature("rc(Windows.Services.TargetedContent.TargetedContentItem;{38168dc4-276c-4c32-96ba-565c6e406e74})")
@WinRTByReference(brClass = TargetedContentItem.ByReference::class)
public class TargetedContentItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITargetedContentItem.WithDefault, IWinRTObject {
  private val __772760087_Interface: ITargetedContentItem.WithDefault by lazy {
    as_772760087()
  }


  public override val __772760087_Ptr: JNAPointer? by lazy {
    __772760087_Interface.__772760087_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__772760087_Interface)

  private fun as_772760087(): ITargetedContentItem.WithDefault {
    if(pointer == NULL) {
      return(ITargetedContentItem.ABI.makeITargetedContentItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITargetedContentItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITargetedContentItem.ABI.makeITargetedContentItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TargetedContentItem> {
    public override fun getValue() = TargetedContentItem(pointer.getPointer(0))

    public fun setValue(value: TargetedContentItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TargetedContentItem, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TargetedContentItem {
      val address = segment.toRawLongValue()
      return TargetedContentItem(Pointer(address))
    }

    public override fun toNative(obj: TargetedContentItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
