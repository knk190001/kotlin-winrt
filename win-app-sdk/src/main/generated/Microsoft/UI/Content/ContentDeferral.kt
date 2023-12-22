package Microsoft.UI.Content

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

@ABIMarker(ContentDeferral.ABI::class)
@Signature("rc(Microsoft.UI.Content.ContentDeferral;{470529f5-cd93-599b-968e-f8a689bc3a07})")
@WinRTByReference(brClass = ContentDeferral.ByReference::class)
public class ContentDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentDeferral.WithDefault, IWinRTObject {
  private val __471460250_Interface: IContentDeferral.WithDefault by lazy {
    as_471460250()
  }


  public override val __471460250_Ptr: JNAPointer? by lazy {
    __471460250_Interface.__471460250_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__471460250_Interface)

  private fun as_471460250(): IContentDeferral.WithDefault {
    if(pointer == NULL) {
      return(IContentDeferral.ABI.makeIContentDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentDeferral.ABI.makeIContentDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentDeferral> {
    public override fun getValue() = ContentDeferral(pointer.getPointer(0))

    public fun setValue(value: ContentDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContentDeferral {
      val address = segment.toRawLongValue()
      return ContentDeferral(Pointer(address))
    }

    public override fun toNative(obj: ContentDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
