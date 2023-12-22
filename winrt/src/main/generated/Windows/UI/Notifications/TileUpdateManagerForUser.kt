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

@ABIMarker(TileUpdateManagerForUser.ABI::class)
@Signature("rc(Windows.UI.Notifications.TileUpdateManagerForUser;{55141348-2ee2-4e2d-9cc1-216a20decc9f})")
@WinRTByReference(brClass = TileUpdateManagerForUser.ByReference::class)
public class TileUpdateManagerForUser(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITileUpdateManagerForUser.WithDefault, IWinRTObject {
  private val __1923189458_Interface: ITileUpdateManagerForUser.WithDefault by lazy {
    as_1923189458()
  }


  public override val __1923189458_Ptr: JNAPointer? by lazy {
    __1923189458_Interface.__1923189458_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1923189458_Interface)

  private fun as_1923189458(): ITileUpdateManagerForUser.WithDefault {
    if(pointer == NULL) {
      return(ITileUpdateManagerForUser.ABI.makeITileUpdateManagerForUser(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITileUpdateManagerForUser>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITileUpdateManagerForUser.ABI.makeITileUpdateManagerForUser(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TileUpdateManagerForUser> {
    public override fun getValue() = TileUpdateManagerForUser(pointer.getPointer(0))

    public fun setValue(value: TileUpdateManagerForUser): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TileUpdateManagerForUser, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TileUpdateManagerForUser {
      val address = segment.toRawLongValue()
      return TileUpdateManagerForUser(Pointer(address))
    }

    public override fun toNative(obj: TileUpdateManagerForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
