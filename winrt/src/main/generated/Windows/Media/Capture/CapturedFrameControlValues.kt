package Windows.Media.Capture

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

@ABIMarker(CapturedFrameControlValues.ABI::class)
@Signature("rc(Windows.Media.Capture.CapturedFrameControlValues;{90c65b7f-4e0d-4ca4-882d-7a144fed0a90})")
@WinRTByReference(brClass = CapturedFrameControlValues.ByReference::class)
public class CapturedFrameControlValues(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICapturedFrameControlValues.WithDefault,
    ICapturedFrameControlValues2.WithDefault, IWinRTObject {
  private val __1383932728_Interface: ICapturedFrameControlValues.WithDefault by lazy {
    as_1383932728()
  }


  private val __47758442_Interface: ICapturedFrameControlValues2.WithDefault by lazy {
    as_47758442()
  }


  public override val __1383932728_Ptr: JNAPointer? by lazy {
    __1383932728_Interface.__1383932728_Ptr
  }


  public override val __47758442_Ptr: JNAPointer? by lazy {
    __47758442_Interface.__47758442_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1383932728_Interface, __47758442_Interface)

  private fun as_1383932728(): ICapturedFrameControlValues.WithDefault {
    if(pointer == NULL) {
      return(ICapturedFrameControlValues.ABI.makeICapturedFrameControlValues(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICapturedFrameControlValues>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICapturedFrameControlValues.ABI.makeICapturedFrameControlValues(ref.value))
  }

  private fun as_47758442(): ICapturedFrameControlValues2.WithDefault {
    if(pointer == NULL) {
      return(ICapturedFrameControlValues2.ABI.makeICapturedFrameControlValues2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICapturedFrameControlValues2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICapturedFrameControlValues2.ABI.makeICapturedFrameControlValues2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CapturedFrameControlValues> {
    public override fun getValue() = CapturedFrameControlValues(pointer.getPointer(0))

    public fun setValue(value: CapturedFrameControlValues): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CapturedFrameControlValues, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CapturedFrameControlValues {
      val address = segment.toRawLongValue()
      return CapturedFrameControlValues(Pointer(address))
    }

    public override fun toNative(obj: CapturedFrameControlValues): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
