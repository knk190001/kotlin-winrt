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

@ABIMarker(DiscreteObjectKeyFrame.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.DiscreteObjectKeyFrame;{c7dcde89-f12d-4a9c-8199-e7a9ece3a473})")
@WinRTByReference(brClass = DiscreteObjectKeyFrame.ByReference::class)
public class DiscreteObjectKeyFrame(
  ptr: JNAPointer? = NULL
) : ObjectKeyFrame(ptr), IDiscreteObjectKeyFrame.WithDefault, IWinRTObject {
  private val __1530376076_Interface: IDiscreteObjectKeyFrame.WithDefault by lazy {
    as_1530376076()
  }


  public override val __1530376076_Ptr: JNAPointer? by lazy {
    __1530376076_Interface.__1530376076_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1530376076_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1530376076(): IDiscreteObjectKeyFrame.WithDefault {
    if(pointer == NULL) {
      return(IDiscreteObjectKeyFrame.ABI.makeIDiscreteObjectKeyFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDiscreteObjectKeyFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDiscreteObjectKeyFrame.ABI.makeIDiscreteObjectKeyFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DiscreteObjectKeyFrame> {
    public override fun getValue() = DiscreteObjectKeyFrame(pointer.getPointer(0))

    public fun setValue(value: DiscreteObjectKeyFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DiscreteObjectKeyFrame, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.DiscreteObjectKeyFrame".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): DiscreteObjectKeyFrame {
      val address = segment.toRawLongValue()
      return DiscreteObjectKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: DiscreteObjectKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
