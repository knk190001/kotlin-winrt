package Windows.UI.Xaml

import Windows.UI.Xaml.IBrushTransitionFactory.ABI.IID
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

@ABIMarker(BrushTransition.ABI::class)
@Signature("rc(Windows.UI.Xaml.BrushTransition;{1116972c-9dad-5429-a7dd-b2b7d061ab8e})")
@WinRTByReference(brClass = BrushTransition.ByReference::class)
public open class BrushTransition(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBrushTransition.WithDefault, IWinRTObject {
  private val __850406301_Interface: IBrushTransition.WithDefault by lazy {
    as_850406301()
  }


  public override val __850406301_Ptr: JNAPointer? by lazy {
    __850406301_Interface.__850406301_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__850406301_Interface)

  public constructor() : this(ABI.activate())

  private fun as_850406301(): IBrushTransition.WithDefault {
    if(pointer == NULL) {
      return(IBrushTransition.ABI.makeIBrushTransition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBrushTransition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBrushTransition.ABI.makeIBrushTransition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BrushTransition> {
    public override fun getValue() = BrushTransition(pointer.getPointer(0))

    public fun setValue(value: BrushTransition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BrushTransition, MemoryAddress> {
    public val IBrushTransitionFactory_Instance: IBrushTransitionFactory by lazy {
      createIBrushTransitionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBrushTransitionFactory(): IBrushTransitionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.BrushTransition".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBrushTransitionFactory.ABI.makeIBrushTransitionFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IBrushTransitionFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): BrushTransition {
      val address = segment.toRawLongValue()
      return BrushTransition(Pointer(address))
    }

    public override fun toNative(obj: BrushTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
