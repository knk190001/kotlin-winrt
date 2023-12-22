package Windows.Media.ContentRestrictions

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

@ABIMarker(ContentRestrictionsBrowsePolicy.ABI::class)
@Signature("rc(Windows.Media.ContentRestrictions.ContentRestrictionsBrowsePolicy;{8c0133a4-442e-461a-8757-fad2f5bd37e4})")
@WinRTByReference(brClass = ContentRestrictionsBrowsePolicy.ByReference::class)
public class ContentRestrictionsBrowsePolicy(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentRestrictionsBrowsePolicy.WithDefault, IWinRTObject {
  private val __482326434_Interface: IContentRestrictionsBrowsePolicy.WithDefault by lazy {
    as_482326434()
  }


  public override val __482326434_Ptr: JNAPointer? by lazy {
    __482326434_Interface.__482326434_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__482326434_Interface)

  private fun as_482326434(): IContentRestrictionsBrowsePolicy.WithDefault {
    if(pointer == NULL) {
      return(IContentRestrictionsBrowsePolicy.ABI.makeIContentRestrictionsBrowsePolicy(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentRestrictionsBrowsePolicy>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentRestrictionsBrowsePolicy.ABI.makeIContentRestrictionsBrowsePolicy(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentRestrictionsBrowsePolicy> {
    public override fun getValue() = ContentRestrictionsBrowsePolicy(pointer.getPointer(0))

    public fun setValue(value: ContentRestrictionsBrowsePolicy): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentRestrictionsBrowsePolicy, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContentRestrictionsBrowsePolicy {
      val address = segment.toRawLongValue()
      return ContentRestrictionsBrowsePolicy(Pointer(address))
    }

    public override fun toNative(obj: ContentRestrictionsBrowsePolicy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
