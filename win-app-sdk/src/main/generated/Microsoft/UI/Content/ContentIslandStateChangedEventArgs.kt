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

@ABIMarker(ContentIslandStateChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Content.ContentIslandStateChangedEventArgs;{c828eeb2-0c62-5b40-9d48-77c06083c278})")
@WinRTByReference(brClass = ContentIslandStateChangedEventArgs.ByReference::class)
public class ContentIslandStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentIslandStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __1947318448_Interface: IContentIslandStateChangedEventArgs.WithDefault by lazy {
    as_1947318448()
  }


  public override val __1947318448_Ptr: JNAPointer? by lazy {
    __1947318448_Interface.__1947318448_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1947318448_Interface)

  private fun as_1947318448(): IContentIslandStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContentIslandStateChangedEventArgs.ABI.makeIContentIslandStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentIslandStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentIslandStateChangedEventArgs.ABI.makeIContentIslandStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentIslandStateChangedEventArgs> {
    public override fun getValue() = ContentIslandStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContentIslandStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentIslandStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContentIslandStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return ContentIslandStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContentIslandStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
