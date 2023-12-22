package Microsoft.UI.Composition.Experimental

import Microsoft.UI.Composition.Compositor
import Windows.Graphics.SizeInt32
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ExpCompositionVisualSurface.ABI::class)
@WinRTByReference(brClass = ExpCompositionVisualSurface.ByReference::class)
public class ExpCompositionVisualSurface(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExpCompositionVisualSurface> {
    public override fun getValue() = ExpCompositionVisualSurface(pointer.getPointer(0))

    public fun setValue(value: ExpCompositionVisualSurface): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExpCompositionVisualSurface, MemoryAddress> {
    public val IExpCompositionVisualSurfaceStatics_Instance: IExpCompositionVisualSurfaceStatics by
        lazy {
      createIExpCompositionVisualSurfaceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIExpCompositionVisualSurfaceStatics(): IExpCompositionVisualSurfaceStatics {
      val refiid = Guid.REFIID(IExpCompositionVisualSurfaceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.Experimental.ExpCompositionVisualSurface".toHandle(),refiid,interfacePtr)
      val result =
          IExpCompositionVisualSurfaceStatics.ABI.makeIExpCompositionVisualSurfaceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ExpCompositionVisualSurface {
      val address = segment.toRawLongValue()
      return ExpCompositionVisualSurface(Pointer(address))
    }

    public override fun toNative(obj: ExpCompositionVisualSurface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateVisualSurface(
      compositor: Compositor,
      realizationSize: SizeInt32,
      frozen: Boolean
    ) = ABI.IExpCompositionVisualSurfaceStatics_Instance.CreateVisualSurface(compositor,
        realizationSize, frozen)
  }
}
