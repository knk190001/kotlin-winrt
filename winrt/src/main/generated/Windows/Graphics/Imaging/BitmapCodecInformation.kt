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

@ABIMarker(BitmapCodecInformation.ABI::class)
@Signature("rc(Windows.Graphics.Imaging.BitmapCodecInformation;{400caaf2-c4b0-4392-a3b0-6f6f9ba95cb4})")
@WinRTByReference(brClass = BitmapCodecInformation.ByReference::class)
public class BitmapCodecInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBitmapCodecInformation.WithDefault, IWinRTObject {
  private val __1785920754_Interface: IBitmapCodecInformation.WithDefault by lazy {
    as_1785920754()
  }


  public override val __1785920754_Ptr: JNAPointer? by lazy {
    __1785920754_Interface.__1785920754_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1785920754_Interface)

  private fun as_1785920754(): IBitmapCodecInformation.WithDefault {
    if(pointer == NULL) {
      return(IBitmapCodecInformation.ABI.makeIBitmapCodecInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapCodecInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapCodecInformation.ABI.makeIBitmapCodecInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BitmapCodecInformation> {
    public override fun getValue() = BitmapCodecInformation(pointer.getPointer(0))

    public fun setValue(value: BitmapCodecInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BitmapCodecInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BitmapCodecInformation {
      val address = segment.toRawLongValue()
      return BitmapCodecInformation(Pointer(address))
    }

    public override fun toNative(obj: BitmapCodecInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
