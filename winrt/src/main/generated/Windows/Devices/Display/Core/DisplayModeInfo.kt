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

@ABIMarker(DisplayModeInfo.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayModeInfo;{48d513a0-f79b-5a74-a05e-da821f470868})")
@WinRTByReference(brClass = DisplayModeInfo.ByReference::class)
public class DisplayModeInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayModeInfo.WithDefault, IDisplayModeInfo2.WithDefault, IWinRTObject {
  private val __140114927_Interface: IDisplayModeInfo.WithDefault by lazy {
    as_140114927()
  }


  private val __48595391_Interface: IDisplayModeInfo2.WithDefault by lazy {
    as_48595391()
  }


  public override val __140114927_Ptr: JNAPointer? by lazy {
    __140114927_Interface.__140114927_Ptr
  }


  public override val __48595391_Ptr: JNAPointer? by lazy {
    __48595391_Interface.__48595391_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__140114927_Interface, __48595391_Interface)

  private fun as_140114927(): IDisplayModeInfo.WithDefault {
    if(pointer == NULL) {
      return(IDisplayModeInfo.ABI.makeIDisplayModeInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayModeInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayModeInfo.ABI.makeIDisplayModeInfo(ref.value))
  }

  private fun as_48595391(): IDisplayModeInfo2.WithDefault {
    if(pointer == NULL) {
      return(IDisplayModeInfo2.ABI.makeIDisplayModeInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayModeInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayModeInfo2.ABI.makeIDisplayModeInfo2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DisplayModeInfo> {
    public override fun getValue() = DisplayModeInfo(pointer.getPointer(0))

    public fun setValue(value: DisplayModeInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayModeInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplayModeInfo {
      val address = segment.toRawLongValue()
      return DisplayModeInfo(Pointer(address))
    }

    public override fun toNative(obj: DisplayModeInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
