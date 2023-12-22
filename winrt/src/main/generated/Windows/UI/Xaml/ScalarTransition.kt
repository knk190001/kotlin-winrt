package Windows.UI.Xaml

import Windows.UI.Xaml.IScalarTransitionFactory.ABI.IID
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

@ABIMarker(ScalarTransition.ABI::class)
@Signature("rc(Windows.UI.Xaml.ScalarTransition;{4cb68238-e15d-524e-a73c-9d4dcfbea226})")
@WinRTByReference(brClass = ScalarTransition.ByReference::class)
public open class ScalarTransition(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScalarTransition.WithDefault, IWinRTObject {
  private val __441559885_Interface: IScalarTransition.WithDefault by lazy {
    as_441559885()
  }


  public override val __441559885_Ptr: JNAPointer? by lazy {
    __441559885_Interface.__441559885_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__441559885_Interface)

  public constructor() : this(ABI.activate())

  private fun as_441559885(): IScalarTransition.WithDefault {
    if(pointer == NULL) {
      return(IScalarTransition.ABI.makeIScalarTransition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScalarTransition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScalarTransition.ABI.makeIScalarTransition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScalarTransition> {
    public override fun getValue() = ScalarTransition(pointer.getPointer(0))

    public fun setValue(value: ScalarTransition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScalarTransition, MemoryAddress> {
    public val IScalarTransitionFactory_Instance: IScalarTransitionFactory by lazy {
      createIScalarTransitionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIScalarTransitionFactory(): IScalarTransitionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.ScalarTransition".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IScalarTransitionFactory.ABI.makeIScalarTransitionFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IScalarTransitionFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ScalarTransition {
      val address = segment.toRawLongValue()
      return ScalarTransition(Pointer(address))
    }

    public override fun toNative(obj: ScalarTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
