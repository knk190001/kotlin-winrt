package Windows.Devices.Lights.Effects

import Windows.Devices.Lights.Effects.ILampArrayBitmapEffectFactory.ABI.IID
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

@ABIMarker(LampArrayBitmapEffect.ABI::class)
@Signature("rc(Windows.Devices.Lights.Effects.LampArrayBitmapEffect;{3238e065-d877-4627-89e5-2a88f7052fa6})")
@WinRTByReference(brClass = LampArrayBitmapEffect.ByReference::class)
public class LampArrayBitmapEffect(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILampArrayBitmapEffect.WithDefault, ILampArrayEffect.WithDefault, IWinRTObject
    {
  private val __1083555707_Interface: ILampArrayBitmapEffect.WithDefault by lazy {
    as_1083555707()
  }


  private val __818015690_Interface: ILampArrayEffect.WithDefault by lazy {
    as_818015690()
  }


  public override val __1083555707_Ptr: JNAPointer? by lazy {
    __1083555707_Interface.__1083555707_Ptr
  }


  public override val __818015690_Ptr: JNAPointer? by lazy {
    __818015690_Interface.__818015690_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1083555707_Interface, __818015690_Interface)

  public constructor(lampArray: LampArray, lampIndexes: Array<Int>) : this(ABI.activate(lampArray,
      lampIndexes))

  private fun as_1083555707(): ILampArrayBitmapEffect.WithDefault {
    if(pointer == NULL) {
      return(ILampArrayBitmapEffect.ABI.makeILampArrayBitmapEffect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILampArrayBitmapEffect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILampArrayBitmapEffect.ABI.makeILampArrayBitmapEffect(ref.value))
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
      IByReference<LampArrayBitmapEffect> {
    public override fun getValue() = LampArrayBitmapEffect(pointer.getPointer(0))

    public fun setValue(value: LampArrayBitmapEffect): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LampArrayBitmapEffect, MemoryAddress> {
    public val ILampArrayBitmapEffectFactory_Instance: ILampArrayBitmapEffectFactory by lazy {
      createILampArrayBitmapEffectFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILampArrayBitmapEffectFactory(): ILampArrayBitmapEffectFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Lights.Effects.LampArrayBitmapEffect".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILampArrayBitmapEffectFactory.ABI.makeILampArrayBitmapEffectFactory(factoryActivatorPtr.value))
    }

    public fun activate(lampArray: LampArray, lampIndexes: Array<Int>): JNAPointer? =
        ILampArrayBitmapEffectFactory_Instance.CreateInstance(lampArray, lampIndexes)?.pointer

    public override fun fromNative(segment: MemoryAddress): LampArrayBitmapEffect {
      val address = segment.toRawLongValue()
      return LampArrayBitmapEffect(Pointer(address))
    }

    public override fun toNative(obj: LampArrayBitmapEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
