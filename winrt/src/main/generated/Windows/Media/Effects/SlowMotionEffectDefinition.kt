package Windows.Media.Effects

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

@ABIMarker(SlowMotionEffectDefinition.ABI::class)
@Signature("rc(Windows.Media.Effects.SlowMotionEffectDefinition;{35053cd0-176c-4763-82c4-1b02dbe31737})")
@WinRTByReference(brClass = SlowMotionEffectDefinition.ByReference::class)
public class SlowMotionEffectDefinition(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISlowMotionEffectDefinition.WithDefault, IVideoEffectDefinition.WithDefault,
    IWinRTObject {
  private val __195874921_Interface: ISlowMotionEffectDefinition.WithDefault by lazy {
    as_195874921()
  }


  private val __1115276221_Interface: IVideoEffectDefinition.WithDefault by lazy {
    as_1115276221()
  }


  public override val __195874921_Ptr: JNAPointer? by lazy {
    __195874921_Interface.__195874921_Ptr
  }


  public override val __1115276221_Ptr: JNAPointer? by lazy {
    __1115276221_Interface.__1115276221_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__195874921_Interface, __1115276221_Interface)

  public constructor() : this(ABI.activate())

  private fun as_195874921(): ISlowMotionEffectDefinition.WithDefault {
    if(pointer == NULL) {
      return(ISlowMotionEffectDefinition.ABI.makeISlowMotionEffectDefinition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISlowMotionEffectDefinition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISlowMotionEffectDefinition.ABI.makeISlowMotionEffectDefinition(ref.value))
  }

  private fun as_1115276221(): IVideoEffectDefinition.WithDefault {
    if(pointer == NULL) {
      return(IVideoEffectDefinition.ABI.makeIVideoEffectDefinition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoEffectDefinition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoEffectDefinition.ABI.makeIVideoEffectDefinition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SlowMotionEffectDefinition> {
    public override fun getValue() = SlowMotionEffectDefinition(pointer.getPointer(0))

    public fun setValue(value: SlowMotionEffectDefinition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SlowMotionEffectDefinition, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Effects.SlowMotionEffectDefinition".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): SlowMotionEffectDefinition {
      val address = segment.toRawLongValue()
      return SlowMotionEffectDefinition(Pointer(address))
    }

    public override fun toNative(obj: SlowMotionEffectDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
