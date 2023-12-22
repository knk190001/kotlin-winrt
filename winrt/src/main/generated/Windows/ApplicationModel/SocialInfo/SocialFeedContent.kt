package Windows.ApplicationModel.SocialInfo

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

@ABIMarker(SocialFeedContent.ABI::class)
@Signature("rc(Windows.ApplicationModel.SocialInfo.SocialFeedContent;{a234e429-3e39-494d-a37c-f462a2494514})")
@WinRTByReference(brClass = SocialFeedContent.ByReference::class)
public class SocialFeedContent(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISocialFeedContent.WithDefault, IWinRTObject {
  private val __88817866_Interface: ISocialFeedContent.WithDefault by lazy {
    as_88817866()
  }


  public override val __88817866_Ptr: JNAPointer? by lazy {
    __88817866_Interface.__88817866_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__88817866_Interface)

  private fun as_88817866(): ISocialFeedContent.WithDefault {
    if(pointer == NULL) {
      return(ISocialFeedContent.ABI.makeISocialFeedContent(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISocialFeedContent>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISocialFeedContent.ABI.makeISocialFeedContent(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SocialFeedContent> {
    public override fun getValue() = SocialFeedContent(pointer.getPointer(0))

    public fun setValue(value: SocialFeedContent): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SocialFeedContent, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SocialFeedContent {
      val address = segment.toRawLongValue()
      return SocialFeedContent(Pointer(address))
    }

    public override fun toNative(obj: SocialFeedContent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
