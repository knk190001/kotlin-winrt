package Windows.Media.Capture

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

@ABIMarker(AppBroadcastStreamVideoHeader.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastStreamVideoHeader;{0b9ebece-7e32-432d-8ca2-36bf10b9f462})")
@WinRTByReference(brClass = AppBroadcastStreamVideoHeader.ByReference::class)
public class AppBroadcastStreamVideoHeader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastStreamVideoHeader.WithDefault, IWinRTObject {
  private val __1099309392_Interface: IAppBroadcastStreamVideoHeader.WithDefault by lazy {
    as_1099309392()
  }


  public override val __1099309392_Ptr: JNAPointer? by lazy {
    __1099309392_Interface.__1099309392_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1099309392_Interface)

  private fun as_1099309392(): IAppBroadcastStreamVideoHeader.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastStreamVideoHeader.ABI.makeIAppBroadcastStreamVideoHeader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastStreamVideoHeader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastStreamVideoHeader.ABI.makeIAppBroadcastStreamVideoHeader(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastStreamVideoHeader> {
    public override fun getValue() = AppBroadcastStreamVideoHeader(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastStreamVideoHeader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastStreamVideoHeader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBroadcastStreamVideoHeader {
      val address = segment.toRawLongValue()
      return AppBroadcastStreamVideoHeader(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastStreamVideoHeader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
