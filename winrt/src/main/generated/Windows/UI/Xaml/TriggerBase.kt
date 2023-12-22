package Windows.UI.Xaml

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

@ABIMarker(TriggerBase.ABI::class)
@Signature("rc(Windows.UI.Xaml.TriggerBase;{e7ea222f-dee6-4393-a8b2-8923d641f395})")
@WinRTByReference(brClass = TriggerBase.ByReference::class)
public open class TriggerBase(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ITriggerBase.WithDefault, IWinRTObject {
  private val __413443863_Interface: ITriggerBase.WithDefault by lazy {
    as_413443863()
  }


  public override val __413443863_Ptr: JNAPointer? by lazy {
    __413443863_Interface.__413443863_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__413443863_Interface)

  private fun as_413443863(): ITriggerBase.WithDefault {
    if(pointer == NULL) {
      return(ITriggerBase.ABI.makeITriggerBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITriggerBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITriggerBase.ABI.makeITriggerBase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TriggerBase> {
    public override fun getValue() = TriggerBase(pointer.getPointer(0))

    public fun setValue(value: TriggerBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TriggerBase, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TriggerBase {
      val address = segment.toRawLongValue()
      return TriggerBase(Pointer(address))
    }

    public override fun toNative(obj: TriggerBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
