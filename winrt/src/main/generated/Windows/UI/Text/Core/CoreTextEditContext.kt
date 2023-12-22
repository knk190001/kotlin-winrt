package Windows.UI.Text.Core

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

@ABIMarker(CoreTextEditContext.ABI::class)
@Signature("rc(Windows.UI.Text.Core.CoreTextEditContext;{bf6608af-4041-47c3-b263-a918eb5eaef2})")
@WinRTByReference(brClass = CoreTextEditContext.ByReference::class)
public class CoreTextEditContext(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreTextEditContext.WithDefault, ICoreTextEditContext2.WithDefault,
    IWinRTObject {
  private val __467561537_Interface: ICoreTextEditContext.WithDefault by lazy {
    as_467561537()
  }


  private val __1609505809_Interface: ICoreTextEditContext2.WithDefault by lazy {
    as_1609505809()
  }


  public override val __467561537_Ptr: JNAPointer? by lazy {
    __467561537_Interface.__467561537_Ptr
  }


  public override val __1609505809_Ptr: JNAPointer? by lazy {
    __1609505809_Interface.__1609505809_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__467561537_Interface, __1609505809_Interface)

  private fun as_467561537(): ICoreTextEditContext.WithDefault {
    if(pointer == NULL) {
      return(ICoreTextEditContext.ABI.makeICoreTextEditContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreTextEditContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreTextEditContext.ABI.makeICoreTextEditContext(ref.value))
  }

  private fun as_1609505809(): ICoreTextEditContext2.WithDefault {
    if(pointer == NULL) {
      return(ICoreTextEditContext2.ABI.makeICoreTextEditContext2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreTextEditContext2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreTextEditContext2.ABI.makeICoreTextEditContext2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreTextEditContext> {
    public override fun getValue() = CoreTextEditContext(pointer.getPointer(0))

    public fun setValue(value: CoreTextEditContext): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreTextEditContext, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreTextEditContext {
      val address = segment.toRawLongValue()
      return CoreTextEditContext(Pointer(address))
    }

    public override fun toNative(obj: CoreTextEditContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
