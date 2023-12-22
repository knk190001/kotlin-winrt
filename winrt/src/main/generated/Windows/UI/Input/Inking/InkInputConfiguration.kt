package Windows.UI.Input.Inking

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

@ABIMarker(InkInputConfiguration.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkInputConfiguration;{93a68dc4-0b7b-49d7-b34f-9901e524dcf2})")
@WinRTByReference(brClass = InkInputConfiguration.ByReference::class)
public class InkInputConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkInputConfiguration.WithDefault, IInkInputConfiguration2.WithDefault,
    IWinRTObject {
  private val __39215496_Interface: IInkInputConfiguration.WithDefault by lazy {
    as_39215496()
  }


  private val __1215680326_Interface: IInkInputConfiguration2.WithDefault by lazy {
    as_1215680326()
  }


  public override val __39215496_Ptr: JNAPointer? by lazy {
    __39215496_Interface.__39215496_Ptr
  }


  public override val __1215680326_Ptr: JNAPointer? by lazy {
    __1215680326_Interface.__1215680326_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__39215496_Interface, __1215680326_Interface)

  private fun as_39215496(): IInkInputConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IInkInputConfiguration.ABI.makeIInkInputConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkInputConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkInputConfiguration.ABI.makeIInkInputConfiguration(ref.value))
  }

  private fun as_1215680326(): IInkInputConfiguration2.WithDefault {
    if(pointer == NULL) {
      return(IInkInputConfiguration2.ABI.makeIInkInputConfiguration2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkInputConfiguration2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkInputConfiguration2.ABI.makeIInkInputConfiguration2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkInputConfiguration> {
    public override fun getValue() = InkInputConfiguration(pointer.getPointer(0))

    public fun setValue(value: InkInputConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkInputConfiguration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkInputConfiguration {
      val address = segment.toRawLongValue()
      return InkInputConfiguration(Pointer(address))
    }

    public override fun toNative(obj: InkInputConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
