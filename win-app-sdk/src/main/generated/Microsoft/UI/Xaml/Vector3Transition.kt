package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.IVector3TransitionFactory.ABI.IID
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

@ABIMarker(Vector3Transition.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Vector3Transition;{0c408bb9-f9a2-55d7-8aed-143d36d603f2})")
@WinRTByReference(brClass = Vector3Transition.ByReference::class)
public open class Vector3Transition(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVector3Transition.WithDefault, IWinRTObject {
  private val __646753118_Interface: IVector3Transition.WithDefault by lazy {
    as_646753118()
  }


  public override val __646753118_Ptr: JNAPointer? by lazy {
    __646753118_Interface.__646753118_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__646753118_Interface)

  public constructor() : this(ABI.activate())

  private fun as_646753118(): IVector3Transition.WithDefault {
    if(pointer == NULL) {
      return(IVector3Transition.ABI.makeIVector3Transition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector3Transition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector3Transition.ABI.makeIVector3Transition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Vector3Transition> {
    public override fun getValue() = Vector3Transition(pointer.getPointer(0))

    public fun setValue(value: Vector3Transition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Vector3Transition, MemoryAddress> {
    public val IVector3TransitionFactory_Instance: IVector3TransitionFactory by lazy {
      createIVector3TransitionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVector3TransitionFactory(): IVector3TransitionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Vector3Transition".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IVector3TransitionFactory.ABI.makeIVector3TransitionFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IVector3TransitionFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Vector3Transition {
      val address = segment.toRawLongValue()
      return Vector3Transition(Pointer(address))
    }

    public override fun toNative(obj: Vector3Transition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
