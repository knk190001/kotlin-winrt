package Windows.Media.Devices.Core

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

@ABIMarker(FrameControlCapabilities.ABI::class)
@Signature("rc(Windows.Media.Devices.Core.FrameControlCapabilities;{a8ffae60-4e9e-4377-a789-e24c4ae7e544})")
@WinRTByReference(brClass = FrameControlCapabilities.ByReference::class)
public class FrameControlCapabilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFrameControlCapabilities.WithDefault, IFrameControlCapabilities2.WithDefault,
    IWinRTObject {
  private val __938096022_Interface: IFrameControlCapabilities.WithDefault by lazy {
    as_938096022()
  }


  private val __983794440_Interface: IFrameControlCapabilities2.WithDefault by lazy {
    as_983794440()
  }


  public override val __938096022_Ptr: JNAPointer? by lazy {
    __938096022_Interface.__938096022_Ptr
  }


  public override val __983794440_Ptr: JNAPointer? by lazy {
    __983794440_Interface.__983794440_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__938096022_Interface, __983794440_Interface)

  private fun as_938096022(): IFrameControlCapabilities.WithDefault {
    if(pointer == NULL) {
      return(IFrameControlCapabilities.ABI.makeIFrameControlCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameControlCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameControlCapabilities.ABI.makeIFrameControlCapabilities(ref.value))
  }

  private fun as_983794440(): IFrameControlCapabilities2.WithDefault {
    if(pointer == NULL) {
      return(IFrameControlCapabilities2.ABI.makeIFrameControlCapabilities2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameControlCapabilities2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameControlCapabilities2.ABI.makeIFrameControlCapabilities2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FrameControlCapabilities> {
    public override fun getValue() = FrameControlCapabilities(pointer.getPointer(0))

    public fun setValue(value: FrameControlCapabilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FrameControlCapabilities, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FrameControlCapabilities {
      val address = segment.toRawLongValue()
      return FrameControlCapabilities(Pointer(address))
    }

    public override fun toNative(obj: FrameControlCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
