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

@ABIMarker(ContentSiteRequestedStateChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Content.ContentSiteRequestedStateChangedEventArgs;{1b55fd1d-7292-562b-b4a1-d4de7972e684})")
@WinRTByReference(brClass = ContentSiteRequestedStateChangedEventArgs.ByReference::class)
public class ContentSiteRequestedStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentSiteRequestedStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __937663676_Interface: IContentSiteRequestedStateChangedEventArgs.WithDefault by
      lazy {
    as_937663676()
  }


  public override val __937663676_Ptr: JNAPointer? by lazy {
    __937663676_Interface.__937663676_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__937663676_Interface)

  private fun as_937663676(): IContentSiteRequestedStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContentSiteRequestedStateChangedEventArgs.ABI.makeIContentSiteRequestedStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentSiteRequestedStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentSiteRequestedStateChangedEventArgs.ABI.makeIContentSiteRequestedStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentSiteRequestedStateChangedEventArgs> {
    public override fun getValue() =
        ContentSiteRequestedStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContentSiteRequestedStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentSiteRequestedStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ContentSiteRequestedStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return ContentSiteRequestedStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContentSiteRequestedStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
