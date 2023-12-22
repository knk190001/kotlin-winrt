package Windows.UI.Shell

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

@ABIMarker(ShareWindowCommandEventArgs.ABI::class)
@Signature("rc(Windows.UI.Shell.ShareWindowCommandEventArgs;{4578dc09-a523-5756-a995-e4feb991fff0})")
@WinRTByReference(brClass = ShareWindowCommandEventArgs.ByReference::class)
public class ShareWindowCommandEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IShareWindowCommandEventArgs.WithDefault, IWinRTObject {
  private val __1790086707_Interface: IShareWindowCommandEventArgs.WithDefault by lazy {
    as_1790086707()
  }


  public override val __1790086707_Ptr: JNAPointer? by lazy {
    __1790086707_Interface.__1790086707_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1790086707_Interface)

  private fun as_1790086707(): IShareWindowCommandEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IShareWindowCommandEventArgs.ABI.makeIShareWindowCommandEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IShareWindowCommandEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IShareWindowCommandEventArgs.ABI.makeIShareWindowCommandEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ShareWindowCommandEventArgs> {
    public override fun getValue() = ShareWindowCommandEventArgs(pointer.getPointer(0))

    public fun setValue(value: ShareWindowCommandEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ShareWindowCommandEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ShareWindowCommandEventArgs {
      val address = segment.toRawLongValue()
      return ShareWindowCommandEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ShareWindowCommandEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
