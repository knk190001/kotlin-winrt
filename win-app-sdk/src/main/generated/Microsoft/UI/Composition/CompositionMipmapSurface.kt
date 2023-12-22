package Microsoft.UI.Composition

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

@ABIMarker(CompositionMipmapSurface.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionMipmapSurface;{681f1e47-6e43-5b55-be3a-e5c858a2d5fa})")
@WinRTByReference(brClass = CompositionMipmapSurface.ByReference::class)
public class CompositionMipmapSurface(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionMipmapSurface.WithDefault, ICompositionSurface.WithDefault,
    IWinRTObject {
  private val __1410784108_Interface: ICompositionMipmapSurface.WithDefault by lazy {
    as_1410784108()
  }


  private val __310213500_Interface: ICompositionSurface.WithDefault by lazy {
    as_310213500()
  }


  public override val __1410784108_Ptr: JNAPointer? by lazy {
    __1410784108_Interface.__1410784108_Ptr
  }


  public override val __310213500_Ptr: JNAPointer? by lazy {
    __310213500_Interface.__310213500_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1410784108_Interface, __310213500_Interface)

  private fun as_1410784108(): ICompositionMipmapSurface.WithDefault {
    if(pointer == NULL) {
      return(ICompositionMipmapSurface.ABI.makeICompositionMipmapSurface(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionMipmapSurface>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionMipmapSurface.ABI.makeICompositionMipmapSurface(ref.value))
  }

  private fun as_310213500(): ICompositionSurface.WithDefault {
    if(pointer == NULL) {
      return(ICompositionSurface.ABI.makeICompositionSurface(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionSurface>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionSurface.ABI.makeICompositionSurface(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionMipmapSurface> {
    public override fun getValue() = CompositionMipmapSurface(pointer.getPointer(0))

    public fun setValue(value: CompositionMipmapSurface): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionMipmapSurface, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionMipmapSurface {
      val address = segment.toRawLongValue()
      return CompositionMipmapSurface(Pointer(address))
    }

    public override fun toNative(obj: CompositionMipmapSurface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
