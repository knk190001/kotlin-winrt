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

@ABIMarker(LinearPointKeyFrame.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.LinearPointKeyFrame;{e7c9b8ef-af24-49ee-84f1-a86600a4e319})")
@WinRTByReference(brClass = LinearPointKeyFrame.ByReference::class)
public class LinearPointKeyFrame(
  ptr: JNAPointer? = NULL
) : PointKeyFrame(ptr), ILinearPointKeyFrame.WithDefault, IWinRTObject {
  private val __1566706963_Interface: ILinearPointKeyFrame.WithDefault by lazy {
    as_1566706963()
  }


  public override val __1566706963_Ptr: JNAPointer? by lazy {
    __1566706963_Interface.__1566706963_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1566706963_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1566706963(): ILinearPointKeyFrame.WithDefault {
    if(pointer == NULL) {
      return(ILinearPointKeyFrame.ABI.makeILinearPointKeyFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILinearPointKeyFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILinearPointKeyFrame.ABI.makeILinearPointKeyFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LinearPointKeyFrame> {
    public override fun getValue() = LinearPointKeyFrame(pointer.getPointer(0))

    public fun setValue(value: LinearPointKeyFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LinearPointKeyFrame, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.LinearPointKeyFrame".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): LinearPointKeyFrame {
      val address = segment.toRawLongValue()
      return LinearPointKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: LinearPointKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
