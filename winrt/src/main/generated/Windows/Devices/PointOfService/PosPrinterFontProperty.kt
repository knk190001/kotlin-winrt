package Windows.Devices.PointOfService

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

@ABIMarker(PosPrinterFontProperty.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.PosPrinterFontProperty;{a7f4e93a-f8ac-5f04-84d2-29b16d8a633c})")
@WinRTByReference(brClass = PosPrinterFontProperty.ByReference::class)
public class PosPrinterFontProperty(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPosPrinterFontProperty.WithDefault, IWinRTObject {
  private val __933624681_Interface: IPosPrinterFontProperty.WithDefault by lazy {
    as_933624681()
  }


  public override val __933624681_Ptr: JNAPointer? by lazy {
    __933624681_Interface.__933624681_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__933624681_Interface)

  private fun as_933624681(): IPosPrinterFontProperty.WithDefault {
    if(pointer == NULL) {
      return(IPosPrinterFontProperty.ABI.makeIPosPrinterFontProperty(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPosPrinterFontProperty>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPosPrinterFontProperty.ABI.makeIPosPrinterFontProperty(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PosPrinterFontProperty> {
    public override fun getValue() = PosPrinterFontProperty(pointer.getPointer(0))

    public fun setValue(value: PosPrinterFontProperty): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PosPrinterFontProperty, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PosPrinterFontProperty {
      val address = segment.toRawLongValue()
      return PosPrinterFontProperty(Pointer(address))
    }

    public override fun toNative(obj: PosPrinterFontProperty): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
