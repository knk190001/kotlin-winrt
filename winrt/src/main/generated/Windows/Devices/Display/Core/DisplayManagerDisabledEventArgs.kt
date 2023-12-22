package Windows.Devices.Display.Core

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

@ABIMarker(DisplayManagerDisabledEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayManagerDisabledEventArgs;{8726dde4-6793-5973-a11f-5ffbc93fdb90})")
@WinRTByReference(brClass = DisplayManagerDisabledEventArgs.ByReference::class)
public class DisplayManagerDisabledEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayManagerDisabledEventArgs.WithDefault, IWinRTObject {
  private val __730392174_Interface: IDisplayManagerDisabledEventArgs.WithDefault by lazy {
    as_730392174()
  }


  public override val __730392174_Ptr: JNAPointer? by lazy {
    __730392174_Interface.__730392174_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__730392174_Interface)

  private fun as_730392174(): IDisplayManagerDisabledEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDisplayManagerDisabledEventArgs.ABI.makeIDisplayManagerDisabledEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayManagerDisabledEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayManagerDisabledEventArgs.ABI.makeIDisplayManagerDisabledEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DisplayManagerDisabledEventArgs> {
    public override fun getValue() = DisplayManagerDisabledEventArgs(pointer.getPointer(0))

    public fun setValue(value: DisplayManagerDisabledEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayManagerDisabledEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplayManagerDisabledEventArgs {
      val address = segment.toRawLongValue()
      return DisplayManagerDisabledEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DisplayManagerDisabledEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
