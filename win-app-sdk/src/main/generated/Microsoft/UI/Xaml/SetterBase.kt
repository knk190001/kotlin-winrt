package Microsoft.UI.Xaml

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SetterBase.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.SetterBase;{5a7c1347-cda3-55be-bfef-5c7582213980})")
@WinRTByReference(brClass = SetterBase.ByReference::class)
public open class SetterBase(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ISetterBase.WithDefault, IWinRTObject {
  private val __1491763063_Interface: ISetterBase.WithDefault by lazy {
    as_1491763063()
  }


  public override val __1491763063_Ptr: JNAPointer? by lazy {
    __1491763063_Interface.__1491763063_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1491763063_Interface)

  private fun as_1491763063(): ISetterBase.WithDefault {
    if(pointer == NULL) {
      return(ISetterBase.ABI.makeISetterBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISetterBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISetterBase.ABI.makeISetterBase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SetterBase> {
    public override fun getValue() = SetterBase(pointer.getPointer(0))

    public fun setValue(value: SetterBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SetterBase, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SetterBase {
      val address = segment.toRawLongValue()
      return SetterBase(Pointer(address))
    }

    public override fun toNative(obj: SetterBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
