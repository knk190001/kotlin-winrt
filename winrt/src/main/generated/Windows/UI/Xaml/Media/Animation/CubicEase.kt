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

@ABIMarker(CubicEase.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.CubicEase;{1b94fc76-dad7-4354-b1a2-7969fbf6a70d})")
@WinRTByReference(brClass = CubicEase.ByReference::class)
public class CubicEase(
  ptr: JNAPointer? = NULL
) : EasingFunctionBase(ptr), ICubicEase.WithDefault, IWinRTObject {
  private val __198342894_Interface: ICubicEase.WithDefault by lazy {
    as_198342894()
  }


  public override val __198342894_Ptr: JNAPointer? by lazy {
    __198342894_Interface.__198342894_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__198342894_Interface)

  public constructor() : this(ABI.activate())

  private fun as_198342894(): ICubicEase.WithDefault {
    if(pointer == NULL) {
      return(ICubicEase.ABI.makeICubicEase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICubicEase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICubicEase.ABI.makeICubicEase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CubicEase> {
    public override fun getValue() = CubicEase(pointer.getPointer(0))

    public fun setValue(value: CubicEase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CubicEase, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.CubicEase".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): CubicEase {
      val address = segment.toRawLongValue()
      return CubicEase(Pointer(address))
    }

    public override fun toNative(obj: CubicEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
