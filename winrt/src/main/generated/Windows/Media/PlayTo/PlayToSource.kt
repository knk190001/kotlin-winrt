package Windows.Media.PlayTo

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

@ABIMarker(PlayToSource.ABI::class)
@Signature("rc(Windows.Media.PlayTo.PlayToSource;{7f138a08-fbb7-4b09-8356-aa5f4e335c31})")
@WinRTByReference(brClass = PlayToSource.ByReference::class)
public class PlayToSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlayToSource.WithDefault, IPlayToSourceWithPreferredSourceUri.WithDefault,
    IWinRTObject {
  private val __793257169_Interface: IPlayToSource.WithDefault by lazy {
    as_793257169()
  }


  private val __239914683_Interface: IPlayToSourceWithPreferredSourceUri.WithDefault by lazy {
    as_239914683()
  }


  public override val __793257169_Ptr: JNAPointer? by lazy {
    __793257169_Interface.__793257169_Ptr
  }


  public override val __239914683_Ptr: JNAPointer? by lazy {
    __239914683_Interface.__239914683_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__793257169_Interface, __239914683_Interface)

  private fun as_793257169(): IPlayToSource.WithDefault {
    if(pointer == NULL) {
      return(IPlayToSource.ABI.makeIPlayToSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayToSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayToSource.ABI.makeIPlayToSource(ref.value))
  }

  private fun as_239914683(): IPlayToSourceWithPreferredSourceUri.WithDefault {
    if(pointer == NULL) {
      return(IPlayToSourceWithPreferredSourceUri.ABI.makeIPlayToSourceWithPreferredSourceUri(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayToSourceWithPreferredSourceUri>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayToSourceWithPreferredSourceUri.ABI.makeIPlayToSourceWithPreferredSourceUri(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PlayToSource> {
    public override fun getValue() = PlayToSource(pointer.getPointer(0))

    public fun setValue(value: PlayToSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayToSource, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PlayToSource {
      val address = segment.toRawLongValue()
      return PlayToSource(Pointer(address))
    }

    public override fun toNative(obj: PlayToSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
