package Windows.UI.Notifications

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

@ABIMarker(TileUpdater.ABI::class)
@Signature("rc(Windows.UI.Notifications.TileUpdater;{0942a48b-1d91-44ec-9243-c1e821c29a20})")
@WinRTByReference(brClass = TileUpdater.ByReference::class)
public class TileUpdater(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITileUpdater.WithDefault, ITileUpdater2.WithDefault, IWinRTObject {
  private val __167662645_Interface: ITileUpdater.WithDefault by lazy {
    as_167662645()
  }


  private val __902574649_Interface: ITileUpdater2.WithDefault by lazy {
    as_902574649()
  }


  public override val __167662645_Ptr: JNAPointer? by lazy {
    __167662645_Interface.__167662645_Ptr
  }


  public override val __902574649_Ptr: JNAPointer? by lazy {
    __902574649_Interface.__902574649_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__167662645_Interface, __902574649_Interface)

  private fun as_167662645(): ITileUpdater.WithDefault {
    if(pointer == NULL) {
      return(ITileUpdater.ABI.makeITileUpdater(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITileUpdater>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITileUpdater.ABI.makeITileUpdater(ref.value))
  }

  private fun as_902574649(): ITileUpdater2.WithDefault {
    if(pointer == NULL) {
      return(ITileUpdater2.ABI.makeITileUpdater2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITileUpdater2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITileUpdater2.ABI.makeITileUpdater2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TileUpdater> {
    public override fun getValue() = TileUpdater(pointer.getPointer(0))

    public fun setValue(value: TileUpdater): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TileUpdater, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TileUpdater {
      val address = segment.toRawLongValue()
      return TileUpdater(Pointer(address))
    }

    public override fun toNative(obj: TileUpdater): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
