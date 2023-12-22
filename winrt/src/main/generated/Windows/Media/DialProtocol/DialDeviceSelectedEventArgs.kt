package Windows.Media.DialProtocol

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

@ABIMarker(DialDeviceSelectedEventArgs.ABI::class)
@Signature("rc(Windows.Media.DialProtocol.DialDeviceSelectedEventArgs;{480b92ad-ac76-47eb-9c06-a19304da0247})")
@WinRTByReference(brClass = DialDeviceSelectedEventArgs.ByReference::class)
public class DialDeviceSelectedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDialDeviceSelectedEventArgs.WithDefault, IWinRTObject {
  private val __358316810_Interface: IDialDeviceSelectedEventArgs.WithDefault by lazy {
    as_358316810()
  }


  public override val __358316810_Ptr: JNAPointer? by lazy {
    __358316810_Interface.__358316810_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__358316810_Interface)

  private fun as_358316810(): IDialDeviceSelectedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDialDeviceSelectedEventArgs.ABI.makeIDialDeviceSelectedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDialDeviceSelectedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDialDeviceSelectedEventArgs.ABI.makeIDialDeviceSelectedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DialDeviceSelectedEventArgs> {
    public override fun getValue() = DialDeviceSelectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DialDeviceSelectedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DialDeviceSelectedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DialDeviceSelectedEventArgs {
      val address = segment.toRawLongValue()
      return DialDeviceSelectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DialDeviceSelectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
