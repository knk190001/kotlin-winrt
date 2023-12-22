package Windows.UI.Composition.Effects

import Windows.Graphics.Effects.IGraphicsEffect
import Windows.Graphics.Effects.IGraphicsEffectSource
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

@ABIMarker(SceneLightingEffect.ABI::class)
@Signature("rc(Windows.UI.Composition.Effects.SceneLightingEffect;{91bb5e52-95d1-4f8b-9a5a-6408b24b8c6a})")
@WinRTByReference(brClass = SceneLightingEffect.ByReference::class)
public class SceneLightingEffect(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISceneLightingEffect.WithDefault, ISceneLightingEffect2.WithDefault,
    IGraphicsEffect.WithDefault, IGraphicsEffectSource.WithDefault, IWinRTObject {
  private val __556675311_Interface: ISceneLightingEffect.WithDefault by lazy {
    as_556675311()
  }


  private val __77065507_Interface: ISceneLightingEffect2.WithDefault by lazy {
    as_77065507()
  }


  private val __2076412261_Interface: IGraphicsEffect.WithDefault by lazy {
    as_2076412261()
  }


  private val __568797846_Interface: IGraphicsEffectSource.WithDefault by lazy {
    as_568797846()
  }


  public override val __556675311_Ptr: JNAPointer? by lazy {
    __556675311_Interface.__556675311_Ptr
  }


  public override val __77065507_Ptr: JNAPointer? by lazy {
    __77065507_Interface.__77065507_Ptr
  }


  public override val __2076412261_Ptr: JNAPointer? by lazy {
    __2076412261_Interface.__2076412261_Ptr
  }


  public override val __568797846_Ptr: JNAPointer? by lazy {
    __568797846_Interface.__568797846_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__556675311_Interface, __77065507_Interface, __2076412261_Interface,
        __568797846_Interface)

  public constructor() : this(ABI.activate())

  private fun as_556675311(): ISceneLightingEffect.WithDefault {
    if(pointer == NULL) {
      return(ISceneLightingEffect.ABI.makeISceneLightingEffect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneLightingEffect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneLightingEffect.ABI.makeISceneLightingEffect(ref.value))
  }

  private fun as_77065507(): ISceneLightingEffect2.WithDefault {
    if(pointer == NULL) {
      return(ISceneLightingEffect2.ABI.makeISceneLightingEffect2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneLightingEffect2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneLightingEffect2.ABI.makeISceneLightingEffect2(ref.value))
  }

  private fun as_2076412261(): IGraphicsEffect.WithDefault {
    if(pointer == NULL) {
      return(IGraphicsEffect.ABI.makeIGraphicsEffect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGraphicsEffect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGraphicsEffect.ABI.makeIGraphicsEffect(ref.value))
  }

  private fun as_568797846(): IGraphicsEffectSource.WithDefault {
    if(pointer == NULL) {
      return(IGraphicsEffectSource.ABI.makeIGraphicsEffectSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGraphicsEffectSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGraphicsEffectSource.ABI.makeIGraphicsEffectSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SceneLightingEffect> {
    public override fun getValue() = SceneLightingEffect(pointer.getPointer(0))

    public fun setValue(value: SceneLightingEffect): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneLightingEffect, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Composition.Effects.SceneLightingEffect".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): SceneLightingEffect {
      val address = segment.toRawLongValue()
      return SceneLightingEffect(Pointer(address))
    }

    public override fun toNative(obj: SceneLightingEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
