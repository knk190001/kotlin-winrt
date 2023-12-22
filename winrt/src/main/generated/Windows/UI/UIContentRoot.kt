package Windows.UI

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

@ABIMarker(UIContentRoot.ABI::class)
@Signature("rc(Windows.UI.UIContentRoot;{1dfcbac6-b36b-5cb9-9bc5-2b7a0eddc378})")
@WinRTByReference(brClass = UIContentRoot.ByReference::class)
public class UIContentRoot(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUIContentRoot.WithDefault, IWinRTObject {
  private val __1042419677_Interface: IUIContentRoot.WithDefault by lazy {
    as_1042419677()
  }


  public override val __1042419677_Ptr: JNAPointer? by lazy {
    __1042419677_Interface.__1042419677_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1042419677_Interface)

  private fun as_1042419677(): IUIContentRoot.WithDefault {
    if(pointer == NULL) {
      return(IUIContentRoot.ABI.makeIUIContentRoot(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIContentRoot>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIContentRoot.ABI.makeIUIContentRoot(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UIContentRoot>
      {
    public override fun getValue() = UIContentRoot(pointer.getPointer(0))

    public fun setValue(value: UIContentRoot): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UIContentRoot, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UIContentRoot {
      val address = segment.toRawLongValue()
      return UIContentRoot(Pointer(address))
    }

    public override fun toNative(obj: UIContentRoot): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
