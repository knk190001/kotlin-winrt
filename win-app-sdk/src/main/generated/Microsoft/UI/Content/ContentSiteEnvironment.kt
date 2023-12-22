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

@ABIMarker(ContentSiteEnvironment.ABI::class)
@Signature("rc(Microsoft.UI.Content.ContentSiteEnvironment;{685d085d-be53-55d1-aec4-ba2273d5468b})")
@WinRTByReference(brClass = ContentSiteEnvironment.ByReference::class)
public class ContentSiteEnvironment(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentSiteEnvironment.WithDefault, IContentSiteEnvironment2.WithDefault,
    IWinRTObject {
  private val __1382126397_Interface: IContentSiteEnvironment.WithDefault by lazy {
    as_1382126397()
  }


  private val __103754603_Interface: IContentSiteEnvironment2.WithDefault by lazy {
    as_103754603()
  }


  public override val __1382126397_Ptr: JNAPointer? by lazy {
    __1382126397_Interface.__1382126397_Ptr
  }


  public override val __103754603_Ptr: JNAPointer? by lazy {
    __103754603_Interface.__103754603_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1382126397_Interface, __103754603_Interface)

  private fun as_1382126397(): IContentSiteEnvironment.WithDefault {
    if(pointer == NULL) {
      return(IContentSiteEnvironment.ABI.makeIContentSiteEnvironment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentSiteEnvironment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentSiteEnvironment.ABI.makeIContentSiteEnvironment(ref.value))
  }

  private fun as_103754603(): IContentSiteEnvironment2.WithDefault {
    if(pointer == NULL) {
      return(IContentSiteEnvironment2.ABI.makeIContentSiteEnvironment2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentSiteEnvironment2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentSiteEnvironment2.ABI.makeIContentSiteEnvironment2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentSiteEnvironment> {
    public override fun getValue() = ContentSiteEnvironment(pointer.getPointer(0))

    public fun setValue(value: ContentSiteEnvironment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentSiteEnvironment, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContentSiteEnvironment {
      val address = segment.toRawLongValue()
      return ContentSiteEnvironment(Pointer(address))
    }

    public override fun toNative(obj: ContentSiteEnvironment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
