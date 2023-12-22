package Windows.UI.Xaml.Media.Animation

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SineEase.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.SineEase;{a9382962-230b-49da-9e0d-664987892343})")
@WinRTByReference(brClass = SineEase.ByReference::class)
public class SineEase(
  ptr: JNAPointer? = NULL
) : EasingFunctionBase(ptr), ISineEase.WithDefault, IWinRTObject {
  private val __526190625_Interface: ISineEase.WithDefault by lazy {
    as_526190625()
  }


  public override val __526190625_Ptr: JNAPointer? by lazy {
    __526190625_Interface.__526190625_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__526190625_Interface)

  public constructor() : this(ABI.activate())

  private fun as_526190625(): ISineEase.WithDefault {
    if(pointer == NULL) {
      return(ISineEase.ABI.makeISineEase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISineEase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISineEase.ABI.makeISineEase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SineEase> {
    public override fun getValue() = SineEase(pointer.getPointer(0))

    public fun setValue(value: SineEase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SineEase, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.SineEase".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): SineEase {
      val address = segment.toRawLongValue()
      return SineEase(Pointer(address))
    }

    public override fun toNative(obj: SineEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
