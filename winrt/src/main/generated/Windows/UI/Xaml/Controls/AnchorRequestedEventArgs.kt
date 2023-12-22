package Windows.UI.Xaml.Controls

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

@ABIMarker(AnchorRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.AnchorRequestedEventArgs;{5175f55d-4785-5a72-b462-eb11e9bdf897})")
@WinRTByReference(brClass = AnchorRequestedEventArgs.ByReference::class)
public class AnchorRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAnchorRequestedEventArgs.WithDefault, IWinRTObject {
  private val __2109260410_Interface: IAnchorRequestedEventArgs.WithDefault by lazy {
    as_2109260410()
  }


  public override val __2109260410_Ptr: JNAPointer? by lazy {
    __2109260410_Interface.__2109260410_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2109260410_Interface)

  private fun as_2109260410(): IAnchorRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAnchorRequestedEventArgs.ABI.makeIAnchorRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnchorRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnchorRequestedEventArgs.ABI.makeIAnchorRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AnchorRequestedEventArgs> {
    public override fun getValue() = AnchorRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AnchorRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AnchorRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AnchorRequestedEventArgs {
      val address = segment.toRawLongValue()
      return AnchorRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AnchorRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
