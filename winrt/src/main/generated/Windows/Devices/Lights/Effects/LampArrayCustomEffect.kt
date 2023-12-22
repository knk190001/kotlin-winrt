package Windows.Devices.Lights.Effects

import Windows.Devices.Lights.Effects.ILampArrayCustomEffectFactory.ABI.IID
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

@ABIMarker(LampArrayCustomEffect.ABI::class)
@Signature("rc(Windows.Devices.Lights.Effects.LampArrayCustomEffect;{ec579170-3c34-4876-818b-5765f78b0ee4})")
@WinRTByReference(brClass = LampArrayCustomEffect.ByReference::class)
public class LampArrayCustomEffect(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILampArrayCustomEffect.WithDefault, ILampArrayEffect.WithDefault, IWinRTObject
    {
  private val __351821497_Interface: ILampArrayCustomEffect.WithDefault by lazy {
    as_351821497()
  }


  private val __818015690_Interface: ILampArrayEffect.WithDefault by lazy {
    as_818015690()
  }


  public override val __351821497_Ptr: JNAPointer? by lazy {
    __351821497_Interface.__351821497_Ptr
  }


  public override val __818015690_Ptr: JNAPointer? by lazy {
    __818015690_Interface.__818015690_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__351821497_Interface, __818015690_Interface)

  public constructor(lampArray: LampArray, lampIndexes: Array<Int>) : this(ABI.activate(lampArray,
      lampIndexes))

  private fun as_351821497(): ILampArrayCustomEffect.WithDefault {
    if(pointer == NULL) {
      return(ILampArrayCustomEffect.ABI.makeILampArrayCustomEffect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILampArrayCustomEffect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILampArrayCustomEffect.ABI.makeILampArrayCustomEffect(ref.value))
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
      IByReference<LampArrayCustomEffect> {
    public override fun getValue() = LampArrayCustomEffect(pointer.getPointer(0))

    public fun setValue(value: LampArrayCustomEffect): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LampArrayCustomEffect, MemoryAddress> {
    public val ILampArrayCustomEffectFactory_Instance: ILampArrayCustomEffectFactory by lazy {
      createILampArrayCustomEffectFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILampArrayCustomEffectFactory(): ILampArrayCustomEffectFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Lights.Effects.LampArrayCustomEffect".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILampArrayCustomEffectFactory.ABI.makeILampArrayCustomEffectFactory(factoryActivatorPtr.value))
    }

    public fun activate(lampArray: LampArray, lampIndexes: Array<Int>): JNAPointer? =
        ILampArrayCustomEffectFactory_Instance.CreateInstance(lampArray, lampIndexes)?.pointer

    public override fun fromNative(segment: MemoryAddress): LampArrayCustomEffect {
      val address = segment.toRawLongValue()
      return LampArrayCustomEffect(Pointer(address))
    }

    public override fun toNative(obj: LampArrayCustomEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
