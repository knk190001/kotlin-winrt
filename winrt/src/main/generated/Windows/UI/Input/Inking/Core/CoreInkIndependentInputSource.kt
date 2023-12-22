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

@ABIMarker(CoreInkIndependentInputSource.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.Core.CoreInkIndependentInputSource;{39b38da9-7639-4499-a5b5-191d00e35b16})")
@WinRTByReference(brClass = CoreInkIndependentInputSource.ByReference::class)
public class CoreInkIndependentInputSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreInkIndependentInputSource.WithDefault,
    ICoreInkIndependentInputSource2.WithDefault, IWinRTObject {
  private val __981480103_Interface: ICoreInkIndependentInputSource.WithDefault by lazy {
    as_981480103()
  }


  private val __361112171_Interface: ICoreInkIndependentInputSource2.WithDefault by lazy {
    as_361112171()
  }


  public override val __981480103_Ptr: JNAPointer? by lazy {
    __981480103_Interface.__981480103_Ptr
  }


  public override val __361112171_Ptr: JNAPointer? by lazy {
    __361112171_Interface.__361112171_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__981480103_Interface, __361112171_Interface)

  private fun as_981480103(): ICoreInkIndependentInputSource.WithDefault {
    if(pointer == NULL) {
      return(ICoreInkIndependentInputSource.ABI.makeICoreInkIndependentInputSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreInkIndependentInputSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreInkIndependentInputSource.ABI.makeICoreInkIndependentInputSource(ref.value))
  }

  private fun as_361112171(): ICoreInkIndependentInputSource2.WithDefault {
    if(pointer == NULL) {
      return(ICoreInkIndependentInputSource2.ABI.makeICoreInkIndependentInputSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreInkIndependentInputSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreInkIndependentInputSource2.ABI.makeICoreInkIndependentInputSource2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreInkIndependentInputSource> {
    public override fun getValue() = CoreInkIndependentInputSource(pointer.getPointer(0))

    public fun setValue(value: CoreInkIndependentInputSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreInkIndependentInputSource, MemoryAddress> {
    public val ICoreInkIndependentInputSourceStatics_Instance: ICoreInkIndependentInputSourceStatics
        by lazy {
      createICoreInkIndependentInputSourceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreInkIndependentInputSourceStatics():
        ICoreInkIndependentInputSourceStatics {
      val refiid = Guid.REFIID(ICoreInkIndependentInputSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Inking.Core.CoreInkIndependentInputSource".toHandle(),refiid,interfacePtr)
      val result =
          ICoreInkIndependentInputSourceStatics.ABI.makeICoreInkIndependentInputSourceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CoreInkIndependentInputSource {
      val address = segment.toRawLongValue()
      return CoreInkIndependentInputSource(Pointer(address))
    }

    public override fun toNative(obj: CoreInkIndependentInputSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(inkPresenter: InkPresenter) =
        ABI.ICoreInkIndependentInputSourceStatics_Instance.Create(inkPresenter)
  }
}
