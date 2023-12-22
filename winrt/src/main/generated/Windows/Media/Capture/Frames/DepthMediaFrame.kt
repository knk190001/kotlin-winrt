package Windows.Media.Capture.Frames

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

@ABIMarker(DepthMediaFrame.ABI::class)
@Signature("rc(Windows.Media.Capture.Frames.DepthMediaFrame;{47135e4f-8549-45c0-925b-80d35efdb10a})")
@WinRTByReference(brClass = DepthMediaFrame.ByReference::class)
public class DepthMediaFrame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDepthMediaFrame.WithDefault, IDepthMediaFrame2.WithDefault, IWinRTObject {
  private val __368204762_Interface: IDepthMediaFrame.WithDefault by lazy {
    as_368204762()
  }


  private val __1470554316_Interface: IDepthMediaFrame2.WithDefault by lazy {
    as_1470554316()
  }


  public override val __368204762_Ptr: JNAPointer? by lazy {
    __368204762_Interface.__368204762_Ptr
  }


  public override val __1470554316_Ptr: JNAPointer? by lazy {
    __1470554316_Interface.__1470554316_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__368204762_Interface, __1470554316_Interface)

  private fun as_368204762(): IDepthMediaFrame.WithDefault {
    if(pointer == NULL) {
      return(IDepthMediaFrame.ABI.makeIDepthMediaFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDepthMediaFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDepthMediaFrame.ABI.makeIDepthMediaFrame(ref.value))
  }

  private fun as_1470554316(): IDepthMediaFrame2.WithDefault {
    if(pointer == NULL) {
      return(IDepthMediaFrame2.ABI.makeIDepthMediaFrame2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDepthMediaFrame2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDepthMediaFrame2.ABI.makeIDepthMediaFrame2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DepthMediaFrame> {
    public override fun getValue() = DepthMediaFrame(pointer.getPointer(0))

    public fun setValue(value: DepthMediaFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DepthMediaFrame, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DepthMediaFrame {
      val address = segment.toRawLongValue()
      return DepthMediaFrame(Pointer(address))
    }

    public override fun toNative(obj: DepthMediaFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
