package Microsoft.UI.Xaml.Media

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

@ABIMarker(Transform.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Transform;{92a8dee5-1413-56b9-8cca-3c46918fde1b})")
@WinRTByReference(brClass = Transform.ByReference::class)
public open class Transform(
  ptr: JNAPointer? = NULL
) : GeneralTransform(ptr), ITransform.WithDefault, IWinRTObject {
  private val __1185028699_Interface: ITransform.WithDefault by lazy {
    as_1185028699()
  }


  public override val __1185028699_Ptr: JNAPointer? by lazy {
    __1185028699_Interface.__1185028699_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1185028699_Interface)

  private fun as_1185028699(): ITransform.WithDefault {
    if(pointer == NULL) {
      return(ITransform.ABI.makeITransform(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITransform>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITransform.ABI.makeITransform(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Transform> {
    public override fun getValue() = Transform(pointer.getPointer(0))

    public fun setValue(value: Transform): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Transform, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Transform {
      val address = segment.toRawLongValue()
      return Transform(Pointer(address))
    }

    public override fun toNative(obj: Transform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
