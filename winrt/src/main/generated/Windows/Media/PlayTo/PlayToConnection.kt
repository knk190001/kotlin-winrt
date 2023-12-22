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

@ABIMarker(PlayToConnection.ABI::class)
@Signature("rc(Windows.Media.PlayTo.PlayToConnection;{112fbfc8-f235-4fde-8d41-9bf27c9e9a40})")
@WinRTByReference(brClass = PlayToConnection.ByReference::class)
public class PlayToConnection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlayToConnection.WithDefault, IWinRTObject {
  private val __1038858254_Interface: IPlayToConnection.WithDefault by lazy {
    as_1038858254()
  }


  public override val __1038858254_Ptr: JNAPointer? by lazy {
    __1038858254_Interface.__1038858254_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1038858254_Interface)

  private fun as_1038858254(): IPlayToConnection.WithDefault {
    if(pointer == NULL) {
      return(IPlayToConnection.ABI.makeIPlayToConnection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayToConnection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayToConnection.ABI.makeIPlayToConnection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlayToConnection> {
    public override fun getValue() = PlayToConnection(pointer.getPointer(0))

    public fun setValue(value: PlayToConnection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayToConnection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PlayToConnection {
      val address = segment.toRawLongValue()
      return PlayToConnection(Pointer(address))
    }

    public override fun toNative(obj: PlayToConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
