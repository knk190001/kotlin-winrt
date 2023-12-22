package Windows.Devices.Lights.Effects

import Windows.Devices.Lights.Effects.ILampArrayColorRampEffectFactory.ABI.IID
import Windows.Devices.Lights.LampArray
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
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LampArrayColorRampEffect.ABI::class)
@Signature("rc(Windows.Devices.Lights.Effects.LampArrayColorRampEffect;{2b004437-40a7-432e-a0b9-0d570c2153ff})")
@WinRTByReference(brClass = LampArrayColorRampEffect.ByReference::class)
public class LampArrayColorRampEffect(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILampArrayColorRampEffect.WithDefault, ILampArrayEffect.WithDefault,
    IWinRTObject {
  private val __1715136255_Interface: ILampArrayColorRampEffect.WithDefault by lazy {
    as_1715136255()
  }


  private val __818015690_Interface: ILampArrayEffect.WithDefault by lazy {
    as_818015690()
  }


  public override val __1715136255_Ptr: JNAPointer? by lazy {
    __1715136255_Interface.__1715136255_Ptr
  }


  public override val __818015690_Ptr: JNAPointer? by lazy {
    __818015690_Interface.__818015690_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1715136255_Interface, __818015690_Interface)

  public constructor(lampArray: LampArray, lampIndexes: Array<Int>) : this(ABI.activate(lampArray,
      lampIndexes))

  private fun as_1715136255(): ILampArrayColorRampEffect.WithDefault {
    if(pointer == NULL) {
      return(ILampArrayColorRampEffect.ABI.makeILampArrayColorRampEffect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILampArrayColorRampEffect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILampArrayColorRampEffect.ABI.makeILampArrayColorRampEffect(ref.value))
  }

  private fun as_818015690(): ILampArrayEffect.WithDefault {
    if(pointer == NULL) {
      return(ILampArrayEffect.ABI.makeILampArrayEffect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILampArrayEffect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILampArrayEffect.ABI.makeILampArrayEffect(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LampArrayColorRampEffect> {
    public override fun getValue() = LampArrayColorRampEffect(pointer.getPointer(0))

    public fun setValue(value: LampArrayColorRampEffect): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LampArrayColorRampEffect, MemoryAddress> {
    public val ILampArrayColorRampEffectFactory_Instance: ILampArrayColorRampEffectFactory by lazy {
      createILampArrayColorRampEffectFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILampArrayColorRampEffectFactory(): ILampArrayColorRampEffectFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Lights.Effects.LampArrayColorRampEffect".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILampArrayColorRampEffectFactory.ABI.makeILampArrayColorRampEffectFactory(factoryActivatorPtr.value))
    }

    public fun activate(lampArray: LampArray, lampIndexes: Array<Int>): JNAPointer? =
        ILampArrayColorRampEffectFactory_Instance.CreateInstance(lampArray, lampIndexes)?.pointer

    public override fun fromNative(segment: MemoryAddress): LampArrayColorRampEffect {
      val address = segment.toRawLongValue()
      return LampArrayColorRampEffect(Pointer(address))
    }

    public override fun toNative(obj: LampArrayColorRampEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
