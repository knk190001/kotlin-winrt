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

@ABIMarker(PixelDataProvider.ABI::class)
@Signature("rc(Windows.Graphics.Imaging.PixelDataProvider;{dd831f25-185c-4595-9fb9-ccbe6ec18a6f})")
@WinRTByReference(brClass = PixelDataProvider.ByReference::class)
public class PixelDataProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPixelDataProvider.WithDefault, IWinRTObject {
  private val __976755912_Interface: IPixelDataProvider.WithDefault by lazy {
    as_976755912()
  }


  public override val __976755912_Ptr: JNAPointer? by lazy {
    __976755912_Interface.__976755912_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__976755912_Interface)

  private fun as_976755912(): IPixelDataProvider.WithDefault {
    if(pointer == NULL) {
      return(IPixelDataProvider.ABI.makeIPixelDataProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPixelDataProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPixelDataProvider.ABI.makeIPixelDataProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PixelDataProvider> {
    public override fun getValue() = PixelDataProvider(pointer.getPointer(0))

    public fun setValue(value: PixelDataProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PixelDataProvider, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PixelDataProvider {
      val address = segment.toRawLongValue()
      return PixelDataProvider(Pointer(address))
    }

    public override fun toNative(obj: PixelDataProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
