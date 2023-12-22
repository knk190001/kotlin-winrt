package Microsoft.UI.Content

import Microsoft.UI.IClosableNotifier
import Windows.Foundation.IClosable
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

@ABIMarker(ContentSite.ABI::class)
@Signature("rc(Microsoft.UI.Content.ContentSite;{996c60c4-02b2-5eef-93b0-dd6b1ec2fd7b})")
@WinRTByReference(brClass = ContentSite.ByReference::class)
public class ContentSite(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentSite.WithDefault, IContentSite2.WithDefault, IClosable.WithDefault,
    IClosableNotifier.WithDefault, IWinRTObject {
  private val __1000354038_Interface: IContentSite.WithDefault by lazy {
    as_1000354038()
  }


  private val __946204156_Interface: IContentSite2.WithDefault by lazy {
    as_946204156()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __105354978_Interface: IClosableNotifier.WithDefault by lazy {
    as_105354978()
  }


  public override val __1000354038_Ptr: JNAPointer? by lazy {
    __1000354038_Interface.__1000354038_Ptr
  }


  public override val __946204156_Ptr: JNAPointer? by lazy {
    __946204156_Interface.__946204156_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __105354978_Ptr: JNAPointer? by lazy {
    __105354978_Interface.__105354978_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1000354038_Interface, __946204156_Interface, __1260617006_Interface,
        __105354978_Interface)

  private fun as_1000354038(): IContentSite.WithDefault {
    if(pointer == NULL) {
      return(IContentSite.ABI.makeIContentSite(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentSite>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentSite.ABI.makeIContentSite(ref.value))
  }

  private fun as_946204156(): IContentSite2.WithDefault {
    if(pointer == NULL) {
      return(IContentSite2.ABI.makeIContentSite2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentSite2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentSite2.ABI.makeIContentSite2(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  private fun as_105354978(): IClosableNotifier.WithDefault {
    if(pointer == NULL) {
      return(IClosableNotifier.ABI.makeIClosableNotifier(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosableNotifier>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosableNotifier.ABI.makeIClosableNotifier(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContentSite> {
    public override fun getValue() = ContentSite(pointer.getPointer(0))

    public fun setValue(value: ContentSite): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentSite, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContentSite {
      val address = segment.toRawLongValue()
      return ContentSite(Pointer(address))
    }

    public override fun toNative(obj: ContentSite): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
