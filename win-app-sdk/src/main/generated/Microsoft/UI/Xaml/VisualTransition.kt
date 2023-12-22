package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.IVisualTransitionFactory.ABI.IID
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(VisualTransition.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.VisualTransition;{dd21af54-2ce1-59de-9fd1-2b45f6bf6581})")
@WinRTByReference(brClass = VisualTransition.ByReference::class)
public open class VisualTransition(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IVisualTransition.WithDefault, IWinRTObject {
  private val __716049148_Interface: IVisualTransition.WithDefault by lazy {
    as_716049148()
  }


  public override val __716049148_Ptr: JNAPointer? by lazy {
    __716049148_Interface.__716049148_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__716049148_Interface)

  public constructor() : this(ABI.activate())

  private fun as_716049148(): IVisualTransition.WithDefault {
    if(pointer == NULL) {
      return(IVisualTransition.ABI.makeIVisualTransition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualTransition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualTransition.ABI.makeIVisualTransition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VisualTransition> {
    public override fun getValue() = VisualTransition(pointer.getPointer(0))

    public fun setValue(value: VisualTransition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VisualTransition, MemoryAddress> {
    public val IVisualTransitionFactory_Instance: IVisualTransitionFactory by lazy {
      createIVisualTransitionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVisualTransitionFactory(): IVisualTransitionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.VisualTransition".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IVisualTransitionFactory.ABI.makeIVisualTransitionFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IVisualTransitionFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): VisualTransition {
      val address = segment.toRawLongValue()
      return VisualTransition(Pointer(address))
    }

    public override fun toNative(obj: VisualTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
