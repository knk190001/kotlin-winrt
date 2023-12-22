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

@ABIMarker(CoreTextLayoutRequest.ABI::class)
@Signature("rc(Windows.UI.Text.Core.CoreTextLayoutRequest;{2555a8cc-51fd-4f03-98bf-ac78174d68e0})")
@WinRTByReference(brClass = CoreTextLayoutRequest.ByReference::class)
public class CoreTextLayoutRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreTextLayoutRequest.WithDefault, ICoreTextLayoutRequest2.WithDefault,
    IWinRTObject {
  private val __1342928639_Interface: ICoreTextLayoutRequest.WithDefault by lazy {
    as_1342928639()
  }


  private val __1318885201_Interface: ICoreTextLayoutRequest2.WithDefault by lazy {
    as_1318885201()
  }


  public override val __1342928639_Ptr: JNAPointer? by lazy {
    __1342928639_Interface.__1342928639_Ptr
  }


  public override val __1318885201_Ptr: JNAPointer? by lazy {
    __1318885201_Interface.__1318885201_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1342928639_Interface, __1318885201_Interface)

  private fun as_1342928639(): ICoreTextLayoutRequest.WithDefault {
    if(pointer == NULL) {
      return(ICoreTextLayoutRequest.ABI.makeICoreTextLayoutRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreTextLayoutRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreTextLayoutRequest.ABI.makeICoreTextLayoutRequest(ref.value))
  }

  private fun as_1318885201(): ICoreTextLayoutRequest2.WithDefault {
    if(pointer == NULL) {
      return(ICoreTextLayoutRequest2.ABI.makeICoreTextLayoutRequest2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreTextLayoutRequest2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreTextLayoutRequest2.ABI.makeICoreTextLayoutRequest2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreTextLayoutRequest> {
    public override fun getValue() = CoreTextLayoutRequest(pointer.getPointer(0))

    public fun setValue(value: CoreTextLayoutRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreTextLayoutRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreTextLayoutRequest {
      val address = segment.toRawLongValue()
      return CoreTextLayoutRequest(Pointer(address))
    }

    public override fun toNative(obj: CoreTextLayoutRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
