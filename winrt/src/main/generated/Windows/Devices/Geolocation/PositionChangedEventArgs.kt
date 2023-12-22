package Windows.Devices.Geolocation

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

@ABIMarker(PositionChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Geolocation.PositionChangedEventArgs;{37859ce5-9d1e-46c5-bf3b-6ad8cac1a093})")
@WinRTByReference(brClass = PositionChangedEventArgs.ByReference::class)
public class PositionChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPositionChangedEventArgs.WithDefault, IWinRTObject {
  private val __138159093_Interface: IPositionChangedEventArgs.WithDefault by lazy {
    as_138159093()
  }


  public override val __138159093_Ptr: JNAPointer? by lazy {
    __138159093_Interface.__138159093_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__138159093_Interface)

  private fun as_138159093(): IPositionChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPositionChangedEventArgs.ABI.makeIPositionChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPositionChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPositionChangedEventArgs.ABI.makeIPositionChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PositionChangedEventArgs> {
    public override fun getValue() = PositionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PositionChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PositionChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PositionChangedEventArgs {
      val address = segment.toRawLongValue()
      return PositionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PositionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
