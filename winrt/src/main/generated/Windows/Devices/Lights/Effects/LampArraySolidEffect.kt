package Windows.Devices.Lights.Effects

import Windows.Devices.Lights.Effects.ILampArraySolidEffectFactory.ABI.IID
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

@ABIMarker(LampArraySolidEffect.ABI::class)
@Signature("rc(Windows.Devices.Lights.Effects.LampArraySolidEffect;{441f8213-43cc-4b33-80eb-c6ddde7dc8ed})")
@WinRTByReference(brClass = LampArraySolidEffect.ByReference::class)
public class LampArraySolidEffect(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILampArraySolidEffect.WithDefault, ILampArrayEffect.WithDefault, IWinRTObject
    {
  private val __644307305_Interface: ILampArraySolidEffect.WithDefault by lazy {
    as_644307305()
  }


  private val __818015690_Interface: ILampArrayEffect.WithDefault by lazy {
    as_818015690()
  }


  public override val __644307305_Ptr: JNAPointer? by lazy {
    __644307305_Interface.__644307305_Ptr
  }


  public override val __818015690_Ptr: JNAPointer? by lazy {
    __818015690_Interface.__818015690_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__644307305_Interface, __818015690_Interface)

  public constructor(lampArray: LampArray, lampIndexes: Array<Int>) : this(ABI.activate(lampArray,
      lampIndexes))

  private fun as_644307305(): ILampArraySolidEffect.WithDefault {
    if(pointer == NULL) {
      return(ILampArraySolidEffect.ABI.makeILampArraySolidEffect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILampArraySolidEffect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILampArraySolidEffect.ABI.makeILampArraySolidEffect(ref.value))
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
      IByReference<LampArraySolidEffect> {
    public override fun getValue() = LampArraySolidEffect(pointer.getPointer(0))

    public fun setValue(value: LampArraySolidEffect): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LampArraySolidEffect, MemoryAddress> {
    public val ILampArraySolidEffectFactory_Instance: ILampArraySolidEffectFactory by lazy {
      createILampArraySolidEffectFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILampArraySolidEffectFactory(): ILampArraySolidEffectFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Lights.Effects.LampArraySolidEffect".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILampArraySolidEffectFactory.ABI.makeILampArraySolidEffectFactory(factoryActivatorPtr.value))
    }

    public fun activate(lampArray: LampArray, lampIndexes: Array<Int>): JNAPointer? =
        ILampArraySolidEffectFactory_Instance.CreateInstance(lampArray, lampIndexes)?.pointer

    public override fun fromNative(segment: MemoryAddress): LampArraySolidEffect {
      val address = segment.toRawLongValue()
      return LampArraySolidEffect(Pointer(address))
    }

    public override fun toNative(obj: LampArraySolidEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
