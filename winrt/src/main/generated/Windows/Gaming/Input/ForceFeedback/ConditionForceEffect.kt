package Windows.Gaming.Input.ForceFeedback

import Windows.Gaming.Input.ForceFeedback.IConditionForceEffectFactory.ABI.IID
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

@ABIMarker(ConditionForceEffect.ABI::class)
@Signature("rc(Windows.Gaming.Input.ForceFeedback.ConditionForceEffect;{a17fba0c-2ae4-48c2-8063-eabd0777cb89})")
@WinRTByReference(brClass = ConditionForceEffect.ByReference::class)
public class ConditionForceEffect(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IForceFeedbackEffect.WithDefault, IConditionForceEffect.WithDefault,
    IWinRTObject {
  private val __455352496_Interface: IForceFeedbackEffect.WithDefault by lazy {
    as_455352496()
  }


  private val __1970739534_Interface: IConditionForceEffect.WithDefault by lazy {
    as_1970739534()
  }


  public override val __455352496_Ptr: JNAPointer? by lazy {
    __455352496_Interface.__455352496_Ptr
  }


  public override val __1970739534_Ptr: JNAPointer? by lazy {
    __1970739534_Interface.__1970739534_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__455352496_Interface, __1970739534_Interface)

  public constructor(effectKind: ConditionForceEffectKind) : this(ABI.activate(effectKind))

  private fun as_455352496(): IForceFeedbackEffect.WithDefault {
    if(pointer == NULL) {
      return(IForceFeedbackEffect.ABI.makeIForceFeedbackEffect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IForceFeedbackEffect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IForceFeedbackEffect.ABI.makeIForceFeedbackEffect(ref.value))
  }

  private fun as_1970739534(): IConditionForceEffect.WithDefault {
    if(pointer == NULL) {
      return(IConditionForceEffect.ABI.makeIConditionForceEffect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConditionForceEffect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConditionForceEffect.ABI.makeIConditionForceEffect(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ConditionForceEffect> {
    public override fun getValue() = ConditionForceEffect(pointer.getPointer(0))

    public fun setValue(value: ConditionForceEffect): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ConditionForceEffect, MemoryAddress> {
    public val IConditionForceEffectFactory_Instance: IConditionForceEffectFactory by lazy {
      createIConditionForceEffectFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIConditionForceEffectFactory(): IConditionForceEffectFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.Input.ForceFeedback.ConditionForceEffect".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IConditionForceEffectFactory.ABI.makeIConditionForceEffectFactory(factoryActivatorPtr.value))
    }

    public fun activate(effectKind: ConditionForceEffectKind): JNAPointer? =
        IConditionForceEffectFactory_Instance.CreateInstance(effectKind)?.pointer

    public override fun fromNative(segment: MemoryAddress): ConditionForceEffect {
      val address = segment.toRawLongValue()
      return ConditionForceEffect(Pointer(address))
    }

    public override fun toNative(obj: ConditionForceEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
