package Microsoft.UI.Content

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

@ABIMarker(CoreWindowTopLevelWindowBridge.ABI::class)
@Signature("rc(Microsoft.UI.Content.CoreWindowTopLevelWindowBridge;{2251c304-449d-4456-b008-fe7163403d7e})")
@WinRTByReference(brClass = CoreWindowTopLevelWindowBridge.ByReference::class)
public class CoreWindowTopLevelWindowBridge(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentNodeOwner.WithDefault, IWinRTObject {
  private val __723244670_Interface: IContentNodeOwner.WithDefault by lazy {
    as_723244670()
  }


  public override val __723244670_Ptr: JNAPointer? by lazy {
    __723244670_Interface.__723244670_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__723244670_Interface)

  private fun as_723244670(): IContentNodeOwner.WithDefault {
    if(pointer == NULL) {
      return(IContentNodeOwner.ABI.makeIContentNodeOwner(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentNodeOwner>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentNodeOwner.ABI.makeIContentNodeOwner(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWindowTopLevelWindowBridge> {
    public override fun getValue() = CoreWindowTopLevelWindowBridge(pointer.getPointer(0))

    public fun setValue(value: CoreWindowTopLevelWindowBridge): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWindowTopLevelWindowBridge, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWindowTopLevelWindowBridge {
      val address = segment.toRawLongValue()
      return CoreWindowTopLevelWindowBridge(Pointer(address))
    }

    public override fun toNative(obj: CoreWindowTopLevelWindowBridge): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
