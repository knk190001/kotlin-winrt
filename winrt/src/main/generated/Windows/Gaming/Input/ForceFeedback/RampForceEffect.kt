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

@ABIMarker(RampForceEffect.ABI::class)
@Signature("rc(Windows.Gaming.Input.ForceFeedback.RampForceEffect;{a17fba0c-2ae4-48c2-8063-eabd0777cb89})")
@WinRTByReference(brClass = RampForceEffect.ByReference::class)
public class RampForceEffect(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IForceFeedbackEffect.WithDefault, IRampForceEffect.WithDefault, IWinRTObject {
  private val __455352496_Interface: IForceFeedbackEffect.WithDefault by lazy {
    as_455352496()
  }


  private val __367806425_Interface: IRampForceEffect.WithDefault by lazy {
    as_367806425()
  }


  public override val __455352496_Ptr: JNAPointer? by lazy {
    __455352496_Interface.__455352496_Ptr
  }


  public override val __367806425_Ptr: JNAPointer? by lazy {
    __367806425_Interface.__367806425_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__455352496_Interface, __367806425_Interface)

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

  private fun as_367806425(): IRampForceEffect.WithDefault {
    if(pointer == NULL) {
      return(IRampForceEffect.ABI.makeIRampForceEffect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRampForceEffect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRampForceEffect.ABI.makeIRampForceEffect(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RampForceEffect> {
    public override fun getValue() = RampForceEffect(pointer.getPointer(0))

    public fun setValue(value: RampForceEffect): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RampForceEffect, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Input.ForceFeedback.RampForceEffect".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): RampForceEffect {
      val address = segment.toRawLongValue()
      return RampForceEffect(Pointer(address))
    }

    public override fun toNative(obj: RampForceEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
