package Windows.Devices.Lights.Effects

import Windows.Devices.Lights.Effects.ILampArrayBlinkEffectFactory.ABI.IID
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

@ABIMarker(LampArrayBlinkEffect.ABI::class)
@Signature("rc(Windows.Devices.Lights.Effects.LampArrayBlinkEffect;{ebbf35f6-2fc5-4bb3-b3c3-6221a7680d13})")
@WinRTByReference(brClass = LampArrayBlinkEffect.ByReference::class)
public class LampArrayBlinkEffect(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILampArrayBlinkEffect.WithDefault, ILampArrayEffect.WithDefault, IWinRTObject
    {
  private val __697260408_Interface: ILampArrayBlinkEffect.WithDefault by lazy {
    as_697260408()
  }


  private val __818015690_Interface: ILampArrayEffect.WithDefault by lazy {
    as_818015690()
  }


  public override val __697260408_Ptr: JNAPointer? by lazy {
    __697260408_Interface.__697260408_Ptr
  }


  public override val __818015690_Ptr: JNAPointer? by lazy {
    __818015690_Interface.__818015690_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__697260408_Interface, __818015690_Interface)

  public constructor(lampArray: LampArray, lampIndexes: Array<Int>) : this(ABI.activate(lampArray,
      lampIndexes))

  private fun as_697260408(): ILampArrayBlinkEffect.WithDefault {
    if(pointer == NULL) {
      return(ILampArrayBlinkEffect.ABI.makeILampArrayBlinkEffect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILampArrayBlinkEffect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILampArrayBlinkEffect.ABI.makeILampArrayBlinkEffect(ref.value))
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
      IByReference<LampArrayBlinkEffect> {
    public override fun getValue() = LampArrayBlinkEffect(pointer.getPointer(0))

    public fun setValue(value: LampArrayBlinkEffect): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LampArrayBlinkEffect, MemoryAddress> {
    public val ILampArrayBlinkEffectFactory_Instance: ILampArrayBlinkEffectFactory by lazy {
      createILampArrayBlinkEffectFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILampArrayBlinkEffectFactory(): ILampArrayBlinkEffectFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Lights.Effects.LampArrayBlinkEffect".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILampArrayBlinkEffectFactory.ABI.makeILampArrayBlinkEffectFactory(factoryActivatorPtr.value))
    }

    public fun activate(lampArray: LampArray, lampIndexes: Array<Int>): JNAPointer? =
        ILampArrayBlinkEffectFactory_Instance.CreateInstance(lampArray, lampIndexes)?.pointer

    public override fun fromNative(segment: MemoryAddress): LampArrayBlinkEffect {
      val address = segment.toRawLongValue()
      return LampArrayBlinkEffect(Pointer(address))
    }

    public override fun toNative(obj: LampArrayBlinkEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
