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

@ABIMarker(LinearColorKeyFrame.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.LinearColorKeyFrame;{66fdb6ef-ac81-4611-b1d2-61f545983f03})")
@WinRTByReference(brClass = LinearColorKeyFrame.ByReference::class)
public class LinearColorKeyFrame(
  ptr: JNAPointer? = NULL
) : ColorKeyFrame(ptr), ILinearColorKeyFrame.WithDefault, IWinRTObject {
  private val __886479898_Interface: ILinearColorKeyFrame.WithDefault by lazy {
    as_886479898()
  }


  public override val __886479898_Ptr: JNAPointer? by lazy {
    __886479898_Interface.__886479898_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__886479898_Interface)

  public constructor() : this(ABI.activate())

  private fun as_886479898(): ILinearColorKeyFrame.WithDefault {
    if(pointer == NULL) {
      return(ILinearColorKeyFrame.ABI.makeILinearColorKeyFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILinearColorKeyFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILinearColorKeyFrame.ABI.makeILinearColorKeyFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LinearColorKeyFrame> {
    public override fun getValue() = LinearColorKeyFrame(pointer.getPointer(0))

    public fun setValue(value: LinearColorKeyFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LinearColorKeyFrame, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.LinearColorKeyFrame".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): LinearColorKeyFrame {
      val address = segment.toRawLongValue()
      return LinearColorKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: LinearColorKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
