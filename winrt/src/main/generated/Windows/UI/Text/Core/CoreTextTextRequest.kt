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

@ABIMarker(CoreTextTextRequest.ABI::class)
@Signature("rc(Windows.UI.Text.Core.CoreTextTextRequest;{50d950a9-f51e-4cc1-8ca1-e6346d1a61be})")
@WinRTByReference(brClass = CoreTextTextRequest.ByReference::class)
public class CoreTextTextRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreTextTextRequest.WithDefault, IWinRTObject {
  private val __2111269730_Interface: ICoreTextTextRequest.WithDefault by lazy {
    as_2111269730()
  }


  public override val __2111269730_Ptr: JNAPointer? by lazy {
    __2111269730_Interface.__2111269730_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2111269730_Interface)

  private fun as_2111269730(): ICoreTextTextRequest.WithDefault {
    if(pointer == NULL) {
      return(ICoreTextTextRequest.ABI.makeICoreTextTextRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreTextTextRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreTextTextRequest.ABI.makeICoreTextTextRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreTextTextRequest> {
    public override fun getValue() = CoreTextTextRequest(pointer.getPointer(0))

    public fun setValue(value: CoreTextTextRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreTextTextRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreTextTextRequest {
      val address = segment.toRawLongValue()
      return CoreTextTextRequest(Pointer(address))
    }

    public override fun toNative(obj: CoreTextTextRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
