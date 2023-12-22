package Windows.Management.Update

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

@ABIMarker(PreviewBuildsState.ABI::class)
@Signature("rc(Windows.Management.Update.PreviewBuildsState;{a2f2903e-b223-5f63-7546-3e8eac070a2e})")
@WinRTByReference(brClass = PreviewBuildsState.ByReference::class)
public class PreviewBuildsState(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPreviewBuildsState.WithDefault, IWinRTObject {
  private val __731013732_Interface: IPreviewBuildsState.WithDefault by lazy {
    as_731013732()
  }


  public override val __731013732_Ptr: JNAPointer? by lazy {
    __731013732_Interface.__731013732_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__731013732_Interface)

  private fun as_731013732(): IPreviewBuildsState.WithDefault {
    if(pointer == NULL) {
      return(IPreviewBuildsState.ABI.makeIPreviewBuildsState(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPreviewBuildsState>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPreviewBuildsState.ABI.makeIPreviewBuildsState(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PreviewBuildsState> {
    public override fun getValue() = PreviewBuildsState(pointer.getPointer(0))

    public fun setValue(value: PreviewBuildsState): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PreviewBuildsState, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PreviewBuildsState {
      val address = segment.toRawLongValue()
      return PreviewBuildsState(Pointer(address))
    }

    public override fun toNative(obj: PreviewBuildsState): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
