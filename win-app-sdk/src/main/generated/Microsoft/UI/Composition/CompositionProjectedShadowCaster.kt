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

@ABIMarker(CompositionProjectedShadowCaster.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionProjectedShadowCaster;{15a9f2d0-6bae-521b-90c7-c7500f2bf562})")
@WinRTByReference(brClass = CompositionProjectedShadowCaster.ByReference::class)
public class CompositionProjectedShadowCaster(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionProjectedShadowCaster.WithDefault,
    IExpCompositionProjectedShadowCaster.WithDefault, IWinRTObject {
  private val __1871343725_Interface: ICompositionProjectedShadowCaster.WithDefault by lazy {
    as_1871343725()
  }


  private val __1275330302_Interface: IExpCompositionProjectedShadowCaster.WithDefault by lazy {
    as_1275330302()
  }


  public override val __1871343725_Ptr: JNAPointer? by lazy {
    __1871343725_Interface.__1871343725_Ptr
  }


  public override val __1275330302_Ptr: JNAPointer? by lazy {
    __1275330302_Interface.__1275330302_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1871343725_Interface, __1275330302_Interface)

  private fun as_1871343725(): ICompositionProjectedShadowCaster.WithDefault {
    if(pointer == NULL) {
      return(ICompositionProjectedShadowCaster.ABI.makeICompositionProjectedShadowCaster(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionProjectedShadowCaster>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionProjectedShadowCaster.ABI.makeICompositionProjectedShadowCaster(ref.value))
  }

  private fun as_1275330302(): IExpCompositionProjectedShadowCaster.WithDefault {
    if(pointer == NULL) {
      return(IExpCompositionProjectedShadowCaster.ABI.makeIExpCompositionProjectedShadowCaster(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpCompositionProjectedShadowCaster>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpCompositionProjectedShadowCaster.ABI.makeIExpCompositionProjectedShadowCaster(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionProjectedShadowCaster> {
    public override fun getValue() = CompositionProjectedShadowCaster(pointer.getPointer(0))

    public fun setValue(value: CompositionProjectedShadowCaster): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionProjectedShadowCaster, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionProjectedShadowCaster {
      val address = segment.toRawLongValue()
      return CompositionProjectedShadowCaster(Pointer(address))
    }

    public override fun toNative(obj: CompositionProjectedShadowCaster): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
