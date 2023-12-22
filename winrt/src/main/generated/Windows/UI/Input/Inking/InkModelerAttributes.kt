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

@ABIMarker(InkModelerAttributes.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkModelerAttributes;{bad31f27-0cd9-4bfd-b6f3-9e03ba8d7454})")
@WinRTByReference(brClass = InkModelerAttributes.ByReference::class)
public class InkModelerAttributes(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkModelerAttributes.WithDefault, IInkModelerAttributes2.WithDefault,
    IWinRTObject {
  private val __1432040673_Interface: IInkModelerAttributes.WithDefault by lazy {
    as_1432040673()
  }


  private val __1443587953_Interface: IInkModelerAttributes2.WithDefault by lazy {
    as_1443587953()
  }


  public override val __1432040673_Ptr: JNAPointer? by lazy {
    __1432040673_Interface.__1432040673_Ptr
  }


  public override val __1443587953_Ptr: JNAPointer? by lazy {
    __1443587953_Interface.__1443587953_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1432040673_Interface, __1443587953_Interface)

  private fun as_1432040673(): IInkModelerAttributes.WithDefault {
    if(pointer == NULL) {
      return(IInkModelerAttributes.ABI.makeIInkModelerAttributes(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkModelerAttributes>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkModelerAttributes.ABI.makeIInkModelerAttributes(ref.value))
  }

  private fun as_1443587953(): IInkModelerAttributes2.WithDefault {
    if(pointer == NULL) {
      return(IInkModelerAttributes2.ABI.makeIInkModelerAttributes2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkModelerAttributes2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkModelerAttributes2.ABI.makeIInkModelerAttributes2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkModelerAttributes> {
    public override fun getValue() = InkModelerAttributes(pointer.getPointer(0))

    public fun setValue(value: InkModelerAttributes): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkModelerAttributes, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkModelerAttributes {
      val address = segment.toRawLongValue()
      return InkModelerAttributes(Pointer(address))
    }

    public override fun toNative(obj: InkModelerAttributes): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
