package Windows.Graphics.Imaging

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

@ABIMarker(BitmapFrame.ABI::class)
@Signature("rc(Windows.Graphics.Imaging.BitmapFrame;{72a49a1c-8081-438d-91bc-94ecfc8185c6})")
@WinRTByReference(brClass = BitmapFrame.ByReference::class)
public class BitmapFrame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBitmapFrame.WithDefault, IBitmapFrameWithSoftwareBitmap.WithDefault,
    IWinRTObject {
  private val __405954709_Interface: IBitmapFrame.WithDefault by lazy {
    as_405954709()
  }


  private val __454241903_Interface: IBitmapFrameWithSoftwareBitmap.WithDefault by lazy {
    as_454241903()
  }


  public override val __405954709_Ptr: JNAPointer? by lazy {
    __405954709_Interface.__405954709_Ptr
  }


  public override val __454241903_Ptr: JNAPointer? by lazy {
    __454241903_Interface.__454241903_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__405954709_Interface, __454241903_Interface)

  private fun as_405954709(): IBitmapFrame.WithDefault {
    if(pointer == NULL) {
      return(IBitmapFrame.ABI.makeIBitmapFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapFrame.ABI.makeIBitmapFrame(ref.value))
  }

  private fun as_454241903(): IBitmapFrameWithSoftwareBitmap.WithDefault {
    if(pointer == NULL) {
      return(IBitmapFrameWithSoftwareBitmap.ABI.makeIBitmapFrameWithSoftwareBitmap(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapFrameWithSoftwareBitmap>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapFrameWithSoftwareBitmap.ABI.makeIBitmapFrameWithSoftwareBitmap(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<BitmapFrame> {
    public override fun getValue() = BitmapFrame(pointer.getPointer(0))

    public fun setValue(value: BitmapFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BitmapFrame, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BitmapFrame {
      val address = segment.toRawLongValue()
      return BitmapFrame(Pointer(address))
    }

    public override fun toNative(obj: BitmapFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
