package Windows.UI.Core

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

@ABIMarker(CoreAcceleratorKeys.ABI::class)
@Signature("rc(Windows.UI.Core.CoreAcceleratorKeys;{9ffdf7f5-b8c9-4ef0-b7d2-1de626561fc8})")
@WinRTByReference(brClass = CoreAcceleratorKeys.ByReference::class)
public class CoreAcceleratorKeys(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreAcceleratorKeys.WithDefault, IWinRTObject {
  private val __1776875099_Interface: ICoreAcceleratorKeys.WithDefault by lazy {
    as_1776875099()
  }


  public override val __1776875099_Ptr: JNAPointer? by lazy {
    __1776875099_Interface.__1776875099_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1776875099_Interface)

  private fun as_1776875099(): ICoreAcceleratorKeys.WithDefault {
    if(pointer == NULL) {
      return(ICoreAcceleratorKeys.ABI.makeICoreAcceleratorKeys(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreAcceleratorKeys>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreAcceleratorKeys.ABI.makeICoreAcceleratorKeys(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreAcceleratorKeys> {
    public override fun getValue() = CoreAcceleratorKeys(pointer.getPointer(0))

    public fun setValue(value: CoreAcceleratorKeys): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreAcceleratorKeys, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreAcceleratorKeys {
      val address = segment.toRawLongValue()
      return CoreAcceleratorKeys(Pointer(address))
    }

    public override fun toNative(obj: CoreAcceleratorKeys): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
