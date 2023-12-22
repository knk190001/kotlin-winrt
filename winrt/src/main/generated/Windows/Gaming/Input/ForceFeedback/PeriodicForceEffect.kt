package Windows.Gaming.Input.ForceFeedback

import Windows.Gaming.Input.ForceFeedback.IPeriodicForceEffectFactory.ABI.IID
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

@ABIMarker(PeriodicForceEffect.ABI::class)
@Signature("rc(Windows.Gaming.Input.ForceFeedback.PeriodicForceEffect;{a17fba0c-2ae4-48c2-8063-eabd0777cb89})")
@WinRTByReference(brClass = PeriodicForceEffect.ByReference::class)
public class PeriodicForceEffect(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IForceFeedbackEffect.WithDefault, IPeriodicForceEffect.WithDefault,
    IWinRTObject {
  private val __455352496_Interface: IForceFeedbackEffect.WithDefault by lazy {
    as_455352496()
  }


  private val __187650512_Interface: IPeriodicForceEffect.WithDefault by lazy {
    as_187650512()
  }


  public override val __455352496_Ptr: JNAPointer? by lazy {
    __455352496_Interface.__455352496_Ptr
  }


  public override val __187650512_Ptr: JNAPointer? by lazy {
    __187650512_Interface.__187650512_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__455352496_Interface, __187650512_Interface)

  public constructor(effectKind: PeriodicForceEffectKind) : this(ABI.activate(effectKind))

  private fun as_455352496(): IForceFeedbackEffect.WithDefault {
    if(pointer == NULL) {
      return(IForceFeedbackEffect.ABI.makeIForceFeedbackEffect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IForceFeedbackEffect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IForceFeedbackEffect.ABI.makeIForceFeedbackEffect(ref.value))
  }

  private fun as_187650512(): IPeriodicForceEffect.WithDefault {
    if(pointer == NULL) {
      return(IPeriodicForceEffect.ABI.makeIPeriodicForceEffect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPeriodicForceEffect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPeriodicForceEffect.ABI.makeIPeriodicForceEffect(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PeriodicForceEffect> {
    public override fun getValue() = PeriodicForceEffect(pointer.getPointer(0))

    public fun setValue(value: PeriodicForceEffect): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PeriodicForceEffect, MemoryAddress> {
    public val IPeriodicForceEffectFactory_Instance: IPeriodicForceEffectFactory by lazy {
      createIPeriodicForceEffectFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPeriodicForceEffectFactory(): IPeriodicForceEffectFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Input.ForceFeedback.PeriodicForceEffect".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPeriodicForceEffectFactory.ABI.makeIPeriodicForceEffectFactory(factoryActivatorPtr.value))
    }

    public fun activate(effectKind: PeriodicForceEffectKind): JNAPointer? =
        IPeriodicForceEffectFactory_Instance.CreateInstance(effectKind)?.pointer

    public override fun fromNative(segment: MemoryAddress): PeriodicForceEffect {
      val address = segment.toRawLongValue()
      return PeriodicForceEffect(Pointer(address))
    }

    public override fun toNative(obj: PeriodicForceEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
