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

@ABIMarker(LinearDoubleKeyFrame.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.LinearDoubleKeyFrame;{8efdf265-9a7b-431d-8f0c-14c56b5ea4d9})")
@WinRTByReference(brClass = LinearDoubleKeyFrame.ByReference::class)
public class LinearDoubleKeyFrame(
  ptr: JNAPointer? = NULL
) : DoubleKeyFrame(ptr), ILinearDoubleKeyFrame.WithDefault, IWinRTObject {
  private val __746896074_Interface: ILinearDoubleKeyFrame.WithDefault by lazy {
    as_746896074()
  }


  public override val __746896074_Ptr: JNAPointer? by lazy {
    __746896074_Interface.__746896074_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__746896074_Interface)

  public constructor() : this(ABI.activate())

  private fun as_746896074(): ILinearDoubleKeyFrame.WithDefault {
    if(pointer == NULL) {
      return(ILinearDoubleKeyFrame.ABI.makeILinearDoubleKeyFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILinearDoubleKeyFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILinearDoubleKeyFrame.ABI.makeILinearDoubleKeyFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LinearDoubleKeyFrame> {
    public override fun getValue() = LinearDoubleKeyFrame(pointer.getPointer(0))

    public fun setValue(value: LinearDoubleKeyFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LinearDoubleKeyFrame, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.LinearDoubleKeyFrame".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): LinearDoubleKeyFrame {
      val address = segment.toRawLongValue()
      return LinearDoubleKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: LinearDoubleKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
