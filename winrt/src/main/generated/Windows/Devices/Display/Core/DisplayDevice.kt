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

@ABIMarker(DisplayDevice.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayDevice;{a4c9b62c-335f-5731-8cb4-c1ccd4731070})")
@WinRTByReference(brClass = DisplayDevice.ByReference::class)
public class DisplayDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayDevice.WithDefault, IDisplayDevice2.WithDefault, IWinRTObject {
  private val __770367862_Interface: IDisplayDevice.WithDefault by lazy {
    as_770367862()
  }


  private val __1888400004_Interface: IDisplayDevice2.WithDefault by lazy {
    as_1888400004()
  }


  public override val __770367862_Ptr: JNAPointer? by lazy {
    __770367862_Interface.__770367862_Ptr
  }


  public override val __1888400004_Ptr: JNAPointer? by lazy {
    __1888400004_Interface.__1888400004_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__770367862_Interface, __1888400004_Interface)

  private fun as_770367862(): IDisplayDevice.WithDefault {
    if(pointer == NULL) {
      return(IDisplayDevice.ABI.makeIDisplayDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayDevice.ABI.makeIDisplayDevice(ref.value))
  }

  private fun as_1888400004(): IDisplayDevice2.WithDefault {
    if(pointer == NULL) {
      return(IDisplayDevice2.ABI.makeIDisplayDevice2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayDevice2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayDevice2.ABI.makeIDisplayDevice2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DisplayDevice>
      {
    public override fun getValue() = DisplayDevice(pointer.getPointer(0))

    public fun setValue(value: DisplayDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayDevice, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplayDevice {
      val address = segment.toRawLongValue()
      return DisplayDevice(Pointer(address))
    }

    public override fun toNative(obj: DisplayDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
