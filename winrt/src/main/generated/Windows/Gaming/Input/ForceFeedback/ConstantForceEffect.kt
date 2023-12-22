package Windows.Gaming.Input.ForceFeedback

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(ConstantForceEffect.ABI::class)
@Signature("rc(Windows.Gaming.Input.ForceFeedback.ConstantForceEffect;{a17fba0c-2ae4-48c2-8063-eabd0777cb89})")
@WinRTByReference(brClass = ConstantForceEffect.ByReference::class)
public class ConstantForceEffect(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IForceFeedbackEffect.WithDefault, IConstantForceEffect.WithDefault,
    IWinRTObject {
  private val __455352496_Interface: IForceFeedbackEffect.WithDefault by lazy {
    as_455352496()
  }


  private val __83005831_Interface: IConstantForceEffect.WithDefault by lazy {
    as_83005831()
  }


  public override val __455352496_Ptr: JNAPointer? by lazy {
    __455352496_Interface.__455352496_Ptr
  }


  public override val __83005831_Ptr: JNAPointer? by lazy {
    __83005831_Interface.__83005831_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__455352496_Interface, __83005831_Interface)

  public constructor() : this(ABI.activate())

  private fun as_455352496(): IForceFeedbackEffect.WithDefault {
    if(pointer == NULL) {
      return(IForceFeedbackEffect.ABI.makeIForceFeedbackEffect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IForceFeedbackEffect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IForceFeedbackEffect.ABI.makeIForceFeedbackEffect(ref.value))
  }

  private fun as_83005831(): IConstantForceEffect.WithDefault {
    if(pointer == NULL) {
      return(IConstantForceEffect.ABI.makeIConstantForceEffect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConstantForceEffect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConstantForceEffect.ABI.makeIConstantForceEffect(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ConstantForceEffect> {
    public override fun getValue() = ConstantForceEffect(pointer.getPointer(0))

    public fun setValue(value: ConstantForceEffect): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ConstantForceEffect, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Input.ForceFeedback.ConstantForceEffect".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): ConstantForceEffect {
      val address = segment.toRawLongValue()
      return ConstantForceEffect(Pointer(address))
    }

    public override fun toNative(obj: ConstantForceEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
