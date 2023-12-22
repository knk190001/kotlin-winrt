package Windows.UI.Input.Inking.Core

import Windows.UI.Input.Inking.InkPresenter
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(CoreWetStrokeUpdateSource.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.Core.CoreWetStrokeUpdateSource;{1f718e22-ee52-4e00-8209-4c3e5b21a3cc})")
@WinRTByReference(brClass = CoreWetStrokeUpdateSource.ByReference::class)
public class CoreWetStrokeUpdateSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWetStrokeUpdateSource.WithDefault, IWinRTObject {
  private val __1013735448_Interface: ICoreWetStrokeUpdateSource.WithDefault by lazy {
    as_1013735448()
  }


  public override val __1013735448_Ptr: JNAPointer? by lazy {
    __1013735448_Interface.__1013735448_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1013735448_Interface)

  private fun as_1013735448(): ICoreWetStrokeUpdateSource.WithDefault {
    if(pointer == NULL) {
      return(ICoreWetStrokeUpdateSource.ABI.makeICoreWetStrokeUpdateSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWetStrokeUpdateSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWetStrokeUpdateSource.ABI.makeICoreWetStrokeUpdateSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWetStrokeUpdateSource> {
    public override fun getValue() = CoreWetStrokeUpdateSource(pointer.getPointer(0))

    public fun setValue(value: CoreWetStrokeUpdateSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWetStrokeUpdateSource, MemoryAddress> {
    public val ICoreWetStrokeUpdateSourceStatics_Instance: ICoreWetStrokeUpdateSourceStatics by
        lazy {
      createICoreWetStrokeUpdateSourceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreWetStrokeUpdateSourceStatics(): ICoreWetStrokeUpdateSourceStatics {
      val refiid = Guid.REFIID(ICoreWetStrokeUpdateSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Inking.Core.CoreWetStrokeUpdateSource".toHandle(),refiid,interfacePtr)
      val result =
          ICoreWetStrokeUpdateSourceStatics.ABI.makeICoreWetStrokeUpdateSourceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CoreWetStrokeUpdateSource {
      val address = segment.toRawLongValue()
      return CoreWetStrokeUpdateSource(Pointer(address))
    }

    public override fun toNative(obj: CoreWetStrokeUpdateSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(inkPresenter: InkPresenter) =
        ABI.ICoreWetStrokeUpdateSourceStatics_Instance.Create(inkPresenter)
  }
}
