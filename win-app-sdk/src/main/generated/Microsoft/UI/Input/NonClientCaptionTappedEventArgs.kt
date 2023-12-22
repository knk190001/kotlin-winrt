package Microsoft.UI.Input

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

@ABIMarker(NonClientCaptionTappedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Input.NonClientCaptionTappedEventArgs;{3d173531-991f-5753-b7e0-14a121c3cd2d})")
@WinRTByReference(brClass = NonClientCaptionTappedEventArgs.ByReference::class)
public class NonClientCaptionTappedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INonClientCaptionTappedEventArgs.WithDefault, IWinRTObject {
  private val __2100664612_Interface: INonClientCaptionTappedEventArgs.WithDefault by lazy {
    as_2100664612()
  }


  public override val __2100664612_Ptr: JNAPointer? by lazy {
    __2100664612_Interface.__2100664612_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2100664612_Interface)

  private fun as_2100664612(): INonClientCaptionTappedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INonClientCaptionTappedEventArgs.ABI.makeINonClientCaptionTappedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INonClientCaptionTappedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INonClientCaptionTappedEventArgs.ABI.makeINonClientCaptionTappedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NonClientCaptionTappedEventArgs> {
    public override fun getValue() = NonClientCaptionTappedEventArgs(pointer.getPointer(0))

    public fun setValue(value: NonClientCaptionTappedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NonClientCaptionTappedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NonClientCaptionTappedEventArgs {
      val address = segment.toRawLongValue()
      return NonClientCaptionTappedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NonClientCaptionTappedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
